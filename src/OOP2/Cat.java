package OOP2;

public class Cat implements Pet {
    String name;
    public Cat(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public void getFood(String s) {
        System.out.printf("%s просит кушать у своего хозяина %s", this.name, s);

    }
    @Override
    public void getVoice() {
        System.out.println("Мяу");

    }
}
