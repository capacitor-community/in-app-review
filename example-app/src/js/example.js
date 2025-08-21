import { InAppReview } from '@capacitor-community/in-app-review';

window.testReview = async () => {
    await InAppReview.requestReview();
}