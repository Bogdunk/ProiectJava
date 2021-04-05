package com.company;

public class Main {

    public static void main(String[] args) {

        Vin Chardonnay = new Vin(240, "Chardonnay", 17.5f, 2000);
        Chardonnay.print();

        System.out.println();

        vin_rosu Merlot = new vin_rosu(560, "Merlot", 22.5f, 5050, " aroma de migdala si parfum de trandafir.");
        Merlot.print_vin_rosu();

        System.out.println();

        Angajat Ionescu_Stefan = new Angajat("Ionescu Stefan", 27, "zilier");
        Angajat Mihaila_Gabriela = new Angajat("Mihaila Gabriela", 53, "sef de echipa");

        Ionescu_Stefan.arata_angajat();
        System.out.println();
        System.out.println();

        echipa Echipa_1 = new echipa(275, new Angajat[]{Ionescu_Stefan, Mihaila_Gabriela});
        Echipa_1.show_the_team();

        System.out.println();

        Task intretinere = new Task( new String[]{"cercuire", "semanat"} );
        intretinere.arata_task_parcele( Echipa_1 );


    }
}

/**
 * Prin acest proiect eu gestionez o ferma viticola
 * ferma viticola are in evidenta mai multe parcele care vor fi intretinute de mai multi angajati in echipe, fiecare echipa este condusa de un sef_de_echipa care apartine de clasa angajat
 * vinul este si el gestionat prin clasa Vin care se imparte in clasele vin_rosu, vin_alb
 * voi implementa si un meniu in care vor fi prezentate sortimente( asemeni unui meniu de restaurant ) care sa ajute la selectarea unei comenzi
 * voi crea si o clasa comanda( cu posibilitatea pt cumparator de a achizitiona vin f2f sau online )
 * am creat clasa task pentru e tine in evidenta si activitatile de intretinere ale fermei
 * o sa introduc o clasa care tine cont de parcelele fermei viticole si o sa o combin cu clasa task
 *
 */