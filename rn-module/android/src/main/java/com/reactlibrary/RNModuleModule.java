
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNModuleModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNModuleModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public void helloWorld(Callback callback) {
  	callback.invoke("Hello World From RNModule");
  }

  @Override
  public String getName() {
    return "RNModule";
  }
}