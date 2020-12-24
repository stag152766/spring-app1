package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music); // ручное создание объекта и внедрение зависимости через конструктор
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer1.playMusic();
        boolean comparison = musicPlayer1 == musicPlayer2;



        System.out.println();
        System.out.println(comparison);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        musicPlayer1.setVolume(10);
        System.out.println(musicPlayer1.getVolume());
        System.out.println(musicPlayer2.getVolume());

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }

}
