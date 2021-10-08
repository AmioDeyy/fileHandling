package amio;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        File myFile = new File("name.txt");
        try {
            myFile.createNewFile();

        } catch (IOException e) {
            System.out.println("cannot create a new file!!!!!");
            e.printStackTrace();
        }
        try {
            FileWriter fileWriter = new FileWriter("name.txt");
            fileWriter.write("Learning File handling...\nThank You for you have come here to see my code .");
            fileWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        File m = new File("name.txt");


        try {
           Scanner s = new Scanner(m);
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        }

    }

