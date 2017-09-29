
var fs = require("fs");

file = process.argv[2];

var content = fs.readFile(file, function(err, data){

	if (!!err) {
		console.error(err);
		return;
	}
	console.log(data.toString().split(/\r\n|\n|\r/).length);
});