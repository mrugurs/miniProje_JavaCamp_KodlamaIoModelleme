import java.util.Scanner;

public class StudentManager extends UserManager{


    @Override
    public void Add() {
        Student student = new Student();
        student.setUserId(201);

        System.out.print("Kullanıcı Adı: ");
        Scanner kadi = new Scanner(System.in);
        student.setUserName(kadi.next());

        System.out.print("Öğrenci Adı: ");
        Scanner ad = new Scanner(System.in);
        student.setFirstName(ad.next());

        System.out.print("Öğrenci Soyadı: ");
        Scanner soyad = new Scanner(System.in);
        student.setLastName(soyad.next());

        System.out.print("Öğrenci Yaşı: ");
        Scanner yas = new Scanner(System.in);
        student.setStudentAge(yas.nextInt());

        System.out.print("Mail Adresi: ");
        Scanner mail = new Scanner(System.in);
        student.setEmail(mail.next());

        System.out.print("Password: ");
        Scanner pass = new Scanner(System.in);
        student.setPassword(pass.next());

        Mesaj(student);

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
        System.out.println("'" + user.getFirstName() + " " + user.getLastName() + "' Öğrenci olarak '" + user.getUserName() + "' kullanıcı adı ile sisteme eklenmiştir.");
    }
}
