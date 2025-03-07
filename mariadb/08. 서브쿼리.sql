-- 서브 쿼리 실습
--  하나의 SQL 문 안에 포함된 또 다른 SQL 문을 서브 쿼리라 한다.

-- 서브 쿼리 예시
-- 노옹철 사원과 같은 부서원들을 조회
-- 1) 노옹철 사원의 부서 코드를 조회
SELECT emp_name, 
		 dept_code
FROM employee
WHERE emp_name = '노옹철';

-- 2) 부서 코드가 노옹철 사원의 부서 코드와 동일한 사원들을 조회
SELECT emp_name,
		 dept_code
FROM employee
WHERE dept_code = 'D9';

-- 3) 위의 2단계를 서브 쿼리를 사용하여 하나의 쿼리문으로 작성
SELECT emp_name,
		 dept_code
FROM employee
WHERE dept_code = (
	SELECT dept_code
	FROM employee
	WHERE emp_name = '노옹철'
);

-- 서브 쿼리 구분
-- 서브 쿼리는 서브 쿼리를 수행한 결과값의 행과 열의 개수에 따라서 분류할 수 있다.

-- 1) 단일행 서브 쿼리
--   서브 쿼리의 조회 결과 값의 개수가 1개일 때

-- 전 직원의 평균 급여보다 더 많은 급여를 받고 있는 직원들의 
-- 사번, 직원명, 직급 코드, 급여를 조회
SELECT emp_id, 
		 emp_name, 
		 job_code, 
		 salary
FROM employee
WHERE salary >= (
	SELECT AVG(salary)
	FROM employee
);

-- 노옹철 사원의 급여보다 더 많이 받는 사원의 사번, 직원명, 부서명, 급여 조회
SELECT e.emp_id,
		 e.emp_name,
		 d.dept_title,
		 e.salary
FROM employee e
INNER JOIN department d ON e.dept_code = d.dept_id
WHERE e.salary > (
	SELECT salary
	FROM employee
	WHERE emp_name = '노옹철'
);

-- 2) 다중행 서브 쿼리
--   서브 쿼리의 조회 결과 값의 개수가 여러 행 일 때

-- 각 부서별 최고 급여를 받는 직원의 이름, 직급 코드, 부서 코드, 급여 조회
-- 부서별 최고 급여 조회
SELECT MAX(salary)
FROM employee
GROUP BY dept_code; -- (2890000, 3660000, 2490000, 3760000, 3900000, 2550000, 8000000)

-- 위 급여를 받는 사원들을 조회
SELECT emp_name,
		 job_code,
		 dept_code,
		 salary
FROM employee
-- WHERE salary IN (2890000, 3660000, 2490000, 3760000, 3900000, 2550000, 8000000)
WHERE salary IN (
	SELECT MAX(salary)
	FROM employee
	GROUP BY dept_code
)
ORDER BY dept_code;

-- 직원들의 사번, 직원명, 부서 코드, 구분(사원/사수) 조회
-- 사수에 해당하는 사번을 조회
SELECT DISTINCT manager_id
FROM employee
WHERE manager_id IS NOT NULL; -- (200, 201, 204, 207, 211, 214, 100)

-- SELECT 절에 서브 쿼리를 사용하는 방법
SELECT emp_id AS '사번',
		 emp_name AS '직원명',
		 dept_code AS '부서 코드',
		 CASE
		 	-- WHEN emp_id IN (200, 201, 204, 207, 211, 214, 100) THEN '사수'
		 	WHEN emp_id IN (
				SELECT DISTINCT manager_id
				FROM employee
				WHERE manager_id IS NOT NULL 
			) THEN '사수'
		 	ELSE '사원'
		 END AS '구분'
FROM employee;

-- 대리 직급임에도 과장 직급들의 최소 급여보다 많이 받는
-- 직원의 사번, 이름, 직급 코드, 급여 조회

-- 과장 직급들의 급여 조회
SELECT salary
FROM employee
WHERE job_code = 'J5'; -- (2200000, 2500000, 3760000)

-- ANY는 서브 쿼리의 결과 중 하나라도 조건을 만족하면 참이된다.
SELECT emp_id,
		 emp_name,
		 job_code,
		 salary
FROM employee
WHERE job_code = 'J6'
  -- salary > 200만 OR salary > 250만 OR salary > 376만
  AND salary > ANY (
	  	SELECT salary
		FROM employee
		WHERE job_code = 'J5'
  );

-- 과장 직급임에도 차장 직급의 최대 급여보다 더 많이 받는 
-- 직원의 사번, 이름, 직급 코드, 급여 조회

-- 차장 직급들의 급여 조회
SELECT salary
FROM employee
WHERE job_code = 'J4'; -- (2800000, 1550000, 2490000, 2480000)

-- ALL은 서브 쿼리의 결과 모두가 조건을 만족하면 참이된다.
SELECT emp_id, 
		 emp_name, 
		 job_code, 
		 salary
FROM employee
WHERE job_code = 'J5'
  -- salary > 280만 AND salary > 155만 AND salary > 249만 AND salary > 248
  AND salary > ALL (
		SELECT salary
		FROM employee
		WHERE job_code = 'J4'
  );

-- 3) 다중열 서브 쿼리
--   서브 쿼리의 조회 결과 값은 한 행이지만 열의 수가 여러개 일 때

-- 하이유 사원과 같은 부서 코드, 같은 직급 코드에 해당하는 사원들을 조회
-- 하이유 사원의 부서 코드와 직급 코드를 조회
SELECT dept_code, job_code
FROM employee
WHERE emp_name = '하이유'; -- ('D5', 'J5')

-- 부서 코드가 D5이면서 직급 코드가 J5인 사원들을 조회
SELECT emp_name,
		 dept_code,
		 job_code
FROM employee
-- WHERE dept_code = 'D5' AND job_code = 'J5';
-- WHERE (dept_code, job_code) = ('D5', 'J5');
WHERE (dept_code, job_code) IN (('D5', 'J5'));

-- 다중열 서브 쿼리를 사용해서 작성하는 방법
SELECT emp_name,
		 dept_code,
		 job_code
FROM employee
WHERE (dept_code, job_code) IN (
	SELECT dept_code, job_code
	FROM employee
	WHERE emp_name = '하이유'
);

-- 박나라 사원과 직급 코드가 일치하면서 같은 사수를 가지고 있는 
-- 사원들의 사번, 직원명, 직급 코드, 사수 사번 조회

-- 박나라 사원의 직급 코드와 사수의 사번을 조회
SELECT job_code, 
		 manager_id
FROM employee
WHERE emp_name = '박나라'; -- ('J7', 207)

-- 다중열 서브 쿼리를 사용해서 쿼리를 작성
SELECT emp_id,
		 emp_name,
		 job_code,
		 manager_id
FROM employee
WHERE (job_code, manager_id) = (
	SELECT job_code, 
			 manager_id
	FROM employee
	WHERE emp_name = '박나라'
);


-- 4) 다중행 다중열 서브 쿼리
--   서브 쿼리의 조회 결과값이 여러 행, 여러 열 일 때

-- 각 부서별 최고 급여를 받는 직원의 사번, 직원명, 부서 코드, 급여 조회
-- 각 부서별 최고 급여 조회
SELECT dept_code, 
		 MAX(salary)
FROM employee
GROUP BY dept_code; -- ('D1', 3660000), ('D2', 2490000), ...

-- 각 부서별 최고 급여를 받는 직원들을 조회
SELECT emp_id,
		 emp_name,
		 dept_code,
		 salary
FROM employee
-- WHERE dept_code = 'D1' AND salary = 3660000
--    OR dept_code = 'D2' AND salary = 2490000;
WHERE (dept_code, salary) IN (('D1', 3660000), ('D2', 2490000));

-- 다중행, 다중열 서브 쿼리를 사용해서 조회
SELECT emp_id,
		 emp_name,
		 IFNULL(dept_code, '부서 없음') AS 'dept_code',
		 salary
FROM employee
WHERE (IFNULL(dept_code, '부서 없음'), salary) IN (
	SELECT IFNULL(dept_code, '부서 없음'), 
			 MAX(salary)
	FROM employee
	GROUP BY dept_code
)
ORDER BY dept_code;

-- 각 직급별로 최소 급여를 받는 사원들의 사번, 직원명, 직급 코드, 급여 조회

-- 각 직급별 최소 급여 조회
SELECT job_code, MIN(salary)
FROM employee
GROUP BY job_code;

-- 다중행 다중열 서브 쿼리를 사용해서 조회
SELECT emp_id,
		 emp_name,
		 job_code,
		 salary
FROM employee
WHERE (job_code, salary) IN (
	SELECT job_code, MIN(salary)
	FROM employee
	GROUP BY job_code
)
ORDER BY job_code;

-- 인라인 뷰
-- FROM 절에 서브 쿼리를 작성하고
-- 서브 쿼리를 수행한 결과를 테이블 대신에 사용한다.
SELECT e.사번,
		 e.이름,
		 e.급여,
		 e.연봉
FROM (
	SELECT emp_id AS '사번',
			 emp_name AS '이름',
			 salary AS '급여',
			 salary * 12 AS '연봉'
   FROM employee
) e;

-- employee 테이블에서 급여로 순위를 매겨서 출력
SELECT e.num,
		 e.emp_name,
		 e.salary
FROM (
	SELECT ROW_NUMBER() OVER(ORDER BY salary DESC) AS 'num',
		 	 emp_name,
		 	 salary
	FROM employee
) e
WHERE e.num BETWEEN 6 AND 10;