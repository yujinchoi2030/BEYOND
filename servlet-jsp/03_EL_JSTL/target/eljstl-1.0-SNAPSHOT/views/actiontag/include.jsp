<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>jsp:include</title>
</head>
<body>
<h2>jsp:include 액션 태그</h2>
<p>
    jsp:include 액션 태그는 다른 페이지를 포함시킬 때 사용하는 액션 태그이다.
</p>

<h3>1. include 지시어 (정적 include 방식)</h3>
<p>
    다른 페이지를 포함하는 JSP 파일이 컴파일되기 전에 페이지가 삽입된다.
</p>

<%--
<%@ include file="includePage.jsp"%>

include.jsp에서 선언된 변수를 그대로 사용할 수 있다.
include.jsp 페이지의 year 변수의 값음 <%= year %> 입니다.

<%
// 현재 페이지와 포함된 페이지의 변수명이 중복되어 에러가 발생한다.
String year = "2025";
%>
--%>

<h3>2. jsp:include 액션 태그 (동적 include 방식)</h3>
<p>
    다른 페이지를 포함하는 JSP 파일이 화면에 출력되는 시점(런타임)에 삽입된다.
</p>

<jsp:include page="includePage.jsp"/>

<%
    // 중복되는 변수명으로 선언해도 에러가 발생하지 않는다.
    String year = "2025";
%>

include.jsp 페이지의 year 변수값은 <%= year %> 입니다.

</body>
</html>
