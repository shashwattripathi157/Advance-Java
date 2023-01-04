import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

public class VovCount {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int ch;

            System.out.println("Main menu");
            System.out.println("1.....Create File");
            System.out.println("2.....Input to File");
            System.out.println("Input :");
            ch=inp.nextInt();
            switch (ch){
                case 1:
                    f_create();
                    break;
                case 2:
                    f_input();
                    break;
                case 0:
                    break;

                default:
                    System.out.println("error!!!");

            }
    }
   public static void f_create(){
        Scanner f=new Scanner(System.in);
       System.out.println("Crate a File");
       String fName;
       System.out.println("Enter a file name ");
       fName=f.nextLine();

       try {
           FileWriter fW=new FileWriter(fName);
           fW.write("Hello");
           fW.close();
       }catch (IOException e){
           System.out.println(e);
       }



    }
    public static void f_input(){
        System.out.println("Input into a file");

    }
}

