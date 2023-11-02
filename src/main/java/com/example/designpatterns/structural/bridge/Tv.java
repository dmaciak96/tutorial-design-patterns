package com.example.designpatterns.structural.bridge;

public class Tv implements Device {
    private int channel;
    private int volume;
    private boolean isEnabled;

    public Tv() {
        this.channel = 0;
        this.volume = 0;
        this.isEnabled = false;
    }

    @Override
    public boolean isEnabled() {
        if (this.isEnabled) {
            System.out.println("TV is enabled");
        } else {
            System.out.println("TV is disabled");
        }
        return this.isEnabled;
    }

    @Override
    public void enable() {
        if (!this.isEnabled) {
            System.out.println("Enabling TV...");
            this.isEnabled = true;
        }
    }

    @Override
    public void disable() {
        if (this.isEnabled) {
            System.out.println("Disabling TV...");
            this.isEnabled = false;
        }
    }

    @Override
    public int getVolume() {
        System.out.println("TV volume: " + this.volume + "%");
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 0 && percent <= 100) {
            System.out.println("Changing TV Volume...");
            this.volume = percent;
        } else {
            System.out.println("Tv volume can be between 0 and 100%");
        }
    }

    @Override
    public int getChannel() {
        System.out.println("TV channel: " + this.channel);
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 10) {
            System.out.println("Changing TV Channel...");
            this.channel = channel;
        } else {
            System.out.println("Tv channel can be between 1 and 10");
        }
    }
}
