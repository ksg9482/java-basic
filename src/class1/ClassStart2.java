package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = new int[]{15, 16};
        int[] studentGrades = new int[]{90, 80};

        System.out.println(studentNames[0] + studentAges[0] + studentGrades[0]);
        System.out.println(studentNames[1] + studentAges[1] + studentGrades[1]);

        //배열사용의 한계
        //한 학생의 데이터가 셋으로 나뉨. 수정이 필요할 때 다 수정해야 함.
    }
}
