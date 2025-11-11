package basic2.construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 30);
        MemberConstruct member2 = new MemberConstruct("user2", 25);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }
}
