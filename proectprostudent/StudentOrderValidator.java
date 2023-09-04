package proectprostudent;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll(){
        //тут все спрацьовує в тому порядку в якому я прописав ці методи
        checkCildren();
        checkStudent();
        checkWedding();
        chackCityRegister();
    }

    //Первірка студента в держреєстрі населення
    //1. перевірка в реєстрі міста
    static  void chackCityRegister(){
        System.out.println("chackCityRegister is runnig ");
    }
    //2. перевірка шлюбу (чи одружений)
    static void checkWedding(){
        System.out.println(" Wedding працює ");
    }
    static void checkCildren(){
        System.out.println(" Cildren check is ranning ");
    }
    static void checkStudent(){
        System.out.println(" студенти перевіряються ");
    }

}
