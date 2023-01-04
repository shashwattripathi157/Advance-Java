import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleFile {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the file name to delete");
            String fName;
            fName=sc.nextLine();

           // try {
                File fW=new File(fName);
                if(fW.delete()){
                    System.out.println("the file is deleted  "+ fW.getName());
                }
                else{
                    System.out.println("Error!! file does not exist or has been deleted");
                }

           // }catch (IOException e){
               // System.out.println(e);
           // }

        }

    }


