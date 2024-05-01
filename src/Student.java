public class Student {
    String name;
    int studentID;
    int gradClass;
    String major;
    double gpa;

    public Student(String name,int studentID,int gradClass,String major,double gpa){
        this.name = name;
        this.studentID = studentID;
        this.gradClass = gradClass;
        this.major = major;
        this.gpa = gpa;
        }
    public String getName(){return name;}
    public int getStudentID(){return studentID;}
    public int getGradClass(){return gradClass;}
    public String getMajor(){return major;}
    public double getGpa(){return gpa;}


        public void getStudentInfo(){
            System.out.printf("Name: %s\nID: %d\nGraduating Class: %d\n" +
                    "Major: %s\nGPA: %.2f\n", name, studentID, gradClass, major, gpa);
        }

    }

