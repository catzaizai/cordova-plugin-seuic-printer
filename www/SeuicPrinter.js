var exec = require('cordova/exec');
module.exports = {
    printText: function(text, cb) {
        exec(function(){
            if(cb) cb();
        }, function(msg){ console.log(msg); }, 'Printer', 'print', [text]);
    }
};
