package ua.goit.homeWork12.Task1;

import java.util.Date;

public class Timer implements Runnable {
    private Date date;
    private int sec;
    private final int startTime;


    public Timer(Date startDate) {
        this.startTime = (int) startDate.getTime();
    }

    @Override
    public void run() {
        while (true) {
            date = new Date();
            int newSec = (int) (date.getTime() - startTime) / 1000;
            if (newSec != TimeAfterStart.getSec()) {
                TimeAfterStart.setSec(newSec);
                TimeAfterStart.setPrinted(false);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
