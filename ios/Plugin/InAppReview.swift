import Foundation
import Capacitor
import StoreKit

@objc public class InAppReview: NSObject {
    @objc func requestReview(_ call: CAPPluginCall) {
        if #available(iOS 14.0, *) {
             if let windowScene = UIApplication.shared.connectedScenes.first(where: { $0.activationState == .foregroundActive }) as? UIWindowScene {
                 SKStoreReviewController.requestReview(in: windowScene)
             }
         } else {
             SKStoreReviewController.requestReview()
         }
        call.resolve()
    }
}
