package practice.l01_task;

public class Person {
    private Pet pet;

    // Сеттер для внедрения через Spring
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Эй, питомец!");
        pet.say();
    }

}
