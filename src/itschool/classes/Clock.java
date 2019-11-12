package itschool.classes;

public class Clock {
    private static int time=0;

    public static int getTime() {
        return time;
    }

    public static void incTime()
    {
        time++;
    }
}
