package com.getcapacitor.community.inappreview;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "InAppReview")
public class InAppReviewPlugin extends Plugin {

    private InAppReview implementation = new InAppReview();

    @PluginMethod
    public void requestReview(PluginCall call) {
        final AppCompatActivity activity = getActivity();
        implementation.requestReview(call, activity);
    }
}
