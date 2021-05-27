package com.company;

import com.company.servicii.Audit;

import java.sql.*;
import java.util.Scanner;

public class ComandaDB {
    public static void AdaugaComanda() {


        try {
            // Connection
            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();


            /**Aici folosesc insert**/
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nIntroduceti numele clientului: ");
            String nume_cl = "";
            nume_cl = scanner.nextLine();
            //if( nume_cl == " " || nume_cl.isEmpty() )
            // scanner.next();


            System.out.println("Introduceti id_ul comenzii: ");
            int id;
            id = scanner.nextInt();
            /***********************/


            System.out.println("\nIntroduceti adresa clientului: ");
            String adresa_cl="";
            adresa_cl = scanner.next();

            System.out.println("\nIntroduceti produsul comandat: ");
            String produs_c="";
            produs_c = scanner.next();
            //if( produs_c == " " || produs_c.isEmpty() )
               // produs_c = scanner.nextLine();

            /********/
            String operatie = "INSERT INTO Comanda(id_comanda,nume_client,adresa_client, produs_comandat ) VALUES ('"+id+"', '"+nume_cl+"', '"+adresa_cl+"', '"+produs_c+"');";

            PreparedStatement ps = conexiune.prepareStatement(operatie);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Conexiunea a fost un succes! \n ");

                Audit.set_action("Am introdus Comanda " + id + " in baza de date");
            } else
                System.out.println("Eroare de conexiune \n");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void AfiseazaComandaDB(){

        try {

            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();

            ResultSet result = statement.executeQuery("select * from Comanda;");


            while (result.next()) {
                System.out.println(result.getString("id_comanda") + ", " + result.getString("nume_client") + ", " + result.getString("adresa_client") + ", " + result.getString("produs_comandat") );

            }

            Audit.set_action("Am afisat lista de Comenzi in baza de date.");

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }
    public static void StergeComanda(){

        try{
            // Connection
            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");


            Statement statement = conexiune.createStatement();
            Scanner scan = new Scanner(System.in);
            System.out.println("\nIntroduceti id-ul Comenzii pe care doriti sa o stergeti din baza de date: ");
            int id_c;
            id_c = scan.nextInt();
            String operatie3 = ("delete from Comanda where id_comanda = '" +id_c+ "'");
            PreparedStatement ps = conexiune.prepareStatement(String.valueOf(operatie3));
            int status3 = ps.executeUpdate();
            if (status3 != 0) {
                System.out.println("Eliminare reusita\n ");
                Audit.set_action("Am sters comanda cu id-ul " + id_c+ " din baza de date.");
            } else
                System.out.println("Eroare conexiune\n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public static void updateComanda(){

        try{
            Connection conexiune= DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();
            Scanner scan = new Scanner(System.in);
            System.out.println("\nModifica informatiile despre Comanda:\n");
            System.out.println("Modifica id-ul.");

            int VinId;
            System.out.println("\nIntroduceti id-ul Comenzii pe care doriti sa o modificati:");
            VinId = scan.nextInt();

            System.out.println("\nIntroduceti noul id. ");
            int id_c;
            id_c = scan.nextInt();
            String operatiebd = (" update Comanda set  id_comanda = '" + id_c + "' where id_comanda = '" + id_c + "'");
            PreparedStatement ps1 = conexiune.prepareStatement((operatiebd));
            int status1 = ps1.executeUpdate();
            if (status1 != 0) {
                System.out.println("Modificare reusita\n ");
                Audit.set_action("Am modificat id-ul Comenzii " +id_c+ " in baza de date.");
            } else System.out.println("Conexiune nereusita\n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
