<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="display.jsp">
<jsp:param name="name" value="Raj" />
<jsp:param name="company" value="Quinnox"/>
<jsp:param name="technology" value="jsp forward action"/>
<jsp:param name="reqfrom" value="fwdDemo1.jsp"/>
</jsp:forward>
</body>
</html>