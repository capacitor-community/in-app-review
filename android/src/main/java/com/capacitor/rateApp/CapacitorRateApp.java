package com.capacitor.rateApp;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

@NativePlugin()
public class CapacitorRateApp extends Plugin {

    @PluginMethod()
    public void requestReview(PluginCall call) {
        String appPackageName = getContext().getPackageName();
        Log.d("Capacitor", "Opening market for ".concat(appPackageName));
        Intent marketIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+appPackageName));
        marketIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_NEW_DOCUMENT | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        getContext().startActivity(marketIntent);

        call.success();
    }
}
