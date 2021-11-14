package Elite;


import java.util.*;

class xyz {
    int roll, marks;

    public xyz(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "xyz{" +
                "roll=" + roll +
                ", marks=" + marks +
                '}';
    }
}

public class ComparatorLambda {


    public static void main(String[] args) {

        Map<Integer, Integer> rollMarkMap = new LinkedHashMap<>();
        rollMarkMap.put(1, 23);
        rollMarkMap.put(2, 43);
        rollMarkMap.put(3, 12);

        List<xyz> rollMarkStud = new ArrayList<>();
        for (Map.Entry<Integer, Integer> rollMar : rollMarkMap.entrySet())
            rollMarkStud.add(new xyz(rollMar.getKey(), rollMar.getValue()));
        System.out.println(rollMarkStud);

        Collections.sort(rollMarkStud, ((o1, o2) -> o1.getMarks() > o2.getMarks() ? 1 : -1));

        System.out.println(rollMarkStud);


    }

}
