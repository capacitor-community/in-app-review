export interface InAppReviewPlugin {
  requestReview(): Promise<void>;
}
