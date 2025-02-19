<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<%
    String year = "2025";
%>
<head>
    <title>include 페이지</title>
</head>
<body>
    <h3>include 페이지</h3>
    <p>
        includePage.jsp 페이지의 year 변수의 값은 <%= year %> 입니다.
    </p>

    userName : ${ param.userName } <br>
    userName : <%= request.getParameter("userName") %>
</body>
</html>
