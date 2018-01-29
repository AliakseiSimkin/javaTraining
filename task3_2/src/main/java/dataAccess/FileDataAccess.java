package dataAccess;

import electricalAppliances.ElectricalAppliances;

import java.io.*;

public class FileDataAccess implements DataAccess {
    String filePath = "dataFile.txt";
    String currentLine;
    String outputData;

    @Override
    public String readData () {
        System.out.println("\nStart to read a new file about your Electrical Appliance:");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((currentLine = br.readLine()) !=null) {
                System.out.println(currentLine);
                outputData += currentLine + " ";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputData;
    }

    @Override
    public void writeData (ElectricalAppliances electricalAppliances) {
        System.out.println("\nStart to write information about your Electrical Appliance into a new file:");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(electricalAppliances.toString());
            System.out.println("Information about your object has been successfully written into file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
