package com.capacitor.rateapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.OnCompleteListener;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;

public class CapacitorRateApp {

    public void requestReview(final PluginCall call, final AppCompatActivity activity) {
        final ReviewManager manager = ReviewManagerFactory.create(activity);

        Task<ReviewInfo> request = manager.requestReviewFlow();
        request.addOnFailureListener(
            new OnFailureListener() {
                @Override
                public void onFailure(Exception e) {
                    e.printStackTrace();
                    call.reject("Request review failed", e);
                }
            }
        );
        request.addOnCompleteListener(
            new OnCompleteListener<ReviewInfo>() {
                @Override
                public void onComplete(Task<ReviewInfo> task) {
                    if (task.isSuccessful()) {
                        // We can get the ReviewInfo object
                        ReviewInfo reviewInfo = task.getResult();
                        Task<Void> flow = manager.launchReviewFlow(activity, reviewInfo);
                        flow.addOnCompleteListener(
                            new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(Task<Void> task) {
                                    Log.i("RateApp", "Request review flow finished");
                                    // The flow has finished. The API does not indicate whether the user
                                    // reviewed or not, or even whether the review dialog was shown. Thus, no
                                    // matter the result, we continue our app flow.
                                    call.resolve();
                                }
                            }
                        );
                        flow.addOnSuccessListener(
                            new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void result) {
                                    call.resolve();
                                }
                            }
                        );
                        flow.addOnFailureListener(
                            new OnFailureListener() {
                                @Override
                                public void onFailure(Exception e) {
                                    e.printStackTrace();
                                    call.reject("Request review flow Failed", e);
                                }
                            }
                        );
                    } else {
                        // There was some problem, continue regardless of the result.
                        call.reject("Request review task Failed");
                    }
                }
            }
        );
    }
}
