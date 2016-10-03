package getraenkeHandel2;

/**
 * Created by mike on 02.10.16.
 */
public class Getraenk2 {

    //name
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    //preis
    private double preis;

    public double getPreis() {

        return preis;
    }

    public void setPreis(double preis) {

        this.preis = preis;
    }

    //bestand
    private int bestand;

    public int getBestand() {

        return bestand;
    }

    public void setBestand(int bestand) {

        this.bestand = bestand;
    }

    //hoechstbestand
    private int hoechstBestand;

    public int getHoechstBestand() {

        return hoechstBestand;
    }

    public void setHoechstBestand(int hoechstBestand) {

        this.hoechstBestand = hoechstBestand;
    }

    //mindestBestand
    private int mindestBestand;

    public int getMindestBestand() {

        return mindestBestand;
    }

    public void setMindestBestand(int mindestBestand) {

        this.mindestBestand = mindestBestand;
    }

    //second method to set in Getraenkeverwaltung2.java
    public Getraenk2 (String name, double preis, int bestand, int hoechstBestand, int mindestBestand) {
        this.name = name;
        this.preis = preis;
        this.bestand = bestand;
        this.hoechstBestand = hoechstBestand;
        this.mindestBestand = mindestBestand;
    }
}
