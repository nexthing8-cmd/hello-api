# hello-api

Spring Boot 학습용 프로젝트 (Week1)

## 📌 프로젝트 개요
`hello-api`는 Spring Boot 및 Java Stream/Lambda 학습을 위한 기초 REST API 예제다.  
3개월 풀스택 학습 플랜 중 **1주차(Week1)** 과제의 일부로 진행되었다.

---

## 📁 기술 스택
- Java 17  
- Spring Boot 3.x  
- Gradle (Groovy DSL)  
- REST API (Spring Web)  

---

## ⚙️ 실행 방법

```bash
./gradlew bootRun

정상 실행 시:
	•	API: http://localhost:8080/api/hello￼
	•	응답 예시:

{"message": "Hello, World!", "status": "success"}


⸻

🧩 Stream/Lambda 실습

StreamPractice.java

List<User> users = List.of(
    new User("Tom", 25, "Seoul"),
    new User("Anna", 30, "Busan"),
    new User("Bob", 19, "Seoul"),
    new User("Jane", 27, "Incheon")
);

List<User> seoulUsers = users.stream()
    .filter(u -> u.city().equals("Seoul"))
    .toList();

List<String> names = seoulUsers.stream()
    .map(User::name)
    .sorted()
    .toList();

double avgAge = seoulUsers.stream()
    .mapToInt(User::age)
    .average()
    .orElse(0);

System.out.println("서울 거주자: " + names);
System.out.println("평균 나이: " + avgAge);

출력:

서울 거주자: [Bob, Tom]
평균 나이: 22.0


⸻

🧭 브랜치 전략
	•	main: 기본 브랜치
	•	feature/week1: Week1 학습 브랜치

⸻

📅 진행 상태

구분	내용	상태
환경 세팅	JDK, Gradle, Spring CLI 설치	✅ 완료
REST API 작성	/api/hello 엔드포인트 구현	✅ 완료
Stream 실습	StreamPractice.java 실행	✅ 완료
GitHub 리포 생성	push 완료	🟩 진행 중


⸻

🔗 관련 링크
	•	[Spring Boot 공식 문서](https://spring.io/projects/spring-boot)
	•	Week1 학습 플랜￼

⸻

다음 단계:
Week2 – JPA 기반 CRUD API 구현 및 MySQL 연동

---