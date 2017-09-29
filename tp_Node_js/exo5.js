function test(){

	var http = require('http');
	var data = "";
	file = process.argv[2];

	http.get(file, function(res) {
		res.setEncoding('utf8');
		res.on('data', function(chunk) {
			data += chunk;
		});
		res.on('error', console.error);
		res.on('end', function() {
			console.log(data);
		});
	});

}


test();