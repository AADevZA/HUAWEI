var exec = require('cordova/exec');

exports.getToken = function (arg0, success, error) {
    exec(success, error, "CordovaHMSPushPlugin", "getToken", [arg0]);
}
