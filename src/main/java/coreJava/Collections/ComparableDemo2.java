package coreJava.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int marks,roll;
    String name;

    public Student(int marks, int roll, String name) {

        this.marks = marks;
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student stud) {
        return marks>stud.marks?1:marks< stud.marks?-1:0;
    }
}

public class ComparableDemo2 {
    public static void main(String[] args) {
        List<Student> studs=new ArrayList<>();
        studs.add(new Student(12,125,"Zamesh"));
        studs.add(new Student(2,50,"Suresh"));

        Collections.sort(studs);
        System.out.println(studs);
    }
}
