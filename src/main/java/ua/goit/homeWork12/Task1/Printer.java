package ua.goit.homeWork12.Task1;

public class Printer implements Runnable {
    private int sec;


    @Override
    public void run() {
        while (true) {
            sec = TimeAfterStart.getSec();
            boolean printed = TimeAfterStart.isPrinted();
                if (sec != 0 && !printed) {
                    if (sec % 5 == 0) {
                        System.out.println("Прошло 5 секунд");
                    } else {
                        System.out.println(sec);
                    }
                    TimeAfterStart.setPrinted(true);
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}
