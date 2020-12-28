package ru.alishev.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.alishev.springcourse.config.SpringConfig;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        System.out.println(musicPlayer.getList());

        List<String> myList = context.getBean("musicList", List.class);
        System.out.println(myList);

        context.close();
    }

}
