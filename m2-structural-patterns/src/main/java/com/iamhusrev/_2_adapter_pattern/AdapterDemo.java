package com.iamhusrev._2_adapter_pattern;

// Client test
public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song1.mp3");
        player.play("mp4", "video1.mp4");
        player.play("vlc", "movie1.vlc");
        player.play("avi", "oldmovie.avi");
    }
}