<%@ page import="com.example.entity.Employee" %>
<%@ page import="com.example.model.empModel" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: callm
  Date: 3/5/2022
  Time: 10:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%empModel em= (empModel) pageContext.findAttribute("emplist");%>
<%=em.show()%>

</body>
</html>
