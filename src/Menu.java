import java.util.ArrayList;
import java.util.Scanner;
public class Menu extends TestScores{
    private Scanner scnr = new Scanner(System.in);
    private StudentRecord studentRecord = new StudentRecord();

    public void displayMenu(){
        while (true) {
            System.out.printf("*******MENU*******\n(1) Add a Student\n(2) Remove a Student\n(3) Display Student Info\n(4) Display All Student Info\n(5) Exit\n");
            int selection = Integer.parseInt(scnr.nextLine());
            if(selection==1){
                createStudent();
            }
            else if (selection==2){
                deleteStudent();
            }
            else if(selection==3){
                displayStudent();
            }
            else if (selection==4){
                displayAllStudent();
            }
            else if (selection==5){
                break;
            }
            else{
                System.out.println("Invalid Entry");
            }
        }

    }
    public void enterInScore(Student student){
        System.out.println("Enter in your Score");
        int score = Integer.parseInt(scnr.nextLine());
        student.addTestScore(getLetterGrade(score));

    }
    private void createStudent(){
        Student student;
        TestScores testScores = new TestScores();
        System.out.println("Enter Student Name: ");
        String studentName = scnr.nextLine();
        System.out.println("Enter ID: ");
        int studentID = Integer.parseInt(scnr.nextLine());
        student = new Student(studentName,studentID);
        studentRecord.addStudent(student);

        // using method from TestScores
        while(true){
            System.out.println("Enter test score or 'q' to quit: ");
            String input = scnr.nextLine();
            if(input.equals("q")){
                break;
            }
            else{
                int score = Integer.parseInt(input);
                char letterGrade = testScores.getLetterGrade(score);
                student.addTestScore(letterGrade);
            }
        }


        Course course;
        while(true){
            System.out.println("Enter Course Name or 'q' to Finish: ");
            String courseName = scnr.nextLine();
            if (courseName.equals("q")){
                break;
            }
            else {
                System.out.println("Enter course's hours: ");
                int courseHours =Integer.parseInt(scnr.nextLine());
                course = new Course(courseName,courseHours);
                student.addCourse(course);
            }
        }
    }

    private void deleteStudent(){
        System.out.println("Enter name of student to delete: ");
        String studentName = scnr.nextLine();
        Student student = studentRecord.getStudent(studentName);
        if (student==null){
            System.out.println("Student not found");
        }
        else {
            studentRecord.removeStudent(student);
        }
    }
    private void displayStudent(){
        System.out.println("Enter name of student to display info: ");
        String studentName = scnr.nextLine();
        Student student = studentRecord.getStudent(studentName);
        if (student==null){
            System.out.println("Student not found");
        }
        else {
            System.out.println(student.toString());
            System.out.println(student.gradesToString());
        }
    }
    private void displayAllStudent(){
        System.out.println(studentRecord.getStudentArrayList());
    }
}
