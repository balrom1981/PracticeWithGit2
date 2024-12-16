import java.lang.*;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String course;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.surname = studentBuilder.surname;
        this.age = studentBuilder.age;
        this.course = studentBuilder.course;
    }

    public static class StudentBuilder{
        private String name;
        private String surname;
        private int age;
        private String course;

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder course(String course) {
            this.course = course;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }
}
