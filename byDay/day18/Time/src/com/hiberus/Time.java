package com.hiberus;

//08. Time [PENDIENTE]
//        - nextSecond()
//        - prevSecond()
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {}

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void nextSecond() {
        seconds++;

        if (seconds > 59) {
            seconds = 0;
            minutes++;
        }
        if (minutes > 59) {
            minutes = 0;
            hours++;
        }
        if (hours > 23) {
            hours = 0;
        }
    }

    public void prevSecond() {
        seconds--;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
