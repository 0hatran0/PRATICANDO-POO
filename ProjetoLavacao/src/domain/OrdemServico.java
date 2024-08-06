/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
public class OrdemServico {
    // Atributos - variaveis de instacia
    private long numero;
    private double total;
    private String agenda;
    private double desconto;
    
    private EStatus status = EStatus.ABERTA;
    private Veiculo veiculo;
    private ItemOS itemOS;
    
    
    // Metodos
    public double calcularServico(){
        return total;
    }
    
    public void add(ItemOS itemOS){
        
    }
    
    public void remove(ItemOS itemOS){
        
    }
    
}
