import java.util.Scanner;

public class InstructorManager extends UserManager{

    @Override
    public void Add() {
        Instructor instructor = new Instructor();
        instructor.setUserId(101);

        System.out.print("Kullanıcı Adı: ");
        Scanner kadi = new Scanner(System.in);
        instructor.setUserName(kadi.next());

        System.out.print("Eğitmen Adı: ");
        Scanner ad = new Scanner(System.in);
        instructor.setFirstName(ad.next());

        System.out.print("Eğitmen Soyadı: ");
        Scanner soyad = new Scanner(System.in);
        instructor.setLastName(soyad.next());

        System.out.print("Mail Adresi: ");
        Scanner mail = new Scanner(System.in);
        instructor.setEmail(mail.next());

        System.out.print("Password: ");
        Scanner pass = new Scanner(System.in);
        instructor.setPassword(pass.next());

        System.out.print("Mezun Olduğu Okul: ");
        Scanner okul = new Scanner(System.in);
        instructor.setGraduate(okul.next());

        Mesaj(instructor);
    }

    @Override
    public void Update() {
        System.out.println("Kullanıcı Bilgileri Güncellenmiştir.");
    }

    @Override
    public void Remove() {
        System.out.println("Kullanıcı Sistemden Silinmiştir.");
    }

    @Override
    public void Mesaj(User user) {
        System.out.println("'" + user.getFirstName() + " " + user.getLastName() + "' Eğitmen olarak '" + user.getUserName() + "' kullanıcı adı ile sisteme eklenmiştir.");
    }
}
