public class InstructorManager extends UserManager{


    public void Add(User instructor) {
        System.out.println("'" + instructor.getFirstName() + " " + instructor.getLastName() + "' Eğitmen olarak '" + instructor.getUserName() + "' kullanıcı adı ile sisteme eklenmiştir.");

    }

}