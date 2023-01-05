import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;


class Fcreate implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File name");
        String Fname=sc.nextLine();
        System.out.println("Enter File data");
        String fileData=sc.nextLine();

        File fw=new File(Fname);
        try {
            FileWriter file=new FileWriter(Fname);
            file.write(fileData);
            file.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
class Fdelete implements Runnable{
    public void run() {
        try {
            Thread.sleep(10000);
            File fdel = new File("auto.txt");
            if (fdel.delete()) {
                System.out.println("delete");
            } else {
                System.out.println("done!");
                System.exit(0);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Threaded_Files {
    public static void main(String[] args) {
        Fcreate create=new Fcreate();
        Thread t1=new Thread(create);

        Fdelete delete=new Fdelete();
        Thread t2=new Thread(delete);


        t1.start();
        t2.start();

    }
}
