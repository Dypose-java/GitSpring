package ru.dypose.springcore.task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Decision {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("applicationContext.xml"))
        {
            int count=0;
            while (true){
                MusicPlayer bean = context.getBean(MusicPlayer.class);
                System.out.println(bean.getSoundMusic(TypeMisic.HIP_HOP));
                count++;
                if (count==15)break;

            }
        }
    }
}
