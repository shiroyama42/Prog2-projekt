package org.example;

import java.time.LocalDate;

public class Virag {
    private String nev;
    private int raktaronLevoMennyiseg;
    private LocalDate vagasDatuma;
    private String besorolas;
    private int ar;

    public Virag(String nev, int raktaronLevoMennyiseg, LocalDate vagasDatuma, String besorolas, int ar) {
        this.nev = nev;
        this.raktaronLevoMennyiseg = raktaronLevoMennyiseg;
        this.vagasDatuma = vagasDatuma;
        this.besorolas = besorolas;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public int getRaktaronLevoMennyiseg() {
        return raktaronLevoMennyiseg;
    }

    public LocalDate getVagasDatuma() {
        return vagasDatuma;
    }

    public String getBesorolas() {
        return besorolas;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Virag{");
        sb.append("nev='").append(nev).append('\'');
        sb.append(", raktaronLevoMennyiseg=").append(raktaronLevoMennyiseg);
        sb.append(", vagasDatuma=").append(vagasDatuma);
        sb.append(", besorolas='").append(besorolas).append('\'');
        sb.append(", ar=").append(ar);
        sb.append('}');
        return sb.toString();
    }
}
