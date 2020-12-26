package ru.alishev.springcourse;
import org.springframework.stereotype.Component;


@Component
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
