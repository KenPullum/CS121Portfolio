import java.util.ArrayList;
import java.util.LinkedList;

public class Student {
    private String studentName;
    private int studentID;
    private ArrayList<Course> courseArrayList = new ArrayList<>();
    LinkedList<Character> testGrade = new LinkedList<>();

    public Student(String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;
    }
    public void addTestScore(char grade){
        testGrade.add(grade);
    }

    public String getStudentName(){
        return studentName;
    }
    public int getStudentID(){
        return studentID;
    }
    public StringBuilder getCourseArrayList(){
        //Create your instance
        StringBuilder st = new StringBuilder();
        for(Course course: courseArrayList){
            st.append(course.toString());
        }
        return st;
    }

    public StringBuilder getAllCourses() {
        StringBuilder courseStringBuilder = new StringBuilder();
        for (Course course: courseArrayList){
            courseStringBuilder.append(course.toString());
        }
         return courseStringBuilder;
    }

    public void addCourse(Course course){
        courseArrayList.add(course);
    }
    public void removeCourse(Course course){
        courseArrayList.remove(course);
    }
    public Course getCourse(String courseName){
        Course foundCourse = null;
        //enhanced for loop
        for(Course course: courseArrayList){
            if(course.getCourseName().equals(courseName)){
                foundCourse = course;
                break;
            }
        }
        return foundCourse;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nID: %d\n",studentName,studentID);
    }
    public String gradesToString(){
        String gradeString = ("Grades: ");
        for(int i=0; i<testGrade.size(); i++){
            char grade = testGrade.get(i);
            gradeString = gradeString + grade +" ";
        }
        return gradeString;
    }


}
