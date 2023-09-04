package com.Lyambda.vikluchateltwo;

public class Lamp implements ElectricityConsumer {
    public  void  LightOn()
    {
        System.out.println("лампа увімкнулась");
    }
    @Override
    public void  electricityOn(){
        LightOn();

    }
}
