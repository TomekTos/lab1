/**
 * Created by Tomasz on 22.03.2017.
 */
public class testowa
{
    public static void main(String[] args)
    {
    PunktMaterialny punkt1=new PunktMaterialny(10);
    System.out.println("Masa punktu 1 wynosi: "+punkt1.getmasa());
    System.out.println("Moment punktu 1 wynosi: "+punkt1.getMoment());
    System.out.println("Moment Stainera punktu 1 wynosi: "+punkt1.getSteiner(5));
    PunktMaterialny punkt2=new PunktMaterialny(-20);
    System.out.println("Masa punktu 2 wynosi: "+punkt2.getmasa());
    System.out.println("Moment punktu 2 wynosi: "+punkt2.getMoment());
    System.out.println("Moment Stainera punktu 2 wynosi: "+punkt2.getSteiner(10));
    int [] tablica=new int [10];
    for (int i=0; i<10; i++)
    {
        PunktMaterialny punkt3 = new PunktMaterialny(i);
        tablica[i]=punkt3.getmasa();
        System.out.println("Masa punktu 3 wynosi: "+punkt3.getmasa());
        System.out.println("Moment punktu 3 wynosi: "+punkt3.getMoment());
        System.out.println("Moment Stainera punktu 3 wynosi: "+punkt3.getSteiner(10));
    }
    }
}

