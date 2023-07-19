// Require the HTTP module
const http = require('http');

// Create a server object
http.createServer((req, res) => {
  // Set the response header
  res.writeHead(200, {'Content-Type': 'text/html'});

  // Set the response content
  res.write('Hello World!');

  // End the response
  res.end();
}).listen(8080);