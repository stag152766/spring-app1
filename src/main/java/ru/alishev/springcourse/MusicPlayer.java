package ru.alishev.springcourse;

import java.util.*;

public class MusicPlayer {

    private Music music; //поле в качестве зависимости общий интерфейс


    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public MusicPlayer() {
    }


    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.print("Playing: " + music.getSong());
    }
}

