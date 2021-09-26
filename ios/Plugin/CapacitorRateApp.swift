import Foundation
import Capacitor
import StoreKit

@objc public class CapacitorRateApp: NSObject {
    @objc func requestReview(_ call: CAPPluginCall) {
        SKStoreReviewController.requestReview()
        call.resolve()
    }
}
