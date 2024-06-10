package OOP.week03.p3;

public class MusicDemo {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Gibson");
        Drumset drumset = new Drumset("Tampa Superstar");

        LeadGuitarist leadGuitarist = new LeadGuitarist(guitar);
        Drummer drummer = new Drummer(drumset);

        Band band = new Band(leadGuitarist, drummer);

        Song song = new Song("Wonderful Tonight");

        band.performSong(song);

        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.playSong(song);
    }
}
