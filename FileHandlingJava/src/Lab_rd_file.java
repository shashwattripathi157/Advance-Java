import  java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Lab_rd_file {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("user enter the file name");
        String fileName=sc.nextLine();
        String temp=new String();
        System.out.println(fileName);
        File myfile =new File(fileName);
        try{
            Scanner file=new Scanner(myfile);
            while(file.hasNextLine()){
                 String str=file.nextLine();
                 System.out.println(str);
                 temp=str;

            }
            file.close();

        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println(temp);
        int c=0;
        char[] ch=temp.toCharArray();
        for (int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                c++;
            }
        }
        if(c>0){
            System.out.println(true);
        }
        else
            System.out.println(false);

    }
}
