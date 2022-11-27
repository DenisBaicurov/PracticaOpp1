package PracticaOpp1;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    private ArrayList<Aminal> animals;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Crocodil("крокодил vasya", "africanskiy", "green"), new Fish("рыба", "золотая", "золотая"), new Cat("кот barsik", "vislauh", "black")
                , new Dog("собака sedi", "ratvailer", "brown"), new Duck("утка kru", "rat", "white")));

    }

    public ArrayList<SpeakAble> getSpeakAble() {
        ArrayList<SpeakAble> result = new ArrayList<>();
        for (Aminal speakItem : animals) {
            if (speakItem instanceof SpeakAble) {
                result.add((SpeakAble) speakItem);
            }
        }
        result.add(new Radio());
        return result;
    }

    public ArrayList<RunAble> getRunAble() {
        ArrayList<RunAble> result = new ArrayList<>();
        for (Aminal speakItem : animals) {
            if (speakItem instanceof RunAble) {
                result.add((RunAble) speakItem);
            }
        }
        return result;
    }

    public ArrayList<FlyAble> getFlyAble() {
        ArrayList<FlyAble> result = new ArrayList<>();
        for (Aminal speakItem : animals) {
            if (speakItem instanceof FlyAble) {
                result.add((FlyAble) speakItem);
            }
        }
        return result;
    }

    public ArrayList<SwimAble> getSwimAble() {
        ArrayList<SwimAble> result = new ArrayList<>();
        for (Aminal swimItem : animals) {
            if (swimItem instanceof SwimAble) {
                result.add((SwimAble) swimItem);
            }
        }
        return result;
    }

    public void talk() {
        for (SpeakAble item : getSpeakAble()) {
            System.out.printf("%s\n", item.speak());

        }
    }

    public void run() {
        for (RunAble item : getRunAble()) {
            System.out.printf("для %s скорость равна %s\n", item.toString(), item.run());

        }
    }

    public void fly() {
        for (FlyAble item : getFlyAble()) {
            System.out.printf("для %s скорость полёта равна %s\n", item.toString(), item.fly());

        }


    }

    public void swim() {
        for (SwimAble item :getSwimAble()) {
            System.out.printf(" для %s скорость плавания равна %s\n",item.toString(),item.swim());

        }
    }



}