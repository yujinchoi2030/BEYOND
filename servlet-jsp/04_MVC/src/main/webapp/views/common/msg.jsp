<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>
<body>
<script>
  // 알림 메세지를 띄움
  alert("${ msg }");

  // 페이지 이동
  location.replace("${ pageContext.request.contextPath }${ location }");
</script>
</body>
</html>