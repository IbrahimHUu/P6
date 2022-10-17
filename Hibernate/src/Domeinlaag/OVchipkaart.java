package Domeinlaag;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Entity
@Table(name = "ov_chipkaart")
public class OVchipkaart {

    @Id
    @Column(name = "kaart_nummer")
    private int kaartNummer;
    @Column(name = "geldig_tot")
    private Date geldigTot;
    private int klasse;
    private double saldo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reiziger_id", nullable = false)
    private Reiziger reiziger;

    @ManyToMany
            (mappedBy = "ovchipkaarten")
    private List<Product> producten = new ArrayList<>();

    public OVchipkaart(int krtnr, Date geltot, int ks, Double sd, int ri) {
        kaartNummer = krtnr;
        geldigTot = geltot;
        klasse = ks;
        saldo = sd;

    }

    public OVchipkaart() {

    }


    public int getKaartNummer() {
        return kaartNummer;
    }

    public void setKaartNummer(int kaartNummer) {
        this.kaartNummer = kaartNummer;
    }

    public Date getGeldigTot() {
        return geldigTot;
    }

    public void setGeldigTot(Date geldigTot) {
        this.geldigTot = geldigTot;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Reiziger getReiziger() {
        return reiziger;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }

//    public List<Product> getProducten() {
//        return producten;
//    }
//
//    public void setProducten(List<Product> producten) {
//        this.producten = producten;
//    }
    public String toString(){
        String s =  "Kaartnummer:"+ kaartNummer + ", Geldig tot:" + " " + geldigTot + ", Klasse:" + " " + klasse  + ", Saldo:" + " " + saldo;
//                + ", reiziger_id:" + " " + reizigerId;
        if(reiziger == null){
            s = s + " De reiziger is onbekend";
        }
        else {
            s = s + " Rekeninghouder " + reiziger;
        }

        return s;
    }

}
