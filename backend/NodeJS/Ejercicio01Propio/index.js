var express = require('express');
var fs = require('fs');
var app = express();

app.get('/', function(req, res) {
    fs.readFile('./index.html', 'utf8', function(err, data) {
        (err) ? console.log(err) : res.send(data);
    });
});


app.listen(8080, function() {
    console.log('Escuchando por puerto 8080');
});