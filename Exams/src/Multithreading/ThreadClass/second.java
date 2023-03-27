package Multithreading.ThreadClass;

import Multithreading.RunnableInterface.ThreadDemo;

public class second extends Thread{
    @Override
    public void run() {
        for (int i = 11; i<=20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
