var fs = require("fs");
var path = require("path");


module.exports = function(dirPath, extFile, cb) => {

	var listFile = []

		fs.readdir(dirPath, function(err, data){

			if (!!err) {
				cb(err);
				return;
			}

			for (var i in date) {
				var fileName = data[i];
				if (path.extname(fileName) === "." + extname(){
					listFile.push(fileName);
				}
				
			}

			return cb(null, listFile);
		});	

	}
