package ru.alishev.springcourse;
import java.util.*;

public class MusicPlayer {

    //private Music music; //поле в качестве зависимости общий интерфейс
    private List<Music> musicList = new ArrayList<>();

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

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer(){
    }


    public void setMusicList(List<Music> musicList){
        this.musicList = musicList;
    }

    public void playMusic(){
        System.out.print("Playing: " );
        for (Music track: musicList){
            System.out.print(track.getSong() + ", ");
        }
    }
}
