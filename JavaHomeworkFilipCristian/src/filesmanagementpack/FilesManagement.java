package filesmanagementpack;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesManagement {

    public static void writeToFile() {
        try {
            String content = " Write a string into a file specified as parameter. ";
            //Specify the file name and path here
            File file = new File("D:\\Documents\\programare\\java\\FilesManagementOutput.txt");

            //Here true is to append the content to file
            FileWriter fw = new FileWriter(file, true);

            //BufferedWriter writer give better performance
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            //Closing BufferedWriter Stream
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Documents\\programare\\java\\FilesManagementOutput.txt"));

            StringBuffer stringBuffer = new StringBuffer();

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line).append("\n");
            }
            System.out.println(stringBuffer);

        } catch (IOException ioe) {
            System.out.println("The file doesn't exist.");
        }
    }

    public static void appendToFile() {
        try {
            String filename = "D:\\Documents\\programare\\java\\FilesManagementOutput.txt";
            FileWriter fw = new FileWriter(filename, false); //the true will append the new data
            fw.write("add a line\n");//appends the string to the file

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void deleteContent() throws IOException {
        try {
            PrintWriter writer = new PrintWriter("D:\\Documents\\programare\\java\\FilesManagementOutput.txt");
            writer.print("");
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    

}
