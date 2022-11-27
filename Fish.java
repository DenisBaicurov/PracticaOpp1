package PracticaOpp1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fish extends Aminal implements SwimAble {
    public Fish(String name, String breed, String colour) {
        super(name, breed, colour);
    }

    @Override
    public int swim() {

        int getswim=0;
        try {

            System.out.println("Установите скорость плавания для " +name);
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
