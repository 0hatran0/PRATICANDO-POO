/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
// Classe especializada(subclasse) de porta, diferenciar os tipos de porta.
public class Correr extends Porta {
    
    // Sobrescrevendo metodos obrigatórios das superclasse.
    @Override
    public void abrir() {
        System.out.println("A porta de correr está aberta!");
    }

    @Override
    public void fechar() {
        System.out.println("A porta de correr está fechada!");
    }

    @Override
    public void travar() {
        System.out.println("A porta de correr está travada!");
    }

    @Override
    public void destravar() {
        System.out.println("A porta de correr está destravada!");
    }
}
