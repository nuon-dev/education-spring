# education-spring
spring mvc 샘플

## IntellIJ CE 설치
https://www.jetbrains.com/ko-kr/idea/download/?section=windows

## Feature 브랜치 생성
```
$ git checkout -b feature/{이름}-demo
```

## 과제
- git 기본 커맨드 공부하기
  - git add
  - git commit
  - git checkout
  - git branch
  - git pull
  - git push
  - git fetch
- git ssh 키 인증 방식 공부하고 적용하기

## spring initializer
https://start.spring.io/

1. Prject의 `Gradle - Kotlin ` 선택
2. Language의 `Kotlin` 선택
3. Spring boot `3.2.3`(최신) 버전 선택
4. Project Metadata 다음과 같이 입력
  - Group: `org.nuon`
  - Artifact: `{이름}-demo`
  - Name: `{이름}-demo`
  - Description: 아무거나
  - Package name: `org.nuon.{이름}-demo`
5. Packaging `Jar` 선택
6. Java `17` 선택
7. Dependencies 아래 항목 추가
- Spring Configuration Processor
- Spring Web
8. Generate 한 뒤 이 폴더에 압축해제

## 과제

## REST API 만들어보기
- GET
- POST
- PUT
- DELETE

## H2 DB의 데이터를 SQL로 조회하기
- DDL로 테이블 만들기
- DML로 데이터 조회하기


## JPA 의존성 추가해보기
- `build.gradle.kts` 파일에 JPA 의존성 추가
- `H2 Database` 의존성 추가

## H2 디비 Repository 만들어서 조회해보기
- Entity 생성
- Repository 만들기
