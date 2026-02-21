package com.iamhusrev._6_bridge_pattern;

// Client
public class BridgeDemo {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl tvRemote = new AdvancedRemoteControl(tv);
        RemoteControl radioRemote = new AdvancedRemoteControl(radio);

        tvRemote.togglePower(true);
        tvRemote.volumeUp();
        ((AdvancedRemoteControl) tvRemote).mute();
        tvRemote.togglePower(false);

        System.out.println("-------------------");

        radioRemote.togglePower(true);
        radioRemote.volumeDown();
        ((AdvancedRemoteControl) radioRemote).mute();
        radioRemote.togglePower(false);
    }
}