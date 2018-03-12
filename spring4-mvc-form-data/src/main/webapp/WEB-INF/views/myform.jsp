<!DOCTYPE html>
<html>
<head>
	<title>My Input Form</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<h1><span class="label label-default">Tell us Your Name</span></h1>
	<form action="processForm" method="GET" >
		<div class="col-xs-4">
		<input type="text" class="form-control " name="personName" placeholder="What's your name?" />
		</div>
	<input class="btn btn-primary" type="submit" />
		
	</form>
	<br>
	<form action="processReqParam" method="POST" >
		<div class="col-xs-2">
		<input type="text" class="form-control " name="personName" placeholder="What's your name?" />
		</div>
	<input class="btn btn-primary" type="submit" />
		
	</form>
	<br>
	
	<p><b><a href="processPathVar/I am from a link" target="_blank">This is a link</a></b></p>
	
			
	</form>

</body>

</html>


