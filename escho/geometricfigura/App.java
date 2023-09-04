package com.Lyambda.escho.geometricfigura;
import  com.Lyambda.escho.Clothing;
import com.Lyambda.escho.Loundry;
import com.Lyambda.escho.Shirt;
import com.Lyambda.escho.Trousers;
import com.Lyambda.escho.geometricfigura.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class App {
    public static List <String> List = new ArrayList<>();
    public static List <String> List1 = new LinkedList<>();
    public static List <String> List0;
    //робимо статичний блок ініціалізації
    static {
        //робимо реалізацію інтерфейсу через конфиг файл тобто не в коді а в
        // конфиг файлі вказуємо який саме ліст треба реалізувати/задіяти
        // підключитися до файлу config і з нього зчитати назву
        //метод создать обєкт newInstance()
        try {
            BufferedReader br = new BufferedReader(new FileReader("config"));
            List = (List) Class.forName(br.readLine()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //List тут це інтерфейс
    public static void main(String[] args) {

        //робимо змінні батьківського класу абстрактного та
        // ініціалізуємо їх через змінні дочірнього класу
        Clothing clothing = new Shirt("My green shirt" , 49 ,  500);
        System.out.println(clothing);
        clothing.wash();
        System.out.println(clothing);
        List.add("1");
        List.add("2");
        List.add("3");
        List1.add("4");
        List1.add("5");
        List1.add("6");
        List.add("7");
        List.add("8");
        System.out.println(List);
        System.out.println(List1);
        System.out.println(List);

        Loundry loundry = new Loundry();
        Loundry.clean(clothing);

        Clothing[] clothingArray = {
                new Shirt ("Shirt 2" , 60 , 300),
                new Shirt ("Shirt 1" , 2 , 400),
                new Trousers("Trousers5" , 34),
                new Trousers("Trousers2" , 36),
                new Shirt ("Shirt 3" , 40 , 800),
                clothing
        };
        for (Clothing clothing1:
             clothingArray) {
            System.out.println(clothing1);
        }
        System.out.println("********************************");

        Arrays.sort(clothingArray);

        for (Clothing clothing1:
                clothingArray) {
            System.out.println(clothing1);
        }
        System.out.println("**********************************");

        System.out.println("/---/-/-/-/-/--/-/-/-/-/-/-/-/---/");
        Arrays.sort(clothingArray, new ClothComparator());
        for (Clothing clothing1:
                clothingArray) {
            System.out.println(clothing1);
        }
        System.out.println("/---/-/-/-/-/--/-/-/-/-/-/-/-/---/");

        System.out.println("/---/-/-/-/-/--/-/-/-/-/-/-/-/---/");
        Arrays.sort(clothingArray, (a, b) -> b.getSize() - a.getSize());
        for (Clothing clothing1:
                clothingArray) {
            System.out.println(clothing1);
        }
        System.out.println("/---/-/-/-/-/--/-/-/-/-/-/-/-/---/");
//лямбда возвращает обєкт котрий можна зберегти в змінну

        System.out.println("-----------------------------------------------");
        Arrays.sort(clothingArray, (a, b) -> b.getSize() - a.getSize());
Arrays.asList(clothingArray).forEach(a -> System.out.println(a));
        System.out.println("******************************************************");
                Arrays.asList(clothingArray).forEach(System.out::println);

        System.out.println("*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
//лямбда возвращает обєкт котрий можна зберегти в змінну
        Comparator<Clothing> ClothingComparator = (a, b) -> b.getSize() - a.getSize();
        System.out.println(ClothingComparator);
        System.out.println("*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        for (Clothing clothing1:
                clothingArray) {
            clothing1.wash();
        }

    }

}

//якщо видалит метод wash в класі Clothing але оставити його в класі shirt
// то буде помилка бо тип ссилочной змінної це Clothing відповідно на ссилочних змінних можна
// визивати тільки ті методи які є в їхньому класі і в класі їх батьків від яких вони щось
// уналедовали а так як в Clothing тепер нема методу wash  то його визивати не можна
/*
навіть якщо в класі Clothing нема реалізації метода а є тільки його заголовок (його тільки обявили без тіла) то
 цей метод всеодно можна визивати (на типі абстрактного класу молжна визивати його абстрактний метод)
 а його реалізація буде взята підкласу (дочірнього) фактично обєкт якого
 зберігається в цій ссилочній змінній
 */