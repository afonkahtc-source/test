package lesson.l01_task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = (Pet) context.getBean("myPet");
        pet.say();

        context.close();
    }
}
