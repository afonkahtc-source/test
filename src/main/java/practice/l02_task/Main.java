package practice.l02_task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("practice/l02_context.xml");

        Person person = (Person) context.getBean("myPerson");

        person.callYourPet();
    }
}
