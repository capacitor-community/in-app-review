package com.capacitor.rateapp;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "RateApp")
public class CapacitorRateAppPlugin extends Plugin {

    private CapacitorRateApp implementation = new CapacitorRateApp();

    @PluginMethod
    public void requestReview(PluginCall call) {
        final AppCompatActivity activity = getActivity();
        implementation.requestReview(call, activity);

        call.resolve();
    }
}
