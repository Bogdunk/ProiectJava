package com.company;

import com.company.servicii.Audit;

import java.sql.*;
import java.util.Scanner;

public class VinDB {
    public static void AdaugaVin() {


        try {
            // Connection
            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();


            /**Aici folosesc insert**/
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti id_ul vinului: ");
            int id;
            id = scanner.nextInt();

            System.out.println("\nIntroduceti numele vinului: ");
            String nume = "";
            nume = scanner.next();

            System.out.println("\nIntroduceti acoolemia vinului: ");
            float alcoolemie;
            alcoolemie = scanner.nextFloat();

            System.out.println("\nIntroduceti cantitatea de vin: ");
            int cantitate;
            cantitate = scanner.nextInt();

            String operatie = "INSERT INTO Vin(id_vin, nume, alcoolemie,cantitate) VALUES ('"+id+"', '"+nume+"', '"+alcoolemie+"', '"+cantitate+"');";

            PreparedStatement ps = conexiune.prepareStatement(operatie);
            int status = ps.executeUpdate();
            if (status != 0) {
                System.out.println("Conexiunea a fost un succes! \n ");

                Audit.set_action("Am introdus vinul " + id + " in baza de date");
            } else
                System.out.println("Eroare de conexiune \n");

        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void AfiseazaVinDB(){

        try {

            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();

            ResultSet result = statement.executeQuery("select * from vin;");


            while (result.next()) {
                System.out.println(result.getString("id_vin") + ", " + result.getString("nume") + ", " + result.getString("alcoolemie") + ", " + result.getString("cantitate") );

            }

            Audit.set_action("Am afisat lista de vinuri in baza de date.");

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }
    public static void StergeVin(){

        try{
            // Connection
            Connection conexiune = DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");


            Statement statement = conexiune.createStatement();
            Scanner scan = new Scanner(System.in);
            System.out.println("\nIntroduceti id-ul vinului pe care doriti sa il stergeti din baza de date: ");
            int idVin;
            idVin = scan.nextInt();
            String operatie3 = ("delete from vin where id_vin = '" +idVin+ "'");
            PreparedStatement ps = conexiune.prepareStatement(String.valueOf(operatie3));
            int status3 = ps.executeUpdate();
            if (status3 != 0) {
                System.out.println("Eliminare reusita\n ");
                Audit.set_action("Am sters vinul cu id-ul " + idVin+ " din baza de date.");
            } else
                System.out.println("Eroare conexiune\n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
    public static void updateVin(){

        try{
            Connection conexiune= DriverManager.getConnection("jdbc:mysql://localhost:3306/FermaViticolaJava", "root", "root");

            Statement statement = conexiune.createStatement();
            Scanner scan = new Scanner(System.in);
            System.out.println("\nModifica informatiile despre vin:\n");
            System.out.println("\nModifica id-ul.");

            int VinId;
            System.out.println("\nIntroduceti id-ul vinului pe care doriti sa il modificati:");
            VinId = scan.nextInt();

            System.out.println("\nIntroduceti noul id. ");
            int VinIdNou;
            VinIdNou = scan.nextInt();
            String operatiebd = (" update vin set  id_vin = '" + VinIdNou + "' where id_vin = '" + VinId + "'");
            PreparedStatement ps1 = conexiune.prepareStatement((operatiebd));
            int status1 = ps1.executeUpdate();
            if (status1 != 0) {
                System.out.println("Modificare reusita\n ");
                Audit.set_action("Am modificat id-ul vinului" +VinIdNou+ "in baza de date.");
            } else System.out.println("Conexiune nereusita\n");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
