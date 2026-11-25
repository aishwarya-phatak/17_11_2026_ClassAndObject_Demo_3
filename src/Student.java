public class Student {

    //data members
    private int rollNumber;
    private String studentName;
    private int courseId;
    private String courseName;
    private String city;

    //default or no argument constructor
    Student(){
        IO.println("Default or no argument constructor is called");
        this.rollNumber = 12423;
        this.studentName = "Omkar";
        this.courseId = 45;
        this.courseName = "Core java";
        this.city = "Pune";
    }

    //parameterized constructor
    Student(int rN, String studentName, int courseId, String courseName, String city){
        IO.println("Parameterized constructor is called");
        this.rollNumber = rN;
        this.studentName = studentName;
        this.courseId = courseId;
        this.courseName = courseName;
        this.city = city;
    }

    void display(){
        IO.println("Display method");
        IO.println("Student rollNumber : " + rollNumber +
                "\nstudent name : " + studentName);
    }

    @Override
    public String toString() {
        return  "\nroll number : " + rollNumber +
                "\nstudent name : " + studentName +
                "\ncourse id : " + courseId +
                "\ncourse name : " + courseName +
                "\ncity : " + city;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.courseId == ((Student) obj).courseId;
    }
}