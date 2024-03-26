-- MAJOR 테이블 생성
CREATE TABLE edu_ella_major (
majorId BIGINT auto_increment primary key,
majorName VARCHAR(50) NOT NULL,
professor VARCHAR(50) NOT NULL
);

-- 데이터 생성
-- 1. 물리학과, 아인슈타인
-- 2. 화학공학과, 프리츠 하버
-- 3. 컴퓨터공학과, 앨런 튜링
-- 4. 체육학과, 김연아
-- 5. 수학과, 피타고라스
-- 6. 물리학과, 오펜하이머
-- 7. 화학공학과, 오펜하이머
-- 8. 수학과, 레온하르트 오일러
-- 9. 컴퓨터공학과, 빌 조이
-- 10. 체육학과, 박지성

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('물리학과', '아인슈타인');

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('화학공학과', '프리츠 하버');

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('컴퓨터공학과', '앨런 튜링');

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('체육학과', '김연아');

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('수학과', '피타고라스');

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('물리학과', '오펜하이머');

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('화학공학과', '오펜하이머');

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('수학과', '레온하르트 오일러');

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('컴퓨터공학과', '빌 조이');

INSERT INTO edu_ella_major (majorName, professor)
VALUES ('체육학과', '박지성');

-- majorId 컬럼 추가
ALTER TABLE edu_ella_student ADD majorId BIGINT NULL;

UPDATE edu_ella_student
SET majorId = (id = 2)
WHERE id % 2 = 5;

UPDATE edu_ella_student
SET majorId = (
SELECT majorId
FROM edu_ella_major
WHERE majorId = 1
-- WHERE majorName = '체육학과' AND edu_ella_major.professor = '박지성'
)
WHERE edu_ella_student.id%10 = 1;

-- JOIN
SELECT *
FROM edu_ella_student ees INNER JOIN edu_ella_major eem
ON ees.majorId = eem.majorId;

-- 화학공학과 학생들의 학번들 조회
SELECT id, majorName
FROM edu_ella_major m JOIN edu_ella_student s
ON m.majorId = s.majorId
WHERE m.majorName = '화학공학과';

-- 문제 오펜하이머의 수업을 듣는 재학생들 이름, 성별, 나이, 전화번호
SELECT name, gender, age, mobile
FROM edu_ella_major eem JOIN edu_ella_student ees
ON eem.majorId = ees.majorId
WHERE eem.professor = '오펜하이머' AND ees.isGraduated = 0;

-- 문제 앨런 튜링의 컴퓨터공학수업을 들은 졸업생의 전공id, 학번, 전공명, 이름, 성별, 나이, 전화번호
SELECT eem.majorId, id, majorName, name, gender, age, mobile
FROM edu_ella_major eem JOIN edu_ella_student ees
ON eem.majorId = ees.majorId
WHERE eem.professor = '앨런 튜링' AND eem.majorName = '컴퓨터공학과' AND ees.isGraduated = 1;

-- 신입생 추가 DML
INSERT INTO edu_ella_student(name, gender, age, isGraduated)
SELECT name, gender, age, 0
FROM edu_echo2_student;

-- 학번 짝수인 신입생들은 피타고라스의 수학 강의가 필수라 할당해주어함 (createtime 활용)
SELECT * FROM edu_ella_student ees WHERE ees.createtime  > '2024-03-26 22:26:00' AND id % 2 = 0;

UPDATE edu_ella_student
SET majorId = 5
WHERE createtime  > '2024-03-26 22:26:00' AND id % 2 = 0;

-- INNER JOIN major가 있는 신입생만 조회
SELECT *
FROM edu_ella_student ees INNER JOIN edu_ella_major eem
ON eem.majorId = ees.majorId
-- WHERE eem.professor = '피타고라스' AND createtime  > '2024-03-26 22:26:00';
WHERE createtime  > '2024-03-26 22:26:00';

-- LEFT JOIN major가 없는 신입생도 모두 조회
SELECT *
FROM edu_ella_student ees LEFT JOIN edu_ella_major eem
ON eem.majorId = ees.majorId
WHERE createtime  > '2024-03-26 22:26:00';

-- LEFT OUTER JOIN major가 없는 신입생만 조회
SELECT *
FROM edu_ella_student ees LEFT JOIN edu_ella_major eem
ON eem.majorId = ees.majorId
WHERE createtime  > '2024-03-26 22:26:00'
AND ees.majorId  IS NULL;
-- OUTER 는 OUTER 조건을 넣어줌