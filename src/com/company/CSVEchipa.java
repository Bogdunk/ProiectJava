package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class CSVEchipa {

    private final static String path = "src/com/company/files/echipa.csv";

    public static void scrieEchipa(echipa team )
    {
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter((path), true);

            String stringBuilder = team.getId_echipa() +
                    "," + team.getTeam()+
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
