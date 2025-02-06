package org.example.module2_object_orientation.c05_interfaces;

public class MusicPlayer implements Playable{
    private String currentSong;

    public MusicPlayer(String song) {
        this.currentSong = song;
    }

    @Override
    public void play() {
        System.out.println("Playing Music: " + currentSong);
    }
}
