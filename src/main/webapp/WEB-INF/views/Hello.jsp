<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>I'm inside JSP</h3>
Hello Mr. 

   Request Param :<%= request.getAttribute("requestName") %>
   Session Param :<%= session.getAttribute("sessionName") %>
</body>
</html>