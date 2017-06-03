<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Create Object from JSON String</h2>

<p id="demo"></p>

<script>
var text = '{"state":['+'{"name":"Kerala","shortname":"KL","capital":"TRIVANDRUM","language":"Malayalam" },' +
'{"name":"Karntaka","shortname":"KA","capital":"Banglore","language":"Kannada" },' +
'{"name":"Tamilnadu","shortname":"TN","capital":"Chennai","language":"Tamil" } ]}';

obj = JSON.parse(text);
document.getElementById("demo").innerHTML =
obj.state[1].name +
" "+obj.state[1].shortname + " "+obj.state[1].capital + " "+obj.state[1].language;
</script>
</body>
</html>