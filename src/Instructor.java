public class Instructor extends User{

    private String graduate;

    public Instructor() {

    }

    public Instructor(int userId, String userName, String firstName, String lastName, String email, String password,
                      String graduate) {
        super(userId, userName, firstName, lastName, email, password);
        this.graduate = graduate;
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }
}