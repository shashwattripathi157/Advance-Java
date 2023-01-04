import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorld  {
    public static void main(String[] args) {
        File myFile = new File("Hello.txt");
        try {
            myFile.createNewFile();
            if (myFile.exists()) {
                System.out.println("File Exists" + myFile.getName());
            } else {
                myFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Unable to create file");
            System.out.println(e);
        }

    }


}
