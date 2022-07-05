package ua.goit.homeWork12.Task1;

public class TimeAfterStart {
    private static int sec = 0;
    private static boolean printed = true;

    public static boolean isPrinted() {
        return printed;
    }

    public static synchronized void setPrinted(boolean printed) {
        TimeAfterStart.printed = printed;
    }

    public static int getSec() {
        return sec;
    }


    public static synchronized void setSec(int sec) {
        TimeAfterStart.sec = sec;
    }
}
