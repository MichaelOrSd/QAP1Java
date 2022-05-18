package problem2;

public class TestTime {
    
    public static void main (String[] args) {

        Time time1 = new Time(0, 0, 0);
        Time time2 = new Time(0, 0, 0);
        Time time3 = new Time(0, 0, 0);
        Time time4 = new Time(0, 0, 0);

        time1.setTime(21, 10, 59);
        time2.setTime(10, 20, 0);
        time3.setTime(11, 59, 59);
        time4.setTime(12, 0, 0);

        System.out.println("Time object time1 = " + time1);
        System.out.println("Time object time2 = " + time2);
        System.out.println("Time object time3 = " + time3);
        System.out.println("Time object time4 = " + time4);
        System.out.println("============================");

        time1.nextSecond();
        time3.nextSecond();

        time2.previousSecond();
        time4.previousSecond();

        System.out.println("NextSecond of Time1 = " + time1);
        System.out.println("PreviousSecond of Time2 = " + time2);
        System.out.println("NextSecond of Time3 = " + time3);
        System.out.println("PreviousSecond of Time4 = " + time4);

    }

}
