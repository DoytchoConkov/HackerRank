import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }


    @Override
    public int compareTo(Student o) {
        if (this.cgpa != o.cgpa)
            return this.cgpa > o.cgpa ? -1 : 1;

        int i = this.fname.compareTo(o.fname);
        if (i == 0) {
            i = this.id - o.id;
        }
        return i;
    }

}
public class JavaSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
