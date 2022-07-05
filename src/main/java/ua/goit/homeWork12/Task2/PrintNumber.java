package ua.goit.homeWork12.Task2;

public class PrintNumber implements Runnable{
        private int number;
    @Override
    public void run() {
        number = FIzzBuzz.getNumber();
        System.out.println(number);

    }
}
