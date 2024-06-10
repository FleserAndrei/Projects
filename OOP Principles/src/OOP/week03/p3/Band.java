package OOP.week03.p3;

public class Band {
    private Guitarist guitarist;
    private Drummer drummer;
    private Song song;

    Band(Guitarist guitarist, Drummer drummer){
        this.guitarist = guitarist;
        this.drummer = drummer;
    }

    void performSong(Song song){
        this.song = song;
        guitarist.playGuitar();
        drummer.playDrums();
        System.out.println("Band is preforming: " + song.getTitle());
    }
}
