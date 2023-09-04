import java.util.ArrayList;
public class Switcher {
    private ArrayList<ElektricityListner> Listeners =
            new ArrayList<ElektricityListner>();
    public void addElectricityListner(ElektricityListner l) {
        Listeners.add(l);
    }
    public void removeElectricityListner(ElektricityListner l) {
        Listeners.remove(l);
    }
    public void switchOn() {
System.out.println("Вимикач увімкнено");
for (ElektricityListner l : Listeners)
    l.electricity(this);
    }
}
