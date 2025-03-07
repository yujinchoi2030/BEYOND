<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>

<html>
<head>
    <title>JSTL Function Library</title>
</head>
<body>
    <h2>JSTL Function Library</h2>

    <c:set var="str" value="java mariadb HTML5 CSS3 Javascript Servlet JSP"/>

    원본 : ${ str }

    <br><br>

    문자열의 길이 : ${ fn:length(str) }
    <br>
    대문자로 변경 : ${ fn:toUpperCase(str) }
    <br>
    소문자로 변경 : ${ fn:toLowerCase(str) }

    <br><br>

    원본 : ${ str }
</body>
</html>
