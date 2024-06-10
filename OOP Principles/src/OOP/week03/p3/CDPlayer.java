package OOP.week03.p3;

public class CDPlayer extends MusicPlayer{
    @Override
    void playSong(Song song){
        System.out.println("Playing song on CDPlayer: " + song.getTitle());
    }
}
