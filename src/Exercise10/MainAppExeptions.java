package Exercise10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainAppExeptions {

    public static void main(String args[]) {

        // 1. wrote the names to the file
        String[] names = {"Asia", "Zosia", "Ewa", "Sławek", "Pawel", "Piotr"};
        // Creates a FileWrite
        FileWriter fileNames = null;

        try {
            fileNames = new FileWriter("names.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Creates a BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(fileNames);
        try {
            // used write() Method - writes  character to the internal buffer of the writer
            for (int i = 0; i < names.length; i++) {
                bufferedWriter.write(names[i]);

                // used newLine() -	inserts a new line to the writer
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Closes the bufferedWriter and fileNames
        try {
            bufferedWriter.close();
            fileNames.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. read the names from the file
        List<String> namesList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("names.txt"));
            String line = bufferedReader.readLine();

            while(line != null) {
                namesList.add(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(namesList);

        String nameX = namesList.stream()
                .filter(name -> name.startsWith("X"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("There is no name that begins with leter X"));

        System.out.println(nameX);




    }



}
