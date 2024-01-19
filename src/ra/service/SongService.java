package ra.service;

import ra.model.Song;

public class SongService {
    public static Song[] songs = new Song[0];

    public static Song findById(String id){
        for(Song song:songs){
            if (song.getSongId().equals(id)){
                return song;
            }
        }
        return null;
    }
}
