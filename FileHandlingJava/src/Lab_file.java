import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab_file {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a file name");
        String fileName=sc.nextLine();
        System.out.println("enter the content fro the file ");
        String fileData=sc.nextLine();

        File lab=new File(fileName);
        try {
            FileWriter fileWriter=new FileWriter(fileName);
            fileWriter.write(fileData);
            lab.createNewFile();
            fileWriter.close();

        }catch (IOException e){
            System.out.println(e);
        }


    }

}
