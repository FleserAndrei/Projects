package OOP.week03.p3;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Song> songs = new ArrayList<>();
     void addSong(Song song) {
         songs.add(song);
     }
     List<Song> getSongs(){
         return songs;
     }
}
