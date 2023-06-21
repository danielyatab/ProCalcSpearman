/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.List;

/**
 *
 * @author yatac
 */
public class ModelSpearman {
    private List x;
    private List y;
    private double covarianza;
    private double spearman;
    private double pearson;
    private double cofYsobreX;
    private double cofXsobreY;

    
    public ModelSpearman(){}
        
    public ModelSpearman(List x, List y) {
        this.x = x;
        this.y = y;
    }

    public ModelSpearman(List x, List y, double covarianza, double spearman, double pearson, double cofYsobreX, double cofXsobreY) {
        this.x = x;
        this.y = y;
        this.covarianza = covarianza;
        this.spearman = spearman;
        this.pearson = pearson;
        this.cofYsobreX = cofYsobreX;
        this.cofXsobreY = cofXsobreY;
    }

    public List getX() {
        return x;
    }

    public void setX(List x) {
        this.x = x;
    }

    public List getY() {
        return y;
    }

    public void setY(List y) {
        this.y = y;
    }

    public double getCovarianza() {
        return covarianza;
    }

    public void setCovarianza(double covarianza) {
        this.covarianza = covarianza;
    }

    public double getSpearman() {
        return spearman;
    }

    public void setSpearman(double spearman) {
        this.spearman = spearman;
    }

    public double getPearson() {
        return pearson;
    }

    public void setPearson(double pearson) {
        this.pearson = pearson;
    }

    public double getCofYsobreX() {
        return cofYsobreX;
    }

    public void setCofYsobreX(double cofYsobreX) {
        this.cofYsobreX = cofYsobreX;
    }

    public double getCofXsobreY() {
        return cofXsobreY;
    }

    public void setCofXsobreY(double cofXsobreY) {
        this.cofXsobreY = cofXsobreY;
    }
    
    
}
