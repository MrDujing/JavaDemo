package bob.util;
import java.lang.*;
import java.util.*;

class Student {
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

//自定义升序
class SortbyrollAsc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

//自定义降序
class SortbyrollDsc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.rollno - a.rollno;
    }
}

//default asc
//默认强制降序
class DefaultDsc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return 1;
    }
}

//default dsc
//默认强制升序
class DefaultAsc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return -1;
    }
}

// Main class
public class SortDemo {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(141, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(161, "Solanki", "jaipur"));
        ar.add(new Student(151, "Aggarwal", "Hongkong"));
        // Display message on console for better readability
        System.out.println("初始化顺序");
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by roll number
        Collections.sort(ar, new SortbyrollAsc());
        // Display message on console for better readability
        System.out.println("\n自定义升序排序");
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by roll number
        Collections.sort(ar, new SortbyrollDsc());
        // Display message on console for better readability
        System.out.println("\n自定义降序排序");
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new DefaultDsc());
        // Display message on console for better readability
        System.out.println("\n默认强制降序排序");
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new DefaultAsc());
        // Display message on console for better readability
        System.out.println("\n默认强制升序排序");
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}

