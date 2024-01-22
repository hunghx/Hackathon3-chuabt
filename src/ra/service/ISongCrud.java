package ra.service;

import ra.model.Song;

public interface ISongCrud extends ICRUD<Song,String>{
    void findSongsBySingerNameOrGenre();
}
