/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.model;

/**
 *
 * @author PC
 */
public class Funcionario {
    private int matricula;
    private String nome;
    private double salarioBase;
    private int dependentes;

    public Funcionario(int matricula, String nome, double salarioBase, int dependentes) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.dependentes = dependentes;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }
    
    public double calcularSalarioLiquido() {
        return salarioBase + (dependentes * 250.00);
    }
}
