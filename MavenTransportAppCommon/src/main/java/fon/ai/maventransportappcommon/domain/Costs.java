/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.maventransportappcommon.domain;

import java.io.Serializable;

/**
 * Klasa koja predstavlja troskove.
 *
 * @author Vladimir
 * @version 1.0
 * @see Costs
 */
public class Costs implements Serializable{

    /**
     *Privatni atribut koji predstavlja trosak plate zaposlenom.
     */
    private double driverSallary;

    /**
     *Privatni atribut koji predstavlja iznos troska goriva.
     */
    private double fuel;

    /**
     *Privatni atribut koji predstavlja iznos troska putarine.
     */
    private double toll;

    /**
     *Privatni atribut koji predstavlja iznos ostalih vrsta troskova.
     */
    private double other;

    /**
     *Privatni atribut koji predstavlja iznos ukupnog troska.
     */
    private double inTotal;

    /**
     *Neparametrizovani konstruktor klase Costs.
     */
    public Costs() {
    }

    /**
     *Parametrizovani konstruktor klase Costs koji incijalizuje objekte ove klase.
     * @param driverSallary plata zaposlenog
     * @param fuel trosak goriva
     * @param toll trosak putarine
     * @param other ostali troskovi
     * @param inTotal zbir svih troskova
     */
    public Costs(double driverSallary, double fuel, double toll, double other, double inTotal) {
        this.driverSallary = driverSallary;
        this.fuel = fuel;
        this.toll = toll;
        this.other = other;
        this.inTotal = inTotal;
    }

    /**
     *Metoda koja vraca zbir svih troskova
     * @return zbir svih troskova
     */
    public double getInTotal() {
        return inTotal;
    }

    /**
     *Metoda koja postavlja zbir svih troskova
     * @param inTotal zbir svih troskova
     */
    public void setInTotal(double inTotal) {
        this.inTotal = inTotal;
    }

    /**
     *Metoda koja vraca iznos plate zaposlenog.
     * @return iznos plate zaposlenog.
     */
    public double getDriverSallary() {
        return driverSallary;
    }

    /**
     *Metoda koja postavlja novi iznos plate zaposlenom.
     * @param driverSallary iznos plate zaposlenog
     */
    public void setDriverSallary(double driverSallary) {
        this.driverSallary = driverSallary;
    }

    /**
     *Metoda koja vraca iznos troska goriva.
     * @return iznos troska goriva
     */
    public double getFuel() {
        return fuel;
    }

    /**
     *Metoda koja postavlja iznos troska goriva na novu vrednost.
     * @param fuel iznos troska goriva
     */
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    /**
     *Metoda koja vraca iznos troska putarine.
     * @return iznos troska putarine.
     */
    public double getToll() {
        return toll;
    }

    /**
     *Metoda koja postavlja novi iznos troska putarine.
     * @param toll iznos troska putarine
     */
    public void setToll(double toll) {
        this.toll = toll;
    }

    /**
     *Metoda koja vraca vrednost ostalih troskova.
     * @return vrednost ostalih troskova
     */
    public double getOther() {
        return other;
    }

    /**
     *Metoda koja postavlja vrednost ostalih troskova.
     * @param other vrednost ostalih troskova
     */
    public void setOther(double other) {
        this.other = other;
    }
    
    
}
