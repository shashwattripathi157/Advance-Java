import com.sun.tools.javac.Main;

public class Threads extends Thread{
    public static void main(String[] args) {
        Threads thread=new Threads();
        thread.start();
        System.out.println("the code is outside thread");
    }

    public void run(){

            int c=1;
            c++;
            //delay(500);
            System.out.println(c);


    }
}
