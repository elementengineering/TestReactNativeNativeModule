### Test React Native, Native Module

This repo was created to demostrate an issue importing from a native android module (ios might be the same just untested) from a standard react native project.

`RNApp` created using `react-native init` (react-native-cli version 2.0.1)
`rn-module` created using `react-native-create-library` https://www.npmjs.com/package/react-native-create-library (version 3.1.2)

## Steps to install:
1. `cd RNApp && npm install`

## Steps to run:
1. `cd RNApp && npm run android`

### The problem:

In RNApp/App.js

importing the index file from `rn-module`
```js
import RNModule from 'react-native-module';`
```
does not work and there is a haste module map error found.

`HOWEVER` using RNModule from NativeModules does work.

```js
import { NativeModules } from 'react-native';
const { RNModule } = NativeModules;
```

I have following all the instructions including: clearing haste map module cache, watchman cache, metro bundler cache.
