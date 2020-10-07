import { WebPlugin } from "@capacitor/core";
import { CapacitorRateAppPlugin } from "./definitions";

export class CapacitorRateAppWeb extends WebPlugin
  implements CapacitorRateAppPlugin {
  constructor() {
    super({
      name: "CapacitorRateApp",
      platforms: ["web"]
    });
  }

  async requestReview(): Promise<void> {
    return;
  }
  async showInAppReview(): Promise<void> {
    return;
  }
}

const CapacitorRateApp = new CapacitorRateAppWeb();

export { CapacitorRateApp };

import { registerWebPlugin } from "@capacitor/core";
registerWebPlugin(CapacitorRateApp);
