public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setUserId(1);
        student1.setUserName("mugur");
        student1.setFirstName("Murat");
        student1.setLastName("UGUR");
        student1.setStudentAge(25);
        student1.setEmail("murat@gmailcom");
        student1.setPassword("dd64ed4");

        Instructor instructor1 = new Instructor();
        instructor1.setUserId(1);
        instructor1.setUserName("mrugur");
        instructor1.setFirstName("Mehmet Can");
        instructor1.setLastName("UĞUR");
        instructor1.setEmail("mrt@gmailcom");
        instructor1.setPassword("cs56468se98wef");
        instructor1.setGraduate("Ege Üniversitesi");


        UserManager userManager4 = new StudentManager();
        userManager4.Add(student1);

        UserManager userManager3 = new InstructorManager();
        userManager3.Add(instructor1);

    }
}