package com.Lyambda.vikluchateltwo;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    //БУЛО ТАК public ElectricityConsumer consumer;
    //ТЕПЕР ДЛЯ МНОЖЕСТВА ЗРОБИМО КОЛЕКЦІЮ ЕЛЕМЕНТАМИ ЯКОЇ Є
    //НАБІР ПОСИЛАНЬ НА ОБЄКТИ ТИП ЯКИХ Є
    // НАЗВА ІНТЕРФЕЙСУ ЯКИЙ БУДЕ ВИКОРИСТАНО ОДИН ДЛЯ ВСІХ
    private List <ElectricityConsumer> Listeners =
            new ArrayList<>();
    //добавляємо радіо до лампи методом addElectricityListner
    //тип  параметру якого буде сам інтерфейс ElectricityConsumer
    public void addElectricityListener(ElectricityConsumer Listener)
    {
        Listeners.add(Listener);
    }
    public void removeElectricityListener(ElectricityConsumer Listener)
    {
        Listeners.remove(Listener);
    }
    public  void swichOn ()
    {
        System.out.println("вимикач увімкнутий");
        /* відповідно було так
        if (consumer != null)
            consumer.electricityOn();

         */
        //тепер для того щоб включати багато
        // ссилок - споживачів
        for (ElectricityConsumer c :
             Listeners) {
            c.electricityOn();
        }
    }


}
