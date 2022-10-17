package Domeinlaag;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "adres")
public class Adres {
    @Id
    @Column(name = "adres_id")
    private int adresId;
    private String postcode;
    private String huisnummer;
    private String straat;
    private String woonplaats;

    @OneToOne
    @JoinColumn(name = "reiziger_id", nullable = false)
    private Reiziger reiziger;


    public Adres (int adrid, String pstcd, String huisnr, String strt, String woonplts){
        adresId = adrid;
        postcode = pstcd;
        huisnummer = huisnr;
        straat = strt;
        woonplaats = woonplts;

    }
    public Adres() {

    }

    public int getAdresId() {
        return adresId;
    }

    public void setAdresId(int adresId) {
        this.adresId = adresId;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public Reiziger getReiziger() {
        return reiziger;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }

    public String toString(){

        String s = "Adresid: " + adresId + ", Postcode: " + postcode + ", Huisnummer: " + huisnummer +
                ", Straat: " + straat + ", Woonplaats: " + woonplaats;
        return s;
    }
}
