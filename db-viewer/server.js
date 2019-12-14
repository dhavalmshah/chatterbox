var express = require('express');
var app = express();

var mysqlAdmin = require('node-mysql-admin');
app.get('/', function(req, res) {
 res.redirect('/myadmin');
});
app.use(mysqlAdmin(app));
app.listen(3000, () => console.log("SQL Client started..."));