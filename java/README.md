## 프로그래밍 기초
### 1. 프로그램
* 컴퓨터 프로그램이란 컴퓨터에게 특정 문제를 해결하기 위해 처리 방법과 순서를 기술해 놓은 작업지시서(명령문의 집합)이다.
### 2. 프로그래밍
* 프로그램의 목적에 따라 기능별 순서와 처리 방법을 설계하고 구현하는 것이다.
### 3. 프로그래머
* 프로그램을 설계하고 코딩하는 사람(프로그래밍)을 하는 사람을 뜻한다.
### 4. 프로그래밍 언어
* 사람의 언어와 기계의 언어의 중간 다리 역할을 하는 언어가 프로그래밍 언어이다.
* 프로그래밍 언어는 고급 언어와 저급 언어로 구분된다. (고급 언어일수록 사람이 이해하기 쉽고, 컴파일러라는 번역 도구가 필요)
* 프로그래밍 언어로 작성된 내용을 소스(Source)라고 부르고, 이 소스는 컴파일러(Compiler)라는 소프트웨어를 통해서 기계어로 변환된 후 컴퓨터에서 실행할 수 있게 된다.
## 자바(Java)
### 1. 자바란?
* 1995년 썬 마이크로시스템즈의 제임스 고슬링(James Gosling)과 연구원들에 의해 개발한 개발된 객체지향 프로그래밍 언어로 전 세계적으로 다양한 분야에서 사용되고 있다.
* 2009년 4월 20일 썬 마이크로시스템즈가 오라클과 인수 합병되면서 자바는 오라클로 넘어가게 되었다.
### 2. 자바의 특징
* 객체 지향 프로그래밍(Object-Oriented Programming, OOP) 언어이다.
  * 객체 지향 프로그래밍은 프로그램을 개발하는 기법 중 하나로 객체들을 만들고 이러한 객체들을 연결해서 전체 프로그램을 완성하는 기법이다. 
* 운영체제에 독립적이다.
  * 자바 언어로 개발된 프로그램은 소스를 수정하지 않아도, 자바 실행 환경(JRE, Java Runtime Environment)이 설치되어 있는 모든 운영체제에서는 실행이 가능하다.
* 자동으로 메모리를 관리한다.
  * 자바는 개발자가 직접 메모리에 접근할 수 없도록 설계되었으며, 메모리는 자바가 가비지 컬렉터(Garbage Collector, GC)를 활용하여 직접 관리한다.
### 3. JVM(Java Virtual Machine)
* Windows, Linux, MacOS와 같은 운영체제(OS)에서는 자바 프로그램을 직접 실행할 수 없으며 JVM을 통해 자바 프로그램을 실행할 수 있다.
* JVM은 JDK(Java Development Kit) 또는 JRE(Java Runtime Environment)를 설치하면 자동으로 설치되는데 JDK와 JRE는 운영체제에 별로 제공되고 운영체제에 맞게 설치해야 한다.
* JVM이 설치된 환경에서 자바 프로그램을 실행하기 때문에 개발자는 운영체제와 상관없이 자바 프로그램을 개발할 수 있다.
### 4. 자바 프로그램의 실행 단계
* 확장자가 .java인 소스파일 작성을 작성한다.  
* 작성된 소스파일을 자바 컴파일러로 컴파일하여 확장자가 .class인 바이트코드(기계어)로 번역한다.
* 번역된 바이트코드(기계어)를 JVM에서 실행한다.
## 자바 개발 환경 구축
### 1. 자바 설치
* JDK(Java Development Kit)
  * 자바 프로그램을 개발하기 위해서는 JDK(Java Development Kit)를 설치해야 한다. 
  * JDK는 프로그램 개발에 필요한 JRE(JVM), 라이브러리 API, 컴파일러 등의 개발 도구가 포함되어 있다.
* JRE(Java Runtime Environment)
  * 자바 프로그램 실행에 필요한 JVM, 라이브러리 API만 포함되어 있다.
  * 자바 프로그램을 개발하는 것이 아닌 프로그램을 실행만 한다면 JRE만 설치하면 된다.  
* JDK의 종류
  * Java SE(Standard Edition)
  * Java EE(Enterprise Edition)
  * Java ME(Micro Edition)
* JDK 설치
  * 오라클 JDK의 경우 유료이기 때문에 Temurin OpenJDK를 설치한다.
  * [Temurin 공식 홈페이지](https://adoptium.net/)에서 원하는 버전의 JDK(LTS)를 다운로드 후 설치한다.
  * 설치가 완료되면 "명령 프롬프트" 실행 후 아래의 명령어를 입력하여 JDK가 정상적으로 설치되었는지 확인한다.
    ```
    > java -version
    ...

    > javac -version
    ...
    ```
### 2. IDE 설치 
* IDE(Integrated Development Environment)
  * IDE는 프로그램 개발에 필요한 기능을 통합해서 제공해 주는 프로그램이다.
  * IDE는 소스 코드 편집기, 빌드 자동화, 코드 실행, 디버거 등의 기능을 제공해 준다.
* 인텔리제이(IntelliJ) 설치
  * 인텔리제이는 JetBrains사에서 만든 상용 자바 통합 개발 환경(IDE)이다.
  * [인텔리제이 공식 홈페이지](https://www.jetbrains.com/ko-kr/idea/download)에서 운영체제에 맞는 인스톨러를 다운로드 후 설치한다.
## 변수(Variable)
### 1. 변수
* 컴퓨터 메모리(RAM)에 값을 저장하기 위해 할당받는 공간을 변수라고 한다.
* 프로그램에 의해서 할당받은 공간의 값이 수시로 변경될 수 있기 때문에 변수라고 부른다.
### 2. 변수의 선언
* 변수를 사용하기 위해서는 먼저 변수를 선언해야 한다.
* 변수의 선언은 어떤 타입의 데이터를 저장할 것인지 그리고 변수의 이름이 무엇인지 기술해야 한다.
* 변수를 선언하는 구문은 `자료형 변수명;`이다.
    ``` java
    // 정수형 변수 선언
    byte bnum;
    short snum;
    int inum;
    long lnum;

    // 실수형 변수 선언
    float fnum;
    double dnum;

    // 논리형 변수 선언
    boolean isTrue;

    // 문자형 변수 선언
    char ch;

    // 문자열 변수 선언
    String str;
    ```
### 3. 변수의 명명 규칙
* 영어 대소문자가 구분되며 문자 수의 제한이 없다.
* 숫자로 시작하면 안 된다.
* 특수문자는 '_'와 '$'만 허용한다.
* 여러 단어로 조합된 변수의 이름은 첫 시작 글자는 소문자로 하고 조합되는 단어의 첫 글자를 대문자로 하는 것이 관례이다.
* 의미 있는 이름을 지어주는 것이 좋다.
* 예약어를 사용하면 안 된다. (class, int, new, null 등)
### 4. 변수의 값 대입
* 변수에 값을 저장할 때는 대입 연산자(=)를 사용한다.
    ``` java
    int age;

    // 한 개의 변수는 한 개의 데이터만 저장할 수 있다. 
    // 연속으로 값을 저장하면 마지막에 대입한 값이 저장된다.
    age = 10;
    age = 20; 
    ```
### 5. 변수의 초기화
* 변수를 선언하고 처음 저장되는 값을 초기값, 변수에 초기값을 대입하는 것을 변수의 초기화라 한다.
* 지역변수(메소드 안에 선언된 변수)를 사용하려면 반드시 초기화되어야 한다.
    ``` java
    // 선언 후 초기화
    int age;

    age = 100;

    // 선언과 동시에 초기화
    int age = 100;
    ```
### 6. 변수의 사용
* 변수는 출력문이나 연산식 내부에서 변수에 저장된 값을 출력하거나 연산할 때 사용한다.
    ``` java
    int age = 100;
    
    System.out.println("나이 : " + age);
    ```
## 자료형
### 1. 자료형
* 자료형은 저장될 데이터의 타입을 뜻하며 저장하고자 하는 값의 종류에 맞게 기술해야 한다.
### 2. 기본 타입
* 정수, 실수, 문자, 논리 타입을 기본 타입이라고 한다.
* 기본 타입은 정해진 메모리 크기(byte)를 사용해 값을 저장하는데 바이트 크기가 클수록 표현하는 값의 범위가 크다.
    |타입|자료형|범위|크기(byte)|기본값|
    |:---:|:---:|:---:|:---:|:---:|
    |논리형|boolean|true, false|1|false|
    |문자형|char|0 ~ 65,535 (유니코드)|2|'\u0000'|
    |정수형|byte|-128 ~ 127|1|0|
    |정수형|short|-32,768 ~ 32767|2|0|
    |정수형|int|-2,147,483,648 ~ 2,147,483,647|4|0|
    |정수형|long|-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807|8|0L|
    |실수형|float|±1.4E-45 ~ 3.4E38|4|0.0f|
    |실수형|double|±4.9E-324 ~ 1.8E308|8|0.0 또는 0.0d|
### 3. 문자열
* 자바에서 단어나 문장을 문자열이라고 한다.
* 문자열을 저장할 때는 String 타입을 사용하는데 String은 클래스 타입으로 String 타입의 변수는 참조 변수이다.
    ``` java
    String str = "오리";
    String str = new String("오리");
    String str = "오리" + "꽥꽥"; // 문자열 연결 연산
    String str = new String("오리" + "꽥꽥");
    ```
### 4. 리터럴
* 소스 코드에서 프로그래머에 의해 직접 입력된 값을 리터럴이라고 한다.
* 리터럴은 정수, 실수, 문자, 논리, 문자열 리터럴로 구분되며 리터럴들은 정해진 표기법대로 작성되어야 한다.
    ``` java
    short s = 32767; 
    int i = 100; 
    long l = 10000L;
    float f = 0.123f;
    double d = 3.14;
    char c = 'A';
    String str = "ABC";
    ```
### 5. 형 변환(Type Casting)
* 데이터의 타입을 변환하는 것을 형 변환(Type Casting)이라 한다. (boolean 제외)
* 자료형의 값의 표현 범위 차이에 따라 자동 형 변환, 강제 형 변환으로 나뉜다.
  * 자동 형 변환은 컴파일러가 자동으로 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환한다. 
  * 강제 형 변환은 값의 표현 범위가 큰 자료형을 작은 자료형으로 강제로 변환한다.
  ``` java
      // 자동 형 변환 (단, byte와 short 자료형 값의 계산 결과는 int로 처리한다.)
      double result = 12 + 3.3; // 12.0 + 3.3 = 15.3 (데이터 손실 없음)

      // 강제 형 변환
      int result = 12 + (int) 3.3; // 12 + 3 = 15 (0.3 데이터 손실 발생)
  ```
## 연산자(Operator)
### 1. 연산자
* 프로그램에서 데이터를 처리하여 결과를 산출하는 과정을 연산이라고 한다.
* 연산에 사용되는 표시나 기호를 연산자(Operator)라고 한다.
* 연산의 대상이 되는 데이터를 피연산자(Operand)라고 한다.
* 자바에서는 다양한 연산자들을 제공하고 있으며 숫자뿐만 아니라 문자열 등 다양한 데이터들도 연산이 가능하다.
* 연산자는 피연산자의 수에 따라 단항, 이항, 삼항 연산자로 구분된다.
### 2. 단항 연산자
* 단항 연산자는 한 개의 피연산자를 필요로 하는 연산자이다.
#### 2.1. 부호 연산자
* 부호 연산자는 양수 및 음수를 표시하는 연산자이다. (+ 부호 유지, - 부호 변경)
* boolean, char 타입을 제외한 기본 타입에 사용할 수 있다.
    ``` java
    int num = -10;
    ```
#### 2.2. 논리 부정 연산자
* 논리 부정 연산자는 true를 false로 false를 true로 변경하는 연산자이다.
* boolean 타입에만 사용할 수 있다.
    ``` java
    boolean result = true;

    System.out.println(result); // true
    System.out.println(!result); // false
    ```
#### 2.3. 증감 연산자
* 증감 연산자는 피연산자의 값에 1을 증가시키거나 감소시키는 연산자이다.
* boolean 타입을 제외한 기본 타입에 사용할 수 있다.
* 증감 연산자가 피연산자 앞에 있으면 먼저 증감 연산을 수행하고 다음 연산을 수행한다.
    ``` java
    int num = 10;
    int result = ++num; // 전위 연산

    System.out.println(num + ", " + result); // 11, 11
    ```
* 증감 연산자가 피연산자 뒤에 있으면 다른 연산을 먼저 수행하고 증감 연산을 수행한다.
    ``` java
    int num = 10;
    int result = num++; // 후위 연산

    System.out.println(num + ", " + result); // 11, 10
    ```
### 3. 이항 연산자
* 이항 연산자는 두 개의 피연산자를 필요로 하는 연산자이다.
#### 3.1. 산술 연산자
* 수학의 사칙연산(+, -, *, /)과 나머지 연산(%)을 하는 연산자이다.
* boolean 타입을 제외한 기본 타입에 사용할 수 있다.
    ```java
    System.out.println(10 + 5); // 15
    System.out.println(10 - 5); // 5
    System.out.println(10 * 5); // 50
    System.out.println(10 / 5); // 2
    System.out.println(10 % 5); // 0
    System.out.println(10 % 3); // 1
    ```
#### 3.2. 문자열 연결 연산자
* 문자열에서 + 연산자는 문자열을 서로 연결하는 연산자이다.
* 피연산자 중에 한 쪽이 문자열이면 다른 피연산자를 문자열로 변환하고 서로 연결한다.
    ```java
    System.out.println("Hello" + "World"); // HelloWorld
    System.out.println("1" + 2); // 12
    ```
#### 3.2. 비교 연산자
* 비교 연산자는 피연산자의 대소(>, >=, <, <=) 또는 동등(==, !=)을 비교하는 연산자이다.
* 대소 비교는 boolean 타입을 제외한 모든 기본 타입에 사용할 수 있고, 동등 비교는 모든 타입에서 사용할 수 있다.
* 비교 연산의 결과 값은 boolean 타입이다. (true 또는 false)
    ``` java
        // ≥, ≤, ≠는 키보드로 누를 수 없기 때문에 >=, <=, !=로 사용한다.
        System.out.println(10 == 5); // false
        System.out.println(10 != 5); // true
        System.out.println(10 > 5); // true
        System.out.println(10 <= 5); // false
        System.out.println(true == false); // false
        System.out.println(true > false); // Syntax Error
    ```
#### 3.3. 논리 연산자
* 논리 연산자는 논리 값을 비교하는 연산자이다. (동등, 크기 비교 X)
* 논리 연산의 결과 값은 boolean 타입이다. (true 또는 false)
    ``` java
    // 논리곱(&&)은 피연산자가 모두 true일 경우 연산 결과가 true이다.
    System.out.println(true && true); // true
    System.out.println(true && false); // false
    // 논리합(||)은 피연산자 중 하나만 true 이면 연산 결과가 true이다.
    System.out.println(true || false); // true
    System.out.println(false || false); // false
    ```
#### 3.4. 대입 연산자
* 대입 연산자는 오른쪽 피연산자의 값을 왼쪽 변수에 저장한다.
    ``` java
    int num = 10;
    // 오른쪽 피연산자는 리터럴, 변수, 연산식이 올 수 있다.
    int result = num * 10;
    ```
#### 3.5. 복합 대입 연산자
* 다른 연산자와 대입 연산자가 결합한 것으로 자기 자신과 연산 후 연산 결과를 자기 자신에게 대입한다.
* 코드가 간결하고 메모리에서 직접 연산을 수행하여 연산 속도가 빠르다.
* 증감 연산자와 비슷해 보이지만 증감 연산자는 1씩 증감하지만 복합 대입 연산자는 원하는 값만큼 증감시키고 변수에 저장한다.
    ``` java
    a += 10; // a = a + 10;
    a -= 10; // a = a - 10;
    a *= 10; // a = a * 10;
    a /= 10; // a = a / 10;
    a %= 10; // a = a % 10;
    ```
### 3. 삼항 연산자
* 삼항 연산자는 세 개의 피연산자를 필요로 하는 연산자이다.
* 삼항 연산자는 뒤에서 배우는 if 문으로 변경해서 작성할 수 있지만 한 줄에 간단하게 사용하고자 할 때 사용한다.
* 삼항 연산자는 중첩해서 여러 번 사용이 가능하다.
    ``` java
    // ? 앞의 조건식을 연산하여 true가 나오면 결과는 a, false 가 나오면 결과는 b가 된다.
    int max = (a > b) ? a : b;
    int min = (a < b) ? a : b;
    ```
### 4. 연산자의 우선순위
* 수학에서처럼 프로그램 연산자에도 우선순위가 존재한다.
* 단항, 이항, 삼항 연산자 순으로 우선순위를 가진다.
* 산술, 비교, 논리, 대입 연산자 순으로 우선순위를 가진다.
* 동일한 우선순위의 연산의 경우 대부분 왼쪽에서 오른쪽으로 연산을 시작한다. (단항, 부호, 대입 연산자 제외)
## 제어문
### 1. 제어문
* 자바 프로그램의 실행 흐름을 개발자가 원하는 방향으로 바꾸어주는 것이 제어문이다.
* 제어문은 조건식과 중괄호({}) 블록으로 구성되는데 조건식의 결과에 따라 블록 내부의 실행 여부가 결정된다.
* 제어문에는 조건문, 반복문, 분기문이 있다.
### 2. 조건문
* 조건문은 특정 조건에 따라 원하는 코드를 실행시키는 구문이다.
#### 2.1. if 문
* 조건식이 true 일 때 중괄호({}) 블록이 실행되고 false 일 때는 중괄호({}) 블록이 실행되지 않는다.
    ```java
    if(조건식) {
        // 실행 코드
    }
    ```
#### 2.2. if-else 문
* 조건식이 true 일 때 if 문의 중괄호({}) 블록이 실행되고 false 일 때는 else 문의 중괄호({}) 블록이 실행된다.
    ```java
    if(조건식) {
        // 실행 코드
    } else {
        // 실행 코드
    }
    ```
#### 2.3. if-else if-else 문
* 조건식이 여러 개인 if 문을 만들 때 사용하는 구문이다.
* 처음 조건식이 true 일 때 if 문의 중괄호({}) 블록이 실행된다.
* 처음 조건식이 false일 경우 if 문 이후에 작성된 else if 문 중에 조건식이 true에 해당하는 중괄호({}) 블록이 실행된다.
* 모든 조건식이 false 일 때는 else 문의 중괄호({}) 블록이 실행된다.
    ```java
    if(조건식) {
        // 실행 코드
    } else if(조건식) {
        // 실행 코드
    } 
    // else if 문의 수는 제한이 없다.
    ... 
    else {
        // 실행 코드
    }
    ```
#### 2.4. switch 문
* switch 문은 조건식의 결과값이(계산식, 변수, 리터럴) 어떤 값(정수, 문자, 문자열)을 갖느냐에 따라서 실행문이 선택된다.
* if 문과 다르게 코드를 실행하고 조건문을 빠져나가기 위해 break 문이 필요하다.
    ```java
    switch(값) { 
        case 값1 : 
            // 실행 코드; 
            break; 
        case 값2 : 
            // 실행 코드; 
            break; 
        ... 
        default : 
            // 실행 코드;
    }
    ```
### 3. 반복문
* 반복문은 특정 코드를 반복적으로 실행시키는 구문이다.
#### 3.1. for 문
* for 문은 주어진 횟수만큼 코드를 반복 실행하는 구문이다.
    ``` java
    for(초기식; 조건식; 증감식) {
        // 실행 코드
    }
    ```
#### 3.2 향상된 for 문
* 자바 5부터 배열 및 컬렉션 객체를 좀 더 쉽게 처리할 목적으로 제공된다.
* 향상된 for 문은 반복 실행을 위한 증감식을 사용하지 않고 배열 및 컬렉션의 요소 개수만큼 반복하고 for 문을 종료한다.
    ``` java
    for(변수 : 배열or컬렉션) {
        // 실행 코드
    }
    ```
#### 3.2. while 문
* while 문은 조건식이 true 일 경우에 코드를 반복 실행하는 구문이다. 
* while 문을 빠져나가기 위한 코드(증감식, 분기문)가 필요하다.
    ``` java
    while(조건식) {
        // 실행 코드
        // 증감식 or 분기문
    }
    ```
#### 3.3. do-while 문
* do-while 문은 while 문과 동일하게 조건식에 의해 코드를 반복 실행하는 구문이지만 조건식이 true가 아니더라도 무조건 한 번은 실행되는 구문이다.
    ``` java
    do {
        // 실행 코드
        // 증감식 or 분기문
    } while(조건식);
    ```
### 4. 분기문
* 분기문은 반복을 멈추거나, 조건식으로 이동하는 경우 사용한다.
#### 4.1. break 문
* break 문은 switch 문과 for 문, while 문, do-while 문의 실행을 중지하고 빠져나갈 때 사용한다.
* 반복문이 중첩되어 있는 경우 break 문이 포함되어 있는 반복문만 중지하고 빠져나간다.
    ``` java
    while(true) {
        for(int i = 0; i < 10; i++ ) {
            if (i == 5) {
                break;
            }

            System.out.println("i : " + i);
        }
    }
    ```
#### 4.2. continue 문
* continue 문은 반복문에서 이후의 문장을 실행하지 않고 증감식 또는 조건식으로 이동할 때 사용한다.
* 반복문이 중첩되어 있는 경우 continue 문이 포함되어 있는 가장 가까운 반복문의 증감식 또는 조건식으로 이동한다
    ``` java
    while(true) {
        for(int i = 0; i < 10; i++ ) {
            if (i == 5) {
                continue;
            }

            System.out.println("i : " + i);
        }
    }
    ```
## 배열(Array)
### 1. 배열(Array)
* 자바는 같은 타입의 많은 데이터를 다루는 효율적인 방법인 배열을 제공한다.
* 배열은 같은 타입의 데이터를 연속된 공간에 나열시키고, 각 데이터에 인덱스(index)를 부여해 데이터를 읽거나, 데이터를 저장하는 방법을 제공한다.
### 2. 배열 변수의 선언
* 변수와 마찬가지로 배열을 사용하기 위해서는 배열 변수를 선언해야 한다.
* 배열 변수를 선언하는 구문은 `자료형[] 변수명 또는 자료형 변수명[]`이다.
    ``` java
    // 대괄호([])는 배열 변수를 선언할 때 사용하는 기호이다.
    int[] iArray;
    double dArray[];
    ```
### 3. 배열 생성 및 초기화
#### 3.1. new 연산자로 배열 생성 및 초기화
* 배열에 저장될 값을 배열 생성 후 저장하려면 new 연산자로 배열을 생성하면 된다.
* new 연산자로 배열을 생성하는 구문은 `new 자료형[배열 크기]`이다.
    ``` java
    int[] iArray;
    double dArray[] = new double[5]; // 배열 변수 선언과 동시에 배열 생성

    iArray = new int[5]; // 배열 변수 선언 후 배열 생성
    ```
* 배열이 생성되고 나서 배열에 저장되어 있는 값을 읽거나 저장, 변경하기 위해서는 배열 변수명과 인덱스를 사용한다.
    ``` java
    //  배열의 인덱스는 0번부터 시작한다. (Zero Base)
    iArray[0] = 10; 
    iArray[1] = 20; 
    iArray[2] = 30; 
    iArray[3] = 40; 
    iArray[4] = 50;
     // iArray[5] = 60; // ArrayIndexOutOfBoundsException

    System.out.println(iArray[0]); // 10 출력
    System.out.println(iArray[1]); // 20 출력
    System.out.println(iArray[2]); // 30 출력
    System.out.println(iArray[3]); // 40 출력
    System.out.println(iArray[4]); // 50 출력
    // System.out.println(iArray[5]); // ArrayIndexOutOfBoundsException
    ```
* 배열 사용 시 반복문을 활용하여 편리하게 사용이 가능하다.
    ``` java
    // 배열변수.length 필드로 배열의 길이를 얻을 수 있다.
    for(int i = 0; i < dArray.length; i++) {
        iArray[i] = (i + 1) * 10;

        System.out.println(iArray[i]);
    }
    ```
#### 3.2. 값 목록으로 배열 생성 및 초기화
* 배열에 저장될 값을 배열 생성과 동시에 초기화하려면 값 목록으로 배열을 생성하면 된다.
* 값 목록으로 배열을 생성하는 구문은 `new 자료형[] {값, 값, 값, ... } 또는 {값, 값, 값, ... }`이다.
    ``` java
    int[] iArray = new int[] {1, 2, 3, 4, 5}; // 배열 생성과 동시에 초기화
    double dArray[] = {1.1, 2.2, 3.3, 4.4, 5.5}; // 배열 생성과 동시에 초기화
    ```
* 배열 변수를 이미 선언한 후에 중괄호를 사용한 배열 생성은 불가능하다.
    ``` java
    int[] iArray;

    iArray = {1, 2, 3, 4, 5}; // 에러 발생
    ```
* 배열 변수를 미리 선언한 후에 중괄호를 사용한 배열 생성은 new 연산자를 사용해서 값 목록을 지정해야 한다.
    ``` java
    int[] iArray;

    iArray = new int[] {1, 2, 3, 4, 5};
    ```
### 4. 배열의 저장 구조
* 배열 변수는 참조 변수이다. 배열 변수는 Stack 영역에 생성된다.
* `new 자료형[배열 크기]` 구문을 실행하면 Heap 영역에 배열을 생성하고, 배열의 시작 주소를 반환한다.
* `new 자료형[] {값, 값, 값, ... } 또는 {값, 값, 값, ... }` 구문을 실행하면 주어진 값들을 요소로 가지는 배열을 Heap 영역에 생성하고, 배열의 시작 주소를 반환한다.
* `new 자료형[배열 크기]` 구문으로 배열을 생성할 경우 배열은 자동적으로 기본값으로 초기화된다.
    |자료형|초기값|자료형|초기값|
    |:--:|:--:|:--:|:--:|
    |byte|0|float|0.0F|
    |short|0|double|0.0|
    |int|0|char|\u0000|
    |long|0|boolean|false|
    |참조형|null|||
* null(널)은 참조형 변수가 Heap 영역의 객체를 참조하지 않는다고 뜻하는 값이다.
* null 값을 가지고 있는 참조 변수를 사용하면 `NullPointerException`이 발생한다.
## 2차원 배열
### 1. 2차원 배열
* 배열의 요소로 다른 배열을 가지는 배열을 2차원 배열이라고 한다.
* 2차원 배열은 논리적으로 행과 열로 이루어진 표 형태로 존재한다고 생각하면 된다.
* 2차원 배열은 할당된 공간마다 인덱스 번호 두 개를 갖는다. (앞 번호는 행, 뒤 번호는 열)
### 2. 2차원 배열 변수 선언
* 2차원 배열 변수를 선언하는 구문은 `자료형[][] 변수명 또는 자료형 변수명[][]`이다.
    ``` java
    int[][] iArray;
    double dArray[][];
    byte[] bArray[]; // 배열 변수 선언 가능
    ```
### 3. 2차원 배열의 생성 및 초기화
#### 3.1. new 연산자로 2차원 배열 생성 및 초기화
* new 연산자로 2차원 배열을 생성하는 구문은 `new 자료형[행 크기][열 크기]`이다.
    ``` java
    int[][] iArray;
    double dArray[][] = new double[4][4];

    iArray = new int[4][4];
    ```
* 2차원 배열이 생성되고 나서 배열을 사용하기 위해서는 변수명과 두 개의 인덱스(행과 열)를 사용한다.
    ``` java
    iArray[0][0] = 10; 
    iArray[0][1] = 20; 
    iArray[0][2] = 30; 
    iArray[0][3] = 40; 
    ...

    System.out.println(iArray[0][0]); // 10 출력
    System.out.println(iArray[0][1]); // 20 출력
    System.out.println(iArray[0][2]); // 30 출력
    System.out.println(iArray[0][3]); // 40 출력
    ...
    ```
* 2차원 배열 사용 시 중첩 반복문을 활용하여 편리하게 사용이 가능하다.
    ``` java
    for(int i = 0; i < iArray.length; i++) {
        for(int j = 0; j < iArray[i].length; j++) {
            iArray[i][j] = (j + 1) * 10;

            System.out.println(iArray[i][j]);
        }
    }
    ```
#### 3.2. 값 목록으로 2차원 배열 생성 및 초기화
* 값 목록으로 2차원 배열을 생성하는 구문은 `new 자료형[][] {{값, 값, ... }, {값, 값, ... }} 또는 {{값, 값, ... }, {값, 값, ... }}`이다.
    ``` java
    int[][] iArray = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}};
    double dArray[][] = {{1.1, 2.2, 3.3, 4.4}, {5.5, 6.6, 7.7, 8.8}};
    ```
## 열거 타입(Enumeration Type)
### 1. 열거 타입(Enumeration Type)
* 데이터 중에는 몇 가지로 한정된 값만 갖는 데이터가 있다.
* 한정된 값만을 갖는 데이터 타입이 열거 타입(Enumeration Type)이다. 
* 열거 타입은 몇 개의 열거 상수(Enumeration Constant) 중에서 하나의 상수를 저장하는 데이터 타입이다.
### 2. 열거 타입 선언
* 열거 타입은 클래스와 동일하게 소스 파일(.java)을 생성해야 한다.
* 열거 상수는 모두 대문자로 작성하는 것이 관례이다.
  ```java
  // public enum은 열거 타입을 선언하기 위한 키워드이다.
  // 열거 타입의 이름은 소스 파일명과 동일해야 한다.
  public enum Week {
     MONDAY, 
     TUESDAY, 
     WEDNESDAY,
     THURSDAY,
     FRIDAY,
     SATURDAY,
     SUNDAY
  }
  ```
### 3. 열거 타입 변수
* 열거 타입도 하나의 데이터 타입이므로 변수를 선언하고 사용해야 한다.
  ```java
  Week today;
  ```
* 선언된 열거 타입 변수에 열거 상수를 저장할 수 있다.
* 열거 상수는 단독으로 사용할 수 없고 반드시 `열거 타입.열거 상수`로 사용된다.
  ```java
  Week today = Week.FRIDAY;
  ```
### 4. 열거 타입 메소드
* name() 메소드는 열거 상수가 가지고 있는 문자열을 반환한다.
* ordinal() 메소드는 전체 열거 상수 중 몇 번째 열거 상수인지 정숫값을 반환한다. (0부터 시작)
* equals() 메소드는 매개값으로 전달되는 열거 상수와 동일한 열거 상수인지 확인 후 true 또는 false를 반환한다.
* compareTo() 메소드는 매개값으로 주어진 열거 상수를 기준으로 전후로 몇 번째 위치하는 정숫값을 반환한다.
  ```
  System.out.println(today.name());
  System.out.println(today.ordinal());
  System.out.println(today.equals(Week.SUNDAY));
  System.out.println(today.compareTo(Week.SUNDAY));
  ```
### 5. 열거 타입에 속성 추가하기
* 열거 타입의 열거 상수에 다른 속성을 추가할 수 있다.
* 열거 상수의 괄호()를 넣고 추가로 할 속성을 적어준다.
* 열거 타입에 필드를 설정하고 Getter를 통해 읽어 올 수 있다.
  ```java
  public enum Week {
    MONDAY("monday", 1),
    TUESDAY("tuesday", 2),
    WEDNESDAY("wednesday", 3),
    THURSDAY("thursday", 4),
    FRIDAY("friday", 5), 
    SATURDAY("saturday", 6),
    SUNDAY("sunday", 7);
  
    private final String name;
    private final int value;
  
    // 열거 타입의 생성자는 반드시 private으로 선언해야 한다.
    private Week(String name, int value) {
        this.name = name;
        this.value = value;
    }
  
    // 열거 타입의 name 값을 읽어오는 메소드이다.
    public String getName() {
        return this.name;
    }
    
    // 열거 타입의 value 값을 읽어오는 메소드이다.
    public int getValue() {
        return this.value;
    }
  }
  ```
## 클래스(Class)
### 1. 객체
 * 객체란 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성과 기능을 가지고 다른 것과 식별이 가능한 것을 말한다. (ex. 유형, 무형, 개념 등)
### 2. 객체 지향 프로그래밍(OOP, Object-Oriented Programming)
* 프로그램을 개발하는 기법으로 객체들을 만들고 이러한 객체들을 연결해서 프로그램을 완성하는 기법을 객체 지향 프로그래밍이라고 한다.
* 객체 지향 프로그래밍 특성을 지원하는 언어를 객체 지향 프로그래밍 언어라고 한다.
### 3. 객체와 클래스
* 클래스는 객체의 특성(속성, 기능)을 정의하는 설계도이다.
  * 객체의 속성은 필드를 통해서 정의한다.
  * 객체의 기능은 메소드를 통해서 정의한다.
* 클래스로부터 메모리에 생성된 객체를 해당 클래스의 인스턴스(Instance)라고 한다.
* 객체(Object)는 프로그램에서 구현할 대상으로 이를 구현하기 위한 설계도가 클래스(Class)이고, 클래스로부터 메모리에 생성된 실체가 인스턴스(Instance)이다.
### 4. 클래스 선언
* 클래스를 선언하는 구문은 `[접근 제한자] [예약어] class 클래스명 { ... }`이다.
* 클래스의 이름은 자바의 식별자 작성 규칙에 따라서 만들어야 한다.
* 소스 파일의 이름은 반드시 선언된 클래스 이름과 같도록 해야 한다.
* 접근 제한자는 public, default 설정이 가능하다.
* 클래스에는 구성 멤버로 필드(Field), 메소드(Method), 생성자(Constructor)가 정의된다.
  ``` java
  public class Member {
    // 필드, 생성자, 메소드 정의
    ...
  }
  ```
### 5. 객체 생성
* 클래스로부터 객체를 생성하려면 new 연산자를 사용해서 생성한다.
  ```java
  클래스명 변수명 = new 클래스명();
  ```
* new 연산자는 Heap 영역에 객체를 생성하고 객체의 주소값을 리턴한다.
* 객체의 주소값을 참조 타입인 변수에 저장해서 객체를 사용할 수 있다.
  ``` java
  // new 연산자와 클래스의 생성자를 사용해서 객체를 생성한다.
  Member member = new Member();
  ```
## 필드(Field)
### 1. 필드(Field)
* 필드는 객체의 데이터, 상태 등의 속성이 저장되는 공간이다.
* 선언 형태는 변수와 비슷하지만, 필드를 변수라고 부르지 않는다.
* 필드는 생성자와 메소드 전체에서 사용되며 객체가 생성되고 소멸되기 전까지 객체와 함께 존재한다.
### 2. 필드 선언
* 필드를 선언하는 구문은 `[접근 제한자] [예약어] 자료형 변수명[ = 초기값];`이다.
* 필드 선언은 클래스 중괄호 블록 어디서든 존재할 수 있다. 단, 생성자와 메소드 중괄호 블록 내부에는 선언될 수 없다.
* 접근 제한자는 public, private, default, protected 설정이 가능하다.
* 필드의 초기값은 필드 선언 시 주어질 수도 있고, 생략될 수도 있다.
* 초기값이 지정되지 않은 필드는 객체 생성 시 자동으로 기본 초기값으로 설정된다.
  ``` java
  public class Member {
    // 필드 정의
    public String name; // null
    private int age = 20;
    
    // 생성자, 메소드 정의
    ...
  }
  ```
### 3. 필드 사용
* 클래스 내부에서 필드는 생성자와 모든 메소드에서 사용이 가능하다.
* 클래스 외부에서 필드를 사용하려면 클래스로부터 객체를 생성하고 필드를 사용해야 한다.
* 접근 제한자가 public인 필드의 경우 도트(.) 연산자를 사용해서 필드에 접근할 수 있다.
  ``` java
  Member member = new Member();

  // 도트(.) 연산자를 사용해서 필드에 접근
  member.name; // 접근 가능
  member.age; // 에러 발생
  ```
## 생성자(Constructor)
### 1. 생성자(Constructor)
* 생성자는 new 연산자로 호출되는 특별한 메소드로 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다.
* 모든 클래스는 생성자가 반드시 존재해야 하고 생성자를 하나 이상을 가질 수 있다. 
* 생성자와 new 연산자에 의해 힙(Heap) 영역에 객체가 생성되고 생성된 객체의 주소가 리턴된다.
### 2. 생성자 선언
* 생성자를 선언하는 구문은 `[접근 제한자] 클래스명([매개변수]) { ... }`이다.
* 생성자의 선언은 메서드와 다르게 반환값이 없고 생성자명은 클래스명과 똑같이 지정해 주어야 한다.
* 클래스에 생성자 선언을 생략하면 컴파일러가 내용이 비어있는 기본 생성자(Default Constructor)를 자동으로 추가해 준다.
* 단, 클래스에서 생성자를 한 개라도 명시적으로 선언했다면 컴파일러는 기본 생성자를 추가하지 않는다.
* 생성자도 메소드이기 때문에 오버로딩이 가능하며 오버로딩의 조건은 메소드 오버로딩과 동일하다.
* 생성자 오버로딩을 통해서 여러 개의 생성자를 만들고 객체 생성 시 필요한 생성자를 호출해서 객체를 만들 수 있다.
  ``` java
  public class Member {
    // 필드 정의
    private String name;
    private int age;
    
    // 생성자 정의
    // 기본 생성자
    public Member() {
    }

    // 매개변수가 있는 생성자 (필드 초기화)
    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
    
    // 메소드 정의
    public String information() {
      return "이름은 " + this.name + ", 나이는 " +  this.age + "살 입니다.";
    }
  }
  ```
  ``` java
  Member member1 = new Member(); // 기본 생성자 호출
  Member member2 = new Member("홍길동", 38); // 이름과 나이를 매개값으로 받는 생성자 호출
  ```
### 3. this
* 객체 내부에서 객체는 자신을 this라고 표현한다.
* 객체 내부에서 다른 멤버에 접근하기 위해 this를 사용한다.
* this는 주로 생성자와 메소드의 매개변수 이름이 필드와 동일한 경우에 매개변수와 필드를 구분하기 위해 사용한다.
### 4. 다른 생성자 호출
* 생성자에서 다른 생성자를 호출할 때 this()를 사용한다. 단, 생성자의 첫 줄에서만 사용해야 한다.
* this()를 통해서 생성자 간에 중복되는 코드를 제거할 수 있다.
  ``` java
  public class Member {
    private String name;    
    private int age;

    public Member() {
      // 생성자의 매개변수 타입과 순서에 맞게 전달해야 한다.
      this("아무개", 0);
    }

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  ```
## 메소드(Method)
### 1. 메소드(Method)
* 메소드는 객체의 기능, 동작에 해당하는 코드 블록({})이다.
* 메소드는 수학의 함수와 비슷하며 호출을 통해 사용한다. 
* 메소드를 호출하게 되면 중괄호 블록에 있는 코드들이 순차적으로 실행한다.
* 메소드는 외부로부터 필요한 값을 전달받을 수도 있고 메소드 실행 후 결과 값을 반환할 수도 있다.
### 2. 메소드 선언
* 메소드를 선언하는 구문은 `[접근 제한자] [예약어] 반환형 메소드명([매개변수]) { ... }`이다.
* 메소드 선언은 선언부(리턴 타입, 메소드 이름, 매개변수)와 실행 블록({})으로 구성된다.
* 접근 제한자로는 public, private, default, protected 설정이 가능하다.
* 매개변수는 메소드가 실행할 때 필요한 데이터를 외부로부터 받기 위해 사용된다. 
* 메소드를 호출한 곳으로 돌아가면서 결과값을 반환하기 위해 return 문을 사용한다.
  ``` java
  public class Member {
    // 필드 정의
    private String name;
    private int age;
    
    // 생성자 정의
    ...
    
    // 메소드 정의
    public String information() {
      return "이름은 " + this.name + ", 나이는 " +  this.age + "살 입니다.";
    }
  }
  ```
### 3. 메소드 호출
* 클래스 내부의 다른 메소드에서 호출할 경우에는 메소드 이름으로 호출하면 된다.
* 클래스 외부에서 메소드를 호출할 경우에는 클래스로부터 객체를 생성한 후 메소드를 호출해야 한다. 
* 메소드를 호출하고 리턴 값을 받고 싶다면 변수를 선언하고 대입하면 된다.
* 접근 제한자가 public인 메소드의 경우 도트(.) 연산자를 사용해서 메소드를 호출할 수 있다.
  ``` java
  String info = null;
  Member member = new Member();

  // 도트(.) 연산자를 사용해서 메소드에 접근
  info = member.information();
  ```
### 4. 메소드 오버로딩
* 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것을 메소드 오버로딩(Overloading)이라고 한다. 
* 메소드 오버로딩을 통해서 매개값을 다양하게 받아서 필요한 처리할 수 있다.
* 메소드 오버로딩의 조건은 매개변수의 타입, 개수, 순서 중 하나가 달라야 한다. 
* 매개변수 이름만 바꾸는 것은 메소드 오버로딩이 아니다. 또한 리턴 타입만 다르고 매개변수가 동일한 것도 메소드 오버로딩이 아니다.
  ``` java
  // 오버로딩의 대표적인 예시
  System.out.println(1);
  System.out.println(false);
  System.out.println('A');
  System.out.println("Hello World!");
  ```
### 5. Getter와 Setter 메소드
* 객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것이 불가능하다.
* 메소드를 통해서 필드값을 가공한 후 외부로 전달하는 역할을 하는 메소드가 Getter이다.
* 메소드를 통해서 검증된 유효한 값만 데이터로 저장하는 역할을 하는 메소드가 Setter이다.
* 필드 타입이 boolean일 경우에는 Getter는 get으로 시작하지 않고 is로 시작하는 것이 관례이다.
  ``` java
  public class Member {
    // 필드 선언
    private String name;
    private int age;

    // Getter & Setter
    public void setName(String name) {
      // 매개변수의 이름과 필드의 이름이 동일할 경우 this를 사용해서 필드에 접근할 수 있다.
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public void setAge(int age) {
      // 유효한 값만 데이터로 저장되도록 Setter 작성
      this.age = (age >= 1) ? age : 1 ;
    }

    public int getAge() {
      return this.age;
    }
  }
  ```
## 정적(Static) 멤버
### 1. 정적(Static) 멤버
* 정적 멤버는 클래스에 고정된 멤버로 객체를 생성하지 않고 사용할 수 있는 필드와 메소드를 말한다.
* 정적 멤버는 인스턴스에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 클래스 멤버라고도 한다. 
### 2. 정적 멤버 선언
* 정적 멤버를 선언하는 방법은 필드와 메소드 선언 시 static 키워드를 붙여주면 된다.
* 필드를 선언할 때 객체들이 공유할 목적의 데이터라면 정적 필드로 선언한다. 
* 메소드를 선언할 때 메소드 내부에서 정적 멤버를 사용하거나 필드를 사용하지 않는다면 정적 메소드로 선언한다.
  ``` java
  // java.lang에서 제공하는 Math 클래스
  public final class Math {
    public static int max(int a, int b) {
      return (a >= b) ? a : b;
    }

    public static int min(int a, int b) {
      return (a <= b) ? a : b;
    }
    ...
  }
  ```
### 3. 정적 멤버 사용
* 정적 멤버는 객체를 생성하지 않고 클래스 이름과 도트(.) 연산자로 접근한다.
* 정적 메소드에서 객체의 필드나 메소드에 접근할 수 없고 this 키워드를 사용할 수 없다.
* 정적 필드와 정적 메소드는 객체 참조 변수로도 접근이 가능하지만 정적 요소는 클래스 이름으로 접근하는 것이 좋다.
  ``` java
  int max = 0;
  int min = 0;

  max = Math.max(10, 20);
  min = Math.min(10, 20);
  ```
## final 필드와 상수
### 1. final 필드
* final 필드는 초기값이 저장되면 이후 값을 변경할 수 없다.
* final 필드의 초기값은 필드를 선언할 때 명시적으로 지정하는 방법과 생성자를 통해서 지정하는 방법이 있다. 
  ``` java
  public class Member {
    public final String gender;

    // 생성자를 통해 final 필드 초기화
    public Member(String gender) {
      this.gender = gender;
    }
  }
  ```
### 2. 상수(static final)
* final 필드는 한 번 초기화되면 수정할 수 없는 필드지만 객체마다 다른 값으로 초기화될 수 있기 때문에 final 필드를 상수라고 하지 않는다.
* static final 필드는 객체마다 저장되지 않고, 클래스에만 포함되고 한 번 초기값이 저장되면 변경할 수 없기 때문에 static final 필드를 상수라고 한다.
* 상수의 이름은 모두 대문자로 작성하는 것이 관례이고 서로 다른 단어가 혼합된 이름이라면 언더바(_)로 단어들을 구분한다.
  ``` java
  // java.lang에서 제공하는 Math 클래스
  public final class Math {
    public static final double PI = 3.14159265358979323846;
    private static final double DEGREES_TO_RADIANS = 0.017453292519943295;
    ...
  }
  ```
## 접근 제한자
### 1. 접근 제한자
* 자바에서 제공하는 접근 제한자는 public, protected, default, private 4가지 종류가 있다.
* public 접근 제한자는 외부에서 자유롭게 접근이 가능하다.
* protected 접근 제한자는 같은 패키지 또는 자식 클래스에서만 접근이 가능하다.
* default 접근 제한자는 같은 패키지에 소속된 클래스에서만 접근이 가능하다.
* private 접근 제한자는 외부에서의 접근을 제한하고 선언된 클래스에서만 접근이 가능하다.
  |구분|클래스|패키지|자식 클래스|전체|
  |:--:|:--:|:--:|:--:|:--:|
  |public(+)|O|O|O|O|
  |protected(#)|O|O|O|X|
  |default(~)|O|O|X|X|
  |private(-)|O|X|X|X|
## 상속(Inheritance)
### 1. 상속
* 객체 지향 프로그래밍에서 상속은 부모 클래스의 멤버를 자식 클래스에게 물려주는 것을 말한다.
* 부모에 해당하는 클래스를 부모 클래스 또는 상위, 슈퍼 클래스라 한다.
* 자식에 해당하는 클래스를 자식 클래스 또는 하위, 서브 클래스라 한다.
* 상속을 통해서 다른 클래스가 가지고 있는 멤버를 직접 만들지 않고 상속을 받음으로써 자신의 멤버처럼 사용할 수 있다.
### 2. 클래스의 상속
* 클래스의 상속 구문은 `[접근 제한자] class 자식클래스명 extends 부모클래스명 { ... }`이다.
* 자바는 다중 상속을 지원하지 않는다.
* 모든 클래스는 Object 클래스의 후손이다.
* 부모 클래스에서 private 접근 제한을 갖는 필드와 메소드는 상속에서 제외된다. 
  ``` java
  // 부모 클래스
  public class Animal {
    ...
  }
  ```
  ``` java
  // 자식 클래스
  public class Dog extends Animal {
    ...
  }
  ```
### 3. 자식 객체 생성
* 생성자는 객체 생성을 위한 특별한 메소드로 상속되지 않는다.
* 자식 클래스의 객체를 생성하면 부모 클래스의 생성자가 먼저 호출되면서 부모 객체가 생성되고 자식 객체가 생성된다.
* 자식 클래스의 생성자 안에서 super()를 통해서 부모 클래스의 생성자를 호출한다.
* super()는 자식 클래스의 생성자 첫 줄에 위치해야 한다.
  ``` java
  // 부모 클래스
  public class Animal {
    private String name;
    private String kinds;
    
    public Animal() {
    }

    public Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }
  }
  ```
  ``` java
  // 자식 클래스
  public class Dog extends Animal {
    private int weight;

    public Dog() {
      // super() 생략 시 자동으로 생성한다.
    }

    public Dog(String name, String kinds, int weight) {
      super(name, kinds);

      this.weight = weight;
    }
  }
  ```
### 4. 메소드 오버라이딩(Overriding)
* 부모 클래스의 메소드를 자식 클래스에서 다시 재정의해서 사용하는 것을 메소드 오버라이딩이라 한다.
* @Override 어노테이션을 붙여 준다. (생략 가능)
* 자식 클래스에서 메소드 오버라이딩은 부모의 메소드와 동일한 선언부를 가져야 한다.
* 부모 클래스의 메소드가 private 접근 제한을 가지면 자식 클래스는 메소드를 오버라이딩 할 수 없다.
  ``` java
  // 부모 클래스
  public class Animal {
    private String name;
    private String kinds;
    
    public Animal() {
    }

    public Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    public String bark() {
        return "짖는다.";
    }
  }
  ```
  ``` java
  // 자식 클래스
  public class Dog extends Animal {
    private int weight;

    public Dog() {
    }

    public Dog(String name, String kinds, int weight) {
      super(name, kinds);

      this.weight = weight;
    }

    @Override
    public String bark() {
        return "멍멍~ 짖는다.";
    }
  }
  ```
* 자식 객체에서 오버라이딩된 메소드를 호출하면 부모 객체의 메소드가 아닌 오버라이딩된 자식 메소드가 호출된다.
* 부모 객체의 메소드는 삭제되는 것이 아닌 오버라이딩된 메소드에 의해 가려지게 된다.
  ``` java
  Dog dog = new Dog();

  System.out.println(dog.bark()); // "멍멍~ 짖는다." 출력
  ```
* 자식 클래스 내부에서 오버라이딩된 부모 클래스의 메소드를 호출해야 하는 상황이 발생한다면 super를 통해서 부모 메소드를 호출할 수 있다.
  ``` java
  // 부모 클래스
  public class Animal {
    private String name;
    private String kinds;
    
    // 생성자 선언
    ... 

    public String bark() {
        return "짖는다.";
    }
  }
  ```
  ``` java
  // 자식 클래스
  public class Dog extends Animal {
    private int weight;

    // 생성자 선언
    ... 
    @Override
    public String bark() {
        return "멍멍~ " + super.bark();
    }
  }
  ```
### 5. final 클래스와 final 메소드
* final 키워드는 필드뿐만 아니라 클래스와 메소드 선언 시에 사용할 수 있다. 
* final 키워드를 클래스 선언에 붙이게 되면 이 클래스는 상속할 수 없는 클래스가 된다.
  ```java
  // java.lang에서 제공하는 String 클래스
  public final class String {
    ...
  }
  ```
* final 키워드를 메소드 선언에 붙이게 되면 이 메소드는 재정의할 수 없는 메소드가 된다.
  ```java
  // java.lang에서 제공하는 Object 클래스
  public class Object {
    public final void wait() {
        ...
    }
  }
  ```
## 다형성(Polymorphism)
### 1. 다형성
* 다형성은 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질을 말한다.
* 부모 클래스 타입의 참조 변수에 자식 객체들을 대입하여 다룰 수 있는 것이 다형성의 기본 개념이다.
### 2. 업 캐스팅(Up Casting)
* 업 캐스팅은 자식 타입의 객체가 부모 타입의 객체로 형 변환되는 것을 말한다.
* 업 캐스팅은 자동으로 형 변환이 일어나기 때문에 부모 클래스 타입의 참조 변수가 모든 자식 객체들을 별도의 형 변환 없이 대입 받을 수 있다.
* 부모 타입으로 업 캐스팅된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다.
* 단, 예외가 있는데 부모 타입의 메소드가 오버라이딩되었다면 오버라이딩된 메소드가 대신 호출된다.
  ``` java
  // Dog 클래스 타입의 객체를 Animal 클래스 타입의 참조 변수에 대입
  Animal animal = new Dog();

  // 자식 클래스에서 오버라이딩 된 코드가 실행된다.
  System.out.println(animal.bark()); // "멍멍~ 짖는다." 출력
  ```
  ``` java
  // Cat 클래스 타입의 객체를 Animal 클래스 타입의 참조 변수에 대입
  Animal animal = new Cat();

  // 자식 클래스에서 오버라이딩 된 코드가 실행된다.  
  System.out.println(animal.bark()); // "야옹~ 운다." 출력
  ```
### 3. 다운 캐스팅(Down Casting)
* 다운 캐스팅은 부모 타입의 객체가 자식 타입의 객체로 형 변환되는 것을 말한다.
* 다운 캐스팅은 자동으로 형 변환이 일어나지 않기 때문에 형 변환 연산자를 사용해서 형 변환을 해야 한다.
  ``` java
  Animal animal = new Dog();
  // 클래스 간의 형 변환은 반드시 상속 관계에 있는 클래스들끼리만 가능하다.
  Dog dog = (Dog) animal; 
  ```
* 부모 클래스 타입 참조 변수가 실제로 참조하는 객체를 확인하지 않고 강제 형 변환을 시도하면 ClassCastException 예외가 발생할 수 있다.
* 객체가 어떤 클래스의 인스턴스인지 instanceof 연산자를 사용해서 확인할 수 있다.
  ``` java
  // animal이 참조하는 객체가 Dog 클래스로 생성된 객체이면 true
  // animal이 참조하는 객체가 Dog 클래스로 생성된 객체가 아니면 false
  if(animal instanceof Dog) {
    ...
  // animal이 참조하는 객체가 Cat 클래스로 생성된 객체이면 true
  // animal이 참조하는 객체가 Cat 클래스로 생성된 객체가 아니면 false
  } else if (animal instanceof Cat){
    ...
  } 
  ```
## 추상 클래스(Abstract Class)
### 1. 추상 클래스(Abstract Class)
* 클래스들의 공통적인 특성을 추출해서 선언한 클래스를 추상 클래스라고 한다.
* 추상 클래스를 부모 타입으로, 객체로 생성될 실체 클래스가 자식 타입으로 구현되어 추상 클래스의 모든 특성을 물려받을 수 있다.
* 추상 클래스는 공통되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성해서 사용할 수 없고 부모 클래스로만 사용된다.
### 2. 추상 클래스 선언
* 추상 클래스의 선언 구문은 `[접근 제한자] abstract class 클래스명 { ... }`이다.
* 추상 클래스 내에 필드, 메소드, 생성자를 포함할 수 있다.
* 추상 클래스는 객체로 생성이 안되지만 참조 변수의 타입으로는 사용이 가능하다.
  ```java
  public abstract class Animal {
    private String name;
    private String kinds;
    
    public Animal() {
    }

    public Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    public String bark() {
        return "짖는다.";
    }
  }
  ```
  ```java
  Animal animal = new Animal(); // 에러 발생
  Animal animal = new Dog(); // 다형성 적용 가능
  ```
### 4. 추상 메소드(Abstract Method)
* 추상 클래스에 선언된 메소드가 자식 클래스마다 실행 내용이 달라야 하는 경우 추상 메소드를 선언할 수 있다.
* 추상 메소드는 추상 클래스에서 선언할 수 있고 메소드의 선언부만 있는 메소드의 실행 내용인 중괄호({})가 없는 메소드이다.
* 추상 클래스를 상속하는 자식 클래스는 반드시 추상 메소드를 오버라이딩 해야 한다. 
* 오버라이딩하지 않으면 컴파일 에러가 발생하는데 자식 클래스에서 내용을 채우도록 강제화한다.
* 추상 메소드의 선언 구문은 `[접근 제한자] abstract 반환형 메소드명([매개변수]);`이다.
  ```java
  public abstract class Animal {
    private String name;
    private String kinds;
    
    public Animal() {
    }

    public Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    // 추상 메소드 선언
    public abstract String bark();
  }
  ```
  ``` java
  // 자식 클래스
  public class Dog extends Animal {
    private int weight;

    // 생성자 선언
    ... 

    // 추상 메소드는 반드시 오버라이딩 해야 한다.
    @Override
    public String bark() {
        return "멍멍~ 짖는다.";
    }
  }
  ```
## 인터페이스(Interface)
### 1. 인터페이스(Interface)
* 인터페이스는 자바에서 클래스들이 구현해야 하는 동작을 지정하는 역할을 한다.
* 인터페이스는 실행 코드와 객체가 통신하는 접점으로 실행 코드가 인터페이스의 메소드를 호출하면 인터페이스는 객체의 메소드를 호출시킨다.
### 2. 인터페이스 선언
* 인터페이스의 선언 구문은 `[접근 제한자] interface 인터페이스명 { ... }`이다.
* 인터페이스 선언은 class 키워드 대신에 interface 키워드를 사용한다.
* 인터페이스는 선언된 필드는 모두 public static final의 특성을 갖는다.
* 인터페이스에 선언된 메소드는 모두 public abstract의 특성을 갖는다. 
* 자바 8부터 디폴트 메소드와 정적 메소드도 선언이 가능하다.
  ```java
  public interface Runable {
    void run(); // public abstract 생략 가능
  }
  ```
### 3. 인터페이스 구현
* 인터페이스를 구현하는 클래스는 클래스 선언부에 implements 키워드를 추가하고 인터페이스명을 명시해야 한다.
* 인터페이스를 구현하는 클래스는 인터페이스에 정의된 추상 메소드를 반드시 오버라이딩 해야 한다.
  ```java
  // 인터페이스 구현 방법
  public class Cat implements Runable {
    ...

    @Override
    public void run() {
      ...
    }
  }
  ```
* 상속과 다르게 인터페이스는 다중 구현이 가능하다.
  ```java
  // 인터페이스의 다중 구현 시 콤마(,)로 구분한다.
  public class Cat implements Runable, Swimable {
	  ...
    @Override
    public void run() {
      ...
    }

    @Override
    public void swim() {
      ...
    }
  }
  ```
* 인터페이스를 구현하는 클래스로 객체를 생성 후 구현된 메소드를 호출할 수 있다.
  ``` java
  Cat cat = new Cat();

  cat.run();
  cat.swim();
  ```  
### 4. 인터페이스 상속
* 인터페이스도 다른 인터페이스를 상속할 수 있다.
* 인터페이스는 클래스와 달리 다중 상속을 허용한다.
* 인터페이스를 상속하는 구문은 `[접근 제한자] interface 하위인터페이스 extends 상위인터페이스1, 상위인터페이스2 { ... }`이다.
  ```java
  public interface Basic extends Runable, Swimable {
    void eat();
  }
  ```
* 하위 인터페이스를 구현하는 클래스는 하위 인터페이스의 추상 메소드 뿐만 아니라 상위 인터페이스들의 모든 추상 메소드들을 오버라이딩 해야 한다.
  ```java
  public class Cat implements Basic {
	  ...

    @Override
    public void eat() {
      ...
    }

    @Override
    public void run() {
      ...
    }

    @Override
    public void swim() {
      ...
    }
  }
  ```
## 예외처리
### 1. 에러(Error)
* 프로그램 수행 시 치명적 상황이 발생하여 비정상 종료 상황이 발생한 것을 프로그램 에러라고 한다.
#### 1.1. 에러의 종류
* 컴파일 에러는 소스코드 상의 문법 에러로 소스코드를 수정하여 해결할 수 있다.
* 런타임 에러는 프로그램 실행 중에 발생하는 에러로 사용자로부터 잘못된 값을 입력받거나 계산식의 오류 등으로 발생할 수 있다.
* 시스템 에러는 컴퓨터 하드웨어 오작동 또는 고장으로 인해 발생하는 에러로 소스코드를 수정하여 해결이 불가능하다.
### 2. 예외(Exception)
* 예외(Exception)란 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류를 말한다. 
* 예외의 경우 if 문 또는 예외 처리 구문을 통해서 예측 가능한 예외 상황에 대해서 해결이 가능하다.
* 모든 예외는 Exception 클래스를 상속하고 있으며 반드시 예외 처리해야 하는 Checked Exception과 해주지 않아도 되는 Unchecked Exception으로 나뉜다.
#### 2.1. CheckedException
* Exception을 상속하고 있는 예외들을 CheckedException이라 한다.
* 컴파일 시 예외 처리 코드가 있는지 검사하는 예외를 말한다.
* 예외 처리가 되어있지 않으면 컴파일 에러를 발생시킨다.(try ~ catch, throws)
* 조건문이나 소스코드 수정으로는 해결이 되지 않는다. 주로 외부에 매개체와 입출력이 일어날 때 발생한다.
#### 2.2. UnCheckedException
* RuntimeException을 상속하고 있는 예외들을 UnCheckedException이라 한다.
* 컴파일 시 예외 처리 코드가 있는지 검사하지 않는 예외를 말한다. 
* RuntimeException 같은 경우엔 프로그램 실행할 때 문제가 발생되는 것이기 때문에 충분히 예측이 가능하기 때문에 조건문들을 통해서 충분히 처리가 가능하다.
### 3. 예외 처리
* 프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고 정상 실행을 유지할 수 있도록 처리하는 코드를 예외 처리 코드라고 한다.
#### 3.1. try-catch-finally 문
* try 블록에는 예외가 발생할 가능이 있는 코드가 위치한다.
* try 블록의 코드에서 예외가 발생하면 즉시 실행을 멈추고 catch 블록으로 이동하여 예외 처리 코드를 실행한다.
* finally 블록은 생략이 가능하고 예외 발생 여부와 상관없이 항상 실행할 내용이 있을 경우에 finally 블록을 작성해 준다.
  ```java
  try {
    ...
  } catch (Exception e) {
    ... 
  } finally {
    // 예외 발생 여부와 상관없이 실행해야 하는 코드  
  }
  ```
#### 3.2. throws
* 메소드 내부에서 예외가 발생할 수 있는 코드를 작성할 때 try-catch 블록으로 예외를 처리하는 것이 기본이지만, throws 키워드를 통해서 메소드를 호출한 곳으로 예외를 떠넘길 수도 있다.
* throws 키워드는 메소드 선언부 끝에 작성되어 메소드에서 처리하지 않는 예외를 호출한 곳으로 떠넘기는 역할을 한다. 
  ```java
  // BufferedReader 클래스의 readLine() 메소드
  public String readLine() throws IOException {
    ...
  }
  ```
* throws가 붙어있는 메소드는 반드시 try 블록 내에서 호출되어야 한다. 만약 throws가 붙어있는 메소드를 호출한 곳에서 처리하지 않으려면 throws 키워드로 다시 예외를 떠넘길 수 있다.
#### 3.3. 예외와 오버라이딩
* 부모 클래스의 메소드를 자식 클래스에서 오버라이딩 시 메소드가 throws 하는 Exception과 같거나 하위 클래스이어야 한다.
  ```java
  public class Parent {
	public void method() throws IOException {
	  ...
	}
  }
  ```
  ```java
  public class Child extends Parent {
      
    // EOFException은 IOException의 하위 클래스이므로 오버라이딩이 가능하다.
	@Override
	public void method() throws EOFException { 
		. . . 
	}
  }
  ```
  ```java
  public class Child extends Parent {
      
    // Exception은 IOException의 상위 클래스이므로 오버라이딩이 불가능하다.
	@Override
	public void method() throws Exception { 
		. . . 
	}
  }
  ```
## 컬렉션(Collection)
### 1. 컬렉션
* 자료구조는 데이터를 효율적으로 이용하는 방법으로 데이터에 편리하게 접근하고, 효율적으로 사용하기 위해서 데이터를 저장하거나 조직하는 방법을 말한다. 
* 컬렉션(컬렉션 프레임워크)은 자바에서 제공하는 자료구조를 담당하는 프레임워크로 `java.util` 패키지에 컬렉션과 관련된 인터페이스와 클래스들이 포함되어 있다.
* 컬렉션을 사용하면 데이터의 추가, 삭제, 정렬 등의 처리가 간단하게 해결되어 자료구조적 알고리즘을 구현할 필요가 없다.
### 2. 주요 인터페이스
<table>
    <tr>
        <th colspan="2">인터페이스 분류</th>
        <th>구현 클래스</th
        ><th>특징</th>
    </tr>
    <tr>
        <td rowspan="2">Collection</td>
        <td>List</td>
        <td>ArrayList, Vector, LinkedList</td>
        <td>순서가 있는 데이터의 집합으로 데이터의 중복을 허용한다.</td>
    </tr>
    <tr>
        <td>Set</td>
        <td>HashSet, LinkedHashSet, TreeSet</td>
        <td>순서를 유지하지 않는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.</td>
    </tr>
    <tr>
        <td colspan="2">Map</td>
        <td>HashMap, HashTable, TreeMap, Properties</td>
        <td>키(Key), 값(Value)의 쌍으로 이루어진 데이터의 집합으로 키(Key)의 중복을 허용하지 않으나 값(Value)의 중복은 허용한다.</td>
    </tr>
</table>

### 3. List
* List는 자료들을 순차적으로 늘어놓은 구조를 가지고 있다.
* 저장되는 객체를 인덱스로 관리하기 때문에 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다.
* 중복되는 객체를 저장 가능하고 null 값도 저장될 수 있다.
* 특정 인덱스의 객체를 제거하면 바로 뒤 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨진다.
* List 인터페이스의 주요 메소드는 아래와 같다.
  |리턴 타입|메소드|설명|
  |:--:|--|--|
  |boolean|add(E e)|주어진 객체를 맨 끝에 추가한다.|
  |void|add(int index, E element)|주어진 인덱스에 객체를 추가한다.|
  |boolean|addAll(Collection<? extends E> c)|주어진 Collection 타입 객체를 리스트에 추가한다.|
  |E|set(int index, E element)|주어진 인덱스에 저장된 객체를 주어진 객체로 바꾼다.|
  |boolean|contains(Object o)|주어진 객체가 저장되어 있는지를 확인한다.|
  |E|get(int index)|주어진 인덱스에 저장된 객체를 리턴한다.|
  |Iterator\<E>|iterator()|저장된 객체를 한 번씩 가져오는 반복자 리턴한다.|
  |boolean|isEmpty()|컬렉션이 비어 있는지 조사한다.|
  |int|size()|저장되어 있는 전체 객체수를 리턴한다.|
  |void|clear()|저장된 모든 객체를 삭제한다.|
  |E|remove(int index)|주어진 인덱스에 저장된 객체를 삭제한다.|
  |boolean|remove(Object o)|주어진 객체를 삭제한다.|
#### 3.1. ArrayList
* List 인터페이스의 구현 클래스이다.
* 배열과의 차이점은 저장 용량(capacity)을 초과한 객체들이 들어오면 자동적으로 저장 용량이 늘어난다.
* 동기화(Synchronized)를 제공하지 않는다.
* 동기화란, 하나의 자원(데이터)에 대해 여러 개의 스레드가 접근하려 할 때 한 시점에서 하나의 스레드만 사용할 수 있도록 하는 것을 말한다.
#### 3.2. Vector
* List 인터페이스의 구현 클래스이다.
* ArrayList와의 차이점은 동기화(Synchronized)를 제공한다.
* 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있는 것을 스레드가 안전(Thread Safe)하다고 한다.
#### 3.3. LinkedList
* List 인터페이스의 구현 클래스이다.
* ArrayList와 사용 방법은 동일하지만 내부 구조는 완전히 다르다.
* 데이터를 담고 있는 요소들이 앞/뒤로 연결된 노드들을 링크(인접 링크)해서 관리한다.
### 4. Set
* Set은 저장 순서를 유지하지 않는 구조를 가지고 있다.
* 중복되는 객체를 저장할 수 없고 null도 중복을 허용하지 않기 때문에 1개만 저장할 수 있다.
* 인덱스로 관리하지 않기 때문에 인덱스를 매개 값으로 갖는 메소드가 없다.
* 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 제공한다.
* Set 인터페이스의 주요 메소드는 아래와 같다.
  |리턴 타입|메소드|설명|
  |:--:|--|--|
  |boolean|add(E e)|주어진 객체를 추가한다.|
  |boolean|addAll(Collection<? extends E> c)|주어진 Collection 타입 객체를 Set에 추가한다.|
  |boolean|contains(Object o)|주어진 객체가 저장되어 있는지를 확인한다.|
  |Iterator\<E>|iterator()|저장된 객체를 한 번씩 가져오는 반복자 리턴한다.|
  |boolean|isEmpty()|컬렉션이 비어 있는지 조사한다.|
  |int|size()|저장되어 있는 전체 객체수를 리턴한다.|
  |void|clear()|저장된 모든 객체를 삭제한다.|
  |boolean|remove(Object o)|주어진 객체를 삭제한다.|
#### 4.1. HashSet
* Set 인터페이스의 구현 클래스이다.
* HashSet은 객체들을 순서 없이 저장하고 동일한 객체는 중복 저장하지 않는다. 
* 내부적으로 hashCode(), equals() 메소드를 사용해서 중복된 객체를 확인한다.
#### 4.2. LinkedHashSet
* Set 인터페이스의 구현 클래스이다.
* HashSet과 동일하지만 입력된 순서대로 데이터를 관리한다.
* iteration 작업을 할 경우, Set에 삽입된 순서대로 접근한다.
### 4. Map
* 키(key)와 값(value)으로 구성된 Entry 객체를 저장하는 구조를 가지고 있다.
* 키(key)와 값(value) 모두 객체이다.
* 키(key)는 중복 저장을 허용하지 않고 값(value)은 중복 저장이 가능하다.
* Map 인터페이스의 주요 메소드는 아래와 같다.
  |리턴 타입|메소드|설명|
  |:--:|--|--|
  |V|put(K key, V value)|주어진 키와 값을 추가, 저장이 되면 값을 리턴한다.|
  |boolean|containsKey(Object key)|주어진 키가 있는지 확인하여 결과 리턴한다.|
  |boolean|containsValue(Object value)|주어진 값이 있는지 확인하여 결과 리턴한다.|
  |Set<Map.Entry<K,V>>|entrySet()|키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 set에 담아서 리턴한다.|
  |V|get(Object key)|주어진 키의 값을 리턴한다.|
  |boolean|isEmpty()|컬렉션이 비어있는지 조사한다.|
  |Set\<K>|keySet()|모든 키를 Set 객체에 담아서 리턴한다.|
  |int|size()|저장된 키의 수를 리턴한다.|
  |Collection\<V>|values()|저장된 모든 값을 Collection에 담아서 리턴한다.|
  |void|clear()|모든 Map.Entry를 삭제한다.|
  |V|remove(Object key)|주어진 키와 일치하는 Map.Entry 삭제, 삭제가 되면 값을 리턴한다.|
#### 4.1. HashMap
* Map 인터페이스의 구현 클래스이다.
* 키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해야 한다.
* 대부분의 경우에 키값은 hashCode()와 equals()가 재정의된 String을 주로 사용한다.
#### 4.2. HashTable
* Map 인터페이스의 구현 클래스이다.
* HashMap과 차이점은 동기화(Synchronized)를 제공한다.
* 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있는 것을 스레드가 안전(Thread Safe)하다고 한다.
## IO (Input/Output)
### 1. 입출력(IO)
* Input과 Output의 약자로 컴퓨터 내부 또는 외부 장치와 프로그램 간의 데이터를 주고받는 것을 입출력(IO)이라 한다.
* 데이터는 키보드, 파일 또는 네트워크로부터 입력될 수 있고 모니터, 파일 또는 네트워크로 출력 될 수 있다.
### 2. 스트림
* 자바에서 스트림은 입출력 장치에 데이터를 읽고 쓰기 위해서 제공하는 클래스이다.
* 스트림을 통해서 다양한 장치로부터 데이터 입출력에 대해 동일한 처리 방법을 제공한다.
* 모든 스트림은 단방향이며 각각의 장치마다 연결할 수 있는 스트림 존재한다.
#### 2.1. InputStream
* 바이트 기반 입력 스트림의 최상위 클래스로 추상 클래스이다.
* InputStream 스트림은 그림, 멀티미디어, 문자 등 모든 데이터를 입력받을 수 있다.
* InputStream을 상속받는 클래스들은 접미사로 InputStream이 붙는다.
  |최상위 클래스|하위 클래스|
  |:--:|:--:|
  |InputStream|FileInputStream|
  |InputStream|PipedInputStream|
  |InputStream|DataInputStream|
  |InputStream|BufferedInputStream|
  |InputStream|StringBufferedInputStream|
  |InputStream|ObjectInputStream|
* 외부 장치로부터 바이트 단위의 데이터를 읽어 올 수 있는 read() 추상 메소드가 정의되어 있다.
  |리턴 타입|메소드|
  |:--:|--|
  |int|read()|
  |int|read(byte[] b)|
  |int|read(byte[] b, int off, int len)|
  |void|close()|
* 사용한 시스템 자원 반납 후 입력 스트림을 닫는 close() 추상 메소드가 정의되어 있다.
#### 2.2. OutputStream
* 바이트 기반 출력 스트림의 최상위 클래스로 추상 클래스이다.
* OutputStream 스트림은 그림, 멀티미디어, 문자 등 모든 데이터를 출력할 수 있다.
* OutputStream을 상속받는 클래스들은 접미사로 OutputStream이 붙는다.
  |최상위 클래스|하위 클래스|
  |:--:|:--:|
  |OutputStream|FileOutputStream|
  |OutputStream|PipedOutputStream|
  |OutputStream|DataOutputStream|
  |OutputStream|BufferedOutputStream|
  |OutputStream|PrintStream|
  |OutputStream|ObjectOutputStream|
* 바이트 단위의 데이터를 외부 장치에 기록할 수 있는 write() 추상 메소드가 정의되어 있다.
  |리턴 타입|메소드|
  |:--:|--|
  |void|write(int b)|
  |void|write(byte[] b)|
  |void|write(byte[] b, int off, int len)|
* 버퍼에 잔류하는 모든 바이트를 출력하는 flush() 추상 메소드가 정의되어 있다.
* 사용한 시스템 자원 반납 후 출력 스트림을 닫는 close() 추상 메소드가 정의되어 있다.
#### 2.3. Reader
* 문자 기반 입력 스트림의 최상위 클래스로 추상 클래스이다.
* Reader는 문자 데이터만 입력받을 수 있다.
* Reader를 상속받는 클래스들은 접미사로 Reader가 붙는다.
  |최상위 클래스|하위 클래스|
  |:--:|:--:|
  |Reader|BufferedReader|
  |Reader|CharArrayReader|
  |Reader|InputStreamReader|
  |Reader|FileReader|
  |Reader|PipedReader|
  |Reader|StringReader|
* 외부 장치로부터 문자 단위의 데이터를 읽어 올 수 있는 read() 추상 메소드가 정의되어 있다.
  |리턴 타입|메소드|
  |:--:|--|
  |int|read()|
  |int|read(char[] c)|
  |int|read(char[] c, int off, int len)|
  |void|close()|
* 사용한 시스템 자원 반납 후 입력 스트림을 닫는 close() 추상 메소드가 정의되어 있다.
#### 2.4. Writer
* 문자 기반 출력 스트림의 최상위 클래스로 추상 클래스이다.
* Writer는 문자 데이터만 출력할 수 있다.
* Writer를 상속받는 클래스들은 접미사로 Writer가 붙는다.
  |최상위 클래스|하위 클래스|
  |:--:|:--:|
  |Writer|BufferedWriter|
  |Writer|CharArrayWriter|
  |Writer|OutputStreamWriter|
  |Writer|FileWriter|
  |Writer|PipedWriter|
  |Writer|StringWriter|
* 문자 단위의 데이터를 외부 장치에 기록할 수 있는 write() 추상 메소드가 정의되어 있다.
  |리턴 타입|메소드|
  |:--:|--|
  |void|write(int c)|
  |void|write(char[] c)|
  |void|write(char[] c, int off, int len)|
  |void|write(String str)|
  |void|write(String str, int off, int len)|
* 버퍼에 잔류하는 모든 문자열을 출력하는 flush() 추상 메소드가 정의되어 있다.
* 사용한 시스템 자원 반납 후 출력 스트림을 닫는 close() 추상 메소드가 정의되어 있다.
### 3. 파일 관련 입출력 스트림
#### 3.1. FileInputStream
* InputStream의 하위 클래스로 파일로부터 바이트 단위로 데이터를 입력받는 클래스이다.
* FileInputStream은 그림, 오디오, 비디오, 텍스트 파일 등 모든 종류의 파일의 읽기가 가능하다.
  ```java
  // FileInputStream 객체가 생성될 때 파일과 직접 연결된다.
  // 실제 파일이 존재하지 않으면 FileNotFoundException이 발생한다.
  FileInputStream fis = new FileInputStream("C:/data/test.txt");
  ```
#### 3.2. FileOutputStream
* OutputStream의 하위 클래스로 바이트 단위로 데이터를 파일에 출력하는 클래스이다.
* FileOutputStream은 그림, 오디오, 비디오, 텍스트 파일 등 모든 종류의 파일로 저장이 가능하다.
  ```java
  // FileOutputStream 객체가 생성될 때 파일과 직접 연결된다.
  // 실제 파일이 존재하지 않으면 자동으로 생성하지만 이미 파일이 존재하는 경우 파일을 덮어쓴다.
  FileOutputStream fos = new FileOutputStream("C:/data/test.txt");
  ```
  ```java
  // 이미 존재하는 파일에 이어서 계속 작성하고 싶다면 아래 예제처럼 객체를 생성한다.
  FileOutputStream fos = new FileOutputStream("C:/data/test.txt", true);
  ```
#### 3.3. FileReader
* Reader의 하위 클래스로 텍스트 파일로부터 문자 단위로 데이터를 입력받는 클래스이다.
* FileReader는 텍스트가 아닌 그림, 오디오, 비디오 등의 파일은 읽기가 불가능하다.
  ```java
  // FileReader 객체가 생성될 때 파일과 직접 연결된다.
  // 실제 파일이 존재하지 않으면 FileNotFoundException이 발생한다.
  FileReader fr = new FileReader("C:/data/test.txt");
  ```
#### 3.4. FileWriter
* Writer의 하위 클래스로 문자 단위로 데이터를 텍스트 파일에 출력하는 클래스이다.
* FileWriter는 텍스트가 아닌 그림, 오디오, 비디오 등의 파일에 저장이 불가능하다.
  ```java
  // FileWriter 객체가 생성될 때 파일과 직접 연결된다.
  // 실제 파일이 존재하지 않으면 자동으로 생성하지만 이미 파일이 존재하는 경우 파일을 덮어쓴다.
  FileWriter fw = new FileWriter("C:/data/test.txt");
  ```
  ```java
  // 이미 존재하는 파일에 이어서 계속 작성하고 싶다면 아래 예제처럼 객체를 생성한다.
  FileWriter fw = new FileWriter("C:/data/test.txt", true);
  ```
### 4. 보조 스트림
* 보조 스트림은 기반 스트림(InputStream, OutputStream, Reader, Writer)의 기능을 향상시키거나 새로운 기능을 추가하기 위해 사용한다.
* 보조 스트림은 실제 데이터를 주고받는 스트림이 아니기 때문에 입출력 처리 불가능하다.
* 보조 스트림은 반드시 기반 스트림(InputStream, OutputStream, Reader, Writer)을 먼저 생성한 후 이를 이용하여 보조 스트림 생성해야 한다.
#### 4.1. 문자 변환 보조 스트림
* 기반 스트림이 바이트 기반 스트림이지만 데이터가 문자일 경우에 사용한다.
* InputStreamReader는 바이트 기반의 InputStream에 연결되어 문자 기반의 Reader로 변환하는 보조 스트림이다.
* OutputStreamWriter는 바이트 기반의 OutputStream에 연결되어 문자 기반의 Writer로 변환하는 보조 스트림이다.
#### 4.2. 성능 향상 보조 스트림
* 입출력 성능에 영향을 미치는 입출력 장치(하드디스크, 네트워크 등)를 이용하는 경우에 사용한다.
* 입출력 장치(하드디스크, 네트워크 등)와 직접 작업하지 않고 버퍼에 데이터를 모아 한 번에 입출력 작업을 하여 성능을 향상한다.
* BufferedInputStream(BufferedReader)은 외부의 입력 장치로부터 데이터를 직접 읽지 않고 버퍼에 쌓아두었다가 데이터를 한 번에 읽음으로써 읽기 성능을 향상시키는 보조 스트림이다.
* BufferedOutputStream(BufferedWriter)은 외부의 출력 장치로 데이터를 직접 출력하지 않고 버퍼에 쌓아두었다가 데이터를 한 번에 전송함으로써 출력 성능을 향상시키는 보조 스트림이다.
#### 4.3. 기본 타입 입출력 보조 스트림
* 입출력 장치로 기본 자료형의 데이터를 읽고 출력하는 경우에 사용한다.
* 단, 입력된 자료형의 순서와 출력될 자료형의 순서가 일치해야 한다.
* DataInputStream은 바이트 기반의 데이터를 기본 자료형의 데이터로 읽을 수 있는 보조 스트림이다.
* DataOutputStream은 바이트 기반의 데이터를 기본 자료형의 데이터로 출력할 수 있는 보조 스트림이다.
#### 4.4. 객체 입출력 보조 스트림
* 입출력 장치로 객체를 읽고 출력하는 경우에 사용한다.
* 단, 객체는 문자가 아니므로 바이트 기반 스트림으로 데이터를 변경해 주는 직렬화가 필수이다.
  * 직렬화란 스트림을 통해서 객체를 출력하기 위해 연속적인 데이터로 변환하는 것을 말한다.
  * 역직렬화란 스트림을 통해서 읽어들인 연속적인 데이터를 객체로 복원하는 것을 말한다.
* ObjectInputStream은 InputStream에 연결되어 객체를 역직렬화하는 보조 스트림이다.
* ObjectOutputStream은 OutputStream에 연결되어 객체를 직렬화하는 보조 스트림이다.
## 스레드(Thread)
### 1. 스레드
#### 1.1. 프로세스
* 운영체제에서 실행 중인 하나의 프로그램(애플리케이션)을 프로세스라 부른다.
* 프로세스는 프로그램이 실행될 때 마다 개별적으로 생성
* 하나의 프로그램(애플리케이션)은 다중 프로세스를 만들기도 한다.
#### 1.2. 스레드
* 스레드는 프로세스 내에서 할당된 자원을 이용해 실제 작업을 수행하는 작업 단위이다.
* 모든 프로세스는 하나 이상의 스레드를 가지며 각각 독립적인 작업 단위를 가진다.
* 하나의 스레드는 하나의 코드 실행 흐름이기 때문에 한 프로세스 내에 여러 개의 스레드가 존재한다면 여러 개의 실행 흐름이 생긴다는 의미이다.
#### 1.3. 메인 스레드
* 모든 자바 프로그램(애플리케이션)은 메인 스레드가 main()메소드를 실행하면서 시작된다.
* 메인 스레드는 main() 메소드의 첫 코드부터 아래로 순차적으로 실행되고, 코드를 모두 실행하거나 return 문을 만나면 프로그램(애플리케이션) 실행이 종료된다.
* 메인 스레드는 필요에 의해 작업 스레드를 만들어서 병렬로 코드를 실행할 수 있다.
### 2. 멀티 스레드 
* 멀티 스레드는 하나의 프로세스 내에서 여러 스레드가 동시에 작업을 수행하는 것을 말한다.
* 자바 프로그램(애플리케이션)은 메인 스레드가 종료되면 프로세스도 종료되지만 멀티 스레드 프로그램(애플리케이션)의 경우 실행 중인 스레드가 하나라도 있다면 프로세스가 종료되지 않는다.
* 멀티 스레드 프로그램(애플리케이션)은 하나의 프로세스 내부에 여러 개의 스레드가 생성되기 때문에 하나의 스레드가 예외를 발생시키면 프로세스 자체가 종료될 수 있다.
* 멀티 스레드의 장단점
  |장점|단점|
  |--|--|
  |자원을 보다 효율적으로 사용이 가능하다.|동기화(Synchronization)에 주의해야 한다.|
  |사용자에 대한 응답성 향상이 향상된다.|교착상태(dead-lock)가 발생하지 않도록     주의해야 한다.|
  |애플리케이션의 응답성 향상이 향상된다.|프로그래밍 시 고려해야 할 사항이 많다.|
  |작업이 분리되어 코드가 간결해진다.||
  |CPU 사용률이 향상된다.||
### 3. 스레드 생성
* 자바에서 작업 스레드도 객체로 생성되기 때문에 관련된 클래스와 인터페이스를 사용해 작업 스레드를 생성한다.
#### 3.1. java.lang.Thread 클래스를 상속받아 스레드를 생성
* Thread 클래스를 상속한 후 run 메소드를 재정의해서 작업 스레드가 실행할 코드를 작성하면 된다.
    ```java
    public class MyThread extends Thread {

        @Override
        public void run() {
            // 작업 스레드에서 실행할 코드
            ...
        }
    }
    ```
* 생성된 작업 스레드 객체에서 start() 메소드를 호출하면 작업 스레드는 자신의 run()메소드를 실행하게 된다.
    ```java
    public class Application {
        public static void main(String[] args) {
            MyThread thread = new MyThread(); 

            thread.start();
        }
    } 
    ```
#### 3.2. java.lang.Runnable 인터페이스를 구현하여 스레드를 생성
* Thread 클래스로부터 직접 작업 스레드 객체를 생성하려면 Runnable 인터페이스의 구현 객체를 매개값으로 갖는 생성자를 호출해야 한다.
    ```java
    public class MyRunnable implements Runnable {
    
        @Override
        public void run() {
            // 작업 스레드에서 실행할 코드
            ...
        }
    }
    ```
* Runnable 인터페이스의 구현 객체를 매개값으로 전달해서 Thread 객체를 생성한다. 
* 생성된 작업 스레드 객체에서 start() 메소드를 호출하면 작업 스레드는 자신의 run()메소드를 실행하게 된다.
    ```java
    public class Application {
        public static void main(String[] args) {
            MyRunnable runnable = new MyRunnable(); 
            
            Thread thread = new Thread(runnable);
    
            thread.start();
        }
    } 
    ```
* 익명 구현 객체를 통해 Runnable 인터페이스를 직접 구현해서 스레드 생성이 가능하다.
    ```java
    public class Application {
        public static void main(String[] args) {
            Thread thread = new Thread(new Runable() {
                
                @Override
                public void run() {
                    // 작업 스레드에서 실행할 코드
                    ...
                }
            });
    
            thread.start();
        }
    } 
    ```
### 4. 스레드 스케줄링
* 스레드의 개수가 CPU 코어의 수보다 많을 경우, 스레드를 어떤 순서에 의해서 동시성으로 실행할 것인가를 결정하는 것을 스레드 스케줄링이라고 한다.
* 동시성은 하나의 CPU 코어에서 멀티 스레드가 번갈아가며 실행하는 성질을 말한다.
* 병렬성은 CPU 멀티 코어에서 개별 스레드를 동시에 실행하는 성질을 말한다. 
* 자바에서 스레드 스케줄링은 우선순위(Priority) 방식과 순환 할당(Round-Robin) 방식을 사용한다.
#### 4.1. 우선순위 방식 (Priority)
* 우선순위 방식은 우선순위가 높은 스레드가 실행 상태를 더 많이 가지도록 스케줄링하는 방식이다. 
* 우선순위 방식에서 우선순위는 1 ~ 10까지 부여되는데 1이 가장 낮고 10이 가장 높다. (기본값은 5이다. )
* 우선순위를 부여하지 않으면 기본적으로 5의 우선순위를 갖는다.
* Thread 클래스의 setPriority() 메소드를 사용해서 우선순위를 지정할 수 있다.
    ```java
    public class Application {
        public static void main(String[] args) {
            Thread thread = new Thread(new Runable() {
                    
                @Override
                public void run() {
                    // 작업 스레드에서 실행할 코드
                    ...
                }
            });

            // thread.setPriority(1);
            // thread.setPriority(Thread.MIN_PRIORITY); // 1
            // thread.setPriority(Thread.NORM_PRIORITY); // 5
            thread.setPriority(Thread.MAX_PRIORITY); // 10

            thread.start();
        }
    }
    ```
#### 4.2. 순환 할당 방식 (Round-Robin)
* 순환 할당 방식은 시간 할당량(Time Slice)을 정해서 스레드를 정해진 시간만큼 실행하고 정해진 시간이 끝나면 다른 스레드를 실행하는 방식이다.
* JVM에 의해서 정해지기 때문에 코드로 제어할 수 없다.
### 5. 스레드 컨트롤
* 스레드 컨트롤은 실행 중인 스레드의 상태를 제어하기 위한 것을 말한다.
* 효율적이고 정교한 스케줄링을 위한 스레드 상태를 제어하는 기능이다.
#### 5.1. 스레드 상태
* 실행 대기는 스레드 생성 후 start() 호출 시, 스케줄에 의해서 실행을 대기하는 상태이다.
* 실행은 실행 대기 상태의 스레드 중에서 스케줄링으로 선택되어 run() 메소드가 실행되고 있는 상태이다.
* 일시정지는 스레드가 실행 상태에서 일시정지된 상태이다. 일시정지된 스레드를 다시 실행 상태로 가기 위해서는 실행 대기 상태가 되어야 한다.
#### 5.2. 스레드 제어 메소드
* 스레드의 상태를 제어하는 대표적인 메소드는 아래와 같다.
  |리턴 타입|메소드|설명|
  |:--:|--|--|
  |void|interrupt()|InterruptException을 발생시키고 일시 정지 상태인 스레드를 실행 대기 상태로 만든다. (예외 처리를 통해 스레드를 다시 실행하거나 종료할 수 있다.)|
  |void|join()|다른 스레드가 종료될 때까지 기다렸다가 종료되면 다시 해당 스레드를 실행한다.|
  |void|join(long millis)|지정된 시간이 지나거나 다른 스레드의 작업이 종료되면 해당 스레드를 실행한다.|
  |void|join(ling millis, int nanos)|지정된 시간이 지나거나 다른 스레드의 작업이 종료되면 해당 스레드를 실행한다.|
  |void|sleep(long millis)|실행 중인 스레드를 일정 시간 일시정지 상태로 만든다.|
  |void|sleep(long millis, int nanos)|실행 중인 스레드를 일정 시간 일시정지 상태로 만든다.|
  |void|yield()|실행 중인 스레드를 실행 대기 상태로 만들고 동일한 우선순위 또는 높은 우선순위를 갖는 스레드에게 실행 기회를 가질 수 있도록 양보한다.|
  |void|wait()|객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다.|
  |void|wait(long timeout)|객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다. 지정된 시간이 지나면 실행 대기 상태로 만든다.|
  |void|wait(long timeout, int nanos)|객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다. 지정된 시간이 지나면 실행 대기 상태로 만든다.|
  |void|notify()|wait()에 의해 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만든다.|
  |void|notifyAll()|wait()에 의해 일시 정지된 모든 스레드들을 실행 대기 상태로 만든다. |
  |void|stop()|스레드를 즉시 종료 시킨다.|
### 6. 동기화(Synchronized)
* 동기화는 스레드가 사용 중인 객체의 작업이 끝날 때까지 사용 중인 객체에 잠금을 걸어서 다른 스레드가 접근할 수 없도록 한다.
* 자바는 동기화를 위해 동기화 메소드와 동기화 블록을 제공하는데 스레드가 객체 내부에 동기화 메소드 또는 동기화 블록을 실행하면 즉시 객체에 잠금을 걸어 다른 스레드가 객체에 접근하지 못하도록 한다.
* 동기화 메소드와 동기화 블록이 객체 내에 여러 개 있을 경우 스레드가 이들 중 하나를 실행하면 다른 스레드는 해당 메소드는 물론이고 객체 내의 다른 동기화 메소드 및 동기화 블록도 실행할 수 없다.
* 동기화 메소드는 선언부에 synchronized 키워드를 붙이면 된다. 
    ```java
    // 메소드에 synchronized 키워드를 사용하여 동기화 메소드로 만든다.
    public synchronized void 메소드명() {

    }

    // 정적 메소드도 synchronized 키워드를 사용하여 동기화 메소드로 만들 수 있다.
    public static synchronized void 메소드명() {

    }
    ```
* 메소드 전체 내용이 아니라 일부 내용만 동기화하고 싶을 때는 동기화 블록을 만들면 된다. 
    ```java
    public void 메소드명() {
        ... 
        
        // 괄호() 안에는 공유 객체를 지정하는데 보통 this를 지정한다. 
        syschronized(this) { 
            ...
        }
    }
    ```
## 람다식(Lambda Expressions)
### 1. 람다식(Lambda Expressions)
* 자바에서 함수적 프로그래밍을 위해서 자바 8부터 람다식을 지원한다.
* 람다식은 매개변수를 가지는 함수와 같은 코드 블록이지만 런타임 시에는 인터페이스의 익명 구현 객체를 생성한다.
* 람다식을 사용하면 코드가 간결해지고, 컬렉션의 요소들을 필터링하거나 매핑해서 원하는 결과를 쉽게 가져올 수 있다.
  ```java
    ([자료형 매개변수, ...]) -> {
    	// 실행 코드
    
    	[return 반환값;]
    };
  ```
### 2. 함수적 인터페이스(Functional Interface)
* 람다식은 인터페이스 타입의 변수에 대입되고 람다식은 인터페이스의 익명 구현 객체를 생성한다.
* 하나의 추상 메소드가 선언된 인터페이스만 람다식으로 익명 구현 객체를 생성할 수 있는데 이러한 인터페이스를 함수적 인터페이스라고 한다.
* 함수적 인터페이스를 선언할 때 @FunctionalInterface 어노테이션을 붙이면 두 개 이상의 추상메소드가 선언되지 않도록 컴파일러가 체크해 준다.
  ```java
  @FunctionalInterface
  public interface Runnable {

    public abstract void run();
  }
  ```
### 3. 표준 함수적 인터페이스
* 자바 8부터 빈번히 사용되는 함수적 인터페이스는 java.util.function 표준 API 패키지로 제공된다.
* 표준 함수적 인터페이스는 용도에 따라 크게 Consumer, Supplier, Function, Operator, Predicate로 구분된다.
  ```java
  @FunctionalInterface
  public interface Consumer<T> {

    void accept(T t);
  }

  @FunctionalInterface
  public interface Supplier<T> {

    T get();
  }
  
  @FunctionalInterface
  public interface Function<T, R> {

    R apply(T t);
  }

  @FunctionalInterface
  public interface IntBinaryOperator {

    int applyAsInt(int left, int right);
  }

  @FunctionalInterface
  public interface Predicate<T> {

    boolean test(T t);
  }
  ```
## 스트림(Stream) API
### 1. 스트림(Stream) API
* 스트림은 자바 8부터 추가된 기능으로 컬렉션(배열)의 저장 요소들을 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자이다.
* 스트림은 내부 반복자를 사용해서 병렬 처리와 중간 처리, 최종 처리 작업을 수행할 수 있다.
### 2. 스트림의 생성
* java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있다.
  ```java
  public interface BaseStream<T, S extends BaseStream<T, S>> extends AutoCloseable {
    ...
  }

  public interface Stream<T> extends BaseStream<T, Stream<T>> {
    ...
  }

  public interface IntStream extends BaseStream<Integer, IntStream> {
    ...
  }

  public interface LongStream extends BaseStream<Long, LongStream> {
    ...
  }

  public interface DoubleStream extends BaseStream<Double, DoubleStream> {
    ...
  }
  ```
* IntStream, LongStream의 range(), rangeClosed() 메소드를 이용해서 숫자 범위로 스트림을 생성할 수 있다.
  ```java
  IntStream stream = IntStream.range(1, 10); 
  ```
* Arrays.stream(배열) 메소드를 이용해서 배열로부터 스트림을 생성할 수 있다.
  ```java
  String[] names = {"문인수", "홍길동", "이몽룡"};

  Stream<String> stream = Arrays.stream(names);
  ```
* 컬렉션의 stream() 메소드를 이용해서 컬렉션으로부터 스트림을 생성할 수 있다.
  ```java
  List<String> names = Arrays.asList("문인수", "홍길동", "이몽룡");

  Stream<String> stream = names.stream();
  ```
### 3. 중간 처리 메소드
* 스트림은 데이터의 필터링, 정렬, 매핑 등의 처리를 할 수 있는 중간 처리 메소드를 제공한다.
* 리턴 타입이 스트림이라면 중간 처리 메소드이다.
  ```java
  int[] array = {1, 2, 3, 4, 5, 6};

  Arrays.stream(array)
        .filter(value -> value % 2 == 0) // 중간 처리 메소드
        .forEach(value -> System.out.println(value)); // 최종 처리 메소드
  ```
### 4. 최종 처리 메소드
* 스트림은 데이터의 집계, 수집, 반복 처리 등의 처리를 할 수 있는 최종 처리 메소드를 제공한다.
* 리턴 타입이 기본 타입이거나 Optional 타입이라면 최종 처리 메소드이다.
  ```java
  int sum = 0;
  int[] array = {1, 2, 3, 4, 5, 6};
  
  sum = Arrays.stream(array).sum(); // 최종 처리 메소드
  ```
