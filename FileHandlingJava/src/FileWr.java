import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWr {
    public static void main(String[] args) {
        try {
            FileWriter filewr =new FileWriter("Hello.txt");
            filewr.write("this is a file\n bie!!!");
            filewr.close();
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
