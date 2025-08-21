package com.getcapacitor.community.inappreview;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.getcapacitor.PluginCall;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;

public class InAppReview {

    public void requestReview(final PluginCall call, final AppCompatActivity activity) {
        final ReviewManager manager = ReviewManagerFactory.create(activity);

        Task<ReviewInfo> request = manager.requestReviewFlow();
        request.addOnFailureListener(
                e -> {
                    e.printStackTrace();
                    call.reject("Request review failed", e);
                }
        );
        request.addOnCompleteListener(
                task -> {
                    if (task.isSuccessful()) {
                        // We can get the ReviewInfo object
                        ReviewInfo reviewInfo = task.getResult();
                        Task<Void> flow = manager.launchReviewFlow(activity, reviewInfo);
                        flow.addOnCompleteListener(
                                task1 -> {
                                    Log.i("RateApp", "Request review flow finished");
                                    // The flow has finished. The API does not indicate whether the user
                                    // reviewed or not, or even whether the review dialog was shown. Thus, no
                                    // matter the result, we continue our app flow.
                                    call.resolve();
                                }
                        );
                        flow.addOnSuccessListener(
                                result -> call.resolve()
                        );
                        flow.addOnFailureListener(
                                e -> {
                                    e.printStackTrace();
                                    call.reject("Request review flow Failed", e);
                                }
                        );
                    } else {
                        // There was some problem, continue regardless of the result.
                        call.reject("Request review task Failed");
                    }
                }
        );
    }
}
