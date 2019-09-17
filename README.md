# capacitor-rate-app

Let users rate your app. Very very simple. On Android opens Google Play. On iOs will show native rate app dialog.

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
