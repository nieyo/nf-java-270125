package org.example.module2_object_orientation.c05_interfaces;

public class VideoPlayer implements Playable{
    private String currentVideo;

    public VideoPlayer(String video) {
        this.currentVideo = video;
    }

    @Override
    public void play() {
        System.out.println("Playing Video: " + currentVideo);
    }
}
