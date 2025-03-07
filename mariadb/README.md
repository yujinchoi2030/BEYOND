## MariaDB
### 1. DBMS(Database Management System)
* 데이터베이스는 대용량의 데이터 집합을 체계적으로 구성해 놓은 것이다.
* DBMS는 이러한 데이터베이스를 관리해 주는 시스템 또는 소프트웨어를 말한다.
* DBMS의 종류는 아래와 같다.
  <table>
    <tr>
      <th>DBMS</th>
      <th>제작사</th>
      <th>운영체제</th>
      <th>기타</th>
    </tr>
    <tr>
      <td>MariaDB</td>
      <td>MariaDB</td>
      <td>Unix, Linux, Windows, Mac</td>
      <td>오픈 소스(무료)</td>
    </tr>
    <tr>
      <td>MySQL</td>
      <td>Oracle</td>
      <td>Unix, Linux, Windows, Mac</td>
      <td>오픈 소스(무료), 상용</td>
    </tr>
    <tr>
      <td>PostgreSQL</td>
      <td>PostgreSQL</td>
      <td>Unix, Linux, Windows, Mac</td>
      <td>오픈 소스(무료)</td>
    </tr>
    <tr>
      <td>Oracle</td>
      <td>Oracle</td>
      <td>Unix, Linux, Windows</td>
      <td>상용 시장 점유율 1위</td>
    </tr>
    <tr>
      <td>SQL Server</td>
      <td>Microsoft</td>
      <td>Windows</td>
      <td></td>
    </tr>
    <tr>
      <td>DB2</td>
      <td>IBM</td>
      <td>Unix, Linux, Windows</td>
      <td>메인프레임 시장 점유율 1위</td>
    </tr>
    <tr>
      <td>Access</td>
      <td>Microsoft</td>
      <td>Windows</td>
      <td>PC용</td>
    </tr>
    <tr>
      <td>SQLite</td>
      <td>SQLite</td>
      <td>Android, iOS</td>
      <td>모바일 전용, 오픈 소스(무료)</td>
    </tr>
  </table>
### 2. DBMS의 특징
* 데이터 무결성
  * 데이터베이스 안의 데이터는 어떤 경로를 통해 들어왔던 데이터에 오류가 있어서는 안 된다.
* 데이터 독립성
  * 데이터베이스의 크기를 변경하거나 데이터 파일의 저장소를 변경하더라도, 기존에 작성된 응용 프로그램은 전혀 영향을 받지 않아야 한다.
* 보안
  * 데이터베이스의 데이터는 접근이 허가된 사용자만 데이터에 접근할 수 있어야 한다.
* 데이터 중복의 최소화
  * 동일한 데이터가 여러 개 중복되어 저장되는 것을 방지한다.
* 응용 프로그램의 유지 보수가 쉬워짐
  * 응용프로그램이 데이터베이스를 이용함으로써 통일된 방식으로 응용프로그램 작성이 가능해지고, 유지보수 또한 쉬워진다.
* 데이터의 안전성 향상
  * 대부분의 DBMS가 제공하는 백업/복원 기능을 이용함으로써 데이터에 문제가 발생할 경우 복원 또는 복구 쉽게 할 수 있다.
### 3. RDBMS(Relational DataBase Management System)
* DBMS의 유형에는 크게 계층형, 망형, 관계형, 객체지향형, 객체 관계형 DBMS 등으로 분류된다.
* 현재 사용되는 DBMS 중에는 RDBMS가 가장 많은 부분을 차지하고 있으며 MaraiDB도 관계형 RDBMS이다.
* RDBMS에서 모든 데이터를 표 형태의 테이블(Table)에 저장하고 테이블을 릴레이션(Relation), 엔티티(Entity)라고 부르기도 한다.
### 4. SQL(Structured Query Language)
* SQL(Structured Query Language)은 사람과 DBMS가 소통하기 위한 언어로 DBMS에 데이터를 구축하고 관리하고 활용하기 위해서 사용된다.
* SQL은 국제 표준화 기관에서 표준화된 내용을 계속 발표하고 있는데 SQL은 다음과 같은 특징을 갖는다.
  * DBMS 제작 회사와 독립적이다.
  * 다른 시스템으로 이식성이 좋다.
  * 표준이 계속 발전되고 있다.
  * 대화식 언어이다.
  * 분산형 클라이언트/서버 구조
* 모든 DBMS의 SQL 문이 완벽하게 동일하지는 않다는 것에 주의해야 한다.
* 많은 회사가 표준 SQL을 지키면서도 자신의 제품에 특화된 SQL을 사용한다. (Oracle의 PL/SQL, SQL Server의 T-SQL)
* SQL은 크게 DML(Data Manipulation Language), DDL(Data Definition Language), DCL(Data Control Language)로 분류한다.
  * DML은 데이터를 조작하는 데 사용되는 언어이다.
  * DDL은 데이터베이스와 테이블 등의 데이터베이스 개체를 정의하는 데 사용되는 언어이다.
  * DCL은 사용자에게 권한을 부여하거나 회수하는 데 사용되는 언어이다.
### 5. MariaDB 소개
* MariaDB는 MariaDB 사에서 제작한 RDBMS 소프트웨어로 오픈 소스(Open Source)로 제공된다.
* MariaDB의 전신인 MySQL은 비상업용이나 교육용으로는 제한 없이 사용해도 되지만, 2010년 오라클이 MySQL을 인수하면서 상용으로 사용하기 위해서는 상용 라이선스를 취득해야 한다.
* MariaDB는 어떤 환경에서도 제한 없이 사용할 수 있으며 MariaDB는 MySQL과 호환성을 대부분 유지하므로 MySQL을 사용하던 환경에서도 MariaDB로 문제없이 변경된다.
## MariaDB 설치
### 1. MariaDB 설치
* MariaDB 공식 홈페이지에 접속 후(https://mariadb.org/) 운영체제에 맞는  MariaDB를 다운로드 및 설치한다.
* 설치 완료 후 MariaDB가 설치된 경로를 `PATH` 환경 변수에 등록한다.
* 환경 변수를 등록하고 아래의 명령어로 설치를 확인한다.
  ```sh
  # MariaDB 버전 확인
  mariadb -V
  mariadb --version
  ```
### 2. 실습 환경 구축
* root 사용자는 MariaDB의 모든 작업을 할 수 있기 때문에 실습에 필요한 일반 사용자를 생성하고 생성한 일반 사용자에 적합한 권한을 부여한다.
  ```sql
  -- 사용자 생성
  CREATE USER `beyond`@`%` IDENTIFIED BY 'beyond';

  -- 사용자 확인
  SELECT Host, User, Password FROM mysql.user;

  -- beyond 사용자에 testDB 데이터베이스에 대해 모든 권한을 부여
  GRANT ALL PRIVILEGES ON testDB.* TO `beyond`@`%`;

  -- beyond 사용자에 employees 데이터베이스에 대해 모든 권한을 부여
  GRANT ALL PRIVILEGES ON employees_db.* TO `beyond`@`%`;

  -- 권한 확인
  SHOW GRANTS FOR `beyond`@`%`;

  -- 권한 적용
  FLUSH PRIVILEGES;
  ```
## SQL 기본
### 1. 데이터 조회
#### 1.1. SELECT
* `SELECT` 문은 가장 많이 사용하는 구문으로 테이블에서 원하는 정보를 추출하는 구문이다.
  ```sql
  -- 모든 열 조회 시 열 이름 대신 '*' 기호 사용 가능
  SELECT emp_no, name, address  
  FROM employees;
  ```
* `AS`를 사용해 조회된 열 이름에 별칭을 지정할 수 있다.
  ```sql
  SELECT emp_no AS '사번', name '이름', address 주소
  FROM employees;
  ```
* `DISTINCT`를 사용해 중복된 값을 한 번만 표시할 수 있다.
  ```sql
  SELECT DISTINCT address
  FROM employees;
  ```
* `LIMIT`를 사용해 출력의 개수를 제한할 수 있다.
  ```sql
  SELECT *
  FROM employees
  LIMIT 10;
  ```
#### 1.2. WHERE
* `WHERE` 절은 테이블에서 다양한 조건을 설정하여 데이터를 검색할 때 사용하는 구문이다.
* 두 개의 값을 비교하는 `비교 연산자`를 사용할 수 있다. (=, !=, >, <, >=, <=)
  ```SQL
  SELECT *
  FROM employees
  WHERE emp_no = 30000;
  ```
* 여러 개의 조건 결과를 하나의 논리 결과로 만들어주는 `논리 연산자`를 사용할 수 있다. (NOT, AND, OR)
  ```SQL
  SELECT *
  FROM employees
  WHERE emp_no >= 30000 AND emp_no <= 40000;
  ```
* 특정 값이 지정한 범위에 포함되는지 확인하는 `BETWEEN AND 연산자`를 사용할 수 있다.
  ```SQL
  SELECT *
  FROM employees
  WHERE emp_no BETWEEN 30000 AND 40000;
  ```
* 특정 값과 일치하는 값이 목록에 있는지 확인하는 `IN 연산자`를 사용할 수 있다.
  ```SQL
  SELECT *
  FROM employees
  WHERE hobby IN ('축구', '농구', '야구');
  ```
* 문자열을 검색할 때는 `LIKE 연산자`를 사용할 수 있다.
  ```SQL
  SELECT *
  FROM employees
  WHERE address LIKE '서울%'; -- %는 0 글자 이상을 의미

  SELECT *
  FROM employees
  WHERE name LIKE '김_현'; -- _는 1 글자를 의미
  ```
#### 1.3. ORDER BY
* `ORDER BY` 절은 테이블에서 조회된 데이터를 정렬할 때 사용하는 구문이다.
* 기본적으로 오름차순으로 정렬되는데 내림차순으로 정렬하기 위해서는 `DESC`를 추가해야 한다.
* 여러 개의 열로 정렬할 경우 콤마(,)로 구분해서 열을 나열하면 된다.
  ```sql
  SELECT *
  FROM employees
  ORDER BY name, address DESC;
  ```
#### 1.4. GROUP BY
* `GROUP BY` 절은 여러 개의 값들을 하나의 그룹으로 묶어서 처리할 목적으로 사용하는 구문이다.
  ```sql
  SELECT gender, COUNT(*)
  FROM employees
  GROUP BY gender
  ORDER BY gender;
  ```
* 집계 함수를 GROUP BY 절과 함께 사용해 하나 이상의 행을 그룹으로 묶어 연산하며 총합, 평균 등을 계산할 수 있다.
  ```sql
  SELECT SUM(salary) AS '급여의 합',
         AVG(salary) AS '급여의 평균',
         MIN(salary) AS '최소 급여',
         MAX(salary) AS '최대 급여',
         COUNT(*) AS '직원 수'
  FROM employees
  GROUP BY gender;
  ```
#### 1.5. HAVING
* `HAVING` 절은 집계 함수에 대해서 조건을 제한하는 구문이다.
  ``` sql
  SELECT gender, COUNT(*)
  FROM employees
  GROUP BY gender
  HAVING COUNT(*) >= 5;
  ```
### 2. 데이터 변경
#### 2.1. INSERT
* `INSERT`는 테이블에 데이터를 삽입하는 구문이다.
  ```SQL
  INSERT INTO employees(name, gender, age) VALUES('홍길동', '남자', 20);
  ```
* 여러 개의 행을 한 번에 삽입하려면 아래와 같이 작성하면 된다.
  ```sql
  INSERT INTO employees VALUES ('홍길동', '남자', ...), ('성춘향', '여자', ...);
  ```
* 다른 테이블의 데이터를 가져와서 대량으로 입력하려면 아래와 같이 작성하면 된다.
  ```sql
  INSERT INTO employees_copy 
    SELECT * 
    FROM employees;
  ```
#### 2.2. UPDATE
* `UPDATE`는 기존에 입력되어 있는 값을 변경할 때 사용하는 구문이다.
* `WHERE` 절은 생략이 가능하지만 WHERE 절을 생략하면 테이블 전체의 행이 변경된다.
  ```sql
  UPDATE employees
  SET name = '임꺽정',
      age = 35
  WHERE emp_no = 30000;
  ```
#### 2.3. DELETE
* `DELETE`는 행 단위로 데이터를 삭제할 때 사용하는 구문이다.
* `WHERE` 절은 생략이 가능하지만 WHERE 절을 생략하면 테이블 전체의 행이 삭제된다.
* 만약 조건을 만족하는 결과 중에서 상위 몇 건만 삭제하려면 `LIMIT` 구문과 함께 사용하면 된다.
  ```sql
  -- 조건을 만족하는 3개의 행 삭제
  DELETE FROM employees WHERE address LIKE '서울%' LIMIT 3;

  -- 테이블 삭제
  DROP TABLE employees;

  -- 테이블의 모든 데이터 삭제
  TRUNCATE TABLE employees;
  ```
#### 2.4. 조건부 데이터 입력, 변경
* 기본적으로 기본 키(PK)가 중복된 경우 데이터가 입력되지 않는다.
* 기본 키(PK)가 중복되더라도 오류를 발생하지 않고 무시하고 넘어가려면 아래와 같이 작성하면 된다.
  ```sql
  INSERT IGNORE INTO employees VALUES(30000, '홍길동', 30);
  ``` 
* 기본 키(PK)가 중복되지 않으면 INSERT를 실행하고, 기본 키(PK)가 중복되면 UPDATE를 실행하려면 아래와 같이 작성하면 된다. 
  ```sql
  INSERT INTO employees VALUES(30000, '임꺽정', 35)
    ON DUPLICATE KEY UPDATE name = '임꺽정', age = 35;
  ```
## 데이터 형식(Data Type)
### 1. 숫자 데이터 형식
| 데이터 형식 | 바이트 수 | 설명 |
|---|---|---|
| `BIT(N)` | N/8 | 1 ~ 64bit를 표현. b'0000' 형식으로 표현 | |
| `TINYINT` | 1 | -128 ~ 127 |
| `SMALLINT` | 2 | -32,768 ~ 32,767 |
| `MEDIUMINT` | 3 | -8,388,608 ~ 8,388,607 |
| `INT`<br>`INTEGER` | 4 | -2,147,483,648 ~ 2,147,483,647 |
| `BIGINT` | 8 | -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 |
| `FLOAT` | 4 | 소수점 아래 7자리까지 표현 |
| `DOUBLE`<br>`REAL` | 8 | 소수점 아래 15자리까지 표현 |
| `DECIMAL(m, [d])`<br>`NUMERIC(m, [d])` | 5 ~ 17 | 전체 자리수(m)와 소수점 이하 자릿수(d)를 가진 숫자형<br>예) decimal(5, 2)는 전체 자릿수를 5자리로 하되, 그 중 소수점 이하를 2자리로 하겠다는 의미 |
### 2. 문자 데이터 형식
| 데이터 형식 | 바이트 수 | 설명 |
|---|---|---|
| `CHAR(N)` | 1 ~ 255 | 고정 길이 문자형. N을 1부터 255까지 지정.<br>Character의 약자<br>그냥 CHAR만 쓰면 CHAR(1)과 동일 |
| `VARCHAR(N)` | 1 ~ 65535 | 가변 길이 문자형, N을 사용하면 1부터 65535까지 지정.<br>Variable Character의 약자 |
| `BINARY(N)` | 1 ~ 255 | 고정 길이의 이진 데이터 값 | 
| `VARBINARY(N)` | 1 ~ 255 | 가변 길이의 이진 데이터 값 |
| `TINYTEXT` | 1 ~ 255 | 255 크기의 TEXT 데이터 값 |
| `TEXT` | 1 ~ 65535 | N 크기의 TEXT 데이터 값 |
| `MEDIUMTEXT` | 1 ~ 16777215 | 16777215 크기의 TEXT 데이터 값 |
| `LONGTEXT` | 1 ~ 4294967295 | 최대 4GB 크기의 TEXT 데이터 값 |
| `TINYBLOB` | 1 ~ 255 | 255 크기의 BLOB 데이터 값 |
| `BLOB` | 1 ~ 65535 | N 크기의 BLOB 데이터 값 |
| `MEDIUMBLOB` | 1 ~ 16777215 | 16777215 크기의 BLOB 데이터 값 |
| `LONGBLOB` | 1 ~ 4294967295 | 최대 4GB 크기의 BLOB 데이터 값 |
| `ENUM(값들…)` | 1 또는 2 | 최대 65535개의 열거형 데이터 값 |
| `SET(값들…)` | 1, 2, 3, 4, 8 | 최대 64개의 서로 다른 데이터 값 |
### 3. 날짜와 시간 데이터 형식
| 데이터 형식 | 바이트 수 | 설명 |
|---|---|---|
| `DATE` | 3 | YYYY-MM-DD 형식의 날짜 값 (1001-01-01 ~ 9999-12-31) |
| `TIME` | 3 | HH:MM:SS 형식의 시간 값 (-838:59:59.000000 ~ 838:59:59.000000) |
| `DATETIME` | 5 | YYYY-MM-DD HH:MM:SS 형식의 날짜 및 시간 값 (1001-01-01 00:00:00 ~ 9999-12-31 23:59:59)|
| `TIMESTAMP` | 4 | YYYY-MM-DD HH:MM:SS 형식의 날짜 및 시간 값 (1001-01-01 00:00:00 ~ 9999-12-31 23:59:59), Time Zone 시스템 변수와 관련이 있으며 UTC 시간대로 변화하여 저장 |
| `YEAR` | 2 | YYYY 형식의 연도 값 (1901 ~ 2155) |
### 4. 기타 데이터 형식
| 데이터 형식 | 바이트 수 | 설명 |
|---|---|---|
| `GEOMETRY` | N/A | 공간 데이터 형식으로 선, 점 및 다각형 같은 공간 데이터 개체를 저장하고 조작 |
| `JSON` | 8 | JSON(JavaScript Object Notation) 문서를 저장 |
##  함수
### 1. 형 변환 함수
|함수|설명|
|---|---|
|`CAST(expression AS 데이터 형식 [(길이)])`| expression에 데이터 형식을 AS 이후의 데이터 형식으로 변환한다. |
|`CONVERT(expression, 데이터 형식 [(길이)])`|expression에 데이터 형식을 두 번째 매개값으로 전달하는 데이터 형식으로 변환한다. |
### 2. 제어 흐름 함수
|함수|설명|
|---|---|
| `IF(수식, 참, 거짓)` | 수식이 참 또는 거짓인지 결과에 따라서 분기하는 함수이다. |
| `IFNULL(수식 1, 수식2)` | 수식 1이 NULL이 아니면 수식 1이 반환되고, 수식 1이 NULL이면 수식 2가 반환된다. |
| `NULLIF(수식 1, 수식 2)` | 수식 1과 수식 2가 같으면 NULL을 반환하고, 다르면 수식 1을 반환한다. |
### 3. 문자열 함수
|함수|설명|
|---|---|
| `ASCII(문자)` | 문자의 아스키코드를 반환하는 함수이다. |
| `CHAR(숫자)` | 아스키코드값에 해당하는 문자를 반환하는 함수이다. |
| `BIT_LENGTH(문자열)` | 문자열에 할당된 bit의 크기를 반환하는 함수이다. |
| `CHAR_LENGTH(문자열)` | 문자열에 문자의 개수를 반환한다. |
| `LENGTH(문자열)` | 문자열에 할당된 Byte 수를 리턴한다. |
| `CONCAT(문자열 1, 문자열 2, ... )`<br>`CONCAT_WS(구분자, 문자열 1, 문자열 2, ... )` | 문자열을 이어주는 함수이다.<br>CONCAT_WS 함수는 구분자와 함께 문자열을 이어준다. |
| `ELT(위치, 문자열 1, 문자열 2, ...)` | 위치 번째에 해당하는 문자열을 반환한다. |
| `FIELD(찾을 문자열, 문자열 1, 문자열 2, ...)` | 찾을 문자열의 위치를 찾아서 반환한다.<br>매치되는 문자열이 없으면 0을 반환한다. |
| `FIND_IN_SET(찾을 문자열, 문자열 리스트)` | 찾을 문자열을 문자열 리스트에서 찾아서 위치를 반환한다.<br>문자열 리스트는 콤마(,)로 구분되어 있어야 하며 공백은 없어야 한다. |
| `INSTR(기준 문자열, 부분 문자열)` | 기준 문자열에서 부분 문자열을 찾아서 그 시작 위치를 반환한다. |
| `LOCATE(부분 문자열, 기준 문자열)` | INSTR() 함수와 동일하지만 파라미터의 순서가 반대로 되어 있다.<br>LOCATE() 함수와 POSITION() 함수는 동일한 함수이다. |
| `FORMAT(숫자, 소수점 자릿수)` | 숫자를 지정한 소수점 자릿수까지 표현하는 함수이다.<br>또한 1000단위마다 콤마(,)를 표시해 준다. |
| `BIN(숫자)` | 숫자의 2진수 값을 반환한다. |
| `HEX(숫자)` | 숫자의 16진수 값을 반환한다. |
| `OCT(숫자)` | 숫자의 8진수 값을 반환한다. |
| `INSERT(기준 문자열, 위치, 길이, 삽입할 문자열)` | 기준 문자열의 위치부터 길이만큼을 지우고 삽입할 문자열을 끼워 넣는다. |
| `LEFT(문자열, 길이)` | 왼쪽에서 문자열의 길이만큼 반환한다. |
| `RIGHT(문자열, 길이)` | 오른쪽에서 문자열의 길이만큼 반환한다. |
| `UPPER(문자열)` | 소문자를 대문자로 변경하는 함수이다.<br>UPPER() 함수는 UCASE() 함수와 동일한 함수이다. |
| `LOWER(문자열)` | 대문자를 소문자로 변경하는 함수이다.<br>LOWER() 함수는 LCASE() 함수와 동일한 함수이다. |
| `LPAD(문자열, 길이, 채울 문자열)` | 문자열을 길이만큼 왼쪽을 늘린 후에, 빈 곳을 채울 문자열로 채운다. |
| `RPAD(문자열, 길이, 채울 문자열)` | 문자열을 길이만큼 오른쪽을 늘린 후에, 빈 곳을 채울 문자열로 채운다. |
| `LTRIM(문자열)` | 문자열의 왼쪽 공백을 제거한다<br>중간의 공백은 제거되지 않는다. |
| `RTRIM(문자열)` | 문자열의 오른쪽 공백을 제거한다.<br>중간의 공백은 제거되지 않는다. |
| `TRIM(문자열)` | 문자열의 앞/뒤 공백을 모두 제거한다. |
| `TRIM(방향 자를 문자열 FROM 문자열)` | 방향을 지정하면 해서 자를 문자열을 제거할 수 있다.<br>방향은 LEADING(앞), TRAILING(뒤), BOTH(양쪽)로 지정한다. |
| `REPEAT(문자열, 횟수)` | 문자열을 횟수만큼 반복한다. |
| `REPLACE(문자열, 원래 문자열, 바꿀 문자열)` | 문자열에서 원래 문자열을 찾아서 바꿀 문자열로 바꿔준다. |
| `REVERSE(문자열)` | 문자열의 순서를 거꾸로 만든다. |
| `SPACE(길이)` | 길이 만큼의 공백을 반환한다. |
| `SUBSTRING(문자열, 시작 위치, 길이)`<br>`SUBSTRING(문자열 FROM 시작 위치 FOR 길이)` | 시작 위치부터 길이만큼 문자를 반환한다.<br>길이가 생략되면 문자열의 끝까지 반환한다.<br>SUBSTRING() 함수, SUBSTR() 함수, MID() 함수는 모두 동일한 함수이다. |
| `SUBSTRING_INDEX(문자열, 구분자, 횟수)` | 문자열에서 구분자가 왼쪽부터 횟수 번째 나오면 그 이후의 오른쪽은 버린다.<br>횟수가 음수이면 오른쪽부터 세고 왼쪽을 버린다. |
### 4. 수학 함수
|함수|설명|
|---|---|
| `ABS(숫자)` | 숫자의 절댓값을 계산한다. |
| `ACOS(숫자)`<br>`ASIN(숫자)`<br>`ATAN(숫자)`<br>`ATAN2(숫자 1, 숫자 2)`<br>`SIN(숫자)`<br>`COS(숫자)`<br>`TAN(숫자)` | 삼각 함수와 관련된 함수를 제공한다. |
| `CEILING(숫자)` | 숫자를 올림하여 반환한다.<br>CEILING()과 CEIL()은 동일한 함수이다.|
| `FLOOR(숫자)` | 숫자를 내림하여 반환한다. |
| `ROUND(숫자)` | 숫자를 반올림을 반환한다. |
| `TRUNCATE(숫자, 정수)` | 숫자를 소수점을 기준으로 정수 위치까지 구하고 나머지는 버린다. |
| `CONV(숫자, 원래 진수, 변환할 진수)` | 숫자를 원래 진수에서 변환할 진수로 계산한다. |
| `DEGREES(숫자)` |라디안 값을 각도 값으로 변환한다. |
| `RADIANS(숫자)` |각도 값을 라디안 값으로 변환한다. |
| `PI()` | PI 값인 3.141592를 반환한다. |
| `EXP(X)`<br>`LN(숫자)`<br>`LOG(숫자)`<br>`LOG(밑수, 숫자)`<br>`LOG2(숫자)`<br>`LOG10(숫자)` | 지수, 로그와 관련된 함수를 제공한다. |
| `MOD(숫자 1, 숫자 2)`<br>`숫자 1 % 숫자 2`<br>`숫자 1 MOD 숫자 2` | 숫자 1을 숫자 2로 나눈 나머지 값을 구한다. |
| `POW(숫자)` | 숫자의 거듭제곱 값을 반환한다.<br>POW()와 POWER() 함수는 동일한 함수다. |
| `SQRT(숫자)` | 숫자의 제곱근을 반환한다. |
| `RAND()` | 0 이상 1 미만의 실수를 구한다. |
| `SIGN(숫자)` | 숫자가 양수, 0, 음수인지를 구한다.<br>결과는 1, 0, -1 셋 중에 하나를 반환한다. |
### 5. 날짜 및 시간 함수
|함수|설명|
|---|---|
| `ADDDATE(날짜, 차이)` | 날짜를 기준으로 차이를 더한 날짜를 반환한다.<br>ADDDATE() 함수와 DATE_ADD() 함수는 동일한 함수이다. |
| `SUBDATE(날짜, 차이)` | 날짜를 기준으로 차이를 뺀 날짜를 반환한다.<br>SUBDATE() 함수와 DATE_SUB() 함수는 동일한 함수이다. |
| `ADDTIME(날짜/시간, 시간)` | 날짜/시간을 기준으로 시간을 더한 결과를 반환한다. |
| `SUBTIME(날짜/시간, 시간)` | 날짜/시간을 기준으로 시간을 뺀 결과를 반환한다. |
| `CURDATE()` | 현재 `연-월-일`을 조회하는 함수이다.<br>CURDATE() 함수와 CURRENT_DATE() 함수, CURRENT_DATE는 모두 동일하다.|
| `CURTIME()` | 현재 `시:분:초`를 조회하는 함수이다.<br>CURTIME() 함수와 CURRENT_TIME() 함수, CURRENT_TIME은 모두 동일하다. |
| `NOW()`<br>`SYSDATE()` | 현재 `연-월-일 시:분:초를` 조회하는 함수이다.<br>NOW() 함수, LOCALTIME() 함수, LOCALTIME, LOCALTIMESTAMP() 함수, LOCALTIMESTAMP는 모두 동일하다. |
| `YEAR(날짜)`<br>`MONTH(날짜)`<br>`DAY(날짜)`<br>`HOUR(시간)`<br>`MINUTE(시간)`<br>`SECOND(시간)`<br>`MICROSECOND(시간)` | 날짜 또는 시간에서 `연, 월, 일, 시, 분, 초, 밀리초`를 구하는 함수이다.<br>DAY()와 DAYOFMONTH()는 동일한 함수이다. |
| `DATE(DATETIME)` | DATETIME 형식에서 `연-월-일`을 반환한다. |
| `TIME(DATETIME)` | DATETIME 형식에서 `시:분:초`를 반환한다. |
| `DATEDIFF(날짜 1, 날짜 2)` | 날짜 1 - 날짜 2의 일수 결과를 반환한다. |
| `TIMEDIFF(시간 1, 시간 2)` | 시간 1 - 시간 2의 차이 결과를 반환한다. |
| `DAYOFWEEK(날짜)` | 날짜의 요일(1:일, 2:월, ... 7:토)을 반환한다. |
| `MONTHNAME(날짜)` | 날짜의 월의 이름을 반환한다. |
| `DAYOFYEAR(날짜)` | 날짜가 1년 중 몇 번째 날짜 인지를 반환한다. |
| `LAST_DAY(날짜)` | 주어진 날짜의 마지막 날짜를 구한다. |
| `MAKEDATE(연도, 정수)` | 연도에서 정수만큼 지난 날짜를 구한다. |
| `MAKETIME(정수, 정수, 정수)` | 시, 분, 초를 이용해서 `시:분:초`의 TIME 형식을 만든다. |
| `PERIOD_ADD(연월, 개월 수)` | 연월에서 개월만큼의 개월이 지난 연월을 구한다.<br>연월은 `YYYY` 또는 `YYYYMM` 형식을 사용한다.|
| `PERIOD_DIFF(연월 1, 연월 2)` | 연월 1 - 연월 2의 개월 수를 구한다.  |
| `QUARTER(날짜)` | 날짜가 4분기 중에서 몇 분기인지 반환한다. |
| `TIME_TO_SEC(시간)` | 시간을 초 단위로 구한다. |
### 6. 시스템 정보 함수
|함수|설명|
|---|---|
| `USER()` | 현재 사용자를 반환한다.<br>USER() 함수, SESSION_USER() 함수, CURRENT_USER() 함수는 모두 동일한 함수이다. |
| `DATABASE()` | 현재 선택된 데이터베이스를 이름을 반환한다.<br>DATABASE() 함수, SCHEMA() 함수는 모두 동일한 함수이다. |
| `FOUND_ROWS()` | 바로 앞의 SELECT 문에서 조회된 행의 개수를 구한다.  |
| `ROW_COUNT()` | 바로 앞의 INSERT, UPDATE, DELETE 문에서 입력, 수정, 삭제된 행의 개수를 구한다.<br>CREATE, DROP 문은 0을 반환하고, SELECT 문은 -1을 반환한다. |
| `VERSION()` | 현재 MariaDB의 버전을 구한다. |
| `SLEEP(초)` | 쿼리의 실행을 잠깐 멈춘다. |
### 7. 윈도우 함수
#### 7.1. 순위 함수
* 순위 윈도우 함수에는 `ROW_NUMBER()`, `RANK()`, `DENSE_RANK()`, `NTILE()` 등의 함수가 있다.
* 순위 윈도우 함수를 사용하면 데이터를 순서대로 번호 매기거나, 특정 조건에 따라 순위(등수)를 매길 수 있다.
#### 7.2. 분석 함수
* 분석 윈도우 함수에는 `LEAD()`, `LAG()`, `FIRST_VALUE()`, `LAST_VALUE()`, `CUME_DIST()` 등의 함수가 있다.
* 분석 윈도우 함수를 사용하면 현재 행의 이전 행이나 다음 행의 데이터를 참조하거나, 윈도우의 첫 값이나 마지막 값을 가져올 수 있다.
## 조인(JOIN)과 UNION 연산자
### 1. 조인
* 조인이란 두 개 이상의 테이블을 서로 묶어서 하나의 결과 집합으로 만들어 내는 것을 말한다.
### 2. 내부 조인(INNER JOIN)
* 조인 중에서 가장 많이 사용되는 조인으로 일반적으로 조인이라고 이야기하는 것이 이 내부 조인(INNER JOIN)을 지칭하는 것이다.
* FROM 절 다음에 INNER JOIN 구문을 통해 조인에 사용할 테이블을 기술하고 ON 절에 조인 조건을 작성한다.
  ```sql
  SELECT *
  FROM employees e
  INNER JOIN departments d ON e.dept_no = d.dept_no;
  ```
### 3. 외부 조인(OUTER JOIN)
* 외부 조인(OUTER JOIN)은 조인의 조건에 만족되지 않는 행까지도 조회하기 위해서 사용되는 조인이다.
* LEFT OUTER JOIN은 왼쪽 테이블의 데이터는 모두 조회하려고 할 때 사용한다.
  ```sql
  SELECT *
  FROM employees e
  LEFT OUTER JOIN departments d ON e.dept_no = d.dept_no;
  ```
* RIGHT OUTER JOIN은 오른쪽 테이블의 데이터는 모두 조회하려고 할 때 사용한다.
  ```sql
  SELECT *
  FROM employees e
  RIGHT OUTER JOIN departments d ON e.dept_no = d.dept_no;
  ```
### 4. 상호 조인(CROSS JOIN)
* 상호 조인(CROSS JOIN)은 한쪽 테이블의 모든 행들과 다른 쪽 테이블의 모든 행을 조인한다.
  ```sql
  SELECT *
  FROM employees e
  CROSS JOIN departments d;
  ```
### 5. 자체 조인(SELF JOIN)
* 자체 조인(SELF JOIN)은 동일한 테이블을 가지고 조인하여 데이터를 조회한다.
  ```sql
  SELECT *
  FROM employees e
  INNER JOIN employees M ON e.manager_no = m.emp_no;
  ```
### 6. UNION/UNION ALL 연산자
* UNION 연산자는 두 쿼리의 결과를 하나로 합치는 연산자이다.
* UNION 연산자는 중복된 열은 제거되고 데이터가 정렬되어 조회된다.
* UNION ALL 연산자는 UNION 연산자와 다르게 중복된 열까지 모두 출력된다.
  ```sql
  SELECT *
  FROM employees
  WHERE gender = '남자'

  UNION -- 또는 UNION ALL

  SELECT *
  FROM employees
  WHERE salary > 3000000;
  ```
## DB 모델링
### 1. 데이터 모델링
* 데이터 모델링은 업무보다는 데이터를 중심으로 모델링을 진행하는 방법이다.
* 데이터 모델링은 일반적으로 개념적 모델링, 논리적 모델링, 물리적 모델링 3가지 과정으로 분류된다.
### 2. 개념적 모델링
* 요구분석 단계에서 정의된 핵심 개체와 그들 간의 관계를 바탕으로 ERD를 생성하는 단계이다. 
#### 2.1. 엔티티(Entity)
* 엔티티란 실제로 관리해야 할 구체적인 대상을 의미한다.
<br>![학생 entity](https://github.com/user-attachments/assets/2bf3cc6d-02f0-4896-9ab7-fb882c849825)

#### 2.2. 속성(Attribute)
* 속성이란 엔티티가 가지고 있는 특징을 의미한다.
<br>![학생 entity3](https://github.com/user-attachments/assets/a0d58214-0fa0-41dd-b7db-d797649b7375)

##### 2.2.1. 주 식별자
* 엔티티에 있는 데이터들을 서로 구분을 해 줄 수 있는 속성을 의미한다.
##### 2.2.2. 보조 식별자
* 보조 식별자는 주 식별자를 대체할 수 있는 또 다른 속성을 의미한다.
##### 2.2.3. 외래 식별자
* 엔티티와의 관계를 연결해 주는 식별자를 외부 식별자라고 한다.
#### 2.3. 관계(Relationship)
##### 2.3.1. 일대일(1:1, One To One) 관계
* A 엔티티에 존재하는 1건의 데이터와 대응되는 B 엔티티의 데이터도 1건일 경우 1:1 관계라고 한다.
<br>![학생 entity5](https://github.com/user-attachments/assets/8ddf9567-be5e-4bbd-bd68-354355a4c478)

##### 2.3.2. 일대다(1:M, One To Many) 관계
* A 엔티티에 존재하는 1건의 데이터와 대응되는 B 엔티티의 데이터가 여러 건일 경우 1:M 관계라고 한다.
<br>![학생 entity3](https://github.com/user-attachments/assets/9ade90e5-5ede-443b-abd9-f258bd4ce385)

##### 2.3.3. 다대다(M:M, Many To Many) 관계
* A 엔티티에 존재하는 여러 건의 데이터와 대응되는 B 엔티티의 데이터가 여러 건일 경우 M:M 관계라고 한다.
<br>![학생 entity4](https://github.com/user-attachments/assets/821666e9-9107-4f01-86e3-b9c496f5e052)

##### 2.3.4. 식별, 비 식별 관계
* 식별 관계는 부모 엔티티의 주 식별자를 자식 엔티티의 주 식별자, 외래 식별자로 사용하는 관계다. 
* 비 식별 관계는 부모 엔티티의 주 식별자를 자식 엔티티의 외래 식별자로만 사용하는 관계다.
### 3. 논리적 모델링
* 개념적 모델링 과정에서 추상화된 데이터를 구체화하여 개체, 속성을 테이블화하고 상세화 하는 과정이다.
#### 3.1. 이상 (Anomaly)
* 정규화를 진행하지 않은 엔티티를 대상으로 삽입, 갱신, 삭제 시 발생할 수 있는 예기치 못한 현상을 이상이라고 한다.
* 이상에는 삽입 이상, 갱신 이상, 삭제 이상이 있다.
<br>![삽입 이상](https://github.com/user-attachments/assets/b987efd6-a136-4687-8298-ef76421cbe78)
* 주문에 대한 정보만 입력해도 제품에 대한 정보도 같이 입력해야 한다.
* 제품에 대한 정보만 입력하고 싶을 때 주문에 대한 정보는 NULL 값을 가진다.
<br>![갱신 이상](https://github.com/user-attachments/assets/c277fcf1-2693-4a31-8725-fa3ffaa54290)
* 동일한 제품명을 중복되어 있는 수만큼 수정해야 한다.
* 한 번만 수정하거나 일부만 수정할 경우 일관성이 맞지 않는 문제가 발생한다.
<br>![삭제 이상](https://github.com/user-attachments/assets/5f5b303e-ae1c-4892-884f-803d5969ab95)

* 주문에 대한 정보(주문 번호, 주문 수량)를 삭제할 때 제품 번호, 제품명, 단가도 같이 삭제된다.

#### 3.2. 제 1 정규화
* 하나의 속성이 하나의 값을 갖도록 한다.
<br>![1정규화](https://github.com/user-attachments/assets/8ee6b235-ea3f-45a5-b48e-689c2acbe8d2)

#### 3.3. 제 2 정규화
* 주 식별자 전체에 종속적이지 않는 속성을 분리한다. (주 식별자가 복합 식별자일 경우)
<br>![2정규화](https://github.com/user-attachments/assets/ee672f29-6b27-4caa-a097-3d4bfb9facc7)

#### 3.4. 제 3 정규화
* 주 식별자에 종속적이지 않고 다른 속성에 종속적인 속성을 분리한다.
<br>![3정규화](https://github.com/user-attachments/assets/49e37034-4ba0-481b-9b3a-17000ecb3d2b)

### 4. 물리적 모델링
#### 4.1. 물리적 모델링
* 논리적 모델링 과정에서 표현된 데이터를 실제 데이터베이스에 맞도록 구현하는 과정이다.
  <table>
      <tr>
        <th>논리적 DB 설계</th>
        <th>물리적 DB 설계</th>
      </tr>
      <tr>
        <td>엔티티(Entity)</td>
        <td>테이블(Table)</td>
      </tr>
      <tr>
        <td>속성(Attribute)</td>
        <td>컬럼(Column)</td>
      </tr>
      <tr>
        <td>주식별자(Primary Identifier)</td>
        <td>기본키(Primary Key)</td>
      </tr>
      <tr>
        <td>외래식별자(Foreign Identifier)</td>
        <td>외래키(Foreign Key)</td>
      </tr>
      <tr>
        <td></td>
        <td>뷰(View)</td>
      </tr>
      <tr>
        <td></td>
        <td>인덱스(Index)</td>
      </tr>
  </table>
* 엔티티의 속성은 모두 테이블의 컬럼으로 생성한다.
* 주 식별자는 모두 테이블의 Primary Key로 지정한다.
* 보조 식별자는 Unique Key로 지정한다. 
* 외부 식별자는 Foreign Key로 지정한다.
* 추가로 필요한 객체(뷰, 인덱스 등)를 생성한다.
#### 4.2. 반 정규화
* 반 정규화란 이름 그대로 정규화의 반대이다.
* A 테이블과 B 테이블이 있을 때 두 테이블을 따로 분리해도 되고 합쳐도 되는 상황이라면 분리하는 것보다 합치는 것이 성능에 더 좋을 수 있다.
## 테이블(Table)
### 1. 테이블(Table)
* 테이블은 데이터베이스에서 데이터를 저장할 수 있는 핵심이 되는 개체로 행과 열로 구성되어 있다. 
### 2. 테이블 생성
* 테이블을 생성할 때는 `CREATE TABLE` 구문을 사용한다.
* DEFAULT는 값을 입력하지 않았을 때 자동으로 입력되는 기본값을 정의하는 방법이다.
* NULL 값을 허용하려면 NULL을, 허용하지 않으려면 NOT NULL을 사용하면 된다.
  ```sql
  CREATE TABLE tb_member(
    mem_no INT NOT NULL,
    ...
    enroll_date DATE DEFAULT CURDATE()
  );
  ```
### 3. 제약 조건
* 제약 조건이란 데이터의 무결성을 지키기 위한 제한된 조건을 의미한다.
* 즉, 특정 데이터를 입력할 때 무조건적으로 입력되는 것이 아닌, 어떠한 조건을 만족했을 때 입력되도록 제약할 수 있다.
* 제약 조건은 테이블 생성 시 제약조건을 설정할 수 있고 ALTER 구문을 통해서 제약조건을 설정하고, 변경, 삭제할 수 있다.
#### 3.1. PRIMARY KEY 제약 조건
* 테이블에 존재하는 많은 행의 데이터를 구분할 수 있는 식별자를 기본 키(Primary Key)라고 부른다. 
* PRIMARY KEY 제약 조건은 기본 키(Primary Key)로 사용할 열에 부여하는 제약 조건이다.
* 기본 키(Primary Key)에 입력되는 값은 중복될 수 없으며, NULL 값이 입력될 수 없다. 
  ```SQL
  CREATE TABLE tb_member (
    mem_no INT PRIMARY KEY,
    ...
  );
  ```
#### 3.2. UNIQUE 제약 조건
* UNIQUE 제약 조건은 열에 중복되지 않는 유일한 값을 입력해야 하는 조건이다.
  ```sql
  CREATE TABLE tb_member (
    mem_no INT PRIMARY KEY,
    mem_id VARCHAR(20) UNIQUE, 
    ...
  );
  ```
#### 3.3. FOREIGN KEY 제약 조건
* 두 테이블 사이의 관계를 설정하는 키를 외래 키(Foreign Key)라고 부른다.
* FOREIGN KEY 제약조건은 외래 키(Foreign Key)로 사용할 열에 부여하는 제약 조건이다.
* 외래 키(Foreign Key)로 두 테이블의 관계를 설정하면 하나의 테이블이 다른 테이블에 의존하게 된다.
* 외래 키(Foreign Key)가 있는 테이블에 데이터를 입력할 때는 부모 테이블에 이미 데이터가 존재해야 한다.
  ```sql
  CREATE TABLE tb_member_grade (
    grade_code VARCHAR(10) PRIMARY KEY,
    grade_name VARCHAR(10) NOT NULL
  );

  CREATE TABLE tb_member (
    mem_no INT PRIMARY KEY,
    mem_id VARCHAR(20) UNIQUE, 
    grade_code VARCHAR(10) REFERENCES tb_member_grade(grade_code),
    ...
  );
  ```
#### 3.4. CHECK 제약 조건
* CHECK 제약 조건은 열에 입력되는 데이터를 점검하는 기능을 한다.
* CHECK 제약 조건을 설정한 후에는 제약 조건에 위배되는 값은 열에 입력되지 않는다.
  ```sql
  CREATE TABLE tb_member (
    mem_no INT PRIMARY KEY,
    mem_id VARCHAR(20) UNIQUE, 
    gender CHAR(2) CHECK(gender IN ('남자', '여자')),
    grade_code VARCHAR(10) REFERENCES tb_member_grade(grade_code),
    ...
  );
  ```
### 4. 테이블 수정
* 테이블을 수정할 때는 `ALTER TABLE` 구문을 사용한다.
* 테이블에서 정의된 열과 제약 조건의 추가, 수정, 삭제, 이름 변경 등을 할 수 있다.
#### 4.1. 열의 추가 / 수정 / 삭제
* `ALTER`와 `ADD` 구문을 이용해서 열을 추가할 수 있다.
* 열을 추가하면 기본적으로 가장 뒤에 추가가 되는데 열을 추가하면서 순서를 지정하려면 제일 뒤에 `FIRST` 또는 `AFTER 열 이름`을 지정하면 된다.
  ```sql
  ALTER TABLE tb_member ADD age TINYINT DEFAULT 0 AFTER gender;
  ```
* `ALTER`와 `MODIFY` 구문을 이용해서 열의 데이터 타입, DEFAULT 값을 변경할 수 있다.
  ```sql
  ALTER TABLE tb_member MODIFY gender CHAR(2) DEFAULT '남자' NOT NULL;
  ```
* `ALTER`와 `RENAME COLUMN` 구문을 이용해서 열의 이름을 변경할 수 있다.
  ```sql
  ALTER TABLE tb_member RENAME COLUMN mem_no TO memNo;
  ```
* `ALTER`와 `DROP COLUMN` 구문을 이용해서 열을 삭제할 수 있다.
  ```sql
  ALTER TABLE tb_member DROP COLUMN mem_no;
  ```
#### 4.2. 열의 제약 조건 추가 / 삭제
* `ALTER`와 `ADD CONSTRAINT` 구문을 이용해서 제약조건을 추가할 수 있다.
  ```sql
  ALTER TABLE tb_member ADD CONSTRAINT PRIMARY KEY(mem_no);
  ```
* `ALTER`와 `DROP` 구문을 이용해서 제약조건을 삭제할 수 있다.
  ```sql
  ALTER TABLE tb_member DROP CONSTRAINT PRIMARY KEY; 
  ```
* 제약 조건의 수정은 불가능하기 때문에 삭제 후 다시 제약 조건을 추가해야 한다.
### 5. 테이블 삭제
* 테이블을 삭제할 때는 `DROP TABLE` 구문을 사용한다.
  ```SQL
  DROP TABLE tb_member, tb_member_grade;
  ```
## 뷰(View)
### 1. 뷰(View)
* 뷰는 테이블과 똑같은 모습을 하고 있는 가상의 테이블이다.
* 뷰는 기본적으로 읽기 전용으로 많이 사용하지만, 뷰를 통해서 테이블의 데이터를 수정할 수도 있다.
### 2. 뷰의 생성
* 뷰를 생성할 때는 `CREATE VIEW` 구문을 사용한다.
  ```sql
  CREATE [OR REPLACE] VIEW 뷰 이름 
  AS 서브 쿼리
  [WITH CHECK OPTION];
  ```
### 3. 뷰의 수정
* 뷰를 수정할 때는 `ALTER VIEW` 구문을 사용한다. 
  ``` sql
  ALTER VIEW 뷰 이름 AS 서브 쿼리;
  ```
### 4. 뷰의 삭제
* 뷰를 삭제할 때는 `DROP VIEW` 구문을 사용한다.
  ```SQL
  DROP VIEW 뷰 이름;
  ```
## 인덱스(Index)
### 1. 인덱스(Index)
* 인덱스는 테이블의 열 단위에 생성되는 데이터베이스의 개체로 데이터를 조회할 때 빠르게 접근하도록 도와주는 역할을 한다.
* 인덱스를 적절히 사용하면 시스템의 성능에 큰 도움이 되지만, 그렇지 않다면 오히려 시스템의 성능을 떨어뜨릴 수도 있다.
### 2. 인덱스의 종류
* 인덱스는 클러스터형 인덱스(Clustered Index)와 보조 인덱스(Secondary Index)가 있다.
* 클러스터형 인덱스는 테이블당 한 개만 생성할 수 있고, 보조 인덱스는 테이블당 여러 개를 생성할 수 있다.
### 3. 인덱스 생성
* `PRIMARY KEY` 제약 조건으로 지정되는 열에 자동으로 클러스터형 인덱스가 생성된다.
* `UNIQUE` 제약 조건으로 지정되는 열에 자동으로 보조 인덱스가 생성된다.
* 자동으로 생성되는 인덱스 외에 직접 인덱스를 생성하려면 `ALTER TABLE` 또는 `CREATE INDEX` 구문을 사용해야 한다.
  ```sql
  CREATE [UNIQUE] INDEX 인덱스 이름
  ON 테이블 이름(열 이름[, 열 이름, ...]);

  -- 인덱스를 분석 후 적용
  ANALYZE TABLE 테이블 이름; 
  ```
### 4. 인덱스 생성 시 주의 사항
* `WHERE`절에서 자주 사용되는 열에 인덱스를 만들어야 한다.
* 데이터의 중복도가 높은 열은 인덱스를 만들어도 별 효과가 없다.
* `JOIN`에 자주 사용되는 열에는 인덱스를 생성해 주는 것이 좋다.
* `DML(INSERT, UPDATE, DELETE)` 작업이 얼마나 자주 일어나는지를 고려해야 한다.
* 사용하지 않는 인덱스는 제거하자.
### 5. 인덱스 삭제
* 인덱스를 삭제하려면 `DROP INDEX` 구문을 사용해야 한다.
* 인덱스를 모두 제거할 때는 되도록 보조 인덱스부터 삭제하도록 한다.
* 인덱스를 수정하려면 기존 인덱스를 삭제한 후 새로운 인덱스를 생성해야 한다.
  ```sql
  DROP INDEX 인덱스 이름 ON 테이블 이름;
  ALTER TABLE 테이블 이름 DROP INDEX 인덱스 이름;
  ```
## 스토어드 프로시저(Stored Procedure)
### 1. 스토어드 프로시저(Stored Procedure)
* 스토어드 프로시저란 MariaDB에서 제공되는 프로그래밍 기능으로 복잡한 쿼리문을 다시 입력할 필요 없이 간단하게 호출해서 실행 결과를 얻을 수 있다.
### 2. 스토어드 프로시저 생성
* 프로시저를 생성하려면 `CREATE PROCEDURE` 구문을 사용해야 한다.
  ``` sql
  DELIMITER $$
  CREATE PROCEDURE 프로시저이름
  BEGIN
    -- SQL 프로그래밍 코드 작성
  END $$
  DELIMITER ;

  CALL 프로시저이름();
  ```
#### 2.1. 매개 변수의 사용
* 스토어드 프로시저에는 실행 시에 매개 변수를 지정할 수 있다.
  ``` sql
  DELIMITER $$
  CREATE PROCEDURE 프로시저이름 (
    IN|OUT 매개변수 데이터 유형,
    ...
  )
  BEGIN
    -- SQL 프로그래밍 코드 작성
  END $$
  DELIMITER ;

  CALL 프로시저이름([매개값, ...]);
  ```
#### 2.2. 제어문
* IF
  ```sql
  IF 조건식 THEN
    실행 문장
  ELSE
    실행 문장
  END IF
  ```
* CASE
  ```sql
  CASE 
    WHEN 조건식 1 THEN 실행 문장 1
    WHEN 조건식 2 THEN 실행 문장 2
    ...
    [ELSE 실행 문장]
  END CASE;
  ```
#### 2.3. 반복문
* WHILE
  ```sql
  WHILE 조건식 DO
    실행 문장
  END WHILE;
  ```
#### 3.4. 오류 처리
* MariaDB는 오류가 발생할 경우 직접 오류를 처리하는 방법을 제공한다.
  ``` SQL
  DELIMITER $$
  CREATE PROCEDURE errorProc()
  BEGIN
      DECLARE CONTINUE HANDLER FOR 1146 SELECT '테이블이 없어요ㅠㅠ' AS '메시지';
      SELECT * FROM noTable;
  END $$
  DELIMITER ;
  CALL errorProc();
  ```
### 6. 프로시저 삭제
* 프로시저를 삭제하려면 `DROP PROCEDURE` 구문을 사용해야 한다.
  ```sql
  DROP PROCEDURE 프로시저이름;
  ```
## 트리거(Trigger)
### 1. 트리거(Trigger)
* 트리거는 테이블에 삽입, 수정, 삭제 등의 작업이 발생할 때 자동으로 작동되는 개체이다.
### 2. 트리거의 종류
* 테이블에 삽입, 수정, 삭제 작업 후에 작동하는 트리거를 `AFTER 트리거`라 한다.
* 테이블에 삽입, 수정, 삭제 작업 전에 작동하는 트리거를 `BEFORE 트리거`라 한다.
### 3. 트리거 생성
* 트리거를 생성하려면 `CREATE TRIGGER` 구문을 사용해야 한다.
  ```sql
  DELIMITER $$
  CREATE [OR REPLACE] TRIGGER 트리거명
  BEFORE|AFTER INSERT|UPDATE|DELETE ON 테이블명
  FOR EACH ROW
  BEGIN
      -- SQL 프로그래밍 코드 작성
  END $$
  DELIMITER ;
  ```
### 4. 트리거 삭제
* 트리거를 삭제하려면 `DROP TRIGGER` 구문을 사용해야 한다.
  ```sql
  DROP TRIGGER 트리거 이름;
  ```
