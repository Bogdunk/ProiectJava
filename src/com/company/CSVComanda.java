package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class CSVComanda{

    private final static String path = "src/com/company/files/comanda.csv";

    public static void scrieComanda(comanda order)
    {
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter((path), true);

            String stringBuilder = order.getId_comanda() +
                    "," + order.getNume_client()+
                    "," + order.getAdresa_client()+
                    "," + order.getProdus_comandat()+
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
