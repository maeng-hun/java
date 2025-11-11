package basic2.construct;

public class MemberIninMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
       initMember(member1, "명훈", 15, 213);

        MemberInit member2 = new MemberInit();
        initMember(member2, "asf" , 213, 215);


        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
