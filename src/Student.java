public class Student extends User{

    private int studentAge;

    public Student() {

    }

    public Student(int userId, String userName, String firstName, String lastName, String email, String password,
                   int studentAge) {
        super(userId, userName, firstName, lastName, email, password);
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}