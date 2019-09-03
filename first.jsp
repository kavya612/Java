<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p> Today's date:
<%=(new java.util.Date()).toLocaleString() %>
<br/>
<%out.println("Your IP address is "+request.getRemoteAddr()); %>
<br/>
<p> Fibonacci series </p>
<%
int[] a=new int[10];
a[0]=0;
a[1]=1;
int n=10;
for(int j=2;j<n;j++) {
a[j]=a[j-1]+a[j-2];
out.println(a[j]);
}
application.setAttribute("country",String.valueOf(request.getLocale()));
out.println("<b>Locale:</b>"+application.getAttribute("country"));
%>
<h1> Implicit out object </h1>
<%out.println("Today is:"+java.util.Calendar.getInstance().getTime());
int size=out.getBufferSize();
int availsize=out.getRemaining();
int usedsize=size-availsize;%><br/>

<b> Buffering Status:</b><br/>
  <b> Total size: </b><%=size %><br/>
  <b> available size: </b><%=availsize %><br/> 
  <b>Used Size:</b><%=usedsize %> <br/>
  <%! public long fact(long x)
  {
  if(x==0) return 1;
  else return x*fact(x-1);
  }%>
  
  <h2> The factorial of number is: <%=fact(5) %> </h2>
</body>
</html>