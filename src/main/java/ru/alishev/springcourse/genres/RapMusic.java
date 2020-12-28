package ru.alishev.springcourse.genres;

import ru.alishev.springcourse.Music;

public class RapMusic implements Music {
    private String[] songs;

    public RapMusic() {
        this.songs = new String[]{"rapmusic 1", "rapmusic 2", "rapmusic 3"};
    }


    @Override
    public String[] getSongs() {
        return songs;
    }
}
