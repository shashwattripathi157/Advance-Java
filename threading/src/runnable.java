class thread1 implements Runnable{
    public void run(){
        while (true) {
            try {
                Thread.sleep(400);
                System.out.println("this is thread 1");


            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class thread2 implements Runnable {
    public void run(){
        while (true) {
            try {
                Thread.sleep(400);
                System.out.println("this is thread 2");
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
}
public class runnable {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        Thread th1=new Thread(t1);
        thread2 t2=new thread2();
        Thread th2=new Thread(t2);
        th2.start();
        th1.start();

    }
}
