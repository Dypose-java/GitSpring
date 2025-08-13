package ru.dypose.springcore.check;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.dypose.springcore.beans.MusicPlayer;

public class Test {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {
            ListIceFox listIceFox = context.getBean("listIceFox", ListIceFox.class);
            listIceFox.printAllListIceFox();
        }
    }
}
