package practice.l02_task;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Привет, друг!");
        pet.say();
    }

}
