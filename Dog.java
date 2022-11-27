package PracticaOpp1;

public class Dog extends Aminal implements SpeakAble,RunAble {
    public Dog(String name, String breed, String colour) {
        super(name, breed, colour);
    }

    @Override
    public int run() {
        return getRunspeed();
    }

    @Override
    public String speak() {
        return "gav";
    }

    @Override
    public String toString() {
        return name;
    }
}
