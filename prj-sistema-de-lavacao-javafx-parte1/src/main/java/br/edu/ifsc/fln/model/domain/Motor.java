/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.fln.model.domain;

/**
 *
 * @author PC
 */

public class Motor { 
    private int potencia;
    
    private ETipoCombustivel tipoCobustivel = ETipoCombustivel.GASOLINA; 
    
    public int getPotencia() {
        return potencia;
    }

    public ETipoCombustivel getTipoCobustivel() {
        return tipoCobustivel;
    }
    
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTipoCobustivel(ETipoCombustivel tipoCobustivel) {
        this.tipoCobustivel = tipoCobustivel;
    }

//    @Override
//    public String toString() {
//        return "Motor{" + "potencia=" + potencia + "CV " + ", TipoCombustivel=" + tipoCobustivel + '}';
//    }
       
}
