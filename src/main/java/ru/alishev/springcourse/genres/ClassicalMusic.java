package ru.alishev.springcourse.genres;


import ru.alishev.springcourse.Music;

public class ClassicalMusic implements Music {

    private String[] songs;

    public ClassicalMusic(){
        this.songs = new String[]{"classmusic 1", "classmusic 2", "classmusic 3"};
    }


    @Override
    public String[] getSongs() {
        return songs;
    }


}
