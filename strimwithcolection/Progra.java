package com.Lyambda.strimwithcolection;

import java.util.ArrayList;
import java.util.List;

public class Progra {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергій" ,38 ));
        persons.add(new Person("Даша" , 7));
        persons.add(new Person("Глаша" , 3));
        persons.add(new Person("Саша" , 6));
        persons.add(new Person("Анна" , 19));

        //вивести на екран всі персони
        for (Person p :
             persons) {
            System.out.println(p);

        }
//деклоративний підхід відсортувати ось так методом стрім
     persons.stream().forEach( p -> System.out.println(p)

    );
        //а ось так краще
        persons.stream().forEach( System.out::println);
        //тепер можна сортувати
        //вивести на екран тих хто старше  18 років
        persons.stream().filter(p ->
             p.getAge() >= 18).
                sorted((p1 , p2) -> p1.getName().compareTo(p2.getName())).
                map( p -> p.getName()).
                forEach(System.out::println);
//вивести токо імена кому  > =  18 map( p -> p.getName()).
        //середній вік тих кому >= 18
        int summa = 0;
        int adultPersons = 0;
        for (Person p :
             persons) {
            if (p.getAge() >= 18)
            {
                summa += p.getAge();
                adultPersons++;
            }
            double averageAge = (double) summa / adultPersons;
            System.out.println(averageAge);
        }
//АЛЕ ОСЬ ТАК ЗНАЧНО КРАЩЕ
        double averageAge2 = persons.stream().
                filter(p -> p.getAge() >= 18).
                mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println(averageAge2);


    }
}
