
# react-native-module

## Getting started

`$ npm install react-native-module --save`

### Mostly automatic installation

`$ react-native link react-native-module`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-module` and add `RNModule.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNModule.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNModulePackage;` to the imports at the top of the file
  - Add `new RNModulePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-module'
  	project(':react-native-module').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-module/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-module')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNModule.sln` in `node_modules/react-native-module/windows/RNModule.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Module.RNModule;` to the usings at the top of the file
  - Add `new RNModulePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNModule from 'react-native-module';

// TODO: What to do with the module?
RNModule;
```
  