package APIS;

import java.io.*;

public class ReadersAndBuffers {
    public static void main(String[] args) {
        //copy files with readers and buffers
        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/createdWithReaders&BuffersClasses.txt.txt";

        try( FileReader fileReader = new FileReader(sourceFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(targetFile)
        ) {
            while(true){
                String line = bufferedReader.readLine();
                if(line == null){
                    break;
                }
                fileWriter.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
