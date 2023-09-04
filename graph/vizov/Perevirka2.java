package com.Lyambda.graph.vizov;
import com.Lyambda.graph.*;
public class Perevirka2 {
    public static void main(String[] args) {

        //Point2 p12 = new Point2();
        //p12.draw(); // Тут печатє що точка чорного кольору
        // тобто  DEFAULT_COLOR = "black"; бо не вказав параметри
        Point2 p1 = new Point2(10, 20, "gren");
        /*
        Point2 p2 = p1;
        p1.color = "red";
        це просто коріювання посилання
         */
        //тепер це копіювання об'єкта
        // і через це клонування печатається дві пари шейп2 -- поінт2
        Point2 p2 = p1.clone();
        p1.color = "red";

        Shape2 s1 = p1;//перетворив посилання дочірнього типу в батьківський
        //але сам дочірній обєкт незмінюється
        s1.color = "yellow";
        p1.draw();
        s1.draw(); // посилання типу Shape2 але вказує на
        // тип Point2 ось цим ряком Shape2 s1 = p1; але всеодно буде
        // визвано мотод класу Point2 тобто н важливо тип посилання
        // важливо на який обєкт воно посилається в цьому
        // і полягає ввсесь поліморфізм
        if (s1 instanceof  Point2) {//true
            Point2 p3 = (Point2) s1; //тепер навпаки з посилання батьківського типу в дочірній
//// то треба присувати явне перетворення
            //перевірка методом instanceof чи можна так перетворити посилання
            p3.moveBy(1, 1);
        }

        Circle2 c1 =new Circle2(100, 200, 50, "pink");

        Scaleable sc2 = c1;
        sc2.scale(1.5);

        //Scaleable.DEFOULT_FACTOR;
        // використання
        // інтерфейсів
        //Circle2.DEFAULT_COLOR;
        System.out.println(Scaleable.DEFAULT_FACTOR);
        System.out.println(Moveble.DEFAULT_FACTOR);
        System.out.println(((Moveble)c1).DEFAULT_FACTOR);


        c1.scale(1.5);
        //початок ікапсуляції
        c1.setR(50);
        System.out.println(c1.getR());


        //c1.draw();
        s1 = c1; // так також можна
        c1.draw(); // буде визваний метод з класу Circle2
        //c1.z
        if (s1 instanceof Point2) {//false
            s1 = new Shape2();
            Point2 p3 = (Point2) s1;
        }

       // Shape2.drawScene(); //печатається колекція про всі обєкти
        // бо вони всі одною пачкою входять / заповнюють (в) колекцію
        //p2.draw();// метод обєкту/класу Sape2

        //p1.draw();// метод обєкту/класу Sape2 до клонування

        //System.out.println( p1.toString()); //це печать обєкта класу Point2

        //печатає два рази про Поінт бо в ньому є метод дро і метод тострінг
        //а також метод клонування тому бачимо
        //печать методу дро із класу поінт (його визивали і в визові вказували колр зелений)
        // печать методу дро із класу шейп але прописаного в класі поінт
        // результат клонування (змінено зелений на червоний)
/*
        Singleton r1 = new Singleton();
        Singleton r2 = new Singleton();
        System.out.println(r1 == r2);

 */

    }
}
