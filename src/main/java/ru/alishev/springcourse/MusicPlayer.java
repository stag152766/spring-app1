package ru.alishev.springcourse;

import ru.alishev.springcourse.genres.*;
import java.util.List;
import java.util.Random;


public class MusicPlayer {


    private List<MusicGenre> musicList;
    private List<String> list;


    public MusicPlayer(List<MusicGenre> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(List<MusicGenre> musicList, List<String> list) {
        this.musicList = musicList;
        this.list = list;
    }

    public String playMusic() {
        MusicGenre randomGenre = getRandomGenre(musicList);
        Music genre;
        if (randomGenre == MusicGenre.CLASSICAL) {
            genre = new ClassicalMusic();

        } else if (randomGenre == MusicGenre.ROCK) {
            genre = new RockMusic();

        } else {
            genre = new RapMusic();
        }
        return "Playing: " + getRandomTrack(genre.getSongs());
    }


    private String getRandomTrack(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    private MusicGenre getRandomGenre(List<MusicGenre> list) {
        int rnd = new Random().nextInt(list.size());
        return list.get(rnd);
    }

    public List<String> getList() {
        return list;
    }
}

