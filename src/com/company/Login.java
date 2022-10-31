package com.company;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String enteredUsername, enteredPassword;

        String actualUsername = "username";
        String actualPassword = "password";

        String newPassword;
        String renewPassword;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz.");
        enteredUsername = scanner.next();

        System.out.println("Şifrenizi giriniz.");
        enteredPassword = scanner.next();

        if (!((enteredUsername.equals(actualUsername)) && (enteredPassword.equals(actualUsername)))) {
            System.out.println("Hatalı kullanıcı adı veya şifre. Şifrenizi sıfırlamak ister misiniz? Evet için e harfini, hayır için herhangi bir harfi tuşlayınız.");
            renewPassword = scanner.next();


            if (((renewPassword.equals("e")) || (renewPassword.equals("E")))) {

                System.out.println("Kullanıcı adınızı giriniz.");
                enteredUsername = scanner.next();

                if (enteredUsername.equals(actualUsername)) {
                    while (true) {
                        System.out.println("Yeni şifrenizi giriniz.");
                        newPassword = scanner.next();
                        if (newPassword.equals(actualPassword)) {
                            System.out.println("Lütfen farklı bir şifre deneyiniz.");
                        } else {
                            actualPassword = newPassword;
                            System.out.println("Şifreniz başarıyla değiştirildi.");
                            break;
                        }
                    }
                } else {
                    System.out.println("Kullanıcı sistemimizde bulunmamaktadır.");
                }
            } else {
                System.out.println("Çıkış yapıldı.");
            }

        } else {
            System.out.println("Başarılı bir şekilde giriş yapıldı.");
        }

    }
}
