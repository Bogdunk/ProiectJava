package com.company;

import com.company.servicii.Audit;

import java.sql.*;
import java.util.Scanner;

public class ClientDB {
    public static void AdaugaClient() {


        try {
            // Connection
            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();


            /**Aici folosesc insert**/
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numele clientului: ");
            String nume_client="";
            nume_client = scanner.nextLine();

            System.out.println("\nIntroduceti prenumele clientului: ");
            String prenume_client = "";
            prenume_client = scanner.next();

            System.out.println("\nIntroduceti id-ul clientului: ");
            int id_client;
            id_client = scanner.nextInt();

            System.out.println("\nIntroduceti mailul de contact al clientului: ");
            String mail="";
            mail = scanner.next();

            String operatie = "INSERT INTO Client(nume_client, prenume_client, id_client, mail) VALUES ('"+nume_client+"', '"+prenume_client+"', '"+id_client+"', '"+mail+"');";

            PreparedStatement ps = conexiune.prepareStatement(operatie);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Conexiunea a fost un succes! \n ");

                Audit.set_action("Am introdus clientul cu id-ul  " + id_client + " in baza de date");
            } else
                System.out.println("Eroare de conexiune \n");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void AfiseazaCLientDB(){

        try {

            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();

            ResultSet result = statement.executeQuery("select * from Client;");


            while (result.next()) {
                System.out.println(result.getString("nume_client") + ", " + result.getString("prenume_client") + ", " + result.getString("id_client") + ", " + result.getString("mail") );

            }

            Audit.set_action("Am afisat lista de Clienti in baza de date.");

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }
    public static void StergeClient(){

        try{
            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");


            Statement statement = conexiune.createStatement();
            Scanner scan = new Scanner(System.in);
            System.out.println("\nIntroduceti id-ul clientului pe care doriti sa il stergeti din baza de date: ");
            int id_client;
            id_client = scan.nextInt();
            String operatie3 = ("delete from Client where id_client = '" +id_client+ "'");
            PreparedStatement ps = conexiune.prepareStatement(String.valueOf(operatie3));
            int status3 = ps.executeUpdate();
            if (status3 != 0) {
                System.out.println("Eliminare reusita\n ");
                Audit.set_action("Am sters clientul cu id-ul " + id_client+ " din baza de date.");
            } else
                System.out.println("Eroare conexiune\n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
    public static void updateClient(){

        try{
            Connection conexiune= DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();
            Scanner scan = new Scanner(System.in);
            System.out.println("\nModifica informatiile despre clienti:\n");
            System.out.println("\nModifica id-ul.");

            int Id;
            System.out.println("\nIntroduceti id-ul clientului pe care doriti sa il modificati:");
            Id = scan.nextInt();

            System.out.println("\nIntroduceti noul id. ");
            int IdNou;
            IdNou = scan.nextInt();
            String operatiebd = (" update Client set  id_client = '" + IdNou + "' where id_client = '" + Id + "'");
            PreparedStatement ps1 = conexiune.prepareStatement((operatiebd));
            int status1 = ps1.executeUpdate();
            if (status1 != 0) {
                System.out.println("Modificare reusita\n ");
                Audit.set_action("Am modificat id-ul cleintului" +IdNou+ "in baza de date.");
            } else System.out.println("Conexiune nereusita\n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
