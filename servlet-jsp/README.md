## 웹 통신 개요
### 1. 웹 서버(Web Server)
* 웹에서 서버 기능을 수행하는 프로그램으로 HTML 문서나 JPG, PNG 같은 이미지를 HTTP 프로토콜을 통해 웹 브라우저에 제공하는 서버이다.
* 서버 내부의 이미 만들어져 있는 정적인 요소들을 클라이언트에 제공하는 역할을 한다.
* 웹 서버의 종류
  |서버|설명|
  |--|--|
  |Apache|Apache Software Foundation에서 만든 웹 서버로 HTTP 통신에 대한 여러 라이브러리 제공한다.|
  |NGINX|무료 오픈 소스 서버로 사용자 요청을 스레드가 아닌 확장성이 있는 이벤트 기반 설계로 리소스만 할당해 사용한다.|
  |Windows IIS|Window OS에서 제공하는 웹 서버로 높은 수준의 보안성과 성능 제공한다.|
### 2. 웹 애플리케이션 서버(Web Application Server)
* 웹 서버가 할 수 없는 다양한 비즈니스 로직을 수행하고 동적인 페이지를 만들어 웹 브라우저에 제공하는 서버이다.
* 웹 애플리케이션 서버는 웹 서버와 컨테이너로 구성된다.
* 웹 애플리케이션 서버의 종류
  |서버|설명|
  |--|--|
  |Tomcat|Apache Software Foundation에서 Servlet과 JSP를 통한 동적인 웹 문서를 처리하기 위해 만든 웹 애플리케이션 서버이다.|
  |Wildfly|Jboss라고도 불리며 톰캣이 제공하는 Servlet Container뿐만 아니라 EJB Container를 별도로 제공하여 폭넓은 서비스 구현할 수 있다.|
  |Jeus|국산 WAS, 대용량 데이터 트랜잭션을 고성능으로 처리하며 개발 및 운영에 관한 기술 지원이 뛰어나다.|
### 3. 컨테이너
#### 3.1. 서블릿 컨테이너
* 서블릿 컨테이너는 클라이언트의 요청에 따라 서블릿을 수행하는 역할을 한다.
#### 3.2. JSP 컨테이너
* JSP 컨테이너는 JSP를 서블릿으로 변환하는 역할을 한다. 
* JSP 컨테이너는 JSP 파일을 서블릿으로 변환 및 컴파일까지만 담당하는 프로그램이며, 변환된 서블릿의 수행은 서블릿 컨테이너가 담당한다.
## 아파치 메이븐(Apache Maven)
### 1. 아파치 메이븐(Apache Maven)
* 메이븐(Maven) 이란 자바용 프로젝트 관리 도구로 프로젝트의 빌드 과정을 자동화해주는 프레임워크이다.
* POM(Project Object Model) XML 문서를 통해 해당 프로젝트의 버전 정보 및 빌드, 라이브러리 정보들을 통합하여 관리한다.
### 2. POM(Project Object Model)
* 프로젝트에서 사용하는 자바 버전, 라이브러리, 플러그인 구성을 통합하여 관리할 수 있게 설정 정보를 XML로 문서화한 것을 말한다.
* 메이븐으로 프로젝트를 생성하면 프로젝트 최상위 디렉터리에 pom.xml 파일이 생성된다. (프로젝트에 1개의 파일만 존재)
* pom.xml에서는 주로 프로젝트 정보, 빌드 환경, 의존성 등을 설정한다.
  ```xml
  <project>
    <!-- 프로젝트 정보 설정 -->
    <modelVersion>4.0.0</modelVersion> 
    <groupId>com.ismoon</groupId> 
    <artifactId>spring</artifactId> 
    <name>springProject</name> 
    <version>1.0</version>

    <!-- 의존성 설정 -->
    <dependencies> 
      <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>3.8.1</version>
        <scope>test</scope> 
      </dependency>
    </dependencies>
  </project>
  ```
## 서블릿(Servlet)
### 1. 애플릿(Applet)
* 웹 브라우저에서 실행되는 자바 응용프로그램으로 서버에서 클라이언트 쪽으로 실행 파일을 내려받아서 실행되는 방식이다.
* 현재는 HTML5, CSS3, JavaScript 등의 기술들의 발전으로 애플릿을 사용하고 있지 않다.
### 2. 서블릿
* Server Side Applet으로 자바 언어로 구현되는 서버 프로그램이다.
* 서블릿은 웹 브라우저로부터 요청을 받아 처리하고 결과를 다시 웹 브라우저로 전송하는 역할을 한다.
* 일반적인 자바 클래스와 다르게 `jakarta.servlet.http.HttpServlet` 클래스를 상속해야 한다.
* HttpServlet 클래스는 서블릿이 웹상에서 HTTP 프로토콜을 이용해 서비스를 처리하기 위해 반드시 상속해야 하는 클래스이다.
  ```java
  public class 클래스명 extends HttpServlet {
    ...
  }
  ```
### 3.서블릿 메소드
#### 3.1. doGet()
* 클라이언트에서 GET 방식으로 요청이 전송될 경우 호출되는 메소드이다. 
  ```java
  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    // GET 요청에 응답할 로직을 구현
  }
  ```
#### 3.2. doPost()
* 클라이언트에서 POST 방식으로 요청이 전송될 경우 호출되는 메소드이다. 
  ```java
  protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    // POST 요청에 응답할 로직을 구현
  }
  ```
### 4. 요청 객체와 응답 객체
#### 4.1. HttpServletRequest
* 클라이언트(웹 브라우저)에서 서버에 보내는 요청 정보를 제공하는 객체이다.
* jakarta.servlet.ServletRequest를 상속한다.
* 주요 메소드
  <table>
    <tr>
      <th>메소드명</th>
      <th>내용</th>
    </tr>
    <tr>
      <td>getParameter(String)</td>
      <td>client가 보내준 값이 저장된 명칭이 매개변수와 같은 명칭에 저장된 값을 불러오는 메소드</td>
    </tr>
    <tr>
      <td>getParameterNames()</td>
      <td>client가 보내준 값을 저장한 명칭을 불러오는 메소드</td>
    </tr>
    <tr>
      <td>getParameterValues(String)</td>
      <td>client가 보내준 값이 여러 개일 경우 그 값을 배열로 불러오는 메소드</td>
    </tr>
    <tr>
      <td>getParameterMap()</td>
      <td>client가 보내준 값이 전체를 Map 방식으로 불러오는 메소드</td>
    </tr>
    <tr>
      <td>setAttribute(String, object)</td>
      <td>request 객체에 전달하고 싶은 값을 String 이름으로 Object 저장하는 메소드</td>
    </tr>
    <tr>
      <td>getAttribute(String)</td>
      <td>매개변수와 동일한 객체 속성값 불러오는 메소드</td>
    </tr>
    <tr>
      <td>removeAttribute(String)</td>
      <td>request 객체에 저장되어 있는 매개변수와 동일한 속성값 삭제하는 메소드</td>
    </tr>
    <tr>
      <td>setCharacterEncoding(String)</td>
      <td>전송받은 request 객체의 값들의 CharaterSet을 설정해 주는 메소드</td>
    </tr>
    <tr>
      <td>getRequestDispatcher(String)</td>
      <td>컨테이너 내에서 request, response 객체를 전송하여 처리할 컨포넌트(jsp파일 등)를 불러오는 메소드 forward() 메소드와 같이 사용</td>
    </tr>
  </table>
#### 4.2 HttpServletResponse
* 서버가 클라이언트(웹 브라우저)로 보내는 응답 정보를 처리하는 객체이다.
* jakarta.servlet.ServletResponse를 상속한다.
* 주요 메소드
  <table>
    <tr>
      <th>메소드명</th>
      <th>내용</th>
    </tr>
    <tr>
      <td>setContentType(String)</td>
      <td>응답으로 작성하는 페이지의 MIME type을 정하는 메소드</td>
    </tr>
    <tr>
      <td>setCharacterEncoding(String)</td>
      <td>응답하는 데이터의 CharacterSet을 지정해 주는 메소드</td>
    </tr>
    <tr>
      <td>getWriter()</td>
      <td>문자를 페이지에 전송을 위한 Stream을 가져오는 메소드</td>
    </tr>
    <tr>
      <td>getOutputStream()</td>
      <td>byte 단위로 페이지에 전송을 위한 Stream을 가져오는 메소드</td>
    </tr>
    <tr>
      <td>sendRedirect(String)</td>
      <td>client가 매개변수의 페이지를 다시 서버에 요청하게 하는 메소드</td>
    </tr>
  </table>
### 5. 서블릿 매핑
* 사용자의 요청을 서블릿에게 전달하기 위해서는 서블릿을 등록하고 매핑해야 한다.
* 서블릿을 등록하고 매핑하는 방법은 web.xml과 @annotation을 이용하는 방법이 있다.
  ```xml
  <servlet>
     <servlet-name>서블릿 이름</servlet-name>
     <servlet-class>서블릿 클래스</servlet-class>
  </servlet>
  <servlet-mapping>
      <servlet-name>서블릿 이름</servlet-name>
      <url-pattern>접근 URL 패턴</url-pattern>
  </servlet-mapping>
  ```
  ```java
  @WebServlet("접근 URL 패턴")
  public class 서블릿이름 extends HttpServlet{
    // servlet code
  }
  ```
### 6. 배포 서술자 (Deployment Descriptor)
* 배포 서술자(Deployment Descriptor)는 애플리케이션에 대한 전체 설정 정보를 가지고 있는 파일이다.
* 배포 서술자의 정보를 가지고 웹 컨테이너가 서블릿 구동한다. 
* 웹 애플리케이션 폴더의 WEB-INF 폴더에 web.xml 파일이 배포 서술자이다.
* 설정 정보
  * Servlet 정의, Servlet 초기화 파라미터
  * Session 설정 파라미터
  * Servlet/JSP 매핑, MIME type 매핑
  * 보안 설정
  * Welcome file list 설정
  * 에러 페이지 리스트, 리소스, 환경 변수
### 7. 서블릿 생명주기
* 첫 번째 요청일 경우, 서블릿 객체를 생성하고 init() 메소드를 호출한다.
  * 이후 요청에 대해서는 서블릿 객체 생성, init()메소드는 호출하지 않는다.
* 다음에 service() 메소드가 클라이언트 요청 방식에 따라 doGet() 또는 doPost() 메소드를 호출한다.
* 최종적으로 서블릿이 서비스되지 않았을 때 destroy() 메소드를 호출한다. 
  * destroy() 메소드는 보통 서버가 종료되었을 때, 서블릿의 내용이 변경되어 재 컴파일 될 때 호출된다.
## JSP
### 1. JSP(Java Server Page)
* 서블릿은 자바 언어로 동적인 페이지를 구현해야 한다.
* JSP는 HTML 코드 안에서 스크립트 형태로 자바 언어를 사용하여 동적인 페이지를 구현한다.
  <table>
    <tr>
      <th></th>
      <th>Servlet</th>
      <th>JSP</th>
    </tr>
    <tr>
      <td>형태</td>
      <td>Java 코드에 HTML 코드 삽입</td>
      <td>HTML 코드에 Java 코드 삽입</td>
    </tr>
    <tr>
      <td>예시</td>
      <td>out.println("&lt;HTML&gt;");</td>
      <td>&lt;% for(int k = 0; k &lt; 10; k++){ %&gt;</td>
    </tr>
    <tr>
      <td>특징</td>
      <td>비즈니스 로직 처리에 적합</td>
      <td>화면 로직 처리에 적합</td>
    </tr>
  </table>
* JSP의 목표는 서블릿의 비즈니스 로직으로부터 화면 로직을 분리하는 것을 목표로 한다.
### 2. JSP 실행 과정
* 웹 컨테이너는 클라이언트로부터의 요청이 JSP에 대한 요청일 경우 먼저 JSP 파일을 자바 코드(서블릿)로 변환한다.
* 변환된 자바 코드(서블릿)를 컴파일하고 서블릿 인스턴스를 생성한다.
* 서블릿 인스턴스가 생성되면 서블릿의 라이프 사이클을 거치면서 클라이언트의 요청을 처리해 준다.
### 3. JSP 특징
* 자바 언어를 이용하기 때문에 대부분의 운영체제에서 사용이 가능하다.
* 서버 자원을 효율적으로 사용한다. (요청을 스레드 단위로 처리)
* MVC 패턴을 쉽게 적용할 수 있다.
* JSP 파일의 배포 위치는 HTML 파일과 동일하다.
### 4. JSP 요소
* JSP는 동적인 페이지를 만들기 위해 다양한 스크립팅 요소를 제공한다.
* JSP 스크립팅 요소들은 <%로 시작해서 %>로 끝나는 것이 특징이다.
  <table>
    <tr>
      <th>태그</th>
      <th>표기법</th>
    </tr>
    <tr>
      <td>주석(Comment) 태그</td>
      <td>&lt;%-- 주석 --%&gt;</td>
    </tr>
    <tr>
      <td>지시자(Directive) 태그</td>
      <td>&lt;%@ 지시자 %&gt;</td>
    </tr>
    <tr>
      <td>선언문(Declaration) 태그</td>
      <td>&lt;%! 선언문 %&gt;</td>
    </tr>
    <tr>
      <td>스크립트릿(Scriptlet) 태그</td>
      <td>&lt;% 코드 %&gt;</td>
    </tr>
    <tr>
      <td>표현식(Expression) 태그</td>
      <td>&lt;%= 표현식 %&gt;</td>
    </tr>
  </table>
#### 4.1. 지시자(Directive) 태그
* JSP 페이지 전체에 영향을 미치는 정보를 기술할 때 쓰인다.
  ```
  <%@ 지시자 [속성 명="value"] … %>
  ```
* page 지시자는 JSP 페이지에 대한 속성을 지정한다.
* page 지시자는 JSP 파일 어느 위치에 와도 상관없으나 가장 첫 부분에 작성한다.
  ```
  <%@ page import="java.io.*"%>
  <%@ page contentType="text/html;charset=UTF-8"%>
  <%@ page isErrorPage="true" %> * 
  <%@ page errorPage="/error/errorForm.jsp" %>
  ```
* include 지시자는 다른 페이지(JSP, HTML)를 포함할 때 사용하는 지시자이다.
  ```
  <%@ include file="footer.html" %>
  ```
* taglib 지시자는 JSP에서 사용할 태그 라이브러리를 지정한다.
  ```
  <%@ taglib prefix="c" uri="jakarta.tags.core" %>
  ```
#### 4.2. 선언문(Declaration) 태그
* 서블릿 클래스의 필드와 메소드를 선언할 때 사용한다.
  ```
  <%! public static final String DEFAULT_NAME = "홍길동"; %>
  <%! int counter = 0; %>

  <%!
    public String getName(HttpServletRequest request){
      return request.getParameter("name");
    }
  %>
  ```
#### 4.3. 스크립트릿(Scriptlet) 태그
* _jspService() 메소드의 로컬(지역) 변수와 자바 코드를 작성할 때 사용한다.
  ```
  <% int i = 10; %>

  <% if(i > 10) { %>
    ... 
  <% } else { %>
    ...
  <% } %>
  ```
#### 4.4. 표현식(Expression) 태그
* 서블릿 코드에서 out.print()의 역할 수행하는 태그로 클라이언트로 데이터를 출력하는 코드를 작성할 때 사용한다.
  ```
  현재 시간은 <%= new java.util.Date() %> 입니다.
  ```
### 5. JSP 내장 객체
* JSP에서 기본적으로 제공하는 객체들로 request, response, out 등 스크립트릿 태그와 표현식 태그에서 사용할 수 있게 선언된 객체이다.
#### 5.1. JSP 내장 객체 종류
* JSP에서 기본적으로 제공하는 객체들은 아래와 같다. 
  <table>
    <tr>
      <th>내장 객체 명</th>
      <th>설명</th>
    </tr>
    <tr>
      <td>request</td>
      <td>HttpServletRequest 객체 참조 변수</td>
    </tr>
    <tr>
      <td>response</td>
      <td>HttpServletResponse 객체 참조 변수</td>
    </tr>
    <tr>
      <td>out</td>
      <td>JspWriter 객체 참조 변수</td>
    </tr>
    <tr>
      <td>session</td>
      <td>HttpSession 객체 참조 변수</td>
    </tr>
    <tr>
      <td>application</td>
      <td>ServletContext 객체 참조 변수</td>
    </tr>
    <tr>
      <td>page</td>
      <td>현재 JSP 페이지에 대한 참조 변수</td>
    </tr>
    <tr>
      <td>pageContext</td>
      <td>JSP 페이지와 관련된 다른 내장 객체를 얻어내는 객체</td>
    </tr>
    <tr>
      <td>config</td>
      <td>JSP 페이지에 대한 설정 정보를 저장하고 있는 객체</td>
    </tr>
    <tr>
      <td>exception</td>
      <td>발생하는 Throwable 객체에 대한 참조 변수</td>
    </tr>
  </table>
### 6. JSP 내장 객체 영역
* Page < Request < Session < Application 영역 순으로 범위가 넓다.
  <table>
    <tr>
      <th>영역</th>
      <th>설명</th>
    </tr>
    <tr>
      <td>Page</td>
      <td>하나의 JSP 페이지를 처리할 때 사용되는 영역<br>pageContext 내장 객체를 통해 접근할 수 있는 영역</td>
    </tr>
    <tr>
      <td>Request</td>
      <td>하나의 요청을 처리할 때 사용되는 영역<br>request 내장 객체를 통해 접근할 수 있는 영역</td>
    </tr>
    <tr>
      <td>Session</td>
      <td>하나의 브라우저와 관련된 영역<br>session 내장 객체를 통해 접근할 수 있는 영역</td>
    </tr>
    <tr>
      <td>Application</td>
      <td>하나의 웹 애플리케이션과 관련된 영역<br>application 내장 객체를 통해 접근할 수 있는 영역</td>
    </tr>
  </table>
## EL / JSTL
### 1. EL
* EL(Expression Language)은 JSP 2.0버전에서 추가된 표현 언어이다.
* 표현식(Expression) 태그를 대신하여 클라이언트에 출력하고자 하는 값들은 좀 더 간결하게 사용하는 방법이다.
  ```
  <%= request.getParameter("name") %>

  ${ param.name }
  ```
#### 1.1. EL 내장 객체
* EL 구문 내에서 사용할 수 있는 내장 객체는 아래와 같다.
  <table>
  <tr>
      <th>객체 명</th>
      <th>설명</th>
  </tr>
  <tr>
      <td>pageScope</td>
      <td>Page 영역 객체에 접근</td>
  </tr>
  <tr>
      <td>requestScope</td>
      <td>Request 영역 객체에 접근</td>
  </tr>
  <tr>
      <td>sessionScope</td>
      <td>Session 영역 객체에 접근</td>
  </tr>
  <tr>
      <td>applicationScope</td>
      <td>Application 영역 객체에 접근</td>
  </tr>
  <tr>
      <td>param</td>
      <td>전달된 파라미터 값을 받아올 때 사용</td>
  </tr>
  <tr>
      <td>paramValues</td>
      <td>전달된 파라미터들을 배열로 받아올 때 사용</td>
  </tr>
  <tr>
      <td>header</td>
      <td>사용자의 특정 헤더 정보를 받아올 때 사용</td>
  </tr>
  <tr>
      <td>headerValues</td>
      <td>사용자의 헤더 정보를 배열로 받아올 때 사용</td>
  </tr>
  <tr>
      <td>cookie</td>
      <td>${cookie.key명}으로 쿠키 값 조회</td>
  </tr>
  <tr>
      <td>initParam</td>
      <td>초기 파라미터 조회</td>
  </tr>
  <tr>
      <td>pageContext</td>
      <td>pageContext 경로 조회</td>
  </tr>
  </table>
#### 1.2. EL 연산자 
* EL 구문에서 사용할 수 있는 연산자는 아래와 같다.
  <table>
  <tr>
      <th></th>
      <th>일반 연산자</th>
      <th>EL 기호 연산자</th>
  </tr>
  <tr>
      <td>덧셈, 뺄셈</td>
      <td>+, -</td>
      <td>+, -</td>
  </tr>
  <tr>
      <td>곱셈, 나눗셈</td>
      <td>*, /</td>
      <td>*, div</td>
  </tr>
  <tr>
      <td>나머지 연산</td>
      <td>%</td>
      <td>mod</td>
  </tr>
  <tr>
      <td>and 연산</td>
      <td>&amp;&amp;</td>
      <td>and</td>
  </tr>
  <tr>
      <td>or 연산</td>
      <td>||</td>
      <td>or</td>
  </tr>
  <tr>
      <td>! 연산</td>
      <td>!</td>
      <td>not</td>
  </tr>
  <tr>
      <td>작다</td>
      <td>&lt;</td>
      <td>lt(less than)</td>
  </tr>
  <tr>
      <td>크다</td>
      <td>&gt;</td>
      <td>gt(greater than)</td>
  </tr>
  <tr>
      <td>작거나 같다</td>
      <td>&lt;=</td>
      <td>le(less or equal)</td>
  </tr>
  <tr>
      <td>크거나 같다</td>
      <td>&gt;=</td>
      <td>ge(greater or equal)</td>
  </tr>
  <tr>
      <td>같다</td>
      <td>==</td>
      <td>eq(equal)</td>
  </tr>
  <tr>
      <td>다르다</td>
      <td>!=</td>
      <td>ne(not equal)</td>
  </tr>
  <tr>
      <td>null 값 처리</td>
      <td>value== null</td>
      <td>empty</td>
  </tr>
  </table>

#### 1.3. EL 연산자 우선순위
* 연산자 우선순위는 아래와 같다.
  <table>
    <tr>
      <th>순위</th>
      <th>기호</th>
    </tr>
    <tr>
      <td>1</td>
      <td>[], .</td>
    </tr>
    <tr>
      <td>2</td>
      <td>( )</td>
    </tr>
    <tr>
      <td>3</td>
      <td>not, !, empty</td>
    </tr>
    <tr>
      <td>4</td>
      <td>*, /, div, %, mod</td>
    </tr>
    <tr>
      <td>5</td>
      <td>+, -</td>
    </tr>
    <tr>
      <td>6</td>
      <td>&lt;, &lt;=, &gt;, &gt;=, lt, le, gt, ge</td>
    </tr>
    <tr>
      <td>7</td>
      <td>==, !=, eq, ne</td>
    </tr>
    <tr>
      <td>8</td>
      <td>&amp;&amp;, and</td>
    </tr>
    <tr>
      <td>9</td>
      <td>||, or</td>
    </tr>
    <tr>
      <td>10</td>
      <td>? :(삼항 연산자)</td>
    </tr>
  </table>
### 2. JSP 액션 태그
* JSP 페이지에서 자바 코드를 직접 입력하지 않고 특정 작업을 수행하는데 사용하는 태그이다.
* 액션 태그의 경우 웹 브라우저에서 실행되는 것이 아니라 웹 컨테이너에서 실행된다.
  <table>
    <tr>
      <th></th>
      <th>표준 액션 태그</th>
      <th>커스텀 액션 태그</th>
    </tr>
    <tr>
      <td>사용법</td>
      <td>JSP 페이지에서 바로 사용<br>태그 앞에 jsp 접두어가 붙음</td>
      <td>별도의 라이브러리 설치 필요<br>라이브러리 선언에 맞는 접두어가 붙음</td>
    </tr>
    <tr>
      <td>사용 <br>예시</td>
      <td>&lt;jsp:include page="../sample.jsp"/&gt;</td>
      <td>&lt;c:set var="count" value="0"/&gt;</td>
    </tr>
  </table>
### 3. 표준 액션 태그
* JSP에서 기본으로 제공하는 액션 태그로 별도의 라이브러리 설치 없이 바로 사용할 수 있다.
  <table>
    <tr>
      <th>태그 명</th>
      <th>설명</th>
    </tr>
    <tr>
      <td>jsp:include</td>
      <td>현재 페이지에 특정 페이지를 포함할 때 사용</td>
    </tr>
    <tr>
      <td>jsp:forward</td>
      <td>현재 페이지 접근 시 특정 페이지로 이동 (pageContext.forward()와 동일)</td>
    </tr>
    <tr>
      <td>jsp:param</td>
      <td>&lt;jsp:include&gt;, &lt;jsp:forward&gt;의 하위 요소로 사용되며 해당 페이지에 전달할 값을 기록할 때 사용</td>
    </tr>
  </table>
#### 3.1. jsp:include 액션 태그
* include 액션 태그는 다른 페이지를 포함 시킬 때 사용하는 액션 태그이다.
* include 지시자와 다르게 include 액션 태그는 런타임 시에 포함된다.
  ```
  <jsp:include page="포함할 페이지" />
  ```
#### 3.2. jsp:forward 액션 태그
* forward 액션 태그는 다른 페이지로 요청을 전달할 때 사용하는 액션 태그이다.
* 요청을 전달하는 페이지에서 request, response 객체가 함께 전달되며 URL은 변경되지 않는다.
  ```
  <jsp:forward page="이동할 페이지" />
  ```
### 4. JSTL(JSP Standard Tag Library)
* JSP Standard Tag Library의 약자로 JSP에서 사용하는 커스텀 태그이다.
* JSP 페이지에서 자주 사용하는 코드들을 사용하기 쉽게 태그로 만들어 표준으로 제공한다.
#### 4.1. JSTL 라이브러리 등록
* [메이븐 저장소](https://mvnrepository.com/)에서 JSTL 라이브러리를 다운로드한다.
* JSTL 라이브러리는 JSP 페이지에서 taglib 지시자로 선언해야 사용이 가능하다.
  ```
  <%@ taglib uri="jakarta.tags.core" prefix="c" %>
  ```
#### 4.2. JSTL 태그 종류
* JSTL은 용도에 따라 다양한 종류의 태그들을 제공한다.
  <table>
    <tr>
      <th>태그 명</th>
      <th>설명</th>
    </tr>
    <tr>
      <td>Core Tags</td>
      <td>변수와 url, 조건문, 반복문 등의 로직과 관련된 액션 태그를 제공한다.<br>&lt;%@ taglib uri="jakarta.tags.core" prefix="c" %&gt;</td>
    </tr>
    <tr>
      <td>Formatting Tags</td>
      <td>메시지 형식이나 숫자, 날짜 형식과 관련된 액션 태그를 제공한다.<br>&lt;%@ taglib uri="jakarta.tags.fmt" prefix="fmt"%&gt;</td>
    </tr>
    <tr>
      <td>Function</td>
      <td>trim, substring과 같은 여러 문자열 처리 함수를 제공한다.<br>&lt;%@ taglib uri="jakarta.tags.functions" prefix="fn"%&gt;</td>
    </tr>
    <tr>
      <td>XMLTags</td>
      <td>데이터의 XML 파싱 처리 등 XML 문서를 화면으로 읽어오는데 필요한 라이브러리이다.<br>&lt;%@ taglib uri="jakarta.tags.xml" prefix="x"%&gt;</td>
    </tr>
    <tr>
      <td>SQLTags</td>
      <td>페이지 내에서 Database를 연동하고 필요한 쿼리를 실행할 수 있는 라이브러리이다.<br>&lt;%@ taglib uri="jakarta.tags.sql" prefix="sql"%&gt;</td>
    </tr>
  </table>
### 5. JSTL Core Tags
#### 5.1 c:set 태그
* 변수를 선언하고 초기 값을 대입하는 태그이다.
* 변수의 자료형은 별도로 선언하지 않지만 초기 값은 반드시 기술해야 한다.
* 선언된 변수는 EL 구문에서 사용이 가능하다.
  ```
  <c:set var="num" value="100" />

  ${num}
  ```
* scope 속성은 변수가 저장된 영역을 지정한다. (기본값은 page) 
  ```
  <c:set var="num" value="100" scope="request" />
  ```
* `<c:set> ~ </c:set>` 사이에 ","를 이용해서 배열이나 Collection처럼 여러 개의 값 지정할 수 있다.
  ```
  <c:set var="array" scope="request">
	yellow, blue, pink, red, green
  </c:set>
  ```
#### 5.2 c:remove 태그
* c:set 태그로 선언한 변수를 삭제할 때 사용하는 태그이다.
* scope 속성을 지정하지 않으면 page, request, session, application 영역에 저장되어 있는 속성을 모두 찾아 제거한다.
  ```
  <c:remove var="num1" scope="request">
  ```
#### 5.3. c:out 태그
* 클라이언트로 데이터 출력할 때 사용하는 태그이다.
  ```
  <c:out value="<h2>데이터 출력</h2>" escapeXml="false"/>
  <c:out value="<h2>데이터 출력</h2>" escapeXml="true"/>
  ```
#### 5.4. c:if 태그
* 자바의 if 구문과 같은 역할을 하는 태그이다.
* 조건식은 test 속성에 EL 구문으로 기술해야 한다.
* 조건식의 결과가 참일 때 `<c:if> ~ </c:if>` 사이에 있는 내용을 처리한다.
  ```
  <c:if test="${num1 > num2}">
	...
  </c:if>
  ```
#### 5.5. c:choose 태그
* 자바의 switch 구문과 같은 역할을 하는 태그이다.
* 하위 태그인 `<c:when>`, `<c:otherwise>` 태그와 함께 사용되는데, 각각 switch 구문의 case, default 절과 비슷한 역할을 한다.
  ```
  <c:choose>
	<c:when test="${num == 0}">
		...
	</c:when>
	<c:when test="${num == 1}">
		...
	</c:when>
	<c:otherwise>
		...
	</c:otherwise>
  </c:choose>
  ```
#### 5.6. c:forEach 태그
* 자바의 for 구문에 해당하는 역할을 하는 태그이다.
  ```
  <c:forEach begin="1" end="10" items="${list}" var="value">
	...
  </c:forEach>
  ```
* 속성
  <table>
    <tr>
      <th>속성</th>
      <th>설명</th>
    </tr>
    <tr>
      <td>items</td>
      <td>반복할 객체 명(Collection 객체)</td>
    </tr>
    <tr>
      <td>begin</td>
      <td>반복이 시작할 요소 번호</td>
    </tr>
    <tr>
      <td>end</td>
      <td>반복이 끝나는 요소 번호</td>
    </tr>
    <tr>
      <td>step</td>
      <td>반복할 횟수 번호</td>
    </tr>
    <tr>
      <td>var</td>
      <td>현재 반복 횟수에 해당하는 변수 이름</td>
    </tr>
    <tr>
      <td>varStatus</td>
      <td>현재 반복에 해당하는 객체 요소</td>
    </tr>
  </table>
#### 5.7. c:forTokens 태그
* 문자열에 포함된 구분자를 통해 토큰을 분리해 반복을 수행하는 태그이다.
  ```
  <c:forTokens var="color" items="yellow blue pink red green" delims=" ">
	  ${color}
  </c:forTokens>
  ```
#### 5.8. c:url 태그
* URL을 생성하고 쿼리 스트링을 미리 설정하는 태그이다.
  ```
  <c:url var="url" value="jstl.jsp">
    <c:param name="name" value="abc"/>
  </c:url>

  <a href="${url}">jstl.jsp</a>
  ```
### 6. JSTL Formatting Tags
#### 6.1. fmt:formatNumber 태그
* 숫자의 포맷을 통화 기호, ',' 표시, % 표시 등 원하는 쓰임에 맞게 지정할 수 있는 태그이다.
  ```
  <c:set var="number" value="12300.12"/>

  <fmt:formatNumber  value="${number}" type="number" groupingUsed="true"/>
  <fmt:formatNumber value="${number}" type="currency"/>
  <fmt:formatNumber value="${number}" type="percent" />
  ```
* maxIntegerDigits, minIntegerDigits 속성으로 표시하고자 하는 정수의 자릿수를 지정할 수 있다.
  ```
  <fmt:formatNumber type="number" maxIntegerDigits="4" value="${number}"/> 
  ```
* maxFractionalDigits, minFractionalDigits 속성으로 소수의 자릿수를 지정할 수 있다.
  ```
  <fmt:formatNumber type="number" pattern="000.00" maxFractionDigits="2" value="12300.125"/>
  <fmt:formatNumber type="number" pattern="###.###" minFractionDigits="3" value="12300.1"/>
  ```
#### 6.2. fmt:formatDate 태그
* 날짜나 시간의 포맷 방식을 지정하기 위해 사용하는 태그이다.
* value 속성으로는 java.util.Date() 객체를 사용해야 한다.
  ```
  <c:set var="date" value="<%= new java.util.Date() %>"/>

  <fmt:formatDate type="time" value="${date}"/>
  ```
* type 속성과 dateStyle, timeStyle 속성을 사용하여 다양한 형태로 표기 방식을 지정할 수 있다.
  ```
  <fmt:formatDate type="time" value="${date}"/> 
  <fmt:formatDate type="date" value="${date}"/> 
  <fmt:formatDate type="both" value="${date}"/>
  <fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${date}"/>
  <fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${date}"/>
  <fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${date}"/>
  ```
#### 6.3. fmt:setLocale 태그
* 지역 설정을 통해 통화 기호나 시간 대역을 다르게 설정 가능하다.
### 7. JSTL Function
* 문자열 처리에 관련된 함수들을 EL 구문에서 사용할 수 있게 하는 라이브러리이다.
  <table>
    <tr>
      <th>함수명</th>
      <th>설명</th>
    </tr>
    <tr>
      <td>fn:contains(str, 'text')</td>
      <td>str에 두 번째 인자 값의 내용이 포함되어 있는지 확인</td>
    </tr>
    <tr>
      <td>fn:containsIgnoreCase(str, 'text')</td>
      <td>str에 대소문자 구분 없이 'text'값이 포함되어 있는지 확인</td>
    </tr>
    <tr>
      <td>fn:startsWith(str,'text')</td>
      <td>str이 'text'로 시작하는지 확인</td>
    </tr>
    <tr>
      <td>fn:endsWith(str,'text')</td>
      <td>str이 'text'로 끝나는지 확인</td>
    </tr>
    <tr>
      <td>fn:escapeXml(str)</td>
      <td>str에 xml 태그가 포함됐다면 해당 태그까지 화면에 출력</td>
    </tr>
    <tr>
      <td>fn:indexOf(str,'text')</td>
      <td>str 내에 'text'의 첫 글자 시작 위치 반환(0부터 시작)</td>
    </tr>
    <tr>
      <td>fn:length(str)</td>
      <td>str 길이 반환</td>
    </tr>
    <tr>
      <td>fn:replace(str, 'text1', 'text2')</td>
      <td>str 내의 text1을 찾아 text2로 변경</td>
    </tr>
    <tr>
      <td>fn:substring(str, index1, index2)</td>
      <td>str에서 index1부터 index2까지의 문자열 반환</td>
    </tr>
    <tr>
      <td>fn:split(str, ' ')</td>
      <td>str을 ' '구분자를 기준으로 나눠 배열로 만들어 반환</td>
    </tr>
    <tr>
      <td>fn:join(str,'-')</td>
      <td>배열 요소로 나누어진 str을 '-'구분자를 붙여 합친 뒤 반환</td>
    </tr>
    <tr>
      <td>fn:trim(str)</td>
      <td>str 값의 좌우 공백 제거</td>
    </tr>
  </table>
## MVC(Model-View-Controller) 패턴
### 1. MVC(Model-View-Controller) 패턴
* MVC 패턴은 디자인 패턴 중 하나로 데이터 처리(Model), 클라이언트가 보는 페이지(View), 그리고 중간에서 이들을 제어하는 컨트롤러(Controller)로 역할을 분담해 설계하는 디자인 패턴을 말한다.
* MVC 패턴을 활용하게 되면 각각 정해진 역할에만 집중하기 때문에 유지 보수 및 확장성이 용이한 장점이 있지만 설계하는 시간과 개발 시간이 증가하는 단점이 있다.
### 2. Model
* 비즈니스 영역의 로직 처리와 데이터 처리 부분을 담당한다.
  * VO(Value Object), DTO(Data Transfer Object)는 계층 간 데이터 교환을 위한 용도의 객체이다.
  * DAO(Data Access Object)는 Data에 접근하기 위한 용도의 객체이다.
  * Service는 전달할 데이터들을 가공하고 비즈니스 로직을 처리하기 위한 용도의 객체이다.
### 3. View
* 사용자 인터페이스 부분을 담당한다.
* 주로 모델(Model)로부터 전달받은 데이터들을 사용자에게 보여주는 역할을 한다.
### 4. Controller
* 뷰(View)와 모델(Model), 모델(Model)과 뷰(View)를 제어하는 부분을 담당한다.
* 뷰(View)를 통해 사용자가 입력한 값을 전달받거나 모델(Model)로부터 처리된 데이터를 뷰(View)로 전달하는 역할을 한다.
## JDBC(Java DataBase Connectivity)
### 1. JDBC(Java DataBase Connectivity)
* 자바에서 데이터베이스에 접근할 수 있게 해주는 표준 Programming API이다.
* 자바와 데이터베이스 연결 시 사용하는 DBMS에 알맞은 JDBC 드라이버를 사용해야 한다.
* JDBC 드라이버를 사용하면 DBMS의 종류 상관없이 동일한 방법으로 데이터베이스에 다양한 작업을 할 수 있다.
  ![image](https://github.com/user-attachments/assets/e2db755b-424c-407e-951b-067aa32814f0)

### 2. JDBC 주요 객체
#### 2.1. DriverManager
* DriverManager 클래스는 JDBC 드라이버를 통하여 Connection을 만드는 역할을 한다.
* `Class.forName()` 메소드를 이용해서 JDBC 드라이버를 등록하면 드라이버 내부에 있는 클래스들을 동적으로 로드한다.
  ```java
  Class.forName("org.mariadb.jdbc.Driver"); // MariaDB
  Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // MSSQL
  ```
#### 2.2. Connection
* DriverManager 클래스를 통해 실제 데이터베이스와 연결된 Connection 객체를 얻을 수 있다.
* Connection 객체는 직접 생성이 불가능하고 `DriverManager.getConnection()` 메소드를 호출하여 Connection 객체를 얻어올 수 있다.
  ```java
  Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/web", "web", "web");
  ```
#### 2.3. Statement
* Connection 객체를 통해 데이터베이스에 SQL 구문을 전달하여 실행시키고 결과를 반환받는 역할을 하는 객체이다.
* Statement 객체는 직접 생성이 불가능하고 Connection 객체의 `createStatement()` 메소드를 호출하여 Statement 객체를 생성할 수 있다.
  ```java
  Statement stmt = connection.createStatement();
  ```
* SQL 구문의 종류에 따라 실행에 필요한 메소드가 달라진다.
  ```java
  // SELECT 쿼리 실행 (ResultSet 객체를 리턴한다.)
  ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

  // INSERT, UPDATE, DELETE 쿼리 실행 (정수값을 리턴한다.)
  int result = stmt.executeUpdate("DELETE FROM emp WHERE emp_no = 10")
  ```
#### 2.4. PreparedStatement
* SQL 구문을 미리 컴파일 하고 실행 시간 동안 인수 값을 위한 공간을 확보한다는 점에서 Statement와 다르다.
* PreparedStatement 객체는 직접 생성이 불가능하고 Connection 객체의 `prepareStatement()` 메소드를 호출하여 PreparedStatement 객체를 생성할 수 있다.
  ```java
  String query = "SELECT * FROM emp WHERE emp_no = ?";
  PreparedStatement pstmt = connection.prepareStatement(query);

  pstmt.setInt(1, 10);

  ResultSet rs = pstmt.executeQuery();
  ```
#### 2.5. ResultSet
* ResultSet 객체는 SELECT 쿼리의 실행 결과에 의해 생성된 테이블(Result Set)을 담고 있으며 커서(cursor)로 조회된 행들의 데이터에 접근할 수 있다.
  ```java
  ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

  while(rs.next()){
    System.out.println(rs.getInt("emp_no") + ", " + rs.getString(2));
  }
