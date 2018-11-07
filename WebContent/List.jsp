<%@ page import="java.util.List,com.app.bean.Student" language="java" contentType="text/html; charset=ISO-8859-1"
   isELIgnored="false" pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
listing student details


<%List<Student> students = (List<Student>)request.getAttribute("studdata"); 
	out.println("from jsp");	
	out.println(students);
	%> 

<c:out value="checking jstl"/>

<table>
	<tr>
		<th>UNO</th>
		<th>Name</th>
		<th>Gender</th>
	</tr>
	<c:forEach items="${requestScope.students}" var="stud">
		${stud}<br>
	</c:forEach>	
</table>

<input type="hidden" name="action" value="new_list"/>
</body>
</html>