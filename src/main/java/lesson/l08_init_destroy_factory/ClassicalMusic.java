package lesson.l08_init_destroy_factory;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {} //невозможно создать объект с помощью new

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }


    public void doMyInit(){
        System.out.println("Doing mi initialisation");
    }

    public void doMyDestroy(){
        System.out.println("Doing mi destruction");
    }

    @Override
    public String getSong() {
        return "Hangarian Rhapsody";
    }
}
