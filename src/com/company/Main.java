package com.company;

public class Main {

    public static void main(String[] args) {

        /**Etapa 1**/
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

        comanda com1 = new comanda(1763,"Teodorescu Cosmin","Strada Independentei nr.78", "vin Chardonnay 50L");

        /**Etapa 2**/

        //CSVAngajat.scrieAngajat(Ionescu_Stefan);
        //Audit.set_action("Am adaugat angajatul " + Ionescu_Stefan.getNume() );

        ///CSVVin.scrieVin(Chardonnay);
        //Audit.set_action("Am adaugat un sortiment nou de vin " + Chardonnay.getNume() );

        //CSVComanda.scrieComanda(com1);
        //Audit.set_action("A fost introdusa o noua comanda avand id-ul " + com1.getId_comanda() );

        //CSVTask.scrieTask(intretinere);
        //Audit.set_action("Am atribuit unei echipe noi task-uri: " + intretinere.getTaskuri() );

        //CSVEchipa.scrieEchipa(Echipa_1);
        //Audit.set_action("Astazi o noua echipa a intrat la munca: id->" + Echipa_1.getId_echipa() + " si muncitorii-> " + Echipa_1.getTeam());
        System.out.println("\n\n\n\n\n");

        /**Etapa 3*/

        //VinDB.AdaugaVin();
        //VinDB.AfiseazaVinDB();
        //VinDB.StergeVin();
        //VinDB.updateVin();

        //ComandaDB.AdaugaComanda();        /**/
        //ComandaDB.AfiseazaComandaDB();
        //ComandaDB.StergeComanda();
        //ComandaDB.updateComanda();

        //AngajatDB.AdaugaAngajat();
        //AngajatDB.AfiseazaAngajatDB();
        //AngajatDB.StergeAngajat();
        //AngajatDB.updateAngajat();

        //ClientDB.AdaugaClient();
        //ClientDB.AfiseazaCLientDB();
        //ClientDB.StergeClient();
        //ClientDB.updateClient();

        Meniu.getInstance().method();           ///meniu

    }
}

