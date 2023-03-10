package HW2;
//1b

public class StudentTest {
    public static void main(String[] args) {
        Student John = new Student("John", "CS", 3.5);

        Student MaryAnn = new Student();
        MaryAnn.setName("Mary Ann");
        MaryAnn.setMajor("CE");
        MaryAnn.setGpa(3.3);


        System.out.println(John);
        System.out.println();
        System.out.println(MaryAnn);

    }
}
