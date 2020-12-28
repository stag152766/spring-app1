package ru.alishev.springcourse.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.alishev.springcourse.*;
import ru.alishev.springcourse.genres.ClassicalMusic;
import ru.alishev.springcourse.genres.MusicGenreList;
import ru.alishev.springcourse.genres.RapMusic;
import ru.alishev.springcourse.genres.RockMusic;

import java.util.Arrays;
import java.util.List;


@Configuration
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public MusicGenreList musicGenreList(){
        return new MusicGenreList();
    }

    @Bean
    public List<String> musicList(){
        return Arrays.asList("asd");
    }

    @Bean
    public MusicPlayer musicPlayer(MusicGenreList musicGenreList){
        return new MusicPlayer(musicGenreList.getMusicGenreList());
    }

    @Bean
    public MusicPlayer musicPlayer(MusicGenreList musicGenreList, List<String> musicList){
        return new MusicPlayer(musicGenreList.getMusicGenreList(), musicList());
    }




}
