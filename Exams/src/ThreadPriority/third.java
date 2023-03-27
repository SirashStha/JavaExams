package ThreadPriority;

public class third extends Thread{
    @Override
    public void run() {
        for (int i=21; i<=30; i++) {
            System.out.println(i);
        }
    }
}
