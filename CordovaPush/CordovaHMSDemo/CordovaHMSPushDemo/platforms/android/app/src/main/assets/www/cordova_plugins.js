cordova.define('cordova/plugin_list', function(require, exports, module) {
  module.exports = [
    {
      "id": "com.huawei.cordovahmspushplugin.CordovaHMSPushPlugin",
      "file": "plugins/com.huawei.cordovahmspushplugin/www/CordovaHMSPushPlugin.js",
      "pluginId": "com.huawei.cordovahmspushplugin",
      "clobbers": [
        "cordova.plugins.CordovaHMSPushPlugin"
      ]
    }
  ];
  module.exports.metadata = {
    "cordova-plugin-whitelist": "1.3.4",
    "com.huawei.cordovahmspushplugin": "1.0.0"
  };
});