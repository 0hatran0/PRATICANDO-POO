/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;


import domain.Cliente;
import domain.Cor;
import domain.ETipoCombustivel;
import domain.ECategoria;
import domain.EStatus;
import domain.ItemOS;
import domain.Marca;
import domain.Modelo;
import domain.OrdemServico;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Servico;
import domain.Veiculo;
import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        Servico sv1 = new Servico(1, "Completa", 10, ECategoria.PADRAO);
        Servico sv2 = new Servico(2, "Pretinho", 20, ECategoria.PADRAO);
        Servico sv3 = new Servico(3, "Trocar Oleo", 30, ECategoria.PADRAO);
        
        OrdemServico os = new OrdemServico(1,LocalDate.now(),5, EStatus.ABERTA);
        ItemOS item1 = new ItemOS();
        item1.setServico(sv1);
        item1.setObservacoes("A");
        ItemOS item2 = new ItemOS();
        item2.setServico(sv2);
        item2.setObservacoes("B");
        ItemOS item3 = new ItemOS();
        item3.setServico(sv3);
        item3.setObservacoes("C");
        
        os.add(item1);
        os.add(item2);
        os.add(item3);
        
//        System.out.println("Valor Total: "+os.calcularServico());
        System.out.println(sv1);
        System.out.println(os);
//        System.out.println(item1);
    }
}
