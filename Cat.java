package PracticaOpp1;

public class Cat extends Aminal implements RunAble,SpeakAble {
    public Cat(String name, String breed, String colour) {
        super(name, breed, colour);
    }

    @Override
    public int run() {
        return getRunspeed();
    }

    @Override
    public String speak() {

        return "mau";
    }

    @Override
    public String toString() {
        return name;
    }
}
