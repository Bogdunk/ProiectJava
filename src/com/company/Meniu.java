package com.company;

import java.util.Scanner;

public class Meniu {

    private static Meniu menu = null;

    private Meniu() {
    }

    public static Meniu getInstance() { //static method to create instance of singleton class
        if (menu == null) { //to ensure only one instance is created
            menu = new Meniu();
        }
        return menu;
    }

    public void method(){

        Scanner scanner  = new Scanner(System.in);
        int optiune;
        do {




        System.out.println("Alegeti o optiune:\n");
        System.out.println("Client\n");
        System.out.println("1.Afisare lista vinuri\n");
        System.out.println("2.Adauga vin\n");
        System.out.println("3.Update vin\n");
        System.out.println("4.Sterge vin\n");
        System.out.println("Comanda\n");
        System.out.println("5.Afisare comenzi\n");
        System.out.println("6.Adauga comanda\n");
        System.out.println("7.Stergere comanda\n");
        System.out.println("8.Update comenda\n");
        System.out.println("Angajati\n");
        System.out.println("9.Afisare angajati\n");
        System.out.println("10.Stergere angajati\n");
        System.out.println("11.Update angajati\n");
        System.out.println("12.Adauga angajat\n");
        System.out.println("Clienti\n");
        System.out.println("13.Afisare clienti\n");
        System.out.println("14.Update clienti\n");
        System.out.println("15.Stergere clienti\n");
        System.out.println("16.Adauga\n");
        System.out.println("17.EXIT\n");

        System.out.println("Introduceti varianta dorita: ");
        optiune = scanner.nextInt();


        switch (optiune) {

            case 1:
                System.out.println("Vinuri\n");
                VinDB.AfiseazaVinDB();
                break;

            case 2:
                VinDB.AdaugaVin();
                break;

            case 3:
                VinDB.updateVin();
                break;


            case 4:
                VinDB.StergeVin();
                break;


            case 5:
                ComandaDB.AfiseazaComandaDB();
                break;

            case 6:
                ComandaDB.AdaugaComanda();
                break;

            case 7:
                ComandaDB.StergeComanda();
                break;

            case 8:
                ComandaDB.updateComanda();
                break;

            case 9:
                AngajatDB.AfiseazaAngajatDB();
                break;

            case 10:
                AngajatDB.StergeAngajat();
                break;

            case 11:
                AngajatDB.updateAngajat();
                break;

            case 12:
                AngajatDB.AdaugaAngajat();
                break;

            case 13:
                ClientDB.AfiseazaCLientDB();
                break;

            case 14:
                ClientDB.updateClient();
                break;

            case 15:
                ClientDB.StergeClient();
                break;


            case 16:
                ClientDB.AdaugaClient();
                break;

            case 17:
                System.exit(0);
                break;

            default:
                System.out.println("Wrong option. Please choose a valid option!\n");

        }
        }
        while ( optiune > 0 && optiune < 18) ;



    }
}