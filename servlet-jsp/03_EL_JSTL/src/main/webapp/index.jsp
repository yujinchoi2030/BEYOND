<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:set var="contextPath" value="${ pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
    <title>EL/JSTL</title>
</head>
<body>
    <h2>EL/JSTL</h2>

    <h3>1. EL(Expression Language)</h3>
    <p>
        표현식 태그를 대신하여 클라이언트에 출력하고자 하는 값들을 좀 더 간결하게 사용하는 방법이다.
    </p>

    <h4>1) EL 내장 객체</h4>

    <a href="${ contextPath }/el.do">View Details</a>

    <h4>2) EL 연산자</h4>

    <a href="${ contextPath }/views/el/elOperators.jsp">View Details</a>

    <h3>1. JSP 액션 태그</h3>
    <p>
        JSP 페이지에서 자바 코드를 직접 입력하지 않고 특정 작업을 수행하는데 사용하는 태그이다.<br>
        액션 태그의 경우 웹 브라우저에서 실행되는 것이 아니라 웹 컨테이너에서 실행된다.
    </p>

    <h4>1) 표준 액션 태그</h4>
    <p>
        JSP에서 기본으로 제공하는 액션 태그로 별도의 라이브러리 설치 없이 바로 사용할 수 있다.
    </p>

    <a href="${ contextPath }/views/actiontag/include.jsp">View Details</a>
    <a href="${ contextPath }/views/actiontag/forward.jsp">View Details</a>

    <h4>2) JSTL(JSP Standard Tag Library)</h4>
    <p>
        JSP 페이지에서 자주 사용하는 코드들을 사용하기 쉽게 태그로 만들어 표준으로 제공한다.
    </p>

    <h5>2-1) JSTL Core Library</h5>
    <p>
        변수와 URL, 조건문, 반복문 등의 로직과 관련된 액션 태그를 제공한다.
    </p>

    <a href="${ contextPath }/views/jstl/core.jsp">View Details</a>

    <h5>2-2) JSTL Formatting Library</h5>
    <p>
        날짜와 시간, 숫자 데이터의 출력 형식을 지정할 때 사용하는 액션 태그를 제공한다.
    </p>

    <a href="${ contextPath }/views/jstl/formatting.jsp">View Details</a>

    <h5>2-3) JSTL Function Library</h5>
    <p>
        문자열 처리와 관련된 함수들을 EL 구문에서 사용할 수 있게 제공하는 라이브러리이다.
    </p>

    <a href="${ contextPath }/views/jstl/functions.jsp">View Details</a>

    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
    <br><br><br><br><br><br>
</body>
</html>