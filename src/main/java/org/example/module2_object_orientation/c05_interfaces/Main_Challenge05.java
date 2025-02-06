package org.example.module2_object_orientation.c05_interfaces;

public class Main_Challenge05 {
    public static void main(String[] args) {
        Playable media1 = new MusicPlayer("Bohemian Rhapsody");
        Playable media2 = new VideoPlayer("The Shawshank Redemption");

        MediaController mc = new MediaController();
         mc.playMedia(media1);
         mc.playMedia(media2);



    }
}
