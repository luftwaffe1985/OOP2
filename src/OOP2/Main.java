package OOP2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(37, "М", "Дмитрий");
        Cat cat = new Cat("Дюдя");
        Dog dog = new Dog("Лорд");

        human.call(cat);
        System.out.println();
        human.call(dog);
        System.out.println();
        human.game(cat);
        System.out.println();
        cat.getVoice();
        System.out.println();
        human.game(dog);
        System.out.println();
        dog.getVoice();
        System.out.println();
        cat.getFood(human.toString());
        System.out.println();
        dog.getFood(human.toString());
        System.out.println();
    }
}
