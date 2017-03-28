/**
 * Created by Tomasz on 23.03.2017.
 */
public class PunktMaterialny {
    public void napis() {

        System.out.println("Punkt materialny");
    }

    public int masa;

    public PunktMaterialny() {  //konstruktor bez parametru (przypisuje masie wartość 20)
        masa = 20;
    }

    public void setmasa(int m) {  //metoda (mutator, nadaje wartość zmiennej)
        masa = m;
    }
    public PunktMaterialny(int m) {  //konstruktor z parametrem
        if (m>0) {
            masa = m;
        }
         else {
            System.out.println("Masa nie moze byc ujemna");
            masa=10;
        }
    }

    public int getmasa() {  //metoda (akcesor, zwraca wartość zmiennej)
        return masa;
    }

    public int PromienPunktuMaterialnego = 0;

    public int getMoment() {
        return masa * PromienPunktuMaterialnego;
    }

    int st;
    public int getSteiner(int r) {
        return st = masa * r * r;
    }
}




