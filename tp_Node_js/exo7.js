var http = require('http');
var CONFIG = require('./exo7json.json');
var url = require('url');
var fs = require('fs');
var path = require('path');

var server = http.createServer(function(req, res) {
	
	var filePath =  url.parse(req.url).pathname;
	filePath = path.join(CONFIG.publicDir, filePath);

	fs.access(filePath, fs.constants.R_OK, function(err) { 
		if (!!err) {
			console.log(filePath + ':404');
			res.writeHead(404);
			return res.end('Not found !');
		}

		fs.readFile(filePath, fs.constants.R_OK, function(err, data){
			
			if (!!err) {
				console.log(filePath + ':500');
				res.writeHead(500);
				return res.end('ERROR 500');
			}

			res.writehead(200);
			return res.end(data);
		})
	})

});

server.listen(CONFIG.port, function(err) {
	if (!!err) {
		console.error(err);
		return;
	}

	console.log('server strated');
})