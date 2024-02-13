import { WebPlugin } from '@capacitor/core';
import type { RateAppPlugin } from './definitions';
export declare class RateAppWeb extends WebPlugin implements RateAppPlugin {
    requestReview(): Promise<void>;
}
