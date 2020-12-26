package ru.alishev.springcourse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {


    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic, @Qualifier("rockMusic") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicGenre genre) {
        if (genre == MusicGenre.CLASSICAL) {
            return "Playing: " + getRandom(classicalMusic.getSongs());
        } else
            return "Playing: " + getRandom(rockMusic.getSongs());
    }

    private String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}

