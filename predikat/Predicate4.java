package com.Lyambda.predikat;

import java.util.function.Predicate;
//перевір той факт чи не факт що рядок починається
// на вказані букви і закінчується на вказану букву
public class Predicate4 {
    public static void main(String[] args) {
        Predicate<String> predicate5 = s -> s.startsWith("J");
        Predicate<String> predicate6 = s -> s.startsWith("N");
        Predicate<String> predicate7 = s -> s.endsWith("A");
        //використаємо метод or для того щоб перші два це треба
        // щоб прописати що рядок починається абона одну букву
        // або на іншу букву і це треба підтвердити факт того
        // що ці рядки починаються на вказані букви

        //ПОТІМ В ЦЬМУЖ ТАКИ РЯДУ ПРОГРАММИ ЧЕРЕЗ МЕТОД AND
        // ДОБАВЛЯЄМО ТРЕТІЙ ПРЕДИКАТ ЩО ПЕРЕВІРЯЄ ФАКТ ТОГО ЩО
        //РЯДОК ЗАКІНЧУЄТЬСЯ ВКАЗАНОЮ БУКВОЮ
// тоб то це логіка : "бао одна умова або друга і також ще третя умова але обовязково
// має виконуватись одна з перших двох умов і обовязково виконується третя умова "
        Predicate<String> predicate8 = predicate5.or(predicate6).and(predicate7);
        System.out.println(predicate8.test("Java"));//тут остання буква маленька
        System.out.println(predicate8.test("JavA")); //тут повністю виконується/підтверджується умова/факт (початок на одну з вказаних букв і кінець на вказану букву)
        System.out.println(predicate8.test("Net")); //тут остання буква не та що вказана
        System.out.println(predicate8.test("EskaladaA"));
        System.out.println(predicate8.test("navarA"));

    }

}
// System.out.println(predicate4.test(null));