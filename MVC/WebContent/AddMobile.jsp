<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix= "fo" uri ="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<fo:form action = "adddata" method = "post" commandName="my"> <!-- in place of modelAttribute we can write commandName-->

<tr>
<td>Mobile ID:</td>
<td><fo:input path = "mobId"/></td>
</tr>


<tr>
<td>Mobile Name:</td>
<td><fo:input path = "mobName"/></td>
</tr>

<tr>
<td>Mobile Price:</td>
<td><fo:input path = "mobPrice"/></td>
</tr>

<tr>
<td>Mobile Category</td>
<td><fo:select path = "mobCategory" items = "${cato}"></fo:select></td></tr>

<tr>
<td>Mobile Online</td>
<td>
<fo:radiobutton path = "online" value = "Yes"/>Yes
<fo:radiobutton path = "online" value = "No"/> NO </td>

<tr>
<td><input type = "submit" value = "Add Mobile"/></td></tr>
</fo:form>

</table>
</body>
</html>