package Domeinlaag;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_nummer")
    private int prodcutNummer;
    private String naam;
    private String beschrijving;
    private double prijs;

    @ManyToMany
    private List<OVchipkaart> ovchipkaarten = new ArrayList<>();

    public Product (int prnr, String nm, String besch, double prs) {
        prodcutNummer = prnr;
        naam = nm;
        beschrijving = besch;
        prijs = prs ;
    }

    public Product() {

    }
    public int getProdcutNummer() {
        return prodcutNummer;
    }

    public void setProdcutNummer(int prodcutNummer) {
        this.prodcutNummer = prodcutNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public List<OVchipkaart> getOvchipkaarten() {
        return ovchipkaarten;
    }

    public void setOvchipkaarten(List<OVchipkaart> ovchipkaarten) {
        this.ovchipkaarten = ovchipkaarten;
    }
    public String toString () {

        String s = "Productnummer:"+ prodcutNummer + ", Naam:" + " " + naam + ", Beschrijving:" + " " + beschrijving  + " Prijs:" + " " + prijs;
        return s;
    }
}
