import { WebPlugin } from '@capacitor/core';

import type { InAppReviewPlugin } from './definitions';

export class InAppReviewWeb extends WebPlugin implements InAppReviewPlugin {
  async requestReview(): Promise<void> {
    throw this.unimplemented('Not implemented on web.');
  }
}
