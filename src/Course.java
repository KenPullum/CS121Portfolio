import java.util.LinkedList;

public class Course {
    //instance variables
    private String courseName;
    private int courseHours;


    //constructor
    public Course(String courseName, int courseHours){
        this.courseName = courseName;
        this.courseHours = courseHours;
    }

    //methods
    public String getCourseName(){
        return courseName;}
    public int getCourseHours(){
        return courseHours;}
    @Override
    public String toString(){
        return String.format("Course Name: %s\nHours: %d", courseName, courseHours);
    }

}
