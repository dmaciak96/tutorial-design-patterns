package com.example.designpatterns.structural.bridge;

public class Remote {
    private final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public int volumeDown() {
        device.setVolume(device.getVolume() - 5);
        return device.getVolume();
    }

    public int volumeUp() {
        device.setVolume(device.getVolume() + 5);
        return device.getVolume();
    }

    public int channelUp() {
        device.setChannel(device.getChannel() + 1);
        return device.getChannel();
    }

    public int channelDown() {
        device.setChannel(device.getChannel() - 1);
        return device.getChannel();
    }
}
