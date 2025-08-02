package org.lesson.l01_task;

public class Pet {
    private String name;

    public Pet() {
        this.name = "Шарик";
    }

    public void say() {
        System.out.println("Гав-гав! Я " + name);
    }
}

