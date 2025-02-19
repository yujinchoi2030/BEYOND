<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<html>
<head>
    <title>JSTL Formatting Library</title>
</head>
<body>
    <h2>JSTL Formatting Library</h2>

    <h3>1. fmt:formatNumber 액션 태그</h3>
    <p>
        숫자 데이터의 출력 형식을 지정할 때 사용하는 액션 태그이다.
    </p>

    <fmt:formatNumber value="123456789" groupingUsed="true"/> <br>
    숫자 그대로 출력 : <fmt:formatNumber value="123456789" groupingUsed="fasle"/><br><br>

    <%--
      pattern 속성
        - 출력하는 숫자 데이터의 패턴을 지정한다.
        - #, 0을 패턴 기호로 사용한다.
        - 패턴 기호가 부족한 부분에 대해서는 #은 표시하지 않지만 0은 0으로 표시한다.
        - 패턴 기호를 초과하는 부분은 반올림한다.
    --%>
    pattern="#.###": <fmt:formatNumber value="1.23" pattern="#.###"/><br>
    pattern="0.000": <fmt:formatNumber value="1.23" pattern="0.000"/><br>
    number: <fmt:formatNumber value="50000"/><br> <%--type="number" 생략--%>
    currency: <fmt:formatNumber value="50000" type="currency"/><br>
    currency (currencySymbol="$"): <fmt:formatNumber value="50000" type="currency" currencySymbol="$"/><br>
    percent: <fmt:formatNumber value="0.7" type="percent"/><br>

    <h3>2. fmt:formatDate 액션 태그</h3>
    <p>
        날짜와 시간의 데이터 형식을 지정할 때 사용하는 액션 태그이다.
    </p>

    <c:set var="now" value="<%= new Date() %>"/>

    <ul>
        <li>${ now }</li>
        <li><fmt:formatDate value="${ now }"/></li>
        <li><fmt:formatDate type="date" value="${ now }"/></li>
        <li><fmt:formatDate type="time" value="${ now }"/></li>
        <li><fmt:formatDate type="both" value="${ now }"/></li>
        <li><fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${ now }"/></li>
        <li><fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${ now }"/></li>
        <li><fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${ now }"/></li>
        <li><fmt:formatDate type="both" dateStyle="full" timeStyle="full" value="${ now }"/></li>
        <li><fmt:formatDate type="both" pattern="yyyy-MM-dd(E) HH:mm:ss(a)" value="${ now }"/></li>
    </ul>

</body>
</html>
