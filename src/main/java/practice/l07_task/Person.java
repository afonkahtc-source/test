package practice.l07_task;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Дружище, иди сюда!");
        pet.say();
    }

    public Pet getPet() {
        return pet;
    }

}
