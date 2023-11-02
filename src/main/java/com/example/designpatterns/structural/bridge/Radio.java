package com.example.designpatterns.structural.bridge;

public class Radio implements Device {

    private int channel;
    private int volume;
    private boolean isEnabled;

    public Radio() {
        this.channel = 0;
        this.volume = 0;
        this.isEnabled = false;
    }

    @Override
    public boolean isEnabled() {
        if (this.isEnabled) {
            System.out.println("Radio is enabled");
        } else {
            System.out.println("Radio is disabled");
        }
        return isEnabled;
    }

    @Override
    public void enable() {
        if (!this.isEnabled) {
            System.out.println("Enabling Radio...");
            this.isEnabled = true;
        }
    }

    @Override
    public void disable() {
        if (this.isEnabled) {
            System.out.println("Disabling Radio...");
            this.isEnabled = false;
        }
    }

    @Override
    public int getVolume() {
        System.out.println("Radio volume: " + this.volume + "%");
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 0 && percent <= 100) {
            System.out.println("Changing Radio Volume...");
            this.volume = percent;
        } else {
            System.out.println("Radio volume can be between 0 and 100%");
        }
    }

    @Override
    public int getChannel() {
        System.out.println("Radio channel: " + this.channel);
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 10) {
            System.out.println("Changing Radio Channel...");
            this.channel = channel;
        } else {
            System.out.println("Radio channel can be between 1 and 10");
        }
    }
}
