package com.company;

import com.company.servicii.Audit;

import java.sql.*;
import java.util.Scanner;

public class AngajatDB {
    public static void AdaugaAngajat() {


        try {
            // Connection
            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();


            /**Aici folosesc insert**/
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numele angajatului: ");
            String nume="";
            nume = scanner.nextLine();

            System.out.println("\nIntroduceti varsta angajatului: ");
            int varsta_angajat;
            varsta_angajat = scanner.nextInt();

            System.out.println("\nIntroduceti postul ocupat de angajat: ");
            String post="";
            post = scanner.nextLine();
            if( post == " " || post.isEmpty())
                post = scanner.nextLine();


            String operatie = "INSERT INTO Angajat(nume,varsta,post_ocupat ) VALUES ('"+nume+"', '"+varsta_angajat+"', '"+post+"');";

            PreparedStatement ps = conexiune.prepareStatement(operatie);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Conexiunea a fost un succes! \n ");

                Audit.set_action("Am introdus Angajatul " + nume + " in baza de date");
            } else
                System.out.println("Eroare de conexiune \n");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void AfiseazaAngajatDB(){

        try {

            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();

            ResultSet result = statement.executeQuery("select * from Angajat;");


            while (result.next()) {
                System.out.println(result.getString("nume") + ", " + result.getString("varsta") + ", " + result.getString("post_ocupat") );

            }

            Audit.set_action("Am afisat lista de angajati in baza de date.");

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }
    public static void StergeAngajat(){

        try{
            // Connection
            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");


            Statement statement = conexiune.createStatement();
            Scanner scan = new Scanner(System.in);
            System.out.println("\nIntroduceti Numele pe care doriti sa il stergeti din baza de date: ");
            String nume="";
            nume = scan.nextLine();
            String operatie3 = ("delete from angajat where nume = '" +nume+ "'");
            PreparedStatement ps = conexiune.prepareStatement(String.valueOf(operatie3));
            int status3 = ps.executeUpdate();
            if (status3 != 0) {
                System.out.println("Eliminare reusita\n ");
                Audit.set_action("Am sters angajatul cu numele " + nume+ " din baza de date.");
            } else
                System.out.println("Eroare conexiune\n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public static void updateAngajat(){

        try{
            Connection conexiune= DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();
            Scanner scan = new Scanner(System.in);
            System.out.println("\nModifica informatiile despre angajati:\n");
            System.out.println("Modifica numele.");

            String nume="";
            System.out.println("\nIntroduceti numele angajatului pe care doriti sa il modificati:");
            nume = scan.nextLine();

            System.out.println("\nIntroduceti noul nume. ");
            String nume_nou="";
            nume_nou = scan.nextLine();
            String operatiebd = (" update Angajat set  nume = '" + nume_nou + "' where nume = '" + nume + "'");
            PreparedStatement ps1 = conexiune.prepareStatement((operatiebd));
            int status1 = ps1.executeUpdate();
            if (status1 != 0) {
                System.out.println("Modificare reusita\n ");
                Audit.set_action("Am modificat numele angajatului " +nume_nou+ " in baza de date.");
            } else System.out.println("Conexiune nereusita\n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
