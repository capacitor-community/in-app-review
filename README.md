# capacitor-rate-app

Let users rate your app. Very very simple. On Android opens Google Play. On iOs will show native rate app dialog.

![iOS rate popup](https://i2.wp.com/9to5mac.com/wp-content/uploads/sites/6/2017/01/simulator-screen-shot-25-jan-2017-12-47-41.jpg?resize=800%2C0&quality=82&strip=all&ssl=1)

## Installation

```bash
$ npm i --save capacitor-rate-app
```

or

```bash
$ yarn add capacitor-rate-app
```

## Android configuration

In file `android/app/src/main/java/**/**/MainActivity.java`, add the plugin to the initialization list:

```java
import com.capacitor.rateApp.CapacitorRateApp;
[...]
this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
  [...]
  add(CapacitorRateApp.class);
  [...]
}});
```

## iOS configuration

No configuration needed, works out-of-box.

## iOS limitations - IMPORTANT!

1. You should only call request review when it makes sense in the user experience flow of your app, and then call the method only after the user has demonstrated some engagements on an app.
2. You have no control over exactly what’s happening and the dialog displayed or its callbacks, that is determined entirely by the system.
3. The system may or may not show a rating prompt, it’s not appropriate to call the API in response to a button tap or other user action because it is not going to happen every time.
4. **No matter how many times you call the API, the system will only show up to a maximum of 3 prompts to the same user in a 365-day period.**
5. The App Store defaults to showing ratings and reviews only for your app’s most recent version.
6. The User can turn off this in settings.
7. Apple might mandate this flow in future. 
8. **In dev env, dialog is always shown, but you can't submit review.**

## Usage

```js
import { Plugins } from "@capacitor/core";

Plugins.CapacitorRateApp.requestReview();
```

