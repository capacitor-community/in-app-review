import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(CapacitorRateAppPlugin)
public class CapacitorRateAppPlugin: CAPPlugin {
    private let implementation = CapacitorRateApp()

    @objc func requestReview(_ call: CAPPluginCall) {
        implementation.requestReview(call)
        
        call.resolve()
    }
}
