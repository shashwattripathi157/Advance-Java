import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Net {
    public static void main(String[] args) {
    String str=new String();
        Scanner sc=new Scanner(System.in);
        try {
            Socket sock=new Socket("localhost",4999);
            PrintWriter pr=new PrintWriter(sock.getOutputStream());
            do {
                str = sc.nextLine();
                pr.println(str);
                pr.flush();
            } while (str!="Exit");


        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
