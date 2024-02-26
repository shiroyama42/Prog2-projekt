package org.example;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Vajas Benjámin
 */
public class Auto {
    private String rendszam, tipus, marka;
    private LocalDate gyartasDatuma;

    /**
     * Az autó teljesítménye
     */
    private int teljesitmeny;

    /**
     * A class kontruktora
     * @param rendszam
     * @param tipus
     * @param marka
     * @param gyartasDatuma
     * @param teljesitmeny
     */
    public Auto(String rendszam, String tipus, String marka, LocalDate gyartasDatuma, int teljesitmeny) {
        this.rendszam = rendszam;
        this.tipus = tipus;
        this.marka = marka;
        this.gyartasDatuma = gyartasDatuma;
        this.teljesitmeny = teljesitmeny;
    }

    /**
     * @return A getter a rendszám tagot adja vissza
     */
    public String getRendszam() {
        return rendszam;
    }

    public String getTipus() {
        return tipus;
    }

    public String getMarka() {
        return marka;
    }

    public LocalDate getGyartasDatuma() {
        return gyartasDatuma;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    /**
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return teljesitmeny == auto.teljesitmeny && Objects.equals(rendszam, auto.rendszam) && Objects.equals(tipus, auto.tipus) && Objects.equals(marka, auto.marka) && Objects.equals(gyartasDatuma, auto.gyartasDatuma);
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(rendszam, tipus, marka, gyartasDatuma, teljesitmeny);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("org.example.Auto{");
        sb.append("rendszam='").append(rendszam).append('\'');
        sb.append(", tipus='").append(tipus).append('\'');
        sb.append(", marka='").append(marka).append('\'');
        sb.append(", gyartasDatuma=").append(gyartasDatuma);
        sb.append(", teljesitmeny=").append(teljesitmeny);
        sb.append('}');
        return sb.toString();
    }
}
