<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%--
절대 경로
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
    errorPage="/views/error/error500.jsp" %>

상대 경로
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
    errorPage="../error/error500.jsp"%>
--%>

<html>
<head>
    <title>지시자 태그</title>
</head>
<body>
<%@ include file="/views/common/header.jsp"%>

<main>
    <form action="userFormResult.jsp" method="post">
        <label for="name">이름 : </label>
        <input type="text" id="name" name="userName" />

        <br>

        <label for="age">나이 : </label>
        <input type="text" id="age" name="userAge"/>

        <br>

        <label><input type="radio" name="gender" value="남자" checked/>남자</label>
        <label><input type="radio" name="gender" value="여자"/>여자</label>

        <br>

        <label>좋아하는 음식 : </label>
        <label><input type="checkbox" name="food" value="한식">한식</label>
        <label><input type="checkbox" name="food" value="중식">중식</label>
        <label><input type="checkbox" name="food" value="일식">일식</label>
        <label><input type="checkbox" name="food" value="양식">양식</label>
        <label><input type="checkbox" name="food" value="분식">분식</label>

        <br><br>

        <input type="submit" value="전송">
        <input type="reset" value="취소">
    </form>
</main>

<%@ include file="../common/footer.jsp"%>
</body>
</html>