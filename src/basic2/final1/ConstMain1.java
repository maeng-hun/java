package basic2.final1;

public class ConstMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + Const.MAX_USERS);
        int currentUserCount =999;
        procees(currentUserCount++);
        procees(currentUserCount++);
        procees(currentUserCount++);
    }
    
    private static void procees(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if (currentUserCount > Const.MAX_USERS) {
            System.out.println("대기자를 등록합니다.");
        } else {
            System.out.println("게임에 참옇바니다");
        }
    } 
}
