/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
public class Pontuacao { // Classe possui associação por composição
    // Atributos
    private int quantidade;
    
    // Metodos
    public int adicionar(int qtd){ // metodo para acrecentar mais pontos 
       this.quantidade+= qtd;
       return quantidade;
    }
  
    public int subtrair(int qtd){// metodo para retirar pontos
        if(quantidade < qtd){
            return quantidade;   
        }else{
            this.quantidade-= qtd;
            return quantidade;
        }        
    }
    
    public int saldo(){ // metodo para mostrar o saldo registrado na instância
            return quantidade; // funciona como um getter para a classe
    }
     
}
