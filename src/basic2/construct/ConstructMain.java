package basic2.construct;

public class ConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 30);
        MemberConstruct member2 = new MemberConstruct("user2", 25, 70);

        MemberConstruct[] members = {member1, member2};
        System.out.println(members);
        System.out.println(member1);
        System.out.println(member2);

        for (MemberConstruct member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }
}
