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

## Usage

```js
import { Plugins } from "@capacitor/core";

Plugins.CapacitorRateApp.requestReview();
```
