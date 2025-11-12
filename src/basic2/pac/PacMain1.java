package basic2.pac;

import basic2.pac.a.User;

public class PacMain1 {

    public static void main(String[] args) {
        Data data =  new Data();
        User userA = new User();
        basic2.pac.b.User userB = new basic2.pac.b.User();
    }
}
/*
패키지 규칙
- OS마다 대소문자 규칙이 다를 수 있어 JAVA에서는 패키지는 항상 소문자 관례
- 회사의 경우 회사 도메인 이름을 거꾸로 사용 EX: com.company,myapp
 */