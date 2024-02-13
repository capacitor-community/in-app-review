import { registerPlugin } from '@capacitor/core';
const RateApp = registerPlugin('RateApp', {
    web: () => import('./web').then(m => new m.RateAppWeb()),
});
export * from './definitions';
export { RateApp };
//# sourceMappingURL=index.js.map