package dataAccess;

import java.io.*;

public class FileDataAccess implements DataAccess {
    String currentLine;

    @Override
    public void readData (String fileName) {
        System.out.println("\nStart to read a new file about your Electrical Appliance:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((currentLine = br.readLine()) !=null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeData (String fileName, String content) {
        System.out.println("\nStart to write information about your Electrical Appliance into a new file:");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
            System.out.println("Information about your object has been successfully written into file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
