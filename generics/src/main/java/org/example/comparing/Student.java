package org.example.comparing;

public class Student implements Comparable<Student> {

    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        int diff = (int) (this.marks - student.marks);
        // if diff == 0: boath are equal
        // if diff > 0: this is greater than student
        return diff;
    }

}
