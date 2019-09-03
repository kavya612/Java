<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Print Result</title>
<jsp:useBean id="st" class="com.quinnox.basics.model.Employee"/>

</head>
<body>
<jsp:setProperty name="st" property="*"/>
<h1> Employee Details</h1>
Employee Id:<jsp:getProperty property="empno" name="st"/><br>
Employee Name:<jsp:getProperty property="empname" name="st"/><br>
Employee Designation:<jsp:getProperty property="desig" name="st"/><br>

</body>
</html>