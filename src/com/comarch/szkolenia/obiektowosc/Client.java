package com.comarch.szkolenia.obiektowosc;

public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    Client(String name, String surname, int age, long pesel) {
        this(name, surname);
        this.age = age;
        this.pesel = pesel;
    }

    Client(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public Client() {

    }

    int dodaj(int a, int b) {
        return a+b;
    }

    double dodaj(double a, double b) {
        System.out.println("inne dodawanie !!");
        return a+b;
    }

    int cos() {
        return 15;
    }

    void powiedzCos() {
        System.out.println("cos mowie !!");
    }

    void powiedzTo(String text) {
        if(text == "ABC") {
            return;
        }
        System.out.println(text);
    }

    void przedstawSie() {
        powiedzImie();
        powiedzNazwisko();
        powiedzWiek();
        powiedzPesel();
    }

    void powiedzImie() {
        System.out.println(this.name);
    }

    void powiedzNazwisko() {
        System.out.println(surname);
    }

    void powiedzWiek() {
        System.out.println(age);
    }

    void powiedzPesel() {
        System.out.println(pesel);
    }

    class Cos {
        int a;
        int b;
    }
}
