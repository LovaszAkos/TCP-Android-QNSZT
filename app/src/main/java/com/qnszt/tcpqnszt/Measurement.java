package com.qnszt.tcpqnszt;

public class Measurement {
    String name;
    int duration;
    int delay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDuration(String duration) {
        try {
            setDuration(Integer.parseInt(duration));
        } catch (Exception e) {
            setDuration(0);
        }
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay; //map(delay, 50, 100, 20, 10).intValue();
    }

    Float map(float x, float in_min, float in_max, float out_min, float out_max)
    {
        return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }

    public void setDelay(String delay) {
        try {
            setDelay(Integer.parseInt(delay));
        } catch (Exception e) {
            setDelay(0);
        }
    }
}
