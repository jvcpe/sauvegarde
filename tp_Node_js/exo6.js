var net = require("net");

var port = Number(process.argv[2]);

function test( {
	
	var server = net.createServer();

	server.on('connection', function(socket) {

		socket.write('' + new Date() + '\n');
		socket.end();
	});

	server.listen(port);
})

test();