package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students =  new Student[2]; //메모리 크기 2인 배열 생성
        students[0] = student1; //배열에 student1 메모리값 할당
        students[1] = student2; //배열에 student2 메모리값 할당
        System.out.println(students[0].name + students[0].age + students[0].grade);
        System.out.println(students[1].name + students[1].age + students[1].grade);

    }
}
