//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Baxter");
        Dog dog3 = new Dog("Nox", "Goldendoodle", 95, 8);

        System.out.printf("Original Weight: %d\n", dog3.getWeight());
        dog3.setWeight(10);
        System.out.printf("Set weight: %d\n", dog3.getWeight());
        dog3.setWeight(10,dog3.getAge());
        System.out.printf("Set weight with age: %d\n", dog3.getWeight());

    }
}