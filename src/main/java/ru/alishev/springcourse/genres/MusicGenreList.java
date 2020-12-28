package ru.alishev.springcourse.genres;

import java.util.ArrayList;
import java.util.List;

public class MusicGenreList {

    private List<MusicGenre> musicGenreList;

    {   musicGenreList = new ArrayList<>();
        musicGenreList.add(MusicGenre.RAP);
        musicGenreList.add(MusicGenre.CLASSICAL);
        musicGenreList.add(MusicGenre.ROCK);
    }

    public List<MusicGenre> getMusicGenreList() {
        return musicGenreList;
    }
}
