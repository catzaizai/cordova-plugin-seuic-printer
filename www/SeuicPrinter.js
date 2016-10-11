var exec = require('cordova/exec');
module.exports = {
    printText: function(text, success, failure) {
        exec(function(){
            if(success) success();
        }, function(ex){
            if(failure) failure(ex);
        }, 'SeuicPrinter', 'printMethod', [text]);
    },
    checkService: function(cb) {
        exec(function(result) {
            if(cb){ cb(result == 'true') }
        }, function(){
            if(cb){ cb(false) }
        }, 'SeuicPrinter', 'checkServiceMethod', []);
    }
};
