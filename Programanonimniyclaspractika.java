public class Programanonimniyclaspractika {

    public static void fireFighters(Object rr)
    {
        System.out.println("Прибули пожежні");
    }

    public static void main(String[] args) {
Switcher sw = new Switcher();
    Lamp Lamp = new Lamp();
    TvSet tv = new TvSet();
    AirComdition ac = new AirComdition(); //замикання
    sw.addElectricityListner(Lamp);
        sw.addElectricityListner(tv);


           // sw.addElectricityListner(e -> ac.on(e)); //замикання
                    sw.addElectricityListner(ac ::on); // сигнатура методу on така само як в методі
        // що реалізує інтерфейс
        // ставимо :: бо якщо імя методу співпадає з іменем поля класу (змінної)
        // то як їх розрізнити коли тут треба задіяти посилання на метод
                        //sw.addElectricityListner(e -> Programanonimniyclaspractika.fireFighters(e));
//скорочена форма запису через передачу посилання на метод
        sw.addElectricityListner(Programanonimniyclaspractika :: fireFighters);
        String message = "hooo"; //ці змінні не можна змінювати бо їх використовуєш в лямбда виразі це є замикання
        String messages = "yooo - o";
        sw.addElectricityListner(
                new ElektricityListner() {
                    public void electricity(Object s) {
                        System.out.println("загорелась проводка!");
                        System.out.println(message);
                    }
                }
        );
        sw.addElectricityListner(
                    // можна так s -> System.out.println("Пожар")
                o -> System.out.println(messages) // а можна і так
        );
        sw.switchOn();
    }
}
/*
анонімний клас це наслідник іннер класа а лямбда вираз це наслідник анонімного класу тому
 у анонімного классу є доступ до різних данних => є доступ до змінних класу з якого ми визиваємо анонімний клас
 і також є доступ до локальних змінних та методів класу в якому вони ОПРЕДЕЛЕНІ
 */