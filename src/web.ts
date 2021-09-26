import { WebPlugin } from '@capacitor/core';

import type { RateAppPlugin } from './definitions';

export class RateAppWeb extends WebPlugin implements RateAppPlugin {
  async requestReview(): Promise<void> {
    return;
  }
}
