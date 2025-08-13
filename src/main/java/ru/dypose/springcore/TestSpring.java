package ru.dypose.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dypose.springcore.beans.*;


public class TestSpring  {
    public static void main(String[] args) {

        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.getSound();

            Computer computer = context.getBean("computer", Computer.class);
            System.out.println(computer);
        }



    }
}
