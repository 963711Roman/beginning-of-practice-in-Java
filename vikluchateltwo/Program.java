package com.Lyambda.vikluchateltwo;
import java.lang.System.*;
public class Program {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp Lamp= new Lamp();
        Radio radio = new Radio();
        /*
       //було так
        sw.consumer = new Lamp();
        */
        sw.addElectricityListener(Lamp);
        sw.addElectricityListener(radio);
        //тепер треба зробити ще одного споживача який
// просто виведе повідомлення а екран
        //для цього використаємо анонімний клас
        //наприклад виводимо слово пожар
        class  Fire implements ElectricityConsumer {
            @Override
            public void electricityOn(){
                System.out.println("Пожар");
            }
        }
        sw.addElectricityListener(new Fire());

        //АЛЕ ОСЬ ТАК   КРАЩЕ

        sw.addElectricityListener(new ElectricityConsumer()
        {
            //@Override
            public void electricityOn() {
                System.out.println("Пожар");

            }
        }
                );

        //А так НА БАГАТО краще
        //тобто лямбда вираз це просто передача функції в метод в
        // яості вхідних параметрів
        sw.addElectricityListener(
                () -> {
                    System.out.println("Пожар");
                }
        );

        sw.swichOn();


    }
}
