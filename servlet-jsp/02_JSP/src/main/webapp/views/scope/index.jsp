<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>영역 객체</title>
</head>
<body>
    <h2>영역 객체</h2>

    <h3>1) Session 영역과 Application 영역의 비교</h3>
    <%
        session.setAttribute("address", "서울특별시");
        application.setAttribute("name", "홍길동");
    %>

    <a href="scopeTest1.jsp">View Details</a>

    <h3>2) Page 영역과 Request 영역의 비교</h3>

    <a href="scopeTest2.jsp">View Details</a>
</body>
</html>
