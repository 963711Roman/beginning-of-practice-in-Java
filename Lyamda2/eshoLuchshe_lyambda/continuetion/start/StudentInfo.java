package Lyamda2.eshoLuchshe_lyambda.continuetion.start;

import java.util.ArrayList;

public class StudentInfo {
void testStudent(ArrayList<Student> al, StudentChecks sc){
    for (Student s : al){
        if (sc.check(s)){
            System.out.println(s);
        }
    }
}
}

class  Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
        ArrayList<Student> students =new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
/*
        info.testStudent(students, new StudentChecks() {
    //це створення анонімного класу замість створення класу для реалізації інтерфейсу
    // бо ця дія виконується тільки один раз
    @Override
    public boolean check(Student s) {
        return s.age < 30;
    }
});
*/
//********************************************************************************************
        info.testStudent(students,(Student s) -> {
            return s.age < 30;
        } );
        System.out.println("-----------------------");
        info.testStudent(students,(Student s) -> {
            return s.avgGrade > 8;
        } );
        //info.printStudentUnderAge(students, 30);
        System.out.println("-----------------------");
        info.testStudent(students,(Student p) -> {
            return p.age > 20 && p.avgGrade > 8 && p.sex == 'f';
        } );
        //info.printStudentMixCondition(students, 20, 9.5, 'f' );
    }
}
interface StudentChecks{
    boolean check(Student s);
}
/*
class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8 ;
    }

}

 */
