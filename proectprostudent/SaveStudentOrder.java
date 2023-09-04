package proectprostudent;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "Сергій" ;
        so.hLastName = "Петренко" ;
        so.wFirstName = "Олена" ;
        so.wLastName = "Петренко" ;
        long ans = saveStudentOrder(so);
        //System.out.println("SaveStudentOrder is runnig ");
        System.out.println(ans);

    }
    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("SaveStudentOrder:" + studentOrder.hFirstName);
        return answer;
    }
    static void scheduleStudentOrder(){
        System.out.println("scheduleStudentOrder перевіряється (розклад)");
    }
    static void FinanceStudentOrder(){
        System.out.println("FinanceStudentOrder перевіряються (фінанси)");
    }
}
