import Foundation
import Capacitor
import StoreKit

@objc public class InAppReview: NSObject {
    @objc func requestReview(_ call: CAPPluginCall) {
        SKStoreReviewController.requestReview()
        call.resolve()
    }
}
