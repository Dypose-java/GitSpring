package ru.dypose.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dypose.springcore.beans.ClassicalMusic;
import ru.dypose.springcore.beans.HipHopMusic;
import ru.dypose.springcore.beans.MusicPlayer;
import ru.dypose.springcore.beans.RockMusic;

public class TestSpring {
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {
            HipHopMusic hipHopBean = context.getBean("hipHopBean", HipHopMusic.class);
            ClassicalMusic classicalBean = context.getBean("classicalBean", ClassicalMusic.class);
            RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
            System.out.println(hipHopBean);
            System.out.println(classicalBean);
            System.out.println(rockMusic);

            var classicalMusic=ClassicalMusic.getClassicalMusic();
        }



    }
}
