package Domeinlaag;

import java.util.List;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reiziger")
public class Reiziger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reiziger_id", nullable = false)
    private int id;
    private String voorletters;
    private String tussenvoegsel;
    private String achternaam;
    private Date geboortedatum;

    @OneToMany
    private List<OVchipkaart> ovchipkaarten;

    @OneToOne
            (mappedBy = "reiziger")
    private Adres adres;

    public Reiziger(int identiteit, String voorltrs, String tussenvgsl, String achternm, Date gebdtm) {
        id = identiteit;
        voorletters = voorltrs;
        tussenvoegsel = tussenvgsl;
        achternaam = achternm;
        geboortedatum = gebdtm;

    }

    public Reiziger() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public List<OVchipkaart> getOvchipkaarten() {
        return ovchipkaarten;
    }

    public void setOvchipkaarten(List<OVchipkaart> ovchipkaarten) {
        this.ovchipkaarten = ovchipkaarten;
    }
//
//    public Adres getAdres() {
//        return adres;
//    }
//
//    public void setAdres(Adres adres) {
//        this.adres = adres;
//    }

    public String toString(){
        String s = "Id:" + " " + id + " " + "Voorletters:" + " " + voorletters + " " + "Tussenvoegsel:" + " " + tussenvoegsel +
                " " + "Achternaam:" + " " + achternaam + " " + "Geboortedatum:" + " " + geboortedatum;
        return s;
    }
}