package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class CSVTask {

    private final static String path = "src/com/company/files/task.csv";

    public static void scrieTask(Task task )
    {
        FileWriter fileWriter;
        try{
            fileWriter = new FileWriter((path), true);

            String stringBuilder = task.getTaskuri() +
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
