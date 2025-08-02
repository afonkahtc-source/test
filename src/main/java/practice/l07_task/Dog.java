package practice.l07_task;

public class Dog implements Pet {
    public Dog(){
        System.out.println("Вызван конструктор Dog");
    }

    @Override
    public void say(){
        System.out.println("Гав-гав!");
    }
}
