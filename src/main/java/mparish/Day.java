package mparish;

public class Day {
    private String day;

    private int start;

    private int end;

    public Day() {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    private String getMeridianFromHour(int hour){
        if(hour < 12){
            return "AM";
        }
        return "PM";
    }

    public String calculateTimeStart() {
        int hour = start / 60;
        int minute = start % 60;
        String meridian = getMeridianFromHour(hour);
        if (hour == 0) {
            hour = 12;
        }
        if (hour > 12) {
            hour = hour - 12;
        }
        return String.format("%d:%02d %s", hour, minute, meridian);
    }
}
