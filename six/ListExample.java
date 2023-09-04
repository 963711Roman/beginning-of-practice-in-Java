package com.Lyambda.six;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListExample {
    private static class Student {
        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            System.out.println(1); // 4 рази визвався геттер
            return name;
        }

        final private int age;
       final private String name;

    }
    public static void main(String[] args) {
        //ЗАДАЧА СКІЛЬКИ СТУДЕНТІВ Є З НЕПРАВИЛЬНИМИ ІМЕНАМИ
final List<Student> students = new ArrayList<>(){{
    add(new Student(36, "Abdul"));
    add(new Student(35, "Abcd"));
    add(new Student(34, "B"));
    add(new Student(33, "C"));
    add(new Student(32, "null"));
}};
//int counter = 0;
//for (Student student : students) {
   // if (student.age > 30 && (student.name == null || student.name.length() <= 4)) {
       // counter ++;
    //}
//}
//System.out.println(counter);

//стім це потік обєктів над якими можна виконувати декілька операцій
//і цю задачу можна вирішити за їх допомогою
        Long count = students
                //распаралелить це
                .parallelStream()
                //.stream()
                .filter(student -> student.getAge() >30)
                .map(Student :: getName)
                //map(Student :: getName) відбирає з списку тільки дані одного типу  щоб працювати з самими змінними
                // тільки одного відібраного типу  без думаня про те який в них тип
                .filter(name -> name == null || name.length() <= 4)
                //.findAny();
                .count();
        System.out.println(count);

    }
}
