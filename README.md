<p align="center"><br><img src="https://user-images.githubusercontent.com/236501/85893648-1c92e880-b7a8-11ea-926d-95355b8175c7.png" width="128" height="128" /></p>
<h3 align="center">In App Review</h3>
<p align="center"><strong><code>@capacitor-community/in-app-review</code></strong></p>
<p align="center">
  Capacitor Plugin for prompting users to submit app store reviews.
</p>

<p align="center">
  <img src="https://img.shields.io/maintenance/yes/2024?style=flat-square" />
  <a href="https://www.npmjs.com/package/@capacitor-community/in-app-review"><img src="https://img.shields.io/npm/l/@capacitor-community/in-app-review?style=flat-square" /></a>
<br>
  <a href="https://www.npmjs.com/package/@capacitor-community/in-app-review"><img src="https://img.shields.io/npm/dw/@capacitor-community/in-app-review?style=flat-square" /></a>
  <a href="https://www.npmjs.com/package/@capacitor-community/in-app-review"><img src="https://img.shields.io/npm/v/@capacitor-community/in-app-review?style=flat-square" /></a>
</p>

> [!NOTE]
> This repository is the successor to `capacitor-rate-app` by [Nodonisko](https://github.com/Nodonisko).
>
> Please [migrate](https://github.com/capacitor-community/in-app-review/releases/tag/v6.0.0) for continued support and updates.

## Introduction

This plugin lets you prompt users to submit app store ratings and reviews without the inconvenience of leaving your app. It uses the built-in native UI components that iOS and Android provide.

<sub>_Example of the in-app review flow for a user on Android_:</sub>
<br>
<img src="https://github.com/capacitor-community/privacy-screen/assets/35837839/11ec6398-20df-46f3-9687-2c7f0990fc37" width="640" />
<br>

> [!IMPORTANT]
> To protect user privacy and avoid API misuse, there are strict guidelines that your app should follow.
>
> <sub>Design guidelines Android: [source](https://developer.android.com/guide/playcore/in-app-review)</sub>
> <br>
> <sub>Design guidelines iOS: [source](https://developer.apple.com/documentation/storekit/skstorereviewcontroller/3566727-requestreview), [source](https://developer.apple.com/app-store/ratings-and-reviews/), [source](https://developer.apple.com/documentation/storekit/requesting_app_store_reviews), [source](https://developer.apple.com/design/human-interface-guidelines/ratings-and-reviews)</sub>

> [!IMPORTANT]
> If - during development and testing - the dialog is not shown, make sure all prerequisites have been met.
> Generally that means following the design guidelines and making sure your test environment is setup correctly.
>
> <sub>Design guidelines: see explainer paragraph above</sub>
> <br>
> <sub>Test Environment setup Android: [source](https://developer.android.com/guide/playcore/in-app-review/test)</sub>
> <br>
> <sub>Test Environment setup iOS: [source](https://developer.apple.com/documentation/storekit/skstorereviewcontroller/3566727-requestreview#4278434)</sub>

## Installation

```bash
npm install @capacitor-community/in-app-review
npx cap sync
```

## Usage

```ts
import { InAppReview } from '@capacitor-community/in-app-review';

InAppReview.requestReview();
```

## API

<docgen-index>

* [`requestReview()`](#requestreview)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### requestReview()

```typescript
requestReview() => Promise<void>
```

--------------------

</docgen-api>
