package basic2.construct;

public class MemberIninMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "명훈";
        member1.age = 18;
        member1.grade = 20;

        MemberInit member2 = new MemberInit();
        member2.name = "asf";
        member2.age = 19;
        member2.grade = 20;

        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }
}
