package practice.l01_task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("practice/l01_context.xml");

        Person person = (Person) context.getBean("myPerson");

        person.callYourPet();

        context.close();
    }
}

