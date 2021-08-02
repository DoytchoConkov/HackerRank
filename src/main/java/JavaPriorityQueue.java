import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student student) {
        double diffCGPA = student.cgpa - this.cgpa;
        if (diffCGPA == 0D) {
            if (student.getName().equals(this.name)) {
                return student.id - this.id;
            } else {
                return this.name.compareTo(student.getName());
            }
        } else {
            return diffCGPA < 0 ? -1 : 1;
        }
    }
}

class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        List<Student> res = new ArrayList<>();
        String[] vals;
        String name;
        double cgpa;
        int id;
        for (String e : events) {
            vals = e.split(" ");
            if (vals.length == 4) {
                name = vals[1];
                cgpa = Double.parseDouble(vals[2]);
                id = Integer.parseInt(vals[3]);

                pq.add(new Student(id, name, cgpa));
            } else {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        return res;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scanner = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scanner.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scanner.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
