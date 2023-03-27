package ThreadPriority;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new first();
        Thread th2 = new second();
        Thread th3 = new third();
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th3.setPriority(Thread.NORM_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
    }
}
