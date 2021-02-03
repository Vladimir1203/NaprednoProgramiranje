/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.maventransportappcommon.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Klasa koja predstavlja voznju.
 *
 * @author Vladimir
 * @version 1.0
 * @see Drive
 */
public class Drive implements Serializable, IGeneralEntity{

    /**
     *Privatni atribut koji predstavlja identifikacioni broj voznje.
     */
    private int id;

    /**
     *Privatni atribut koji predstavlja instancu klase Costs.
     */
    private Costs cost;

    /**
     *Privatni atribut koji predstavlja datum.
     */
    private Date date;

    /**
     *Privatni atribut koji predstavlja iznos fakture.
     */
    private double facturePrice;

    /**
     *Privatni atribut koji predstavlja prikolicu.
     */
    private Trailer tr;

    /**
     *Privatni atribut koji predstavlja kamion.
     */
    private Truck t;

    /**
     *Privatni atribut koji predstavlja vozaca.
     */
    private Driver d;

    /**
     *Privatni atribut koji predstavlja listu troskova.
     */
    private ArrayList<Cost> costs;
    
    /**
     *Neparametrizovani konstruktor klase Drive.
     */
    public Drive() {
    }

    /**
     *Parametrizovani konstruktor klase Drive.
     * @param cost trosak
     * @param date datum
     * @param facturePrice iznos fakture
     * @param tr prikolica
     * @param t kamion
     * @param d vozac
     * @param costs troskovi
     */
    public Drive(Costs cost, Date date, double facturePrice, Trailer tr, Truck t, Driver d, ArrayList<Cost> costs) {
        this.cost = cost;
        this.date = date;
        this.facturePrice = facturePrice;
        this.tr = tr;
        this.t = t;
        this.d = d;
        this.costs = costs;
    }

    /**
     *Parametrizovani konstruktor klase Drive.
     * @param date datum
     * @param facturePrice iznos fakture
     * @param tr prikolica
     * @param t kamion
     * @param d vozac 
     * @param costs troskovi
     */
    public Drive(Date date, double facturePrice, Trailer tr, Truck t, Driver d, ArrayList<Cost> costs) {
        this.date = date;
        this.facturePrice = facturePrice;
        this.tr = tr;
        this.t = t;
        this.d = d;
        this.costs = costs;
    }

    /**
     *Parametrizovani konstruktor klase Drive.
     * @param id identifikacioni broj
     * @param date datum
     * @param facturePrice iznos fakture
     * @param tr prikolica
     * @param t kamion
     * @param d vozac
     * @param costs troskovi
     */
    public Drive(int id, Date date, double facturePrice, Trailer tr, Truck t, Driver d, ArrayList<Cost> costs) {
        this.id = id;
        this.date = date;
        this.facturePrice = facturePrice;
        this.tr = tr;
        this.t = t;
        this.d = d;
        this.costs = costs;
    }
    
    /**
     *Parametrizovani konstruktor klase Drive.
     * @param id identifikacioni broj
     * @param cost trosak
     * @param date datum
     * @param facturePrice iznos fakture
     * @param tr prikolica
     * @param t kamion
     * @param d vozac
     * @param costs troskovi
     */
    public Drive(int id, Costs cost, Date date, double facturePrice, Trailer tr, Truck t, Driver d, ArrayList<Cost> costs) {
        this.id = id;
        this.cost = cost;
        this.date = date;
        this.facturePrice = facturePrice;
        this.tr = tr;
        this.t = t;
        this.d = d;
        this.costs = costs;
    }
    
    /**
     *Parametrizovani konstruktor klase Drive.
     * @param id identifikacioni broj
     * @param date datum
     * @param facturePrice iznos fakture
     * @param tr prikolica
     * @param t kamion
     * @param d vozac
     */
    public Drive(int id, Date date, double facturePrice, Trailer tr, Truck t, Driver d) {
        this.id = id;
        this.date = date;
        this.facturePrice = facturePrice;
        this.tr = tr;
        this.t = t;
        this.d = d;
    }

    /**
     *Parametrizovani konstruktor klase Drive.
     * @param id identifikacioni broj
     * @param cost trosak
     * @param date datum
     * @param facturePrice iznos fakture
     * @param tr prikolica
     * @param t kamion
     * @param d vozac
     */
    public Drive(int id, Costs cost, Date date, double facturePrice, Trailer tr, Truck t, Driver d) {
        this.id = id;
        this.cost = cost;
        this.date = date;
        this.facturePrice = facturePrice;
        this.tr = tr;
        this.t = t;
        this.d = d;
    }
    
    /**
     *Parametrizovani konstruktor klase Drive.
     * @param cost trosak
     * @param date datum
     * @param facturePrice iznos fakture
     * @param tr prikolica
     * @param t kamion 
     * @param d vozac 
     */
    public Drive(Costs cost, Date date, double facturePrice, Trailer tr, Truck t, Driver d) {
        this.cost = cost;
        this.date = date;
        this.facturePrice = facturePrice;
        this.tr = tr;
        this.t = t;
        this.d = d;
    }

    /**
     *Metoda koja vraca vozaca sa konkretne voznje.
     * @return vozac
     */
    public Driver getD() {
        return d;
    }

    /**
     *Metoda koja postavlja vozaca na konkretnoj voznji.
     * @param d vozac
     */
    public void setD(Driver d) {
        this.d = d;
    }

    /**
     *Metoda koja vraca troskove sa konkretne voznje.
     * @return trosak
     */
    public Costs getCost() {
        return cost;
    }

    /**
     *Metoda koja postavlja troskove sa konkretne voznje.
     * @param cost trosak
     */
    public void setCost(Costs cost) {
        this.cost = cost;
    }

    /**
     *Metoda koja vraca datum sa konkretne voznje.
     * @return datum
     */
    public Date getDate() {
        return date;
    }
 
    /**
     *Metoda koja postavlja datum konkretne voznje.
     * @param date datum
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     *Metoda koja vraca iznos fakture za voznju.
     * @return iznos fakture
     */
    public double getFacturePrice() {
        return facturePrice;
    }

    /**
     *Metoda koja postavlja iznos fakture na novi iznos.
     * @param facturePrice iznos fakture
     */
    public void setFacturePrice(double facturePrice) {
        this.facturePrice = facturePrice;
    }

    /**
     *Metoda koja vraca prikolicu koja je na odredjenoj voznji.
     * @return prikolica
     */
    public Trailer getTr() {
        return tr;
    }

    /**
     *Metoda koja postavlja prikolicu za konkretnu voznju.
     * @param tr prikolica
     */
    public void setTr(Trailer tr) {
        this.tr = tr;
    }

    /**
     *Metoda koja vraca kamion koji je na odredjenoj voznji.
     * @return kamion
     */
    public Truck getT() {
        return t;
    }
    
    /**
     *Metoda koja postavlja kamion za odredjenu voznju.
     * @param t kamion
     */
    public void setT(Truck t) {
        this.t = t;
    }

    /**
     *Metoda koja vraca String koji predstavlja naziv relacije u bazi.
     * @return String naziv tabele
     */
    @Override
    public String getTableName() {
        return "drive";
    }

/**
     *Metoda koja pravi listu od result seta za doticnu klasu.
     * @param resultSet tip podatka koji vraca konekcija sa bazom.
     * @return lista IGeneralEntity
     * @throws Exception Bacanje instance opsteg izuzetka
     */
    @Override
    public List<IGeneralEntity> getList(ResultSet resultSet) throws Exception {
        List<IGeneralEntity> list = new ArrayList<>();
        while (resultSet.next()) {
            double facturePrice = resultSet.getDouble("factureprice");
            Truck truck = new Truck();
            truck.setRegistrationMark(resultSet.getString("truck"));
            Trailer trailer = new Trailer();
            trailer.setRegistrationMark(resultSet.getString("trailer"));
            java.sql.Date datumsql = resultSet.getDate("date");
            Driver driver = new Driver();
            driver.setIDCard(resultSet.getInt("driver"));
            list.add(new Drive(resultSet.getInt("id"), datumsql, facturePrice, trailer, truck, driver));
        }
        return list;
    }    

    /**
     *Metoda koja vraca String vrednosti svih atributa doticne klase.
     * @return String vrednosti svih atributa.
     */
    @Override
    public String getValues() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.format(date);
        Date date11 = new java.sql.Date(date.getTime());
        return "'" + id + "', '" + date11 + "'" + ", '" + facturePrice + "','" + t.getRegistrationMark() + "','" + tr.getRegistrationMark() + "', '" + d.getIDCard() + "'";
    }

/**
     *Metoda koja vraca String nalepljenih svih atributa doticne klase.
     * @return String koji predstavlja sve atribute doticne klase.
     */
    @Override
    public String getAttributes() {
         return "id, date, factureprice, truck, trailer, driver";
    }

    /**
     *Metoda sa povratnim tipom String.
     * @return Sring koji predstavlja skup atributa koji se postavljaju.
     */
    @Override
    public String setAttributes() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.format(date);
        Date d = new java.sql.Date(date.getTime());
        System.out.println(d);
        return "id=" + getId()
                + ", date='" + d
                + "', factureprice='" + getFacturePrice()
                + "', truck='" + getT().getRegistrationMark()
                + "', trailer='" + getTr().getRegistrationMark() + "'";
    }

    /**
     *Metoda koja za povratnu vrednost ima String koji predstavlja delete upit za doticnu tabelu.
     * @return String za delete uslov nad bazom
     */
    @Override
    public String getDeleteCondition() {
        return "id=" + getId();
    }

    /**
     *Metoda koja za povratnu vrednost ima String koji predstavlja update upit za doticnu tabelu.
     * @return String za update uslov nad bazom
     */
    @Override
    public String getUpdateCondition() {
        return "id = '" + getId() + "'";
    }

    /**
     *Metoda koja za povratnu vrednost ima String koji predstavlja select upit za doticnu tabelu.
     * @return String za select uslov nad bazom
     */
    @Override
    public String getSelectContidion() {
         return "id = '" + getId() + "'";
    }

    /**
     *Metoda koja vraca identifikacioni broj voznje.
     * @return identifikacioni broj
     */
    public int getId() {
        return id;
    }

    /**
     *Metoda koja postavlja odredjeni identifikacioni broj voznje.
     * @param id identifikacioni broj
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *Metoda koja vraca listu troskova za jednu voznju.
     * @return lista troskova
     */ 
    public ArrayList<Cost> getCosts() {
        return costs;
    }

    /**
     *Metoda koja postavlja troskove za odredjenu voznju.
     * @param costs lista troskova
     */
    public void setCosts(ArrayList<Cost> costs) {
        this.costs = costs;
    }

    /**
     *Metoda koja se poziva kada zelimo prikaz instance ove klase.
     * @return string id
     */
    @Override
    public String toString() {
        return id +"";
    }

    /**
     *Metoda koja se generise uz equals i dodeljuje instanti konkretnu hashiranu vrednost.
     * @return hash vrednost
     */
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    /**
     *Predefinisana equals metoda za poredjenje objekata.
     * @param obj
     * @return tacno ili ne
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Drive other = (Drive) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.facturePrice) != Double.doubleToLongBits(other.facturePrice)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        if (!Objects.equals(this.tr, other.tr)) {
            return false;
        }
        if (!Objects.equals(this.t, other.t)) {
            return false;
        }
        if (!Objects.equals(this.d, other.d)) {
            return false;
        }
        if (!Objects.equals(this.costs, other.costs)) {
            return false;
        }
        return true;
    }


    
    
    
}
