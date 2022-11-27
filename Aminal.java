package PracticaOpp1;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aminal {

    protected String name;
    protected String breed;
    protected String colour;
    private Integer runspeed;
    private Integer age;

    public Aminal(String name, String breed, String colour) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public Integer getRunspeed() {
        try {
            System.out.println("Установите скорость для "+ name);
            Scanner scanner =new Scanner(System.in);
            runspeed=scanner.nextInt();


        }catch (InputMismatchException e){
            System.out.println("Неверно ввели значение ");
            getRunspeed();

        }
        if (runspeed<=0){
            System.out.println("Некоректное значение скорости");
            getRunspeed();
        }

        return runspeed;
    }

    public Integer getAge() {
     try {
         System.out.println("Установите возраст для " +name);
         Scanner scanner =new Scanner(System.in);
         age=scanner.nextInt();
     }
     catch (InputMismatchException  e){
         System.out.println("Неверно ввели значение ");
         getAge();
     }
     if(0>=age||100<age){
         System.out.println("Некоректное значение возраста");
         getAge();

     }


        return age;
    }



}
