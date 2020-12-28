package ru.alishev.springcourse.genres;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.Music;


public class RockMusic implements Music {

    private String[] songs;

    public RockMusic(){
        this.songs = new String[]{"rockmusic 1", "rockmusic 2", "rockmusic 3"};
    }


    @Override
    public String[] getSongs() {
        return songs;
    }
}
