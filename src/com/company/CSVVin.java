package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class CSVVin {

    private final static String path = "src/com/company/files/vin.csv";

    public static void scrieVin(Vin wine )
    {
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter((path), true);

            String stringBuilder = wine.getId_vin() +
                    "," + wine.getNume()+
                    "," + wine.getCantitate()+
                    "," + wine.getAlcoolemie()+
                    "\n";

            fileWriter.write(stringBuilder);
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("A aparut o eroare.");
        }
    }
}
