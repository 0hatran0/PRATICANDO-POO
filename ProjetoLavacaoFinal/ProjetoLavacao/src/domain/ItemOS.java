/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
public class ItemOS {
    private double valorServico;
    private String observacoes;

    private Servico servico;
    private OrdemServico ordemServico;
        
    public double getValorServico() {
        return valorServico;
    }

    // Deve ser possivel alterar o valor independete do valor do servico
    public void setValorServico(double valorServico) {
        if(this.servico == null){
            notificarEscolherServico();
        }else{
            this.valorServico = valorServico;
        }
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Servico getServico() {
        return servico;
    }

    // Escolher um servico deve atribuir o valor do servico ao atributo valorServico
    public void setServico(Servico servico) {
        this.servico = servico;
        this.valorServico = this.servico.getValor();
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
    
    private static void notificarEscolherServico(){
        System.out.println("É necessário escolher o servico antes de alterar o valor");
    }

//    @Override
//    public String toString() {
//        return "ItemOS{" + "valorServico=" + valorServico + ", observacoes=" + observacoes + ", servico=" + servico + ", ordemServico=" + ordemServico + '}';
//    }
    
    
}
