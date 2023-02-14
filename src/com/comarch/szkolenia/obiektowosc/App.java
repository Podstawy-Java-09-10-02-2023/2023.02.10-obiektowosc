package com.comarch.szkolenia.obiektowosc;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client client = new Client();

        System.out.println(client.dodaj(4,6));
        System.out.println(client.cos());
        int z = client.cos();
        client.powiedzCos();
        client.powiedzTo("witam !!!");
        client.powiedzTo("ABC");
        client.przedstawSie();
        System.out.println(client.dodaj(4.4, 6.9));
        System.out.println();

        Random losowacz = new Random();
        int x = losowacz.nextInt(101);

        System.out.println(client);

        int[] tab = new int[10];
        System.out.println(tab);

        Client c1 = new Client();
        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 30;
        c1.pesel = 1234567;

        Client c2 = new Client();
        c2.name = "Janusz";
        c2.surname = "Kowalski";
        c2.age = 30;
        c2.pesel = 1234567;

        System.out.println(c1 == c2);

        Client c3 = c1;

        System.out.println(c3 == c1);

        String a = "Karol";
        String b = new String("Karol");

        System.out.println(a == b);

        System.out.println(a.equals(b));

        System.out.println(c1.equals(c2));

        String imie1 = "Karol";
        String imie2 = "Karol";

        System.out.println(imie1 == imie2);

        imie2 = imie2 + " Kowalski";

        System.out.println(imie1);
        System.out.println(imie2);

        System.out.println(imie1 == imie2);


    }
}
