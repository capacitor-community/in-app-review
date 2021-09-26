# Capacitor Rate App

Let users rate your app using native rate app dialog for both Android and iOS.

**Please be aware of limitations for your platform, it's reason in 99% cases when dialog is not showing. Platform details: [iOS limitations](#ios-limitations---important), [Android limitations](#android-limitations---important).**

![iOS rate popup](https://i2.wp.com/9to5mac.com/wp-content/uploads/sites/6/2017/01/simulator-screen-shot-25-jan-2017-12-47-41.jpg?resize=800%2C0&quality=82&strip=all&ssl=1)

## Installation

```bash
$ npm i --save capacitor-rate-app
```

or

```bash
$ yarn add capacitor-rate-app
```

Don't forget run `cap sync` command afterwards.

## Usage

```js
import { RateApp } from 'capacitor-rate-app';

RateApp.requestReview();
```

## Demo

For more detailed example check demo app [check demo app](https://github.com/Nodonisko/rate-app-demo).

## iOS limitations - IMPORTANT!

1. You should only call request review when it makes sense in the user experience flow of your app, and then call the method only after the user has demonstrated some engagements on an app.
2. You have no control over exactly what’s happening and the dialog displayed or its callbacks, that is determined entirely by the system.
3. The system may or may not show a rating prompt, it’s not appropriate to call the API in response to a button tap or other user action because it is not going to happen every time.
4. **No matter how many times you call the API, the system will only show up to a maximum of 3 prompts to the same user in a 365-day period.**
5. The App Store defaults to showing ratings and reviews only for your app’s most recent version.
6. The User can turn off this in settings.
7. Apple might mandate this flow in future.
8. **In dev env, dialog is always shown, but you can't submit review.**

## Android limitations - IMPORTANT!

This is copied from [official docs:](https://developer.android.com/guide/playcore/in-app-review#quotas)

_To provide a great user experience, Google Play enforces a time-bound quota on how often a user can be shown the review dialog. Because of this quota, calling the launchReviewFlow method more than once during a short period of time (for example, less than a month) might not always display a dialog._

_Because the quota is subject to change, it's important to apply your own logic and target the best possible moment to request a review. For example, you should not have a call-to-action option (such as a button) to trigger the API, as a user might have already hit their quota and the flow won’t be shown, presenting a broken experience to the user. For this use case, redirect the user to the Play Store instead._

_Note: The specific value of the quota is an implementation detail, and it can be changed by Google Play without any notice._
