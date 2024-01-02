package constructor;

public class ConstructorMain1 {
    public static void main(String[] args) {
        MemberConstructor member1 = new MemberConstructor("user1", 15, 90);
        MemberConstructor member2 = new MemberConstructor("user2", 16);

        MemberConstructor[] members = {member1, member2};

        for (MemberConstructor member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }
}
