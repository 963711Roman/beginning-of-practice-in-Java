public class Lamp implements ElektricityListner {
    @Override
    public void electricity(Object sourse){
        System.out.println("Лампа увімкнена засвітилась");
    }
}
