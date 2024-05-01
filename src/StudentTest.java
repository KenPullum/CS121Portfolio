public class StudentTest {
    public static void main (String[] args){

        Student student1 = new Student("Kendall Pullum",8149,2027,"Applied Mathematics", 3.8);

        //getters
        System.out.println(student1.getName());
        System.out.println(student1.getStudentID());
        System.out.println(student1.getGradClass());
        System.out.println(student1.getMajor());
        System.out.println(student1.getGpa());
        //method
        student1.getStudentInfo();


    }
}
