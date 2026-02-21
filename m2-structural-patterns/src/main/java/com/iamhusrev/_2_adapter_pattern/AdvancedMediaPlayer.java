package com.iamhusrev._2_adapter_pattern;

// Adaptee (Incompatible class)
class AdvancedMediaPlayer {
    void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }

    void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}