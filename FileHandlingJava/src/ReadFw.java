import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReadFw {
    public static void main(String[] args) {
        try{
            File readFW=new File("Hello.txt");
            Scanner sc=new Scanner(readFW);
            while (sc.hasNext()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (IOException e){
            System.out.println(e);
        }

    }

}
