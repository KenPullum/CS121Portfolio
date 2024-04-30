import java.util.ArrayList;
public class StudentRecord {

    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public StringBuilder getStudentArrayList() {
        StringBuilder st = new StringBuilder();
        for (Student student : studentArrayList) {
            st.append(student.toString());
        }
        return st;
    }
    public void addStudent(Student student){
        studentArrayList.add(student);
    }
    public void removeStudent(Student student){
        studentArrayList.remove(student);
    }
    public Student getStudent(String studentName){
        Student foundStudent = null;
        //enhanced for loop
        for(Student student: studentArrayList){
            if(student.getStudentName().equals(studentName)){
                foundStudent = student;
                break;
            }
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents() {
        StringBuilder studentStringBuilder = new StringBuilder();
        for (Student student : studentArrayList) {
            studentStringBuilder.append(student.toString());
        }
        return studentStringBuilder;

    }
}
