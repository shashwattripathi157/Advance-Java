import java.util.*;
class t1 extends Thread {
    @Override
    public void run() {
        int c=0;
        while (c<100) {
            c++;
            System.out.println("t1 is running "+c);

        }
    }
}
class t2 extends Thread {
    @Override
    public void run() {
        int j=0;
        while (j<100) {
            j++;
            System.out.println("t2 is running "+j);

        }
    }
}
public class SimpleThread {
    public static void main(String[] args) {
        t1 thread1=new t1();
        t2 thread2=new t2();
        thread1.start();
        thread2.start() ;
    }
}
