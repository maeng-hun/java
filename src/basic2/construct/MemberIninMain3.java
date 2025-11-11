package basic2.construct;

public class MemberIninMain3 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("asf" , 123 , 213 );

        MemberInit member2 = new MemberInit();
        member2.initMember("azxvsf" , 1235 , 2132 );


        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }


}
