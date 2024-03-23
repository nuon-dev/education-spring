-- 학생 테이블
CREATE TABLE tmdwo07278.edu_ella_student (
id BIGINT auto_increment NOT NULL,
name varchar(100) NOT NULL,
gender varchar(20) NOT NULL,
age INT NOT NULL,
isGraduated TINYINT DEFAULT 0 NOT NULL,
createtime datetime DEFAULT now() NOT NULL,
lastModifiedTime datetime NULL,
CONSTRAINT edu_echo_student_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_general_ci; -- 실행 방법: ctrl+enter

-- 데이터 조회 DML
-- SELECT (조회)
SELECT *
FROM edu_ella_student;

SELECT *
FROM edu_ella_student
WHERE id <= 10;

SELECT *
FROM edu_ella_student
WHERE gender = 'MALE';

-- 교집합 AND 합집합 OR
SELECT *
FROM edu_ella_student
WHERE gender = 'MALE' AND age <= 25;

SELECT name, gender, age
FROM edu_ella_student
WHERE id = 3;

SELECT *
FROM edu_ella_student
WHERE id >= 30 AND id < 50;

SELECT *
FROM edu_ella_student
WHERE name = 'Nelle Harrington';

SELECT *
FROM edu_ella_student
WHERE gender = 'FEMALE' AND age = 23 AND isGraduated = 1;

-- GROUP BY
-- 학생 몇명인지 전체 조회
SELECT COUNT(1) as cnt
FROM edu_ella_student;

-- 재학중인 학생 몇명인지 조회
SELECT COUNT(1) as cnt
FROM edu_ella_student
WHERE isGraduated = 0;

-- 여학생 수
SELECT COUNT(1) as cnt
FROM edu_ella_student
WHERE gender = 'FEMALE';

-- 나이별 학생수
SELECT age, COUNT(1) as cnt
FROM edu_ella_student
GROUP BY age;

-- 나이별 성별별 학생수
SELECT age, gender, COUNT(1) as cnt
FROM edu_ella_student
GROUP BY age, gender;

SELECT SUM(age) as sum
FROM edu_ella_student;

SELECT gender, COUNT(1) as cnt, SUM(age) as sum, AVG(age) as avg
FROM edu_ella_student
GROUP BY gender;

-- 문제1 나이가 24살 이상인 남학생 중 졸업하지 않은 학생수를 구하세요
SELECT COUNT(1) as cnt
FROM edu_ella_student
WHERE age >= 24 AND gender = 'MALE' AND isGraduated = 0;

-- 문제2 나이가 24살 이상인 학생 중 졸업하지 않은 학생 수, 나이의 합, 나이의 평균을 구하세요. (COUNT 함수, SUM 함수, AVG함수 사용)
SELECT COUNT(1) as cnt, SUM(age) as sum, AVG(age) as avg
FROM edu_ella_student
WHERE age >= 24 AND isGraduated = 0;


-- INSERT 입력
INSERT INTO edu_ella_student (id, name, gender, age, isGraduated, createtime, lastModifiedTime)
SELECT id, name, gender, age, isGraduated, createtime, lastModifiedTime
FROM edu_echo_student;

-- ALTER
ALTER TABLE edu_ella_student ADD mobile varchar(20) NULL;

-- UPDATE
-- UPDATE 테이블명
-- SET 컬럼명 = 수정할값 -- 모든 데이터가 수정할 값으로 변경됨

UPDATE edu_ella_student SET mobile = '010-1482-8471' WHERE id = 1;
UPDATE edu_ella_student SET mobile = '010-5484-5085' WHERE id = 2;
UPDATE edu_ella_student SET mobile = '010-2423-6715' WHERE id = 3;
UPDATE edu_ella_student SET mobile = '010-7378-1525' WHERE id = 4;
UPDATE edu_ella_student SET mobile = '010-2511-8610' WHERE id = 5;
UPDATE edu_ella_student SET mobile = '010-3735-0305' WHERE id = 6;
UPDATE edu_ella_student SET mobile = '010-0712-6848' WHERE id = 7;
UPDATE edu_ella_student SET mobile = '010-0558-3572' WHERE id = 8;
UPDATE edu_ella_student SET mobile = '010-2176-1371' WHERE id = 9;
UPDATE edu_ella_student SET mobile = '010-1556-7041' WHERE id = 10;
UPDATE edu_ella_student SET mobile = '010-2798-4301' WHERE id = 11;
UPDATE edu_ella_student SET mobile = '010-9375-7774' WHERE id = 12;
UPDATE edu_ella_student SET mobile = '010-5467-1379' WHERE id = 13;
UPDATE edu_ella_student SET mobile = '010-8288-6982' WHERE id = 14;
UPDATE edu_ella_student SET mobile = '010-8543-6661' WHERE id = 15;
UPDATE edu_ella_student SET mobile = '010-5462-4843' WHERE id = 16;
UPDATE edu_ella_student SET mobile = '010-5106-5420' WHERE id = 17;
UPDATE edu_ella_student SET mobile = '010-6649-8887' WHERE id = 18;
UPDATE edu_ella_student SET mobile = '010-8181-8652' WHERE id = 19;
UPDATE edu_ella_student SET mobile = '010-7117-5654' WHERE id = 20;
UPDATE edu_ella_student SET mobile = '010-5813-3690' WHERE id = 21;
UPDATE edu_ella_student SET mobile = '010-3547-4360' WHERE id = 22;
UPDATE edu_ella_student SET mobile = '010-9210-6747' WHERE id = 23;
UPDATE edu_ella_student SET mobile = '010-5409-2612' WHERE id = 24;
UPDATE edu_ella_student SET mobile = '010-6257-4484' WHERE id = 25;
UPDATE edu_ella_student SET mobile = '010-6702-9042' WHERE id = 26;
UPDATE edu_ella_student SET mobile = '010-3773-0794' WHERE id = 27;
UPDATE edu_ella_student SET mobile = '010-7886-7324' WHERE id = 28;
UPDATE edu_ella_student SET mobile = '010-1865-3006' WHERE id = 29;
UPDATE edu_ella_student SET mobile = '010-0867-3997' WHERE id = 30;
UPDATE edu_ella_student SET mobile = '010-9284-3550' WHERE id = 31;
UPDATE edu_ella_student SET mobile = '010-5611-6115' WHERE id = 32;
UPDATE edu_ella_student SET mobile = '010-7425-7272' WHERE id = 33;
UPDATE edu_ella_student SET mobile = '010-2281-6742' WHERE id = 34;
UPDATE edu_ella_student SET mobile = '010-4871-7316' WHERE id = 35;
UPDATE edu_ella_student SET mobile = '010-8736-0285' WHERE id = 36;
UPDATE edu_ella_student SET mobile = '010-4710-6681' WHERE id = 37;
UPDATE edu_ella_student SET mobile = '010-6499-5652' WHERE id = 38;
UPDATE edu_ella_student SET mobile = '010-2744-4174' WHERE id = 39;
UPDATE edu_ella_student SET mobile = '010-2055-8439' WHERE id = 40;
UPDATE edu_ella_student SET mobile = '010-4260-8655' WHERE id = 41;
UPDATE edu_ella_student SET mobile = '010-6383-7699' WHERE id = 42;
UPDATE edu_ella_student SET mobile = '010-7473-2859' WHERE id = 43;
UPDATE edu_ella_student SET mobile = '010-5869-6258' WHERE id = 44;
UPDATE edu_ella_student SET mobile = '010-2053-8815' WHERE id = 45;
UPDATE edu_ella_student SET mobile = '010-3454-8741' WHERE id = 46;
UPDATE edu_ella_student SET mobile = '010-8707-2255' WHERE id = 47;
UPDATE edu_ella_student SET mobile = '010-1513-8461' WHERE id = 48;
UPDATE edu_ella_student SET mobile = '010-1955-3903' WHERE id = 49;
UPDATE edu_ella_student SET mobile = '010-2203-5224' WHERE id = 50;
UPDATE edu_ella_student SET mobile = '010-1427-3277' WHERE id = 51;
UPDATE edu_ella_student SET mobile = '010-6554-0039' WHERE id = 52;
UPDATE edu_ella_student SET mobile = '010-7725-7901' WHERE id = 53;
UPDATE edu_ella_student SET mobile = '010-1646-6672' WHERE id = 54;
UPDATE edu_ella_student SET mobile = '010-2838-5736' WHERE id = 55;
UPDATE edu_ella_student SET mobile = '010-0920-5643' WHERE id = 56;
UPDATE edu_ella_student SET mobile = '010-0824-5719' WHERE id = 57;
UPDATE edu_ella_student SET mobile = '010-6352-8372' WHERE id = 58;
UPDATE edu_ella_student SET mobile = '010-5528-4133' WHERE id = 59;
UPDATE edu_ella_student SET mobile = '010-7655-1248' WHERE id = 60;
UPDATE edu_ella_student SET mobile = '010-6879-8692' WHERE id = 61;
UPDATE edu_ella_student SET mobile = '010-1744-2435' WHERE id = 62;
UPDATE edu_ella_student SET mobile = '010-4484-2641' WHERE id = 63;
UPDATE edu_ella_student SET mobile = '010-2071-0238' WHERE id = 64;
UPDATE edu_ella_student SET mobile = '010-6171-2550' WHERE id = 65;
UPDATE edu_ella_student SET mobile = '010-4676-6226' WHERE id = 66;
UPDATE edu_ella_student SET mobile = '010-9575-5337' WHERE id = 67;
UPDATE edu_ella_student SET mobile = '010-8235-4013' WHERE id = 68;
UPDATE edu_ella_student SET mobile = '010-9935-1622' WHERE id = 69;
UPDATE edu_ella_student SET mobile = '010-0112-6555' WHERE id = 70;
UPDATE edu_ella_student SET mobile = '010-5670-0451' WHERE id = 71;
UPDATE edu_ella_student SET mobile = '010-7474-3511' WHERE id = 72;
UPDATE edu_ella_student SET mobile = '010-4466-1646' WHERE id = 73;
UPDATE edu_ella_student SET mobile = '010-6319-5162' WHERE id = 74;
UPDATE edu_ella_student SET mobile = '010-2355-8394' WHERE id = 75;
UPDATE edu_ella_student SET mobile = '010-6193-9857' WHERE id = 76;
UPDATE edu_ella_student SET mobile = '010-8187-8256' WHERE id = 77;
UPDATE edu_ella_student SET mobile = '010-8839-6579' WHERE id = 78;
UPDATE edu_ella_student SET mobile = '010-4572-8161' WHERE id = 79;
UPDATE edu_ella_student SET mobile = '010-4248-9248' WHERE id = 80;
UPDATE edu_ella_student SET mobile = '010-2774-3134' WHERE id = 81;
UPDATE edu_ella_student SET mobile = '010-7196-4676' WHERE id = 82;
UPDATE edu_ella_student SET mobile = '010-5607-3403' WHERE id = 83;
UPDATE edu_ella_student SET mobile = '010-0669-7717' WHERE id = 84;
UPDATE edu_ella_student SET mobile = '010-2273-4568' WHERE id = 85;
UPDATE edu_ella_student SET mobile = '010-4101-1272' WHERE id = 86;
UPDATE edu_ella_student SET mobile = '010-4938-6118' WHERE id = 87;
UPDATE edu_ella_student SET mobile = '010-9755-3221' WHERE id = 88;
UPDATE edu_ella_student SET mobile = '010-9553-1283' WHERE id = 89;
UPDATE edu_ella_student SET mobile = '010-3852-7541' WHERE id = 90;
UPDATE edu_ella_student SET mobile = '010-4063-1155' WHERE id = 91;
UPDATE edu_ella_student SET mobile = '010-7772-8652' WHERE id = 92;
UPDATE edu_ella_student SET mobile = '010-2152-8348' WHERE id = 93;
UPDATE edu_ella_student SET mobile = '010-0998-0270' WHERE id = 94;
UPDATE edu_ella_student SET mobile = '010-3321-1648' WHERE id = 95;
UPDATE edu_ella_student SET mobile = '010-5508-2747' WHERE id = 96;
UPDATE edu_ella_student SET mobile = '010-3158-6555' WHERE id = 97;
UPDATE edu_ella_student SET mobile = '010-2092-1483' WHERE id = 98;
UPDATE edu_ella_student SET mobile = '010-5567-5795' WHERE id = 99;
UPDATE edu_ella_student SET mobile = '010-2892-5650' WHERE id = 100;
UPDATE edu_ella_student SET mobile = '010-3746-6230' WHERE id = 101;
UPDATE edu_ella_student SET mobile = '010-1734-6723' WHERE id = 102;
UPDATE edu_ella_student SET mobile = '010-3846-4357' WHERE id = 103;
UPDATE edu_ella_student SET mobile = '010-5460-6595' WHERE id = 104;
UPDATE edu_ella_student SET mobile = '010-6184-6237' WHERE id = 105;
UPDATE edu_ella_student SET mobile = '010-8502-5155' WHERE id = 106;
UPDATE edu_ella_student SET mobile = '010-6630-1161' WHERE id = 107;
UPDATE edu_ella_student SET mobile = '010-1250-5331' WHERE id = 108;
UPDATE edu_ella_student SET mobile = '010-1236-7363' WHERE id = 109;
UPDATE edu_ella_student SET mobile = '010-2247-3681' WHERE id = 110;
UPDATE edu_ella_student SET mobile = '010-9362-9162' WHERE id = 111;
UPDATE edu_ella_student SET mobile = '010-1258-8569' WHERE id = 112;
UPDATE edu_ella_student SET mobile = '010-6354-4748' WHERE id = 113;
UPDATE edu_ella_student SET mobile = '010-8562-1238' WHERE id = 114;
UPDATE edu_ella_student SET mobile = '010-7432-1374' WHERE id = 115;
UPDATE edu_ella_student SET mobile = '010-3317-3916' WHERE id = 116;
UPDATE edu_ella_student SET mobile = '010-1669-7868' WHERE id = 117;
UPDATE edu_ella_student SET mobile = '010-0544-5467' WHERE id = 118;
UPDATE edu_ella_student SET mobile = '010-0073-5393' WHERE id = 119;
UPDATE edu_ella_student SET mobile = '010-7667-1518' WHERE id = 120;
UPDATE edu_ella_student SET mobile = '010-8136-7745' WHERE id = 121;
UPDATE edu_ella_student SET mobile = '010-7808-8500' WHERE id = 122;
UPDATE edu_ella_student SET mobile = '010-9630-3425' WHERE id = 123;
UPDATE edu_ella_student SET mobile = '010-8441-1145' WHERE id = 124;
UPDATE edu_ella_student SET mobile = '010-2717-4787' WHERE id = 125;
UPDATE edu_ella_student SET mobile = '010-9124-7543' WHERE id = 126;
UPDATE edu_ella_student SET mobile = '010-1634-8346' WHERE id = 127;
UPDATE edu_ella_student SET mobile = '010-8048-4281' WHERE id = 128;
UPDATE edu_ella_student SET mobile = '010-3372-4861' WHERE id = 129;
UPDATE edu_ella_student SET mobile = '010-3971-5697' WHERE id = 130;
UPDATE edu_ella_student SET mobile = '010-2577-5884' WHERE id = 131;
UPDATE edu_ella_student SET mobile = '010-1746-8513' WHERE id = 132;
UPDATE edu_ella_student SET mobile = '010-1070-8472' WHERE id = 133;
UPDATE edu_ella_student SET mobile = '010-1535-4765' WHERE id = 134;
UPDATE edu_ella_student SET mobile = '010-6629-1887' WHERE id = 135;
UPDATE edu_ella_student SET mobile = '010-7451-1363' WHERE id = 136;
UPDATE edu_ella_student SET mobile = '010-3768-2742' WHERE id = 137;
UPDATE edu_ella_student SET mobile = '010-9177-9514' WHERE id = 138;
UPDATE edu_ella_student SET mobile = '010-1046-5975' WHERE id = 139;
UPDATE edu_ella_student SET mobile = '010-3244-3881' WHERE id = 140;
UPDATE edu_ella_student SET mobile = '010-6343-4447' WHERE id = 141;
UPDATE edu_ella_student SET mobile = '010-5297-2426' WHERE id = 142;
UPDATE edu_ella_student SET mobile = '010-2486-8436' WHERE id = 143;
UPDATE edu_ella_student SET mobile = '010-4875-9225' WHERE id = 144;
UPDATE edu_ella_student SET mobile = '010-4892-8167' WHERE id = 145;
UPDATE edu_ella_student SET mobile = '010-8769-5715' WHERE id = 146;
UPDATE edu_ella_student SET mobile = '010-3122-0081' WHERE id = 147;
UPDATE edu_ella_student SET mobile = '010-6210-8578' WHERE id = 148;
UPDATE edu_ella_student SET mobile = '010-5306-5779' WHERE id = 149;
UPDATE edu_ella_student SET mobile = '010-1834-6213' WHERE id = 150;
UPDATE edu_ella_student SET mobile = '010-6313-7213' WHERE id = 151;
UPDATE edu_ella_student SET mobile = '010-2554-2682' WHERE id = 152;
UPDATE edu_ella_student SET mobile = '010-3465-7371' WHERE id = 153;
UPDATE edu_ella_student SET mobile = '010-3710-6222' WHERE id = 154;
UPDATE edu_ella_student SET mobile = '010-7245-0728' WHERE id = 155;
UPDATE edu_ella_student SET mobile = '010-1394-8793' WHERE id = 156;
UPDATE edu_ella_student SET mobile = '010-1574-6043' WHERE id = 157;
UPDATE edu_ella_student SET mobile = '010-6165-4889' WHERE id = 158;
UPDATE edu_ella_student SET mobile = '010-2437-8139' WHERE id = 159;
UPDATE edu_ella_student SET mobile = '010-4821-3293' WHERE id = 160;
UPDATE edu_ella_student SET mobile = '010-4181-3350' WHERE id = 161;
UPDATE edu_ella_student SET mobile = '010-2435-3384' WHERE id = 162;
UPDATE edu_ella_student SET mobile = '010-5687-8714' WHERE id = 163;
UPDATE edu_ella_student SET mobile = '010-4676-8888' WHERE id = 164;
UPDATE edu_ella_student SET mobile = '010-6762-2909' WHERE id = 165;
UPDATE edu_ella_student SET mobile = '010-4454-3272' WHERE id = 166;
UPDATE edu_ella_student SET mobile = '010-4207-1885' WHERE id = 167;
UPDATE edu_ella_student SET mobile = '010-7273-3321' WHERE id = 168;
UPDATE edu_ella_student SET mobile = '010-6133-4424' WHERE id = 169;
UPDATE edu_ella_student SET mobile = '010-0084-8752' WHERE id = 170;
UPDATE edu_ella_student SET mobile = '010-6814-0536' WHERE id = 171;
UPDATE edu_ella_student SET mobile = '010-0051-5826' WHERE id = 172;
UPDATE edu_ella_student SET mobile = '010-3663-8888' WHERE id = 173;
UPDATE edu_ella_student SET mobile = '010-2388-3154' WHERE id = 174;
UPDATE edu_ella_student SET mobile = '010-3555-4094' WHERE id = 175;
UPDATE edu_ella_student SET mobile = '010-6544-4768' WHERE id = 176;
UPDATE edu_ella_student SET mobile = '010-1404-8086' WHERE id = 177;
UPDATE edu_ella_student SET mobile = '010-3241-6997' WHERE id = 178;
UPDATE edu_ella_student SET mobile = '010-7385-0111' WHERE id = 179;
UPDATE edu_ella_student SET mobile = '010-7482-5632' WHERE id = 180;
UPDATE edu_ella_student SET mobile = '010-9882-1531' WHERE id = 181;
UPDATE edu_ella_student SET mobile = '010-7167-3358' WHERE id = 182;
UPDATE edu_ella_student SET mobile = '010-4564-0294' WHERE id = 183;
UPDATE edu_ella_student SET mobile = '010-4264-8563' WHERE id = 184;
UPDATE edu_ella_student SET mobile = '010-0943-6085' WHERE id = 185;
UPDATE edu_ella_student SET mobile = '010-3986-2193' WHERE id = 186;
UPDATE edu_ella_student SET mobile = '010-0473-6924' WHERE id = 187;
UPDATE edu_ella_student SET mobile = '010-9618-6592' WHERE id = 188;
UPDATE edu_ella_student SET mobile = '010-8780-1468' WHERE id = 189;
UPDATE edu_ella_student SET mobile = '010-3851-4247' WHERE id = 190;
UPDATE edu_ella_student SET mobile = '010-1948-7298' WHERE id = 191;
UPDATE edu_ella_student SET mobile = '010-9300-2843' WHERE id = 192;
UPDATE edu_ella_student SET mobile = '010-4685-6947' WHERE id = 193;
UPDATE edu_ella_student SET mobile = '010-2076-5285' WHERE id = 194;
UPDATE edu_ella_student SET mobile = '010-8127-6827' WHERE id = 195;
UPDATE edu_ella_student SET mobile = '010-5275-2079' WHERE id = 196;
UPDATE edu_ella_student SET mobile = '010-1281-5578' WHERE id = 197;
UPDATE edu_ella_student SET mobile = '010-6375-7325' WHERE id = 198;
UPDATE edu_ella_student SET mobile = '010-2786-1274' WHERE id = 199;
UPDATE edu_ella_student SET mobile = '010-2343-1977' WHERE id = 200;
UPDATE edu_ella_student SET mobile = '010-2638-5714' WHERE id = 201;
UPDATE edu_ella_student SET mobile = '010-6223-4388' WHERE id = 202;
UPDATE edu_ella_student SET mobile = '010-7912-2533' WHERE id = 203;
UPDATE edu_ella_student SET mobile = '010-9475-1873' WHERE id = 204;
UPDATE edu_ella_student SET mobile = '010-5473-1627' WHERE id = 205;
UPDATE edu_ella_student SET mobile = '010-1034-3766' WHERE id = 206;
UPDATE edu_ella_student SET mobile = '010-7731-0152' WHERE id = 207;
UPDATE edu_ella_student SET mobile = '010-4741-0898' WHERE id = 208;
UPDATE edu_ella_student SET mobile = '010-3315-8202' WHERE id = 209;
UPDATE edu_ella_student SET mobile = '010-5654-6723' WHERE id = 210;
UPDATE edu_ella_student SET mobile = '010-5342-2348' WHERE id = 211;
UPDATE edu_ella_student SET mobile = '010-0734-6878' WHERE id = 212;
UPDATE edu_ella_student SET mobile = '010-8543-2443' WHERE id = 213;
UPDATE edu_ella_student SET mobile = '010-2643-8807' WHERE id = 214;
UPDATE edu_ella_student SET mobile = '010-7019-7377' WHERE id = 215;
UPDATE edu_ella_student SET mobile = '010-6175-4736' WHERE id = 216;
UPDATE edu_ella_student SET mobile = '010-1023-7340' WHERE id = 217;
UPDATE edu_ella_student SET mobile = '010-3915-3353' WHERE id = 218;
UPDATE edu_ella_student SET mobile = '010-5312-6106' WHERE id = 219;
UPDATE edu_ella_student SET mobile = '010-9620-6310' WHERE id = 220;
UPDATE edu_ella_student SET mobile = '010-1484-1977' WHERE id = 221;
UPDATE edu_ella_student SET mobile = '010-4527-1597' WHERE id = 222;
UPDATE edu_ella_student SET mobile = '010-7633-4362' WHERE id = 223;
UPDATE edu_ella_student SET mobile = '010-5114-7460' WHERE id = 224;
UPDATE edu_ella_student SET mobile = '010-4895-8732' WHERE id = 225;
UPDATE edu_ella_student SET mobile = '010-2111-1448' WHERE id = 226;
UPDATE edu_ella_student SET mobile = '010-6262-3179' WHERE id = 227;
UPDATE edu_ella_student SET mobile = '010-3856-4861' WHERE id = 228;
UPDATE edu_ella_student SET mobile = '010-5721-4778' WHERE id = 229;
UPDATE edu_ella_student SET mobile = '010-4620-8342' WHERE id = 230;
UPDATE edu_ella_student SET mobile = '010-8861-9987' WHERE id = 231;
UPDATE edu_ella_student SET mobile = '010-6345-8391' WHERE id = 232;
UPDATE edu_ella_student SET mobile = '010-0405-4233' WHERE id = 233;
UPDATE edu_ella_student SET mobile = '010-8954-1356' WHERE id = 234;
UPDATE edu_ella_student SET mobile = '010-1616-4584' WHERE id = 235;
UPDATE edu_ella_student SET mobile = '010-7445-0696' WHERE id = 236;
UPDATE edu_ella_student SET mobile = '010-6666-4849' WHERE id = 237;
UPDATE edu_ella_student SET mobile = '010-6342-3647' WHERE id = 238;
UPDATE edu_ella_student SET mobile = '010-8711-8634' WHERE id = 239;
UPDATE edu_ella_student SET mobile = '010-8850-6670' WHERE id = 240;
UPDATE edu_ella_student SET mobile = '010-9344-6502' WHERE id = 241;
UPDATE edu_ella_student SET mobile = '010-2136-6127' WHERE id = 242;
UPDATE edu_ella_student SET mobile = '010-5677-8183' WHERE id = 243;
UPDATE edu_ella_student SET mobile = '010-4542-7739' WHERE id = 244;
UPDATE edu_ella_student SET mobile = '010-9381-3066' WHERE id = 245;
UPDATE edu_ella_student SET mobile = '010-1052-4374' WHERE id = 246;
UPDATE edu_ella_student SET mobile = '010-6054-1774' WHERE id = 247;
UPDATE edu_ella_student SET mobile = '010-6212-7527' WHERE id = 248;
UPDATE edu_ella_student SET mobile = '010-9825-5178' WHERE id = 249;
UPDATE edu_ella_student SET mobile = '010-4424-5826' WHERE id = 250;
UPDATE edu_ella_student SET mobile = '010-4633-0130' WHERE id = 251;
UPDATE edu_ella_student SET mobile = '010-0397-8110' WHERE id = 252;
UPDATE edu_ella_student SET mobile = '010-9772-6225' WHERE id = 253;
UPDATE edu_ella_student SET mobile = '010-2307-0128' WHERE id = 254;
UPDATE edu_ella_student SET mobile = '010-7419-7851' WHERE id = 255;
UPDATE edu_ella_student SET mobile = '010-8318-9936' WHERE id = 256;
UPDATE edu_ella_student SET mobile = '010-7849-9873' WHERE id = 257;
UPDATE edu_ella_student SET mobile = '010-2158-2511' WHERE id = 258;
UPDATE edu_ella_student SET mobile = '010-7376-5201' WHERE id = 259;
UPDATE edu_ella_student SET mobile = '010-6945-8770' WHERE id = 260;
UPDATE edu_ella_student SET mobile = '010-5175-2526' WHERE id = 261;
UPDATE edu_ella_student SET mobile = '010-9708-1855' WHERE id = 262;
UPDATE edu_ella_student SET mobile = '010-1777-6237' WHERE id = 263;
UPDATE edu_ella_student SET mobile = '010-5010-5676' WHERE id = 264;
UPDATE edu_ella_student SET mobile = '010-5121-8208' WHERE id = 265;
UPDATE edu_ella_student SET mobile = '010-9349-4089' WHERE id = 266;
UPDATE edu_ella_student SET mobile = '010-1827-3636' WHERE id = 267;
UPDATE edu_ella_student SET mobile = '010-7174-1729' WHERE id = 268;
UPDATE edu_ella_student SET mobile = '010-7174-2708' WHERE id = 269;
UPDATE edu_ella_student SET mobile = '010-2605-3143' WHERE id = 270;
UPDATE edu_ella_student SET mobile = '010-0820-1233' WHERE id = 271;
UPDATE edu_ella_student SET mobile = '010-4600-8583' WHERE id = 272;
UPDATE edu_ella_student SET mobile = '010-4534-1340' WHERE id = 273;
UPDATE edu_ella_student SET mobile = '010-1931-2848' WHERE id = 274;
UPDATE edu_ella_student SET mobile = '010-9616-8584' WHERE id = 275;
UPDATE edu_ella_student SET mobile = '010-1784-4657' WHERE id = 276;
UPDATE edu_ella_student SET mobile = '010-4798-8602' WHERE id = 277;
UPDATE edu_ella_student SET mobile = '010-1830-5466' WHERE id = 278;
UPDATE edu_ella_student SET mobile = '010-3293-5628' WHERE id = 279;
UPDATE edu_ella_student SET mobile = '010-3283-3111' WHERE id = 280;
UPDATE edu_ella_student SET mobile = '010-9651-7467' WHERE id = 281;
UPDATE edu_ella_student SET mobile = '010-0541-2556' WHERE id = 282;
UPDATE edu_ella_student SET mobile = '010-5758-8014' WHERE id = 283;
UPDATE edu_ella_student SET mobile = '010-6144-7454' WHERE id = 284;
UPDATE edu_ella_student SET mobile = '010-0261-8181' WHERE id = 285;
UPDATE edu_ella_student SET mobile = '010-9355-3257' WHERE id = 286;
UPDATE edu_ella_student SET mobile = '010-9272-7671' WHERE id = 287;
UPDATE edu_ella_student SET mobile = '010-5881-2552' WHERE id = 288;
UPDATE edu_ella_student SET mobile = '010-2514-6890' WHERE id = 289;
UPDATE edu_ella_student SET mobile = '010-8587-5668' WHERE id = 290;
UPDATE edu_ella_student SET mobile = '010-5664-5638' WHERE id = 291;
UPDATE edu_ella_student SET mobile = '010-8455-4554' WHERE id = 292;
UPDATE edu_ella_student SET mobile = '010-0812-4144' WHERE id = 293;
UPDATE edu_ella_student SET mobile = '010-5399-8819' WHERE id = 294;
UPDATE edu_ella_student SET mobile = '010-5355-0271' WHERE id = 295;
UPDATE edu_ella_student SET mobile = '010-5252-3633' WHERE id = 296;
UPDATE edu_ella_student SET mobile = '010-3122-5485' WHERE id = 297;
UPDATE edu_ella_student SET mobile = '010-4458-5598' WHERE id = 298;
UPDATE edu_ella_student SET mobile = '010-1552-3699' WHERE id = 299;
UPDATE edu_ella_student SET mobile = '010-7881-7267' WHERE id = 300;
UPDATE edu_ella_student SET mobile = '010-2664-1420' WHERE id = 301;
UPDATE edu_ella_student SET mobile = '010-2755-1358' WHERE id = 302;
UPDATE edu_ella_student SET mobile = '010-8234-2327' WHERE id = 303;
UPDATE edu_ella_student SET mobile = '010-1654-4434' WHERE id = 304;
UPDATE edu_ella_student SET mobile = '010-2834-4485' WHERE id = 305;
UPDATE edu_ella_student SET mobile = '010-4637-6523' WHERE id = 306;
UPDATE edu_ella_student SET mobile = '010-5908-5311' WHERE id = 307;
UPDATE edu_ella_student SET mobile = '010-7534-5257' WHERE id = 308;
UPDATE edu_ella_student SET mobile = '010-2733-2534' WHERE id = 309;
UPDATE edu_ella_student SET mobile = '010-7253-7255' WHERE id = 310;
UPDATE edu_ella_student SET mobile = '010-1171-2858' WHERE id = 311;
UPDATE edu_ella_student SET mobile = '010-8408-3730' WHERE id = 312;
UPDATE edu_ella_student SET mobile = '010-5825-5232' WHERE id = 313;
UPDATE edu_ella_student SET mobile = '010-8642-5878' WHERE id = 314;
UPDATE edu_ella_student SET mobile = '010-4351-5100' WHERE id = 315;
UPDATE edu_ella_student SET mobile = '010-4118-7274' WHERE id = 316;
UPDATE edu_ella_student SET mobile = '010-5541-7166' WHERE id = 317;
UPDATE edu_ella_student SET mobile = '010-5461-3009' WHERE id = 318;
UPDATE edu_ella_student SET mobile = '010-0506-8313' WHERE id = 319;
UPDATE edu_ella_student SET mobile = '010-0531-2181' WHERE id = 320;
UPDATE edu_ella_student SET mobile = '010-1263-7529' WHERE id = 321;
UPDATE edu_ella_student SET mobile = '010-2864-2212' WHERE id = 322;
UPDATE edu_ella_student SET mobile = '010-6894-1866' WHERE id = 323;
UPDATE edu_ella_student SET mobile = '010-4283-6258' WHERE id = 324;
UPDATE edu_ella_student SET mobile = '010-6338-7968' WHERE id = 325;
UPDATE edu_ella_student SET mobile = '010-9569-1517' WHERE id = 326;
UPDATE edu_ella_student SET mobile = '010-2164-6871' WHERE id = 327;
UPDATE edu_ella_student SET mobile = '010-3155-2683' WHERE id = 328;
UPDATE edu_ella_student SET mobile = '010-2879-7537' WHERE id = 329;
UPDATE edu_ella_student SET mobile = '010-7742-1136' WHERE id = 330;
UPDATE edu_ella_student SET mobile = '010-7236-9766' WHERE id = 331;
UPDATE edu_ella_student SET mobile = '010-6303-4848' WHERE id = 332;
UPDATE edu_ella_student SET mobile = '010-1006-8690' WHERE id = 333;
UPDATE edu_ella_student SET mobile = '010-6925-7435' WHERE id = 334;
UPDATE edu_ella_student SET mobile = '010-6089-3133' WHERE id = 335;
UPDATE edu_ella_student SET mobile = '010-8227-6592' WHERE id = 336;
UPDATE edu_ella_student SET mobile = '010-1366-3747' WHERE id = 337;
UPDATE edu_ella_student SET mobile = '010-6597-4431' WHERE id = 338;
UPDATE edu_ella_student SET mobile = '010-3605-5208' WHERE id = 339;
UPDATE edu_ella_student SET mobile = '010-1768-7175' WHERE id = 340;
UPDATE edu_ella_student SET mobile = '010-3355-6778' WHERE id = 341;
UPDATE edu_ella_student SET mobile = '010-1879-9824' WHERE id = 342;
UPDATE edu_ella_student SET mobile = '010-7075-6251' WHERE id = 343;
UPDATE edu_ella_student SET mobile = '010-5452-1967' WHERE id = 344;
UPDATE edu_ella_student SET mobile = '010-8785-3427' WHERE id = 345;
UPDATE edu_ella_student SET mobile = '010-3883-1702' WHERE id = 346;
UPDATE edu_ella_student SET mobile = '010-3288-1217' WHERE id = 347;
UPDATE edu_ella_student SET mobile = '010-2113-5619' WHERE id = 348;
UPDATE edu_ella_student SET mobile = '010-3682-8859' WHERE id = 349;
UPDATE edu_ella_student SET mobile = '010-2252-0841' WHERE id = 350;
UPDATE edu_ella_student SET mobile = '010-5115-8532' WHERE id = 351;
UPDATE edu_ella_student SET mobile = '010-9579-1158' WHERE id = 352;
UPDATE edu_ella_student SET mobile = '010-4528-0815' WHERE id = 353;
UPDATE edu_ella_student SET mobile = '010-3456-0954' WHERE id = 354;
UPDATE edu_ella_student SET mobile = '010-7112-9678' WHERE id = 355;
UPDATE edu_ella_student SET mobile = '010-4289-8767' WHERE id = 356;
UPDATE edu_ella_student SET mobile = '010-7441-8247' WHERE id = 357;
UPDATE edu_ella_student SET mobile = '010-2128-5426' WHERE id = 358;
UPDATE edu_ella_student SET mobile = '010-7349-3643' WHERE id = 359;
UPDATE edu_ella_student SET mobile = '010-8742-5165' WHERE id = 360;
UPDATE edu_ella_student SET mobile = '010-1925-0672' WHERE id = 361;
UPDATE edu_ella_student SET mobile = '010-1632-7130' WHERE id = 362;
UPDATE edu_ella_student SET mobile = '010-6199-5674' WHERE id = 363;
UPDATE edu_ella_student SET mobile = '010-2736-8108' WHERE id = 364;
UPDATE edu_ella_student SET mobile = '010-5472-6587' WHERE id = 365;
UPDATE edu_ella_student SET mobile = '010-0216-0075' WHERE id = 366;
UPDATE edu_ella_student SET mobile = '010-3514-1811' WHERE id = 367;
UPDATE edu_ella_student SET mobile = '010-1617-2474' WHERE id = 368;
UPDATE edu_ella_student SET mobile = '010-7775-9407' WHERE id = 369;
UPDATE edu_ella_student SET mobile = '010-1934-5371' WHERE id = 370;
UPDATE edu_ella_student SET mobile = '010-9774-5445' WHERE id = 371;
UPDATE edu_ella_student SET mobile = '010-5362-3541' WHERE id = 372;
UPDATE edu_ella_student SET mobile = '010-8211-1318' WHERE id = 373;
UPDATE edu_ella_student SET mobile = '010-2121-8828' WHERE id = 374;
UPDATE edu_ella_student SET mobile = '010-1656-1566' WHERE id = 375;
UPDATE edu_ella_student SET mobile = '010-2408-3529' WHERE id = 376;
UPDATE edu_ella_student SET mobile = '010-5511-8757' WHERE id = 377;
UPDATE edu_ella_student SET mobile = '010-1646-6045' WHERE id = 378;
UPDATE edu_ella_student SET mobile = '010-1773-3855' WHERE id = 379;
UPDATE edu_ella_student SET mobile = '010-7353-7437' WHERE id = 380;
UPDATE edu_ella_student SET mobile = '010-9875-0056' WHERE id = 381;
UPDATE edu_ella_student SET mobile = '010-7213-6463' WHERE id = 382;
UPDATE edu_ella_student SET mobile = '010-3698-8112' WHERE id = 383;
UPDATE edu_ella_student SET mobile = '010-0823-3427' WHERE id = 384;
UPDATE edu_ella_student SET mobile = '010-7186-2196' WHERE id = 385;
UPDATE edu_ella_student SET mobile = '010-0965-3924' WHERE id = 386;
UPDATE edu_ella_student SET mobile = '010-4116-5504' WHERE id = 387;
UPDATE edu_ella_student SET mobile = '010-2145-1874' WHERE id = 388;
UPDATE edu_ella_student SET mobile = '010-5444-3810' WHERE id = 389;
UPDATE edu_ella_student SET mobile = '010-1424-1702' WHERE id = 390;
UPDATE edu_ella_student SET mobile = '010-6916-5512' WHERE id = 391;
UPDATE edu_ella_student SET mobile = '010-9626-0381' WHERE id = 392;
UPDATE edu_ella_student SET mobile = '010-0787-6205' WHERE id = 393;
UPDATE edu_ella_student SET mobile = '010-2503-7317' WHERE id = 394;
UPDATE edu_ella_student SET mobile = '010-7681-6367' WHERE id = 395;
UPDATE edu_ella_student SET mobile = '010-3416-1446' WHERE id = 396;
UPDATE edu_ella_student SET mobile = '010-7746-2508' WHERE id = 397;
UPDATE edu_ella_student SET mobile = '010-9293-5788' WHERE id = 398;
UPDATE edu_ella_student SET mobile = '010-1273-5858' WHERE id = 399;
UPDATE edu_ella_student SET mobile = '010-7841-0529' WHERE id = 400;
UPDATE edu_ella_student SET mobile = '010-2898-2753' WHERE id = 401;
UPDATE edu_ella_student SET mobile = '010-1196-4444' WHERE id = 402;
UPDATE edu_ella_student SET mobile = '010-7733-3580' WHERE id = 403;
UPDATE edu_ella_student SET mobile = '010-0341-5486' WHERE id = 404;
UPDATE edu_ella_student SET mobile = '010-9468-4165' WHERE id = 405;
UPDATE edu_ella_student SET mobile = '010-9364-6372' WHERE id = 406;
UPDATE edu_ella_student SET mobile = '010-3479-3310' WHERE id = 407;
UPDATE edu_ella_student SET mobile = '010-0776-8446' WHERE id = 408;
UPDATE edu_ella_student SET mobile = '010-1114-2395' WHERE id = 409;
UPDATE edu_ella_student SET mobile = '010-5025-1372' WHERE id = 410;
UPDATE edu_ella_student SET mobile = '010-6797-7642' WHERE id = 411;
UPDATE edu_ella_student SET mobile = '010-5254-9115' WHERE id = 412;
UPDATE edu_ella_student SET mobile = '010-7782-1463' WHERE id = 413;
UPDATE edu_ella_student SET mobile = '010-8947-6884' WHERE id = 414;
UPDATE edu_ella_student SET mobile = '010-5383-5308' WHERE id = 415;
UPDATE edu_ella_student SET mobile = '010-0683-6339' WHERE id = 416;
UPDATE edu_ella_student SET mobile = '010-8392-5352' WHERE id = 417;
UPDATE edu_ella_student SET mobile = '010-5069-3321' WHERE id = 418;
UPDATE edu_ella_student SET mobile = '010-2113-5061' WHERE id = 419;
UPDATE edu_ella_student SET mobile = '010-2850-8281' WHERE id = 420;
UPDATE edu_ella_student SET mobile = '010-2458-6403' WHERE id = 421;
UPDATE edu_ella_student SET mobile = '010-7217-2368' WHERE id = 422;
UPDATE edu_ella_student SET mobile = '010-7430-2529' WHERE id = 423;
UPDATE edu_ella_student SET mobile = '010-0222-5778' WHERE id = 424;
UPDATE edu_ella_student SET mobile = '010-8088-6122' WHERE id = 425;
UPDATE edu_ella_student SET mobile = '010-0192-8511' WHERE id = 426;
UPDATE edu_ella_student SET mobile = '010-1786-7985' WHERE id = 427;
UPDATE edu_ella_student SET mobile = '010-6189-5538' WHERE id = 428;
UPDATE edu_ella_student SET mobile = '010-1414-1753' WHERE id = 429;
UPDATE edu_ella_student SET mobile = '010-0547-2957' WHERE id = 430;
UPDATE edu_ella_student SET mobile = '010-5100-8437' WHERE id = 431;
UPDATE edu_ella_student SET mobile = '010-7626-1889' WHERE id = 432;
UPDATE edu_ella_student SET mobile = '010-8353-9161' WHERE id = 433;
UPDATE edu_ella_student SET mobile = '010-7388-7600' WHERE id = 434;
UPDATE edu_ella_student SET mobile = '010-3768-2392' WHERE id = 435;
UPDATE edu_ella_student SET mobile = '010-7822-1402' WHERE id = 436;
UPDATE edu_ella_student SET mobile = '010-1419-1278' WHERE id = 437;
UPDATE edu_ella_student SET mobile = '010-2066-9078' WHERE id = 438;
UPDATE edu_ella_student SET mobile = '010-1206-7653' WHERE id = 439;
UPDATE edu_ella_student SET mobile = '010-5988-1721' WHERE id = 440;
UPDATE edu_ella_student SET mobile = '010-4575-9450' WHERE id = 441;
UPDATE edu_ella_student SET mobile = '010-0974-4255' WHERE id = 442;
UPDATE edu_ella_student SET mobile = '010-5185-6064' WHERE id = 443;
UPDATE edu_ella_student SET mobile = '010-6876-6815' WHERE id = 444;
UPDATE edu_ella_student SET mobile = '010-8755-6243' WHERE id = 445;
UPDATE edu_ella_student SET mobile = '010-1226-8571' WHERE id = 446;
UPDATE edu_ella_student SET mobile = '010-8063-9171' WHERE id = 447;
UPDATE edu_ella_student SET mobile = '010-5363-6227' WHERE id = 448;
UPDATE edu_ella_student SET mobile = '010-3406-8135' WHERE id = 449;
UPDATE edu_ella_student SET mobile = '010-8677-1176' WHERE id = 450;
UPDATE edu_ella_student SET mobile = '010-8220-8391' WHERE id = 451;
UPDATE edu_ella_student SET mobile = '010-1017-8321' WHERE id = 452;
UPDATE edu_ella_student SET mobile = '010-2498-7501' WHERE id = 453;
UPDATE edu_ella_student SET mobile = '010-3385-8646' WHERE id = 454;
UPDATE edu_ella_student SET mobile = '010-3850-9707' WHERE id = 455;
UPDATE edu_ella_student SET mobile = '010-1444-7050' WHERE id = 456;
UPDATE edu_ella_student SET mobile = '010-1823-8128' WHERE id = 457;
UPDATE edu_ella_student SET mobile = '010-1087-0965' WHERE id = 458;
UPDATE edu_ella_student SET mobile = '010-3725-4516' WHERE id = 459;
UPDATE edu_ella_student SET mobile = '010-4467-9443' WHERE id = 460;
UPDATE edu_ella_student SET mobile = '010-6283-3868' WHERE id = 461;
UPDATE edu_ella_student SET mobile = '010-0816-1418' WHERE id = 462;
UPDATE edu_ella_student SET mobile = '010-1618-1757' WHERE id = 463;
UPDATE edu_ella_student SET mobile = '010-3548-1532' WHERE id = 464;
UPDATE edu_ella_student SET mobile = '010-6775-3859' WHERE id = 465;
UPDATE edu_ella_student SET mobile = '010-3599-3373' WHERE id = 466;
UPDATE edu_ella_student SET mobile = '010-4618-0587' WHERE id = 467;
UPDATE edu_ella_student SET mobile = '010-2895-5748' WHERE id = 468;
UPDATE edu_ella_student SET mobile = '010-7548-9286' WHERE id = 469;
UPDATE edu_ella_student SET mobile = '010-3619-2668' WHERE id = 470;
UPDATE edu_ella_student SET mobile = '010-2761-7844' WHERE id = 471;
UPDATE edu_ella_student SET mobile = '010-6553-7489' WHERE id = 472;
UPDATE edu_ella_student SET mobile = '010-6834-8585' WHERE id = 473;
UPDATE edu_ella_student SET mobile = '010-3856-9832' WHERE id = 474;
UPDATE edu_ella_student SET mobile = '010-8270-9973' WHERE id = 475;
UPDATE edu_ella_student SET mobile = '010-0624-3163' WHERE id = 476;
UPDATE edu_ella_student SET mobile = '010-8887-4128' WHERE id = 477;
UPDATE edu_ella_student SET mobile = '010-1866-1649' WHERE id = 478;
UPDATE edu_ella_student SET mobile = '010-8896-4823' WHERE id = 479;
UPDATE edu_ella_student SET mobile = '010-9874-5825' WHERE id = 480;
UPDATE edu_ella_student SET mobile = '010-9978-1647' WHERE id = 481;
UPDATE edu_ella_student SET mobile = '010-4662-3758' WHERE id = 482;
UPDATE edu_ella_student SET mobile = '010-6923-3931' WHERE id = 483;
UPDATE edu_ella_student SET mobile = '010-5185-5107' WHERE id = 484;
UPDATE edu_ella_student SET mobile = '010-8336-4115' WHERE id = 485;
UPDATE edu_ella_student SET mobile = '010-6261-2667' WHERE id = 486;
UPDATE edu_ella_student SET mobile = '010-7044-1755' WHERE id = 487;
UPDATE edu_ella_student SET mobile = '010-8846-5982' WHERE id = 488;
UPDATE edu_ella_student SET mobile = '010-8867-2554' WHERE id = 489;
UPDATE edu_ella_student SET mobile = '010-6235-3671' WHERE id = 490;
UPDATE edu_ella_student SET mobile = '010-8259-1751' WHERE id = 491;
UPDATE edu_ella_student SET mobile = '010-5209-7311' WHERE id = 492;
UPDATE edu_ella_student SET mobile = '010-4437-2941' WHERE id = 493;
UPDATE edu_ella_student SET mobile = '010-5326-2867' WHERE id = 494;
UPDATE edu_ella_student SET mobile = '010-6050-6647' WHERE id = 495;
UPDATE edu_ella_student SET mobile = '010-5054-0814' WHERE id = 496;
UPDATE edu_ella_student SET mobile = '010-7615-4427' WHERE id = 497;
UPDATE edu_ella_student SET mobile = '010-2231-1737' WHERE id = 498;
UPDATE edu_ella_student SET mobile = '010-5725-2547' WHERE id = 499;
UPDATE edu_ella_student SET mobile = '010-2061-5753' WHERE id = 500;

-- DELETE
-- DELETE FROM edu_ella_student
-- WHERE id = 1; 
