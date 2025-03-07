-- 데이터베이스 생성
CREATE DATABASE web;

-- beyond 사용자에 web 데이터베이스에 대해 모든 권한을 부여
GRANT ALL PRIVILEGES ON web.* TO `beyond`@`%`;

-- 권한 확인
SHOW GRANTS FOR `beyond`@`%`;

-- 권한 적용
FLUSH PRIVILEGES;

-- 회원 관련 테이블
CREATE TABLE `user` (
    `no` INT AUTO_INCREMENT PRIMARY KEY,
    `id` VARCHAR(30) NOT NULL UNIQUE,
    `password` VARCHAR(100) NOT NULL,
    `role` VARCHAR(10) DEFAULT 'ROLE_USER',
    `name` VARCHAR(15) NOT NULL,
    `phone` VARCHAR(13),
    `email` VARCHAR(100),
    `address` VARCHAR(100),
    `hobby` VARCHAR(100),
    `status` CHAR(1) DEFAULT 'Y' CHECK(STATUS IN('Y', 'N')),
    `enroll_date` DATE DEFAULT CURDATE(),
    `modify_date` DATE DEFAULT CURDATE()
);

-- 테스트 데이터 삽입
INSERT INTO `user` (`id`, `password`, `role`, `name`, `phone`, `email`, `address`, `hobby`) 
VALUES('admin', '1234', 'ROLE_ADMIN', '관리자', '01023234341', 'admin@gmail.com', '서울특별시', NULL);

-- 데이터 조회
SELECT * FROM user
WHERE id = 'admin' AND status ='Y';

-- 멤버 조회
-- SELECT * FROM user WHERE id=? AND status='Y'

-- 멤버 추가
-- INSERT INTO user VALUES(NULL, ?,?,DEFAULT,?,?,?,?,?,DEFAULT,DEFAULT,DEFAULT)

-- 멤버 수정               
-- UPDATE user SET name =?,phone=?,email=?,address=?,hobby=?,modify_date=CURDATE() WHERE no=?

-- 멤버 삭제
-- DELETE FROM user WHERE no = ?
-- UPDATE user SET status=? WHERE no=?
