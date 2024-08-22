/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
public class Servico {
    private int id; 
    private String descricao;
    private double valor;
    private static int pontos;

    ECategoria categoria = ECategoria.PADRAO;
    
    public Servico() {
    }

    public Servico(int id, String descricao, double valor, ECategoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Pontuação será static, entao apenas poderá ser retornada.
    public int getPontos() {
        return pontos;
    }

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Servico{" + "id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", categoria=" + categoria + '}';
    }
    
}
