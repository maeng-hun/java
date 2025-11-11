package basic2.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) { // 생성자 this 규칙은 첫번째 줄에 항상 있어야 함 다른 코드 적으면 컴파일 오류
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출" + name + age + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
