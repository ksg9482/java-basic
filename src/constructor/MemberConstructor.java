package constructor;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    //추가. 생성자 오버로딩
    MemberConstructor(String name, int age){
        this(name, age, 50); //this로 자기 자신의 생성자를 호출한다.
    }
    MemberConstructor(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
