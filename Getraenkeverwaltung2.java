package getraenkeHandel2;

/**
 * Created by mike on 02.10.16.
 */
public class Getraenkeverwaltung2 {

    public static void main(String[] args) {

        //input of attributes
        Getraenk2 getraenk1 = new Getraenk2("Apfelsaft", 1.99, 78, 100, 50);

        //output of attributes
        System.out.println("Name: " + getraenk1.getName());
        System.out.println("Preis: " + getraenk1.getPreis());
        System.out.println("Bestand: " + getraenk1.getBestand());
        System.out.println("Hoechstbestand: " + getraenk1.getHoechstBestand());
        System.out.println("Mindestbestand: " + getraenk1.getMindestBestand());

    }
}
