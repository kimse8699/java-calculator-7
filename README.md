# 문자열 덧셈 계산기
> 입력한 문자열에서 숫자를 추출하여 더하는 계산기를 구현하다.

---

## Tech Stack & Environment
* **Language:** Java 21
* **Framework:** Spring Boot 3.x
* **Build Tool:** Gradle
* **Test:** JUnit 5, AssertJ

---

## Key Features
* **커스텀 구분자 분석:** `//[구분자]\n[본문]` 형식의 문자열 패턴을 정규식으로 검증 및 추출
* **기본 구분자 분석:** `[숫자][:or,][숫자][:or,]...` 형태의 패턴을 정규식으로 검증 및 추출
* **도메인 중심 설계:** 비즈니스 검증 및 가공 로직을 `Domain` 객체 내부에 응집
* **안전한 데이터 전송:** 계층 간 이동 시 `Static Inner Class` 기반의 DTO 구조 채택