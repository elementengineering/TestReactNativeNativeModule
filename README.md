### Test React Native, Native Module

This repo was created to demostrate an issue importing from a native android module from a standard react native project.

`RNApp` was created using `react-native init` (react-native-cli version 2.0.1)
`react-native-module` created using `react-native-create-library` https://www.npmjs.com/package/react-native-create-library (version 3.1.2)

## Steps to install:
1. `cd RNApp && npm install`

## Steps to run on android:
1. `cd RNApp && npm run android`

## Steps to run on iOS:
1. `cd RNApp/ios && pod install && cd ../ && npm run ios`

### The problem:

In RNApp/App.js

importing the index file from `react-native-module`
```js
import RNModule from 'react-native-module';
```
does not work and there is a haste module map error found.

`HOWEVER` using RNModule from NativeModules does work.

```js
import { NativeModules } from 'react-native';
const { RNModule } = NativeModules;
```

I have following all the instructions including: clearing haste map module cache, watchman cache, metro bundler cache.
