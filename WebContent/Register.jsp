<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register</title>
<style type="text/css">

table, th ,td {
    border: 1px solid black;
}

</style>
</head>
<body>
	Registering new students

	<form action="Controller" method="get">

		<table>
			<tr>
				<th>Enter your credentials</th>
			</tr>
			<tr>
				<td>univ_no</td>
				<td><input type="text" name="univ_no" />
			</tr>
			<tr>
				<td>gender</td>
				<td><input type="text" name="gender" />
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" />
			</tr>
			
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
			
			<input type="hidden" name="action" value="new_register"/>
		</table>
	</form>

</body>
</html>