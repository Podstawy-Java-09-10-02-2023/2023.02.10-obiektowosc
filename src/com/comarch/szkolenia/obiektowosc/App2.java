package com.comarch.szkolenia.obiektowosc;

public class App2 {
    public static void main(String[] args) {
        Client client = new Client(
                "Wiesiek",
                "Malinowski",
                50,
                123123123);

        System.out.println(client.name);
        System.out.println(client.surname);
        System.out.println(client.age);
        System.out.println(client.pesel);

        client.powiedzImie();

        Client client2 = new Client(
                "Zbyszek",
                "Kowalski",
                50,
                123123123);

        client2.powiedzImie();

        client2.address = new Address();
        client2.address.street = "Ogrodowa";
        client2.address.no = "10/2";
        client2.address.postCode = "12-123";

        /*com.comarch.szkolenia.obiektowosc.Address address = new com.comarch.szkolenia.obiektowosc.Address();
        address.street = "Ogrodowa";
        address.no = "12/12";
        address.postCode = "12-123";

        client2.address = address;*/

    }
}
