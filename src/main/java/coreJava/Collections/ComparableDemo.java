package coreJava.Collections;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
    int roll, marks;
    String name;

    public Stud(int roll, int marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Stud student) {
        return name.compareTo(student.name);
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        List<Stud> studs=new ArrayList<>();
        studs.add(new Stud(1,25,"Zamesh"));
        studs.add(new Stud(2,50,"Suresh"));

        Collections.sort(studs);
        System.out.println(studs);

    }
}
