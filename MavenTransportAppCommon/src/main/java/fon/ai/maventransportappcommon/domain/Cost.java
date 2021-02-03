/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.maventransportappcommon.domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa koja predstavlja trosak.
 *
 * @author Vladimir
 * @version 1.0
 * @see Cost
 */
public class Cost implements Serializable, IGeneralEntity{

    /**
     *Privatni atribut koji predstavlja vrstu troska.
     */
    private CostType costType;

    /**
     *Privatni atribut koji predstavlja iznos troska.
     */
    private double amount;

    /**
     *Privatni atribut koji predstavlja voznju.
     */
    private Drive drive;

    /**
     * Parametrizovani konstruktor koji inicijalizuje trosak.
     * @param costType tip troska
     * @param amount iznos
     * @param drive voznja
     */
    public Cost(CostType costType, double amount, Drive drive) {
        this.costType = costType;
        this.amount = amount;
        this.drive = drive;
        System.out.println("Just test Common");
    }
    
    /**
     *Neparametrizovani konstruktor klase Trosak.
     */
    public Cost() {
    }

    /**
     *Parametrizovani konstruktor za inicijalizaciju troska.
     * @param costType tip troska
     * @param amount iznos
     */
    public Cost(CostType costType, double amount) {
        this.costType = costType;
        this.amount = amount;
    }
    
    /**
     *Metoda koja vraca String koji predstavlja naziv relacije u bazi.
     * @return String naziv tabele
     */
    @Override
    public String getTableName() {
        return "cost";
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
            Drive dr = new Drive();
            CostType ct = CostType.valueOf(resultSet.getString("costtype"));
            dr.setId(resultSet.getInt("voznja"));
            list.add(new Cost(ct, resultSet.getDouble("amount"), dr));
        }
        return list;
    }

    /**
     *Metoda koja vraca String vrednosti svih atributa doticne klase.
     * @return String vrednosti svih atributa.
     */
    @Override
    public String getValues() {
        return "'" + drive.getId() + "'" + ", '" + costType+ "', '" + amount + "'";
    }

/**
     *Metoda koja vraca String nalepljenih svih atributa doticne klase.
     * @return String koji predstavlja sve atribute doticne klase.
     */
    @Override
    public String getAttributes() {
        return "voznja, costtype, amount";
    }

    /**
     *Metoda sa povratnim tipom String.
     * @return Sring koji predstavlja skup atributa koji se postavljaju.
     */
    @Override
    public String setAttributes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *Metoda koja za povratnu vrednost ima String koji predstavlja delete upit za doticnu tabelu.
     * @return String za delete uslov nad bazom
     */
    @Override
    public String getDeleteCondition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *Metoda koja za povratnu vrednost ima String koji predstavlja update upit za doticnu tabelu.
     * @return String za update uslov nad bazom
     */
    @Override
    public String getUpdateCondition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

/**
     *Metoda koja za povratnu vrednost ima String koji predstavlja select upit za doticnu tabelu.
     * @return String za select uslov nad bazom
     */
    @Override
    public String getSelectContidion() {
        return "voznja = '" + drive.getId() + "'";
    }

    /**
     * Metoda koja vraca tip troska.
     * @return tip troska
     */
    public CostType getCostType() {
        return costType;
    }

    /**
     * Metoda koja postavlja tip troska.
     * @param costType tip troska
     */
    public void setCostType(CostType costType) {
        this.costType = costType;
    }

    /**
     *Metoda koja vraca iznos troska.
     * @return iznos troska
     */
    public double getAmount() {
        return amount;
    }

    /**
     *Metoda koja postavlja iznos troska
     * @param amount iznos
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     *Metoda koja vraca voznju
     * @return voznja
     */
    public Drive getDrive() {
        return drive;
    }

    /**
     *Metoda koja postavlja voznju
     * @param drive voznja
     */
    public void setDrive(Drive drive) {
        this.drive = drive;
    }
    
}
