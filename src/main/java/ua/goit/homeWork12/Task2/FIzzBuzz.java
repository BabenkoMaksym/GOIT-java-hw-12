package ua.goit.homeWork12.Task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FIzzBuzz {
    private static int number = 1;

    public static int getNumber() {
        return number;
    }

    public static synchronized void setNumber(int number) {
        FIzzBuzz.number = number;
    }

    public void run(int lastNumber) {
        Thread a =new Thread(new PrintFizz());
        Thread b =new Thread(new PrintBuzz());
        Thread c =new Thread(new PrintFizzBuzz());
        Thread d =new Thread(new PrintNumber());

        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < lastNumber; i++) {
            if (number % 15 == 0) {
                service.execute(new PrintFizzBuzz());
            } else if (number % 3 ==0) {
                service.execute(new PrintFizz());
            } else if (number % 5 ==0) {
                service.execute(new PrintBuzz());
            } else {
                service.execute(new PrintNumber());
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number++;
        }
    }
}
