package problem2;

public class Time {
    
    private int hour = 0-23;
    private int minute = 0-59;
    private int second = 0-59;

    public Time (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour () {
        return hour;
    }

    public int getMinute () {
        return minute;
    }

    public int getSecond () {
        return second;
    }

    public void setHour (int hour) {
        this.hour = hour;
    }

    public void setMinute (int minute) {
        this.minute = minute;
    }

    public void setSecond (int second) {
        this.second = second;
    }

    public void setTime (int hour, int minute, int second) {
        
        
    }
}
