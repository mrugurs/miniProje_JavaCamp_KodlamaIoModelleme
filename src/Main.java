import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("1. Öğrenci Kayıt\n2. Eğitmen Kayıt\n3. Bilgi Güncelleme\n4. Kullanıcı silme\nLütfen Bir Seçim Yapın: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1) {
            StudentManager userManager = new StudentManager();
            userManager.Add();
        }
        else if (input == 2) {
            UserManager userManager = new InstructorManager();
            userManager.Add();
        }
        else if (input == 3){
            UserManager userManager = new UserManager();
            userManager.Update();
        }
        else if (input == 4){
            UserManager userManager = new UserManager();
            userManager.Remove();
        }
        else {
            System.out.println("Geçersiz Giriş!!");
        }
    }
}