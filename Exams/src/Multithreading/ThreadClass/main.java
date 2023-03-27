package Multithreading.ThreadClass;

public class main {
    public static void main(String[] args) {
            //Multi Threading using Thread Class
            Thread f = new first();
            Thread s = new second();
            f.start();
            s.start();
    }
}
