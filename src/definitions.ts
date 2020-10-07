declare module "@capacitor/core" {
  interface PluginRegistry {
    CapacitorRateApp: CapacitorRateAppPlugin;
  }
}

export interface CapacitorRateAppPlugin {
  requestReview(): Promise<void>;
  showInAppReview(): Promise<void>;
}
