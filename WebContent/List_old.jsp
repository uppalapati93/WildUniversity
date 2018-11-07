<%@ page import="java.util.List,com.app.bean.Student" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
listing student details

<%List<Student> students = (List<Student>)request.getAttribute("studdata"); 
	
%>

<table>
	<tr>
		<th>UNO</th>
		<th>Name</th>
		<th>Gender</th>
	</tr>
	<%for(Student s: students ){ %>
		<tr>
			<td><%=s.getUniv_num()%></td>
			<td><%=s.getName()%></td>
			<td><%=s.getGender()%></td>
		
		</tr>
	<%} %>	
</table>

<input type="hidden" name="action" value="new_list"/>
</body>
</html>