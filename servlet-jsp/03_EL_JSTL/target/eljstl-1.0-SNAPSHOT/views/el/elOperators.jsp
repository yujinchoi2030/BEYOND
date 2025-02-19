<%@ page import="com.beyond.eljstl.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>EL 연산자</h2>

    <h3>1. 산술 연산자</h3>
    ${10 + 5} <br>
    ${10 - 5} <br>
    ${10 * 5} <br>
    ${10 / 5} 또는 ${10 div 5} <br>
    ${10 % 3} 또는 ${10 mod 3}<br>

    <h3>2. 논리 연산자</h3>
    ${ true && false } 또는 ${ true and false } <br>
    ${ true || false } 또는 ${ true or false } <br>
    ${ !(10 > 5) } 또는 ${ not(10 > 5) } <br>

    <h3>3. 비교 연산자</h3>
    <h4>1) 수지 비교 연산</h4>
    <%
        int big = 10;
        int small = 3;

        request.setAttribute("big", big);
        request.setAttribute("small", small);
    %>

    <%-- 표현식 태그 : <%= big > small %> --%>
    <%-- object 타입의 산술 연산은 성립되지 않는다. (Integer) 로 변환 필요 (객체 간 산술이라) --%>
    표현식 태그 : <%= (Integer) request.getAttribute("big") + (Integer) request.getAttribute("small") %> <br>
    <%-- object 타입의 비교 연산은 성립되지 않는다. (Integer) 로 변환 필요 (객체 간 비교라)--%>
    표현식 태그 : <%= (Integer) request.getAttribute("big") > (Integer) request.getAttribute("small") %> <br>
    <br>
    <%-- EL은 영역 객체의 속성을 자동으로 형 변환 후 연산을 처리한다. --%>
    EL (big + small) : ${ big + small } <br>
    EL (big > small) : ${ big > small } 또는 ${ big gt small }<br>
    EL (big < small) : ${ big < small } 또는 ${ big lt small }<br>
    EL (big >= small) : ${ big >= small } 또는 ${ big ge small }<br>
    EL (big <= small) : ${ big <= small } 또는 ${ big le small }<br>
    EL (big == small) : ${ big == small } 또는 ${ big eq small }<br>
    EL (big != small) : ${ big != small } 또는 ${ big ne small }<br>

    <h4>2) 객체의 동등 비교</h4>
    <%
        String str1 = "Hello";
        String str2 = new String("Hello");
        Student student1 = new Student("홍길동",20,80,80);
        Student student2 = new Student("홍길동",20,80,80);

        request.setAttribute("str1", str1);
        request.setAttribute("str2", str2);
        request.setAttribute("student1", student1);
        request.setAttribute("student2", student2);
    %>

    표현식 태그 (str1 == str2) : <%= str1 == str2 %><br> <%-- 주소값을 비교하기에 == 는 안댐 --%>
    표현식 태그 (str1.equals(str2)) : <%= str1.equals(str2) %><br>
    <br>
    <%-- EL에서 객체의 == 연산은 equals() 와 같은 동작을 한다. --%>
    EL (str1 == str2) : ${ str1 == str2 }<br>
    EL (str1 == str2) : ${ str1 != str2 }<br>
    <br>
    <%-- @EqualsAndHashCode 를 추가하면 같은 값을 가지는 객체는 동일값으로 인식 --%>
    EL (student1 == student2) : ${ student1 == student2 }<br>
    EL (student1 != student2) : ${ student1 != student2 }<br>

    <h4>3) 객체의 null 비교</h4>
    <%
        String str = null;
        List<String> names = new ArrayList<>();

        request.setAttribute("str", str);
        request.setAttribute("names", names);
    %>

    표현식 태그 : str == null: (<%= str == null %>), names == null : (<%= names == null %>), names.isEmpty() : (<%= names.isEmpty() %>)
    <br>
    EL : str == null : (${ str == null }), names == null : (${ names == null })
    <br>
    EL : empty str : (${ empty str }), empty names : (${ empty names })
</body>
</html>
