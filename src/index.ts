import { registerPlugin } from '@capacitor/core';

import type { InAppReviewPlugin } from './definitions';

const InAppReview = registerPlugin<InAppReviewPlugin>('InAppReview', {
  web: () => import('./web').then(m => new m.InAppReviewWeb()),
});

export * from './definitions';
export { InAppReview };
