package HW2;
//5a

class Student {
    private String name;
    private Transcript transcript;

    public Student(String name, Transcript transcript) {
        this.name = name;
        this.transcript = transcript;
    }
}

public class Transcript {
    private String course;
    private double grade;

    public Transcript(String course, double grade) {
        this.course = course;
        this.grade = grade;
    }
}


