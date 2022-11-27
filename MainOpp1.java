package PracticaOpp1;

/*
*Создать интерфейс, скорость плаванья
Добавить новое животное, способное плавать
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
*
* */



public class MainOpp1 {


    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.talk();
        System.out.println("run\n");
        zoo.run();
        System.out.println("fly\n");
        zoo.fly();
        System.out.println("swim\n");
        zoo.swim();


    }


}
