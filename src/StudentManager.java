public class StudentManager extends UserManager{


    public void Add(User student) {
        System.out.println("'" + student.getFirstName() + " " + student.getLastName() + "' Öğrenci olarak '" + student.getUserName() + "' kullanıcı adı ile sisteme eklenmiştir.");

    }
}