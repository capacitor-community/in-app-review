import Foundation
import Capacitor
import StoreKit

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitor.ionicframework.com/docs/plugins/ios
 */
@objc(CapacitorRateApp)
public class CapacitorRateApp: CAPPlugin {

    @objc func requestReview(_ call: CAPPluginCall) {
        SKStoreReviewController.requestReview()
        call.success()
    }
}
