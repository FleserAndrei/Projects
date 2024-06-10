package OOP.week03.p3;

public class iPod extends MusicPlayer {
    @Override
    void playSong(Song song){
        System.out.println("Playing song on iPod: " + song.getTitle());
    }
}
