package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong());
        System.out.println("*************************");
        System.out.println(classicalMusic2.getSong());
        System.out.println(classicalMusic1 == classicalMusic2);




        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music); // ручное создание объекта и внедрение зависимости через конструктор
//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        musicPlayer.setVolume(10);
//        musicPlayer.setName("My new player");
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }

}
