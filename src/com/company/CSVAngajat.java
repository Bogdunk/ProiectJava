package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class CSVAngajat {

    private final static String path = "src/com/company/files/angajat.csv";

    public static void scrieAngajat(Angajat emp)
    {
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter((path), true);

            String stringBuilder = emp.getNume() +
                    "," + emp.getVarsta()+
                    "," + emp.getPost_ocupat()+
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
