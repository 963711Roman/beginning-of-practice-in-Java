package com.Lyambda.graph;
//package com.Lyambda.graph.*;
public interface Scaleable {
    public static final double DEFAULT_FACTOR = 2D;
    int z = 5;
    public static void Test () {

    }
    void scale(double factor);

    // дефолтная реализация метода интерфейсу
    //ЯКЩО ДЕФОЛТНИЙ КОНСТРУКТОР НЕ У ВСІХ КЛАСАХ НАСЛІДНИКАХ РЕАЛІЗУЄТЬСЯ ОДНАКОВО
    default void scale() {
        scale(DEFAULT_FACTOR);
    }


}
//В ІНТЕРФЕЙСАХ ВСІ КОНСТАНТИ І МЕТОДИ Є АБСТРАКТНИМИ ТА
// СТАТИЧНИМИ ПО ЗАМОВЧУВАННЮ І СЛОВА PUBLIC STATIC ABSTRACT FINAL МОЖНА НЕ ПИСАТИ


  //НАСЛІДУВАННЯ ІНТЕРФЕЙСІВ
interface Scaleable3D extends Scaleable { //НАСЛІДУВАННЯ ІНТРФЕЙСІВ
void scale3D(double fx, double fy, double fz );

}
