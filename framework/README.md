## 프레임워크(Framework)
### 1. 프레임워크(Framework)
* 프레임워크(Framework)란, 어느 정도 구현되어 있는 틀을 가지고 그 안에서 기능 구현을 할 수 있도록 여러 가지 기능을 제공하는 소프트웨어이다. 
* 프레임워크는 소프트웨어를 구현하는 개발 시간을 줄이고, 반복적으로 해야 하는 공통적인 부분을 최소화할 수 있도록 설계되어 있다. 
* 프레임워크는 일정 수준 이상의 품질을 보장하는 애플리케이션을 개발할 수 있는 환경을 제공한다.
### 2. 라이브러리와 프레임워크, API
#### 2.1. 라이브러리(Library)
* 라이브러리는 소프트웨어를 개발을 필요한 기능들을 재사용하기 편리하도록 미리 만들어 놓은 도구이다.
#### 2.2. 프레임워크(Framework)
* 프레임워크는 애플리케이션의 공통적인 개발 환경을 제공해 주는 소프트웨어이다. 
* 프레임워크 안에 라이브러리가 포함되어 있고 필요에 따라서 개발자가 라이브러리를 추가할 수 있다.
#### 2.3. API(Application Programming Interface)
* 애플리케이션에서 사용할 수 있도록 운영 체제나 서버, 프로그래밍 언어 등이 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다.
### 3. 프레임워크의 특징
* 개발자가 따라야 하는 가이드를 제공한다.
* 개발할 수 있는 범위가 정해져 있다.
* 개발자를 위한 다양한 도구, 플러그인들을 지원한다.
#### 3.1. 프레임워크의 장점
* 개발 시간을 줄일 수 있다.
* 유지 보수가 쉽고 추상화된 코드 제공을 통해 확장성이 뛰어나다.
* 정형화되어 있어 일정 수준 이상의 품질을 보장받을 수 있다.
#### 3.2. 프레임워크의 단점
* 기본 설계에 대한 이해가 어렵기 때문에 학습 난이도가 높다.
* 기본 설계된 구조에 의해 자유로운 개발에 한계가 있다.
* 사용하지 않는 기능에 대한 라이브러리가 포함될 수 있다. 
### 4. 프레임워크의 종류
#### 4.1. 영속성 프레임워크
* 데이터의 저장, 조회, 변경, 삭제를 다루는 클래스 및 설정 파일들을 제공하는 프레임워크이다.
  * Mybatis
  * Hibernate
#### 4.2. 자바 웹 프레임워크
* Java EE를 통한 웹 애플리케이션 개발에 초점을 맞추어 필요한 요소들을 모듈화하여 제공하는 프레임워크이다.
  * Spring Framework
  * 전자정부표준 (Spring 기반)
  * Struts
#### 4.3. UI 프레임워크
* UI를 보다 쉽게 구현할 수 있는 도구를 제공하는 프레임워크이다.
  * Bootstrap
  * Quasar Framework
#### 4.4. 기능 및 지원 프레임워크
* 특정 기능이나 업무 수행에 도움을 줄 수 있는 기능을 제공하는 프레임워크이다.
  * Log4j
  * JUnit 5
  * ANT, Maven, Gradle
## 스프링 프레임워크(Spring Framework)
### 1. 스프링 프레임워크(Spring Framework)
* 자바 애플리케이션 개발을 위한 오픈 소스 프레임워크로 줄여서 스프링(Spring)이라고 불린다.
* 동적인 웹 애플리케이션을 개발하기 위한 여러 가지 서비스를 제공하고 있으며 대한민국 공공기관의 웹 서비스 개발 시 사용을 권장하고 있는 전자정부 표준프레임워크의 기반 기술로서 쓰이고 있다. 
### 2. 스프링 프레임워크의 특징
* 자바 개발의 복잡도를 간소화하기 위한 스프링 프레임워크의 특징은 다음과 같다. 
#### 2.1. DI (Dependency Injection, 의존성 주입)
* 설정 파일이나 어노테이션을 통해 객체 간의 의존 관계를 설정하여 개발자가 직접 객체 간의 의존 관계를 생성할 필요가 없다.
#### 2.2. AOP (Aspect Oriented Programming, 관점 지향 프로그래밍)
* 트랜잭션, 로깅, 보안 등 공통으로 필요로 하는 기능의 경우 해당 기능들을 분리하여 관리한다.
#### 2.3. POJO (Plain Old Java Object)
* 일반적인 J2EE 프레임워크에 비해 특정 라이브러리를 사용할 필요가 없어 개발이 쉬우며, 기존 라이브러리의 지원이 용이하다.
### 3. 스프링 프레임워크의 동작 구조
* 스프링 프레임워크 기반의 애플리케이션에서는 스프링 컨테이너 안에서 애플리케이션에서 필요한 객체가 생성되고 소멸한다.
* 즉, 스프링 컨테이너는 애플리케이션에서 필요한 객체를 생성하고, 객체들을 서로 연결하고, 소멸하는 등 객체의 생명 주기를 관리한다.
* 스프링 컨테이너가 어떤 객체를 생성하고, 객체들을 어떻게 연결할지는 개발자가 설정해야 하는데 설정 방식은 크게 XML, 자바, 어노테이션을 통한 오토 와이어링 방식이 있다.
## DI (Dependency Injection)
### 1. IoC (Inversion of Control)
* IoC(Inversion of Control)란, 프로그램을 구동하는데 필요한 객체에 대한 생성, 변경 등의 관리를 개발자가 아닌 컨테이너에서 직접 관리하는 것을 말한다.
* 스프링은 IoC 구조를 통해 구동 시 필요한 객체의 생성부터 소멸까지 해당 객체에 대한 관리를 직접 수행한다. 
#### 1.1. 스프링 IoC 컨테이너
* 스프링에서 관리하는 객체를 `빈(Bean)`이라고 하고, 해당 빈들을 관리한다는 의미로 컨테이너를 `빈 팩토리(Bean Factory)`라고 한다.
#### 1.2. 스프링 IoC 컨테이너의 역할
* 객체(Bean)의 생명주기와 의존성을 관리한다.
* 객체(Bean)의 생성, 초기화, 소멸 등의 처리를 담당한다.
* 개발자가 직접 객체를 생성할 수 있지만 해당 권한을 컨테이너에 맡김으로써 소스 코드 구현의 시간을 단축할 수 있다.
#### 1.2. 스프링 IoC 컨테이너의 종류
* `애플리케이션 컨텍스트(Application Context)`는 `빈 팩토리(BeanFactory)`를 확장한 IoC 컨테이너로 빈(Bean)을 등록하고 관리하는 기능은 빈 팩토리(BeanFactory)와 동일하지만 스프링이 제공하는 각종 부가적인 서비스를 추가 제공한다.
  <table>
    <tr>
      <th>종류</th>
      <th>설명</th>
    </tr>
    <tr>
      <td>AnnotationConfigApplicationContext</td>
      <td>자바 기반 설정 클래스에서 스프링 애플리케이션 컨텍스트를 로드한다.</td>
    </tr>
    <tr>
      <td>AnnotationConfigWebApplicationContext</td>
      <td>자바 기반 설정 클래스에서 스프링 웹 애플리케이션 컨텍스트를 로드한다.</td>
    </tr>
    <tr>
      <td>GenericXmlApplicationContext</td>
      <td>XML 설정 파일에서 스프링 애플리케이션 컨텍스트를 로드한다.</td>
    </tr>
    <tr>
      <td>ClassPathXmlApplicationContext</td>
      <td>애플리케이션 클래스패스(classpath)에 있는 하나 이상의 xml 파일에서 스프링 애플리케이션 컨텍스트를 로드한다.</td>
    </tr>
    <tr>
      <td>XmlWebApplicationContext</td>
      <td>웹 애플리케이션에 포함된 XML 파일에서 스프링 애플리케이션 컨텍스트를 로드한다.</td>
    </tr>
  </table>
### 2. DI(Dependency Injection)
#### 2.1. DI(Dependency Injection)
* DI(Dependency Injection)란 하나의 객체가 사용하는(의존하는) 다른 객체를 외부에서 생성하고 주입받아 사용하는 것을 말한다.
* 객체를 주입받는 방법으로는 메소드를 통한 의존성 주입 방법과 생성자를 통한 의존성 주입 방법이 있다. 
#### 2.2. 스프링 DI
* 스프링에서는 컨테이너가 설정 정보를 읽어와서 자동으로 객체들의 의존 관계를 주입한다.
* 스프링 컨테이너를 통해 의존성을 주입받게 되면 유지 보수가 편해지고 개발자가 작성해야 할 코드가 단순해지며 객체 간의 종속 관계(결합도)를 해소할 수 있다. 
### 3. 스프링 DI 설정 방법
* 스프링은 객체들의 의존 관계를 연결할 수 있는 3가지의 설정 방법을 제공한다.
#### 3.1. XML 방식
* 스프링 컨테이너 구동 시 생성해야 하는 객체(Bean)들과 의존 관계를 XML 파일로 작성하는 방식이다.
* `<beans>` 요소는 최상위 요소로 하위 요소들로 다양한 스프링 설정할 수 있다. (DI, AOP, Transaction 등)
* `<bean>` 요소는 스프링 컨테이너가 관리할 빈을 선언하는 요소이다.
  ```xml
  <beans>
    <bean id="student" class="com.ismoon.spring.person.model.vo.Student"/>
  </beans>
  ```
* Setter 메소드를 통해 의존 관계가 있는 빈을 주입하려면 `<property>` 요소를 사용한다. (단, 일치하는 Setter 메소드가 있어야 된다.)
  ```xml
  <beans>    
    <bean id="student" class="com.ismoon.spring.person.model.vo.Student">
      <property name="name" value="홍길동"/>
      <property name="wallet" ref="money"/>
    </bean>

    <bean id="money" class="com.ismoon.spring.wallet.model.vo.Wallet" />
  </beans>
  ```
* 생성자를 통해 의존 관계가 있는 빈을 주입하려면 `<constructor-arg>` 요소를 사용한다. (단, 일치하는 매개변수가 있는 생성자가 있어야 된다.)
  ```xml
  <beans>    
    <bean id="student" class="com.ismoon.spring.person.model.vo.Student">
      <constructor-arg name="name" value="홍길동"/>
      <constructor-arg name="wallet" ref="money"/>
    </bean>

    <bean id="money" class="com.ismoon.spring.wallet.model.vo.Wallet" />
  </beans>
  ```
* `<import>` 요소를 사용하여 다른 XML 설정을 가져올 수 있다.
  ```xml
  <beans>    
    <import resource="config.xml"/> 
  </beans>
  ```
#### 3.2. Java 방식
* 스프링 컨테이너 구동 시 생성해야 하는 객체(Bean)들과 의존 관계를 Java 파일로 작성하는 방식이다.
* 스프링 컨테이너가 자바 파일을 설정 파일로 식별하기 위해서는 @Configuration 어노테이션을 클래스에 작성해야 한다.
  ```java
  @Configuration
  public class JavaConfig {
  }
  ```
* 자바 파일에서 빈을 선언하기 위해서는 객체를 리턴하는 메소드를 만들고 @Bean 어노테이션을 메소드에 작성해야 한다.
  ```java
  @Configuration
  public class JavaConfig {
    @Bean
    public Student student() {
      return new Student();
    }
  }
  ```
* Setter 메소드를 통해 의존 관계가 있는 빈을 주입할 수 있다.
  ```java
  @Configuration
  public class JavaConfig {
    @Bean
    public Student student() {
      Student student = new Student();

      student.setName("홍길동");
      student.setWallet(wallet());

      return student;
    }

    @Bean
    public Wallet wallet() {
      return new Wallet();
    }
  }
  ```
* 생성자를 통해 의존 관계가 있는 빈을 주입할 수 있다.
  ```java
  @Configuration
  public class JavaConfig {
    @Bean
    public Student student() {
      return new Student("홍길동", wallet());
    }

    @Bean
    public Wallet wallet() {
      return new Wallet();
    }
  }
  ```
* @Import 어노테이션을 사용하여 다른 Java 설정 파일을 가져올 수 있다.
  ```java
  @Configuration
  @Import(Config.class)
  public class JavaConfig {
  }
  ```
####  3.3. 어노테이션 방식
* 스프링 컨테이너 구동 시 생성해야 하는 객체(Bean)들과 의존 관계를 어노테이션을 사용하여 구성하는 방식이다.
* 어노테이션으로 빈을 선언하기 위해서는 빈으로 생성하고 싶은 클래스에 @Component을 작성해야 한다.
  ```java
  @Component
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public class Student {
    private String name;
    private Wallet wallet;
  }
  ```
* @Component 어노테이션이 작성된 클래스를 빈으로 생성하기 위해서는 컴포넌트 스캐닝(Component Scannig)을 통해서 스프링 컨테이너 구동 시 해당 클래스를 찾아 빈으로 등록하도록 설정해야 한다.
  ```xml
  <!-- XML 방식 -->
  <beans>    
    <context:component-scan base-package="com.ismoon.spring" />
  </beans>
  ```
  ```java
  // Java 방식
  @Configuration
  @ComponentScan("com.ismoon.spring")
  public class JavaConfig {
  }
  ```
* @Autowired 어노테이션을 사용하여 스프링 컨테이너에서 빈을 찾아 자동으로 의존성 주입을 할 수 있다. 
* @Autowired 어노테이션은 필드, 메소드, 생성자에 적용할 수 있다.
* @Value 어노테이션을 사용하여 빈이 아닌 값을 주입할 수 있다.
  ```java
  @Component
  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public class Student {
    @Value("홍길동")
    private String name;
    @Autowired
    private Wallet wallet;
  }
  ```
## AOP(Aspect Oriented Programming)
### 1. AOP(Aspect Oriented Programming)
* 관점 지향 프로그래밍(Aspect Oriented Programming)의 약자이다.
* 애플리케이션의 여러 부분에 걸쳐 있는 기능을 횡단 관심사(Cross-cutting concerns)라고 한다. 
* AOP는 이러한 횡단 관심사를 분리하고 분리한 기능을 어디에 어떻게 적용할지 선언적으로 정의할 수 있다.
* AOP의 목적은 횡단 관심사와 이에 영향받는 객체 간 결합도를 낮추는데 있다.
### 2. AOP 용어 
* 애스펙트(Aspect)는 횡단 관심사를 분리하여 작성한 클래스이다. (어드바이스 + 포인트컷)
* 어드바이스(Advice)는 애스펙트가 해야 할 작업과 언제 그 작업을 수행해야 하는지 정의하는 것을 말한다.
  <table>
    <tr>
      <td>Before Advice</td>
      <td>조인포인트 앞에서 실행된다.</td>
    </tr>
    <tr>
      <td>After Advice</td>
      <td>조인포인트 뒤에서 실행된다.</td>
    </tr>
    <tr>
      <td>Around Advice</td>
      <td>조인포인트 앞과 뒤에서 실행된다.</td>
    </tr>
    <tr>
      <td>After Returning Advice</td>
      <td>조인포인트가 정상적으로 종료된 후에 실행된다.</td>
    </tr>
    <tr>
      <td>After Throwing Advice</td>
      <td>조인포인트에서 예외가 발생했을 때 실행된다.</td>
    </tr>
  </table>
* 조인포인트(JoinPoint)는 어드바이스가 적용될 수 있는 모든 곳을 의미한다. (메소드 호출 지점, 예외 발생 지점, 필드 등)
* 포인트컷(PointCut)은 여러 조인포인트 중에 실제 어드바이스가 적용될 조인 포인트를 정의하는 것을 말한다.
* 대상 객체(Target Object)는 애스펙트가 적용될 객체를 말한다.
* 위빙(Weaving)은 대상 객체에 애스펙트를 적용하는 것을 말한다.
  <table>
    <tr>
      <td>컴파일 시 위빙</td>
      <td>대상 클래스가 컴파일 될 때 위빙 된다.</td>
    </tr>
    <tr>
      <td>클래스 로딩 시 위빙</td>
      <td>대상 클래스가 JVM에 로드될 때 위빙 된다.</td>
    </tr>
    <tr>
      <td>런타임 시 위빙</td>
      <td>애플리케이션 실행 중에 위빙 된다. (스프링)</td>
    </tr>
  </table>
### 3. Spring AOP
#### 3.1. 메소드 조인 포인트만 지원한다.
* 대상 객체의 메소드가 호출되는 런타임 시점에만 어드바이스을 적용할 수 있다.
* AspectJ 같은 고급 AOP 프레임워크를 사용하면 객체의 생성, 필드 값의 조회와 조작, static 메소드 호출 및 초기화 등의 다양한 작업에 어드바이스를 적용할 수 있다. 
#### 3.2. 프록시(Proxy) 기반의 AOP를 지원한다.
* 프록시(Proxy)는 대상 객체에 어드바이스가 적용된 후 생성되는 객체로 대상 객체에 직접 접근을 제한하는 역할을 하는 객체이다.
* Spring AOP는 대상 객체에 대한 프록시를 만들어 제공하며, 대상 객체를 감싸는 프록시는 런타임 시에 생성된다. 
* 프록시는 대상 객체의 메소드 호출을 가로채어 어드바이스를 수행하고 대상 객체의 메소드를 호출하거나 대상 객체의 메소드를 호출 후 어드바이스를 수행한다.
### 4. Spring AOP 구현 방법
* 스프링은 AspectJ의 어노테이션을 사용하여 애스펙트를 생성할 수 있다.
  ```java
  @Aspect
  @Component
  public class 클래스명 {
    @Before("포인트컷 지정자")
    public void before() {
      // 메소드 실행 전에 적용되는 어드바이스를 정의
    }

    @After("포인트컷 지정자")
    public void after() {
      //  메소드 실행 후에 적용되는 어드바이스를 정의 
    }
    
    @AfterReturning("포인트컷 지정자")
    public void success() {
      // 메소드가 정상적으로 실행된 후에 적용되는 어드바이스를 정의 
    }
    
    @AfterThrowing("포인트컷 지정자")
    public void fail() {
      // 메소드가 예외를 발생시킬 때 적용되는 어드바이스를 정의
    }
    
    @Around("포인트컷 지정자")
    public String around(ProceedingJoinPoint jp) {
      // 메소드 호출 이전, 이후, 예외 발생 등 모든 시점에 적용 가능한 어드바이스를 정의
    }
  }
  ```
* AsepctJ 어노테이션을 적용을 위해서는 설정 파일에 아래와 같이 프록시 설정을 해야한다.
  ```xml
  <!-- XML 설정 -->
  <beans>
    <aop:aspectj-autoproxy/>
  </beans>
  ```
  ```java
  // Java 설정
  @Configuration
  @EnableAspectJAutoProxy
  public class RootConfig {
  }
  ```
## 스프링 MVC
### 1. 스프링 MVC
* 스프링 프레임워크에서는 클라이언트의 화면을 표현하기 위한 뷰(View) 영역과 서비스 수행을 위한 비지니스 로직 영역을 나누는 MVC2 패턴을 지원한다.
* 또한 모델(Model), 뷰(View), 컨트롤러(Controller) 사이의 의존 관계를 DI 컨테이너에서 관리하여 유연한 웹 애플리케이션을 쉽게 구현 및 개발할 수 있다.
  <table>
    <tr>
      <td>@Controller</td>
      <td>웹 애플리케이션에서 웹 요청과 응답을 처리하는 빈을 생성한다.</td>
    </tr>
    <tr>
      <td>@Service</td>
      <td>웹 애플리케이션에서 비즈니스 로직을 처리하는 빈을 생성한다.</td>
    </tr>
      <tr>
      <td>@Repository</td>
      <td>웹 애플리케이션에서 영속성(파일, 데이터베이스) 처리를 위한 빈을 생성한다.</td>
    </tr>
  </table>
### 2. 스프링 MVC 요청 처리 과정 
* 디스패처 서블릿(DispatcherServlet)은 사용자의 요청을 받는 프론트 컨트롤러 서블릿이다.
* 핸들 매핑(HandlerMapping)은 요청 URL을 바탕으로 적절한 컨트롤러를 선택하는 역할을 한다.
* 컨트롤러(Controller)는 요청을 처리하기 위한 빈이다. (클라이언트의 요청을 처리 후 반환한다.)
* 뷰 리졸버(ViewResolver)는 디스패처 서블릿에서 전달해 주는 뷰의 이름과 실제로 구현된 뷰를 매핑해준다.
  <br><img src="https://github.com/user-attachments/assets/218677a5-a8ae-416f-9d9e-9223e4a8b63d" width="800px"/><br>
## 스프링 부트(Spring Boot)
### 1. 스프링 부트(Spring Boot)
* 스프링은 장점이 많은 개발도구이지만 설정이 매우 복잡하다는 단점이 있다.
* 스프링 부트는 스프링 프레임워크를 더 쉽고 빠르게 이용할 수 있도록 만들어주는 도구이다.
  * 빠르게 스프링 프로젝트를 설정할 수 있다.
  * 스타터를 사용해 간편하게 의존성을 사용할 수 있다.
  * 웹 애플리케이션 서버(WAS)를 내장하고 있어서 따로 설치하지 않아도 독립적으로 실행할 수 있다.
* 스프링과 스프링 부트의 차이
  * 스프링은 애플리케이션을 개발할 때 필요한 환경을 수동으로 구성해야 한다.
  * 스프링 부트는 필요한 환경을 자동으로 구성하기 때문에 수동으로 개발 환경을 구성할 필요가 없다.
  * 스프링 부트는 WAS를 내장하고 있어서 jar 파일만 만들면 별도의 WAS 설정을 하지 않아도 애플리케이션을 실행할 수 있다.
  <table>
    <tr>
        <th>스프링</th>
        <th>스프링 부트</th>
    </tr>
    <tr>
        <td>개발자가 수동으로 설정</td>
        <td>자동 구성</td>
    </tr>
    <tr>
        <td>일부 파일을 XML로 직접 생성하고 관리</td>
        <td>XML을 사용하지 않음</td>
    </tr>
    <tr>
        <td>인메모리 데이터베이스를 지원하지 않음</td>
        <td>인메모리 데이터베이스 자동 설정 지원</td>
    </tr>
    <tr>
        <td>WAS를 별도로 설정</td>
        <td>WAS를 내장하고 있어서 설정이 필요 없다.</td>
    </tr>
  </table>
### 2. 스프링 부트 스타터
* 스프링 부트 스타터는 의존성이 모여있는 그룹이다.
* 스타터를 사용하면 필요한 기능을 간편하게 설정할 수 있다.
* 스타터는 `spring-boot-starter-{작업유형}`으로 작성한다.
  * spring-boot-starter-web
    * Spring MVC를 사용해서 웹 서비스를 개발할 때 필요한 의존성 모음
  * spring-boot-starter-test
    * 스프링 애플리케이션을 테스트하기 위해 필요한 의존성 모음
  * spring-boot-starter-validation
    * 유효성 검사를 위해 필요한 의존성 모음
  * spring-boot-starter-actuator
    * 모니터링을 위해 애플리케이션에서 제공하는 다양한 정보를 제공하기 쉽게하는 의존성 모음
  * spring-boot-starter-jpa
    * ORM을 사용하기 위한 인터페이스의 모음인 JPA를 더 쉽게 사용하기 위한 의존성 모음
### 3. 스프링 부트 코드 이해하기
#### @SpringBootApplication
* 스프링 부트 사용에 필요한 기본 설정을 한다.
  * @SpringBootConfiguration
    * 스프링 부트 관련 설정을 나타내는 어노테이션이다.
    * @Configuration을 상속해서 만든 어노테이션이다.
  * @EnableAutoConfiguration
    * 스프링 부트 자동 구성을 활성화하는 어노테이션이다.
    * 스프링 부트 애플리케이션이 실행될 때 스프링 부트의 메타 파일(spring.factories)을 읽고 정의된 설정들을 자동으로 구성하는 역할을 한다. 
    * spring.factories안에 자동 구성해야하는  목록을 가지고 있다.
  * @ComponentScan
    * 사용자가 등록한 빈을 읽고 등록하는 어노테이션이다.
* SpringApplication.run()는 애플리케이션을 실행한다.
  * 첫 번째 매개값은 스프링 부트 애플리케이션의 메인 클래스로 사용할 클래스를 지정한다.
  * 두 번째 매개값은 커맨드 라인의 인수들을 전달한다.
### 4. 프로파일(Profile) 설정
* 스프링 부트는 기본적으로 `application.properties` 또는 `application.yml` 파일을 사용하여 설정을 관리한다. 
* 스프링 부트는 프로파일을 설정해서 환경별로 다른 설정을 적용할 수 있는데 `application-{profile}.properties` 또는 `application-{profile}.yml`로 환경별로 설정 파일을 만들 수 있다.
  ``` yml
  # application.yml
  server:
    port: 8080
  ```
  ``` yml
  # application-dev.yml
  spring:
    profiles: dev
  server:
    port: 8088
  ```
  ```yml
  # application-live.yml
  spring:
    profiles: live
  server:
    port: 8089
  ```
* 스프링 부트 애플리케이션을 실행할 때 명령줄 인수로 프로파일을 설정할 수 있다.
  ```sh
  java -jar myapp.jar --spring.profiles.active=dev
  ```
* 운영체제의 환경 변수를 설정하여 프로파일을 지정할 수도 있다.
  ```sh
  # Linux / Unix
  export SPRING_PROFILES_ACTIVE=dev

  # Windows
  set SPRING_PROFILES_ACTIVE=dev
  ```
* 스프링 부트 애플리케이션 코드 내에서 프로파일을 설정할 수도 있다.
  ```java
  // Application.java
  public static void main(String[] args) {
    new SpringApplicationBuilder(Application.class).profiles("dev").run(args);
  }

  // 특정 프로파일에서만 활성화되는 빈을 설정
  @Bean
  @Profile("dev") 
  public TestBean testBean() {
    return new TestBean();
  }
  ```
* 테스트 코드에서 프로파일을 설정할 수도 있다.
  ```java
  @SpringBootTest
  @ActiveProfiles("dev")
  public class ApplicationTest {
    @Test
    void contextLoads() {
    }
  }
  ```
## 타임리프(Thymeleaf)
### 1. 타임리프(Thymeleaf)
* 타임리프는 템플릿 엔진으로 HTML5와 완전히 호환되며 스프링 부트는 타임리프를 사용하는 것을 권장하고 있다.
* 스프링 부트에서 타임리프를 사용하려면 `pom.xml`에 의존성을 추가해야 한다.
  ```xml
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
  </dependency>
  ```
* 또한 HTML 문서에서 타임리프 속성들을 사용하려면 HTML 문서에 `xmlns`를 설정해야 한다.
  ```html
  <!DOCTYPE html>
  <html xmlns:th="http://www.thymeleaf.org">
    ...
  </html>
  ```
### 2. 타임리프 속성
* 태그 안에 텍스트를 설정하려면 `th:text` 속성을 사용한다.
  ```html
  <!-- 컨트롤러로 전달받은 Model에 접근할 때는 ${..} 표현법을 사용한다. -->
  <span th:text="${message}"></span>
  ```
* 태그에 링크를 설정하려면 `th:href` 속성을 사용한다.
  ```html
  <!-- 링크를 지정할 때는 @{..} 표현법을 사용한다. -->
  <a th:href="@{/home}">Home</a>
  ```
* form 태그에서 데이터를 전송할 서버의 URL을 지정할 때는 `th:action` 속성을 사용한다.
  ```html
  <form th:action="@{/submit}" method="post">
    ...
  </form>
  ```
* input 태그에 값을 설정하려면 `th:value` 속성을 사용한다.
  ```html
  <input type="text" th:value="${address}"></span>
  ```
* 조건을 만족하는 경우 HTML 요소를 표시하려면 `th:if` 속성을 사용한다.
  ```html
  <span th:if="${name != null}" th:text="${name}"></span>
  ```
* 배열이나 컬렉션 요소를 반복해 요소를 표시하려면 `th:each`를 사용한다.
  ```html
  <ul>
    <li th:each="item : ${items}" th:text="${item}"></li>
  </ul>
  ```
### 3. 프래그먼트(Fragment)
* 타임리프에서는 `th:fragment` 속성을 이용해 공통 부분을 조각화하고 재사용할 수 있다.
  ```html
  <!-- fragments.html -->

  <!DOCTYPE html>
  <html xmlns:th="http://www.thymeleaf.org">
  <head>
      <title>Fragments</title>
  </head>
  <body>
      <header th:fragment="header">
          <h1>Site Header</h1>
      </header>
      <div th:fragment="footer">
          <p>Site Footer</p>
      </div>
  </body>
  </html>
  ```
* 프래그먼트를 사용할 때는 `~{fragment 경로 :: fragment 이름}` 표현법을 사용한다.
* `th:replace`는 해당 요소를 프래그먼트로 지정한 요소로 대체한다.
* `th:insert`는 해당 요소 내부에 프래그먼트로 지정한 요소를 삽입한다.
  ```html
  <!-- index.html -->
  
  <!DOCTYPE html>
  <html xmlns:th="http://www.thymeleaf.org">
  <head>
      <title>제목</title>
  </head>
  <body>
      <header th:replace="~{fragments :: header}"></header>

      <main>
        ...
      </main>

      <footer th:insert="~{fragments :: footer}"></footer>
  </body>
  </html>
  ```
## 마이바티스(Mybatis)
### 1. 마이바티스(Mybatis)
* 마이바티스는 JDBC를 통해 구현했던 상당 부분의 코드와 파라미터 설정 및 결과 매핑을 xml 설정을 통해 쉽게 구현할 수 있게 해주는 영속성 프레임워크이다.
* 스프링 부트에서 마이바티스를 사용하려면 `pom.xml`에 의존성을 추가해야 한다.
  ```xml
  <dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>3.0.3</version>
  </dependency>
  ```
* 또한 application.yml 파일에 데이터베이스에 연결하기 위한 설정과 마이바티스 실행에 필요한 설정들을 해야 한다.
* type-aliases-package 속성은 mybatis에서 사용할 자료형의 별칭을 선언하는 속성이다.
* mapper-locations 속성은 쿼리문들을 담는 Mapper 파일의 경로를 지정하는 속성이다.
* jdbc-type-for-null 속성은 파라미터의 null 값에 대한 JDBC 타입을 지정한다.
  ```yml
  spring:
    datasource:
      driver-class-name: org.mariadb.jdbc.Driver
      url: jdbc:mariadb://localhost:3306/web
      username: beyond
      password: beyond
  mybatis:
    type-aliases-package: com.ismoon.university.*.model.vo
    mapper-locations:
    - classpath:mappers/**/*.xml
    configuration:
      jdbc-type-for-null: NULL
  ```
### 2. mapper.xml 파일
* mapper.xml은 실행할 쿼리문과 매핑 구문을 정의해 놓은 파일이다.
  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <!-- mybatis mapper 설정 파일임을 선언한다. -->
  <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >

  <mapper namespace="com.ismoon.mybatis.member.model.mapper.MemberMapper">
    <!-- 필요한 쿼리문과 매핑 구문들을 작성한다. -->
  </mapper>
  ```
* select 요소는 SQL의 조회 구문을 작성할 때 사용되는 요소이다.
* resultMap과 resultType은 둘 모두를 사용할 수 없으며, 둘 중 하나만 선언해야 된다.
  ```xml
  <!-- 구문의 이름은 selectPerson이고 int 타입의 파라미터를 가진다. 그리고 결과 데이터는 HashMap에 저장된다. -->
  <select id="selectPerson" parameterType="int" resultType="hashmap">
    SELECT * FROM PERSON WHERE ID = #{id}
  </select>
  ```
* resultMap 요소는 쿼리문의 조회한 결과를 객체와 매핑하기 위한 요소이다.
  ```xml
  <!-- type 속성은 실제로 구현해 놓은 자바 클래스를 지정한다. -->
  <resultMap type="Member" id="memberResultMap">
    <id property="no" column="NO"/>
    <result property="id" column="ID" />
    <result property="password" column="PASSWORD"/>
    <result property="email" column="EMAIL"/>
  </resultMap>
  ```
* insert, update, delete 요소는 데이터를 변경하는 구문을 작성할 때 사용되는 요소이다.
  ```xml
  <insert id="insertMember" parameterType="Member">
    INSERT INTO MEMBER
    VALUES (
      #{id},
      #{name},
      #{password},
      #{email} 
    )
  </insert>

  <update id="updateMember" parameterType="Member">
    UPDATE MEMBER 
    SET 
      NAME = #{name},
      PASSWORD = #{password},
      EMAIL = #{email},
    WHERE ID = #{id}
  </update>
  
  <delete id="deleteMember" parameterType="int">
    DELETE FROM MEMBER WHERE NO = #{no}
  </delete>
  ```
### 3. 매퍼 인터페이스(Mapper Interface)
* 매퍼 인터페이스(Mapper Interface)를 사용하면 SQL 쿼리를 XML 파일에 정의하거나 어노테이션을 통해 자바 코드 내에 직접 작성할 수 있다.
* 매퍼 인터페이스는 MyBatis 프레임워크가 자동으로 구현체를 생성하여 편리하게 데이터베이스 작업을 수행할 수 있다.
* 스프링 부트에서 매퍼 인터페이스를 선언할 때는 `@Mapper` 어노테이션을 사용하고 필요한 곳에서 `@Autowired` 어노테이션으로 구현 객체를 주입받을 수 있다.
  ```java
  @Mapper
  public interface MemberMapper {
    List<Member> selectAll();

    Student selectMemberByNo(@Param("no")String no);

    int insertStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(@Param("no") String no);
  }
  ```
## REST API(Representational State Transfer API)
### 1. REST API(Representational State Transfer API)
* REST(Representational State Transfer)는 자원을 이름으로 구분하여 해당 자원의 상태를 주고받는 것을 의미한다.
* REST API는 REST 아키텍처 스타일을 따르는 API로, HTTP 프로토콜을 통해 요청을 보내고 응답을 받는 API이다.
### 2. REST API의 특징
* 자원(Resource)
  * 모든 것은 자원으로 간주되며, URI(Uniform Resource Identifier)로 식별된다.
* 표현(Representation)
  * 자원의 상태는 JSON, XML 등의 형태로 표현된다.
* 상태없음(Stateless)
  * 서버는 클라이언트의 상태를 유지하지 않는다. 
* 캐시 가능(Cacheable)
  * HTTP 응답은 캐시 가능하도록 설정될 수 있다.
* 계층화(Layered System)
  * 클라이언트는 중간 서버를 통해 간접적으로 서버와 통신할 수 있다.
* 인터페이스 일관성(Uniform Interface)
  * 자원에 대한 접근 방식이 일관되게 설계되어야 한다.
### 3. REST API 설계
* REST API는 자원을 중심으로 설계되며 자원은 URI로 식별된다.
* 자원을 나타낼 때는 명사로 표현하고 일반적으로 복수형을 사용한다.
  * /users
  * /users/1
  * /products
  * /products/30
  * /users/1/orders
  * /credit-cards
  * /customer-addresses
* 동사는 HTTP 메서드(GET, POST, PUT, DELETE 등)를 통해 표현한다.
  * `GET` - 자원 조회
  * `POST` - 자원 생성
  * `PUT` - 자원 전체 수정
  * `PATCH` - 자원 부분 수정
  * `DELETE` - 자원 삭제
* HTTP 상태 코드로 결과를 전달한다.
  * `200` - OK (요청 성공)
  * `201` - Created (자원 생성 성공)
  * `204` - No Content (요청 성공, 응답 본문 없음)
  * `400` - Bad Request (잘못된 요청)
  * `401` - Unauthorized (인증 필요)
  * `403` - Forbidden (권한 없음)
  * `404` - Not Found (자원 없음)
  * `500` - Internal Server Error (서버 오류)
* 요청과 응답에 JSON(JavaScript Object Notation)을 사용한다.
  ```json
  "{name: '홍길동', age: 20, hobby: ['축구', '농구', '야구']}"
  ```
  * JSON은 자바스크립트 객체를 만들 때 사용하는 표현법으로 구조화된 데이터를 표현하는 표기법이다.
  * 비동기 통신에서 객체 타입의 데이터 전송 시 XML 대비 용량이 작고 속도가 빠르다.
## 스웨거(Swagger)
### 1. 스웨거(Swagger)
* API의 인터페이스를 설명하기 위한 오픈 소스 소프트웨어 프레임워크이다.
* Spring Boot와 통합하여 API 문서화를 자동화할 수 있고 개발자가 API의 기능을 쉽게 이해하고, 테스트할 수 있게 도와주는 도구이다.
### 2. 스프링 부트와 연동하기
* 스프링 부트에서 스웨거를 사용하려면 `pom.xml`에 의존성을 추가해야 한다.
  ```xml
  <dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.6.0</version>
  </dependency>
  ```
* 추가로 `SwaggerConfig.java` 파일을 아래와 같이 작성해야 한다.
  ```java
  @Configuration
  @OpenAPIDefinition(
    info = @Info(
            title = "Title",
            description = "Description",
            version = "v1.0.0"
    )
  )
  public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components());
    }
  }
  ```
* 위 작업들을 완료 후 `/swagger-ui/index.html`로 접속하면 API 문서를 확인할 수 있다.
### 3. API 문서 관련 어노테이션
* Tag 어노테이션은 해당 컨트롤러에 대한 설명을 정의한다.
  ```java
  @Tag(name = "Demo APIs", description = "Demo API 목록")
  public class DemoController {
    ...
  }
  ```
* Operation 어노테이션은 각각의 API에 대한 설명을 정의한다.
  ```java
  @Operation(summary = "목록 조회", description = "전체 목록을 조회한다.")
  ```
* ApiResponse 어노테이션은 각각의 응답 코드에 따른 설명을 정의한다.
  ```java
  @ApiResponse(responseCode = "200", description = "요청 성공", content = @Content(mediaType = "application/json"))  
  ```
* Parameters 어노테이션을 사용하여, 파라미터에 대한 정보를 나타낸다.
  ```java
  @Parameters({
    @Parameter(name = "page", description = "페이지 번호", example = "1"),
    @Parameter(name = "numOfRows", description = "한 페이지 결과 수", example = "10")
  })
  ```
* Schema는 응답 데이터에 대한 설명을 정의한다.
  ```java
  @Schema(description = "응답 코드", example = "200")
  private String code;

  @Schema(description = "응답 메시지", example = "OK")
  private String message;
  ```
## 스프링 시큐리티(Spring Security)
### 1. 스프링 시큐리티(Spring Security)
* 스프링 시큐리티는 애플리케이션의 `인증(Authentication)`과 `인가(Authorization)` 등의 보안 기능을 제공하는 스프링 하위 프로젝트이다.
* `인증(Authentication)`은 사용자가 누구인지 확인하는 과정으로 대표적인 예로 로그인이 있다.
* `인가(Authorization)`는 `인증(Authentication)`된 사용자가 특정 리소스에 접근할 때 해당 리소스에 접근할 권한이 있는지 확인하는 과정이다.
* `접근 주체(Principal)`는 애플리케이션 기능을 사용하는 주체를 의미한다.
* 스프링 시큐리티를 사용하는 애플리케이션은 인증 과정을 통해 접근 주체가 신뢰할 수 있는지 확인하고, 인가 과정을 통해 접근 주체에게 부여된 권한을 확인하는 과정을 거친다.
### 2. 스프링 시큐리티 동작 구조
* 스프링 시큐리티는 `서블릿 필터(Servlet Filter)를` 기반으로 동작하며 `DispatcherServlet` 앞에 필터가 배치되어 있다.
* 스프링 시큐리티는 사용하고자 하는 필터 체인을 동작시키기 위해 `DelegatingFilterProxy`를 사용한다.
* `DelegatingFilterProxy`는 서블릿 필터를 구현하고 있으며, 역할을 위임할 `FilterChainProxy`를 내부에 가지고 있다.
  ![{F7B345D9-E0F7-4100-AD59-6D525D626EF2}](https://github.com/user-attachments/assets/85892e2c-1188-43a7-8302-ac879dbd0d96)
### 3. 스프링 시큐리티 인증 처리 과정
* 별도의 설정이 없다면 스프링 시큐리티에서는 `UsernamePasswordAuthenticationFilter`를 통해 인증을 처리한다.
  ![{86586D44-CF44-42D9-93F7-40902B4000BA}](https://github.com/user-attachments/assets/947a81d1-d148-4d04-b4ba-a4db49d2d420)
## JWT(JSON Web Token)
### 1. JWT(JSON Web Token)
* JWT(Json Web Token)는 웹에서 사용되는 JSON 형식의 토큰에 대한 표준이다. 
* 사용자의 인증(authentication)과 인가(authorization) 정보를 서버와 클라이언트 간에 안전하게 주고받기 위해서 사용된다.
### 2. JWT의 구조
* JWT는 헤더(Header), 내용(Payload), 서명(Signature)으로 이루어져 있으며 `.`으로 구분한다.
  ```jwt
  xxxxx(헤더).yyyyy(내용).zzzzz(서명)
  ```
* 헤더(Header)에는 토큰의 타입과 해싱 알고리즘을 지정하는 정보를 담는다.
  ```json
  {
    "alg": "HS256", 
    "typ": "JWT" 
  }
  ```
* 내용(Payload)에는 토큰에 담는 정보를 포함한다.
* 내용(Payload)에 포함된 속성들을 클레임이라 하며 등록된 클레임(Registered Claim), 공개 클레임(Public Claim), 비공개 클레임(Private Claim) 세 가지로 분류된다.
  ``` JSON
  {
    "sub": "1234567890",
    "exp": 1506239022,
    "iat": 1516239022,
    "username": "Gil-Dong Hong",
    "email": "hong@gmail.com"
  }
  ```
* 완성된 헤더와 내용은 Base64Url 형식으로 인코딩되어 사용된다.
* 서명(Signature)은 인코딩된 헤더, 인코딩된 내용, 비밀키, 헤더의 알고리즘 속성값을 가져와 생성한다.
  ```
  HMACSHA256(
    base64UrlEncode(header) + "." + base64UrlEncode(payload),
    secret
  )
  ```
### 3. JWT의 인증 과정
* 클라이언트에서 사용자의 ID와 비밀번호를 사용해 서버에 로그인 요청을 한다.
* 서버는 사용자의 로그인 요청이 유효하다고 판단하면 사용자의 정보를 포함한 JWT를 생성해 클라이언트에게 응답한다.
* 클라이언트는 응답받은 JWT를 로컬 저장소(LocalStorage)나 쿠키에 저장하고 인증이 필요한 요청의 경우 HTTP 헤더에 JWT를 포함해 서버로 요청한다.
  ```
  Authorization: Bearer <JWT>
  ```
* 서버는 인증이 필요한 클라이언트 요청에 대해 JWT의 서명을 확인해 무결성과 유효성을 검증하고 검증에 성공하면 요청한 리소스를 클라이언트에게 제공한다.
