package coreJava.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    int marks;
    String name;
    int roll;

    public Student(int marks, String name, int roll) {
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }


    @Override
    public int compareTo(Student s1) {
        return (s1.marks > marks)?-1:(s1.marks < marks)?1:0;
    }
}

class StudDetails
{
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(12,"aed",123));
        studentList.add(new Student(122,"aed",123));
        studentList.add(new Student(112,"aed",123));
        studentList.add(new Student(2,"aed",123));

        int maxMark = studentList.stream().max((s1 , s2 )-> s1.marks > s2.marks ? 1 : -1).get().marks;
        Collections.sort(studentList);

        System.out.println(studentList.toString());
        System.out.println("maxMark "+maxMark);

    }
}
