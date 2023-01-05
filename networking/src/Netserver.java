import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class Netserver {
    public static void main(String[] args) {
        ServerSocket ss= null;
        try {
            ss = new ServerSocket(4999);
            Socket s=ss.accept();
            System.out.println("connection established !!!");
            InputStreamReader in=new InputStreamReader(s.getInputStream());
            Scanner sc=new Scanner(in);
            String str=sc.nextLine();
            System.out.println("client :"+str);

        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
