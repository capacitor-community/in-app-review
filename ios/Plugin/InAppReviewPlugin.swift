import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(InAppReviewPlugin)
public class InAppReviewPlugin: CAPPlugin {
    private let implementation = InAppReview()

    @objc func requestReview(_ call: CAPPluginCall) {
        implementation.requestReview(call)

        call.resolve()
    }
}
