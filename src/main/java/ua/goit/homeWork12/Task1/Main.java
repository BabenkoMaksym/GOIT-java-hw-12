package ua.goit.homeWork12.Task1;

import java.util.Date;

public class Main {
    private static final Date START_DATE = new Date();

    public static void main(String[] args) {


        Thread thread0 = new Thread(new Printer());
        Thread thread1 = new Thread(new Timer(START_DATE));
        thread1.start();
        thread0.start();

    }
}
