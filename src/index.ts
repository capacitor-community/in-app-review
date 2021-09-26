import { registerPlugin } from '@capacitor/core';

import type { RateAppPlugin } from './definitions';

const RateApp = registerPlugin<RateAppPlugin>('RateApp', {
  web: () => import('./web').then(m => new m.RateAppWeb()),
});

export * from './definitions';
export { RateApp };
