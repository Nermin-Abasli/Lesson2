package org.example.structural;

import java.util.Optional;

public class Adapter {
}
interface MediaPlayer{
    void play (String fileName);
}
class Mp3Player implements MediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing"+ fileName);
    }
}
class Mp4Player{
    public void play(String fileName){
        System.out.println("Playing"+ fileName);

    }
}

class Mp4Adapter implements MediaPlayer{
    private final  Mp4Player mp4Player;
    public Mp4Adapter(Mp4Player mp4Player){
        this.mp4Player=mp4Player;
    }
    public void play(String fileName){
        mp4Player.play(fileName);
    }
    public static void main(String[] args){
        MediaPlayer player=new Mp4Adapter(new Mp4Player());
        player.play("mp4/a.wav");
    }
}
