var exec = require('cordova/exec');
module.exports = {
    printText: function(text, success, failure) {
        exec(function(){
            if(success) success();
        }, function(ex){
            if(failure) failure(ex);
        }, 'SeuicPrinter', 'printMethod', [text]);
    },
    checkService: function() {
        exec(function(result) {
            return result == 'true';
        }, function(){
            return false;
        }, 'SeuicPrinter', 'checkServiceMethod', []);
    }
};
