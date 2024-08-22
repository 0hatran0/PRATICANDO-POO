/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class OrdemServico {
    // Atributos - variaveis de instacia
    private long numero;
    private double total;
    private LocalDate agenda;
    private double desconto;
    
    private EStatus status = EStatus.ABERTA;
//    private Veiculo veiculo;
    private List <ItemOS> itensOS = new ArrayList<>();
    
    
    // Construtores
    public OrdemServico() {
    }

    public OrdemServico(long numero, LocalDate agenda, double desconto, EStatus status) {
        this.numero = numero;
        this.agenda = agenda;
        this.desconto = desconto;
        this.status = status;
    }
//    public OrdemServico(long numero, double total, LocalDate agenda, double desconto, Veiculo veiculo) {
//        this.numero = numero;
//        this.total = total;
//        this.agenda = agenda;
//        this.desconto = desconto;
//        this.veiculo = veiculo;
//    }
    // Metedos de Acesso

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

//    public double getTotal() {
//        return total;
//    }
//
//    public void setTotal(double total) {
//        this.total = total;
//    }

    public LocalDate getAgenda() {
        return agenda;
    }

    public void setAgenda(LocalDate agenda) {
        this.agenda = agenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

//    public Veiculo getVeiculo() {
//        return veiculo;
//    }
//
//    public void setVeiculo(Veiculo veiculo) {
//        this.veiculo = veiculo;
//    }

    public List<ItemOS> getItensOS() {
        return itensOS;
    }

//    public void setItemOS(List<ItemOS> itensOS) {
//        this.itensOS = itensOS;
//    }
    
    // Metodos
    public double calcularServico(){
        this.total = 0;
        int tamanhoVetor = this.itensOS.size();
        for(int i=0;i<(tamanhoVetor);i++ ){
            this.total+= this.itensOS.get(i).getValorServico();
        }
//        this.total-= (this.total*(this.desconto/100));
        return total;
    
    }
    
    public void add(ItemOS itemOS){
        this.itensOS.add(itemOS);
        itemOS.setOrdemServico(this);
        
    }
    
    public void remove(ItemOS itemOS){
        this.itensOS.remove(itemOS);
        itemOS.setOrdemServico(null);
    }

    @Override
    public String toString() {
        return "OrdemServico{" + "numero=" + numero + ", total=" + total + ", agenda=" + agenda + ", desconto=" + desconto + ", status=" + status + ", itensOS=" + itensOS + '}';
    }
    
    
}
