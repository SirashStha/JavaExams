package Multithreading.RunnableInterface;

public class ThreadDemo implements Runnable{
    @Override
    public void run() {
        try {
            for (int i=1;i<=10;i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (Exception e) {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }

    public static void main(String[] args) {
            Thread th = new Thread(new ThreadDemo());
            th.start();

    }
}
