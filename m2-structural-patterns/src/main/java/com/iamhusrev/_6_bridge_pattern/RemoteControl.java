package com.iamhusrev._6_bridge_pattern;

// Abstraction
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower(boolean on) {
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void volumeUp() {
        device.setVolume(70);
    }

    public void volumeDown() {
        device.setVolume(30);
    }
}