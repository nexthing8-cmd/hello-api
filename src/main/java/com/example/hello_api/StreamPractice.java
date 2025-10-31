package com.example.hello_api;

import java.util.List;

public class StreamPractice {
  record User(String name, int age, String city) {}

  public static void main(String[] args) {
    List<User> users = List.of(
      new User("Tom", 25, "Seoul"),
      new User("Anna", 30, "Busan"),
      new User("Bob", 19, "Seoul"),
      new User("Jane", 27, "Incheon")
    );

    // 1. 서울 거주자만 필터
    List<User> seoulUsers = users.stream()
      .filter(u -> u.city().equals("Seoul"))
      .toList();
    
    // 2. 이름만 추출해 정렬
    List<String> names = seoulUsers.stream()
      .map(User::name)
      .sorted()
      .toList();
    
    // 3. 평균 나이 계산
    double avgAge = seoulUsers.stream()
      .mapToInt(User::age)
      .average()
      .orElse(0);

      System.out.println("서울 거주자: " + names);
      System.out.println("평균 나이: " + avgAge);
  }
}
