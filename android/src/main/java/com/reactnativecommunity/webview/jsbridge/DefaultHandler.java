package com.reactnativecommunity.webview.jsbridge;

public class DefaultHandler extends BridgeHandler {

  String TAG = "DefaultHandler";

  @Override
  public void handler(String data, CallBackFunction function) {
    if (function != null) {
      function.onCallBack("DefaultHandler response data");
    }
  }

}
