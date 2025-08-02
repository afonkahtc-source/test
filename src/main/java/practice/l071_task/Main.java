package practice.l071_task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("practice/l071_context.xml");

        Person person1 = (Person)context.getBean("personSingleton");
        Person person2 = (Person)context.getBean("personSingleton2");

        System.out.println("Сравнение Pet у двух Person: " + (person1.getPet() == person2.getPet()));
    }
}
