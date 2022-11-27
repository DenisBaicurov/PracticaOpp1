package PracticaOpp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Duck extends Aminal implements  RunAble,FlyAble,SwimAble,SpeakAble {
    public Duck(String name, String breed, String colour) {
        super(name, breed, colour);
    }

    @Override
    public int fly() {
        int getFly=0;
        try {

            System.out.println("Установите скорость полёта для "+name);
            Scanner scanner =new Scanner(System.in);
            getFly=scanner.nextInt();


        }catch (InputMismatchException e){
            System.out.println("Неверно ввели значение ");
            fly();

        }
        if (getFly<=0){
            System.out.println("Некоректное значение скорости");
            fly();
        }

        return getFly;
    }

    @Override
    public int run() {

        return getRunspeed();
    }

    @Override
    public String speak() {
        return "кря";
    }

    @Override
    public int swim() {
        int getswim=0;
        try {

            System.out.println("Установите скорость плавания для "+name);
            Scanner scanner =new Scanner(System.in);
            getswim=scanner.nextInt();


        }catch (InputMismatchException e){
            System.out.println("Неверно ввели значение ");
            swim();

        }
        if (getswim<=0){
            System.out.println("Некоректное значение скорости");
            swim();
        }


        return getswim;
    }

    @Override
    public String toString() {
        return name;
    }
}
