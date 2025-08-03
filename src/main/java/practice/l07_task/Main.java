package practice.l07_task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("practice/l07_context.xml");

        Person person1 = (Person)context.getBean("person1");
        Person person2 = (Person)context.getBean("person2");

        System.out.println("Сравнение Pet у двух Person: " + (person1.getPet() == person2.getPet()));
    }
}
