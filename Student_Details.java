import java.util.Scanner;
interface Subject {
    void subject_input();
    void display();
}
interface Student {
    void student_record();
}
interface Records extends Subject, Student {
}
class Student_Record implements Records {
    private String stu_name;
    private int roll_no;
    private float subject1, subject2, subject3;
    public void subject_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 3 subjects:");
        System.out.print("Java: ");
        subject1 = sc.nextFloat();
        System.out.print("Operating System: ");
        subject2 = sc.nextFloat();
        System.out.print("UNIX: ");
        subject3 = sc.nextFloat();
    }
    public void student_record() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        stu_name = sc.nextLine();
        System.out.print("Enter the roll no.: ");
        roll_no = sc.nextInt();
    }
    public void display() {
        System.out.println("\n\nStudent Details:");
        System.out.println("Name: " + stu_name);
        System.out.println("Roll No.: " + roll_no);
        System.out.println("\nMarks of three subjects:");
        System.out.println("\tJava: " + subject1);
        System.out.println("\tOperating System: " + subject2);
        System.out.println("\tUNIX: " + subject3);
    }
}
public class Student_Details {
    public static void main(String[] args) {
        Student_Record s = new Student_Record();
        s.student_record();
        s.subject_input();
        s.display();
    }
}
