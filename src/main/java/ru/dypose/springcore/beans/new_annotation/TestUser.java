package ru.dypose.springcore.beans.new_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("applicationContext.xml"))
        {
            User bean = context.getBean(User.class);
            User bean1 = context.getBean(User.class);
            System.out.println(bean==bean1);
            UserSingleton bean2 = context.getBean(UserSingleton.class);
            System.out.println(bean2);

        }

    }
}
