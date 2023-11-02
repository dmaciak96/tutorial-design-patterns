package com.example.designpatterns.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        var tv = new Tv();
        var radio = new Radio();

        var tvRemote = new Remote(tv);
        var radioRemote = new Remote(radio);

        tvRemote.togglePower();
        tvRemote.channelUp();
        tvRemote.channelDown();
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.togglePower();

        System.out.println();
        radioRemote.togglePower();
        radioRemote.channelUp();
        radioRemote.channelDown();
        radioRemote.volumeUp();
        radioRemote.volumeDown();
        radioRemote.togglePower();
    }
}
