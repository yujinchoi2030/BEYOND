-- 테이블 수정 실습
-- 1. 열의 추가, 수정, 삭제
-- 1) 열의 추가
-- usertbl 테이블에 homepage 열을 추가
ALTER TABLE usertbl ADD homepage VARCHAR(30);

-- usertbl 테이블에 gender 열을 추가 (단, 기본값을 남자로 지정)
ALTER TABLE usertbl ADD gender CHAR(2) DEFAULT '남자' NOT NULL;

-- usertbl 테이블에 age 열을 추가 (단, 기본값은 0으로, birthYear 뒤에 생성)
ALTER TABLE usertbl ADD age TINYINT DEFAULT 0 AFTER birthYear;

-- 2) 열의 수정
-- usertbl 테이블에서 name 열의 데이터 유형을 CHAR(15)로 변경
ALTER TABLE usertbl MODIFY NAME CHAR(15) NULL;

-- usertbl 테이블에서 name 열의 데이터 유형을 CHAR(1)로 변경
-- 변경하려는 데이터 유형의 크기보다 이미 큰 값이 존재하기 때문에 에러 발생
ALTER TABLE usertbl MODIFY NAME CHAR(1) NOT NULL;

-- usertbl 테이블에서 name 열의 데이터 유형을 INT로 변경
-- 이미 name에 문자열이 저장되어 있기 때문에 에러 발생
ALTER TABLE usertbl MODIFY NAME INT NOT NULL;

-- usertbl 테이블에서 homepage 열의 데이터 유형을 INT로 변경
-- 값이 없으면 문자 타입을 정수 타입으로 변경이 가능하다.
ALTER TABLE usertbl MODIFY homepage INT;

-- usertbl 테이블에서 name 열의 이름을 uname으로 변경
ALTER TABLE usertbl RENAME COLUMN NAME TO uname;

-- 위 내용을 한 번에 변경
ALTER TABLE usertbl CHANGE COLUMN NAME uname VARCHAR(20) DEFAULT '없음' NOT NULL;

-- 3) 열의 삭제
-- usertbl 테이블에서 age, homepage, gender 열을 삭제
ALTER TABLE usertbl DROP COLUMN age;
ALTER TABLE usertbl DROP COLUMN homepage;
ALTER TABLE usertbl DROP COLUMN gender;

-- 참조되고 있는 열이 있다면 삭제가 불가능하다.
-- 제약 조건을 삭제하거나 참조하는 열이 없도록 한 후에 삭제해야 한다.
ALTER TABLE usertbl DROP COLUMN userid;

-- 2. 열의 제약 조건 추가, 삭제
-- 테스트 테이블 삭제 후 생성
DROP TABLE tb_member, tb_member_grade;

CREATE TABLE tb_member_grade (
	grade_code VARCHAR(10),
	grade_name VARCHAR(10) NOT NULL
);

CREATE TABLE tb_member (
	mem_no INT,
	mem_id VARCHAR(20) NOT NULL,
	mem_pass VARCHAR(20) NOT NULL,
	mem_name VARCHAR(15) NOT NULL,
	enroll_date DATE DEFAULT CURDATE()
);

-- 1) 제약 조건 추가
-- tb_member_grade 테이블에 PRIMARY KEY 제약 조건 추가
ALTER TABLE tb_member_grade ADD CONSTRAINT PRIMARY KEY(grade_code);

-- tb_member 테이블에 PRIMARY KEY 제약 조건, AUTO_INCREMENT 설정 추가
ALTER TABLE tb_member ADD CONSTRAINT PRIMARY KEY(mem_no);
ALTER TABLE tb_member MODIFY mem_no INT AUTO_INCREMENT;

-- tb_member 테이블에 UNIQUE 제약 조건을 추가
ALTER TABLE tb_member ADD CONSTRAINT un_tb_member_mem_id UNIQUE(mem_id);

-- tb_member 테이블에 외래 키 열을 생성 후 FOREIGN KEY 제약 조건 추가
ALTER TABLE tb_member ADD grade_code VARCHAR(10) AFTER mem_name;
ALTER TABLE tb_member ADD CONSTRAINT fk_tb_member_grade_code 
FOREIGN KEY(grade_code) REFERENCES tb_member_grade(grade_code);

-- tb_member 테이블에 gender 열 생성 후 CHECK 제약 조건 추가
ALTER TABLE tb_member ADD gender CHAR(2) AFTER mem_name;
ALTER TABLE tb_member ADD CONSTRAINT CHECK(gender = '남자' OR gender = '여자');

-- tb_member 테이블에 age 열 생성 후 CHECK 제약 조건 추가
ALTER TABLE tb_member ADD age TINYINT AFTER gender;
ALTER TABLE tb_member ADD CONSTRAINT ck_tb_member_age CHECK(age BETWEEN 0 AND 150);

-- 실습
-- employee 테이블의 emp_id 열에 PRIMARY KEY 제약 조건 추가
ALTER TABLE employee ADD CONSTRAINT PRIMARY KEY(emp_id);

-- employee 테이블의 emp_no 열에 UNIQUE 제약 조건 추가
ALTER TABLE employee ADD CONSTRAINT UNIQUE(emp_no);

-- employee 테이블의 dept_code열에 FOREIGN KEY 제약 조건 추가
ALTER TABLE employee ADD CONSTRAINT FOREIGN KEY(dept_code)
REFERENCES department(dept_id);

-- employee 테이블의 job_code 열에 FOREIGN KEY 제약 조건 추가
ALTER TABLE employee ADD CONSTRAINT FOREIGN KEY(job_code) REFERENCES job;

-- department 테이블의 location_id 열에 FOREIGN KEY 제약 조건 추가
ALTER TABLE department ADD CONSTRAINT FOREIGN KEY(location_id)
REFERENCES location(local_code);

-- location 테이블의 national_code 열에 FOREIGN KEY 제약 조건 추가
ALTER TABLE location ADD CONSTRAINT FOREIGN KEY(national_code)
REFERENCES national(national_code);

-- 2) 제약 조건 삭제
-- tb_member 테이블에 PRIMARY KEY 제약 조건 삭제
ALTER TABLE tb_member MODIFY mem_no INT; -- AUTO_INCREMENT 해제
ALTER TABLE tb_member DROP CONSTRAINT PRIMARY KEY;

-- tb_member 테이블에 UNIQUE 제약 조건 삭제
ALTER TABLE tb_member DROP CONSTRAINT un_tb_member_mem_id;

-- tb_member 테이블에 FOREIGN KEY 제약 조건 삭제
ALTER TABLE tb_member DROP CONSTRAINT fk_tb_member_grade_code;

-- tb_member_grade 테이블에 PRIMARY KEY 제약 조건 삭제
ALTER TABLE tb_member_grade DROP CONSTRAINT PRIMARY KEY;

-- tb_member 테이블에 CHECK 제약 조건 삭제
ALTER TABLE tb_member DROP CONSTRAINT CONSTRAINT_1;
ALTER TABLE tb_member DROP CONSTRAINT ck_tb_member_age;

-- 테이블 삭제
DROP TABLE tb_member;
DROP TABLE tb_member_grade;
DROP TABLE tb_member, tb_member_grade;

-- 테이블 이름 변경
RENAME TABLE salary_grade TO sal_grade;