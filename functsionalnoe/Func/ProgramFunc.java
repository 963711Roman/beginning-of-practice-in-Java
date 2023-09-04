package com.functsionalnoe.Func;
//import com.functsionalnoe.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;
public class ProgramFunc {
    public static void main(String[] args) {
        ArrayList<PersonFunc> persons = new ArrayList<PersonFunc>();
        persons.add(new PersonFunc("Сергей" , 45));
        persons.add(new PersonFunc("Олександр" , 7));
        persons.add(new PersonFunc("Валентина" , 11));
        persons.add(new PersonFunc("Меркурі" , 30));
        persons.add(new PersonFunc("МoKay" , 90));

        //звичйне програмування
        for (PersonFunc t :
             persons) {
            out.println(t);
        }
        out.println("**********************************************");
        //функціональне програмування
        persons.stream().forEach(out::println);
        out.println("**********************************************");
        //звичйне програмування
        for (PersonFunc p : persons){
            if (p.age >= 18)
                out.println(p);
        }
        out.println("**********************************************");
        out.println("----------------------------------------------");
        //функціональне програмування
        persons.stream().filter(p -> p.age >= 18).forEach(out::println);
        out.println("**********************************************");
        out.println("\n");

        // тепер отсартируй по имени и по возрасту
        // по звичайному
        ArrayList<PersonFunc> result =new ArrayList<>();
        for (PersonFunc w:
             persons) {
            if (w.age >= 18)
                result.add(w);
            out.println(result);
            //out.println(p);
        }
        out.println("**********************************************");
        out.println("\n");
            Collections.sort(result, (p1, p2) -> p1.name.compareTo(p2.name) );
            for (PersonFunc r :
                 result) {
                out.println(r);
            }

        out.println("**********************************************");
        out.println("----------------------------------------------");
//тепер функціонально
        persons.stream().filter(p -> p.age >= 18).sorted((p1, p2) -> p1.name.compareTo(p2.name)).
                forEach(out::println);
//тепер розпаралелив по різним потокам
        out.println("**********************************************");
        out.println("----------------------------------------------");
        persons.parallelStream().filter(p -> p.age >= 18).sorted((p1, p2) -> p1.name.compareTo(p2.name)).
                forEach(out::println);
        out.println("**********************************************");
        out.println("----------------------------------------------");
        persons.parallelStream().filter(p -> p.age >= 18).sequential().sorted((p1, p2) -> p1.name.compareTo(p2.name)).
                forEach(out::println);
        out.println("**********************************************");
        out.println("----------------------------------------------");
        persons.parallelStream().filter(p -> p.age >= 18).sequential().sorted((p1, p2) -> p1.name.compareTo(p2.name)).
        map(p -> p.name).forEach(out::println);
    }
}
