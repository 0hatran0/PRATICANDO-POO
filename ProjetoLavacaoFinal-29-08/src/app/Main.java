/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.EStatus;
import domain.ItemOS;
import domain.OrdemServico;
import report.ImpressaoOS;
import java.time.LocalDate;
import datasource.DataSource;
import exceptions.ExceptionLavacao;
import static report.Relatorio.imprimir;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        
        DataSource.inicializandoDados();
        
        OrdemServico os = new OrdemServico(1,LocalDate.now(),5, DataSource.getVeiclo(1),EStatus.ABERTA);
        
        ItemOS item1 = new ItemOS();
        item1.setValorServico(DataSource.getServico(1).getValor());
        item1.setServico(DataSource.getServico(1));
        item1.setObservacoes("A");
        ItemOS item2 = new ItemOS();
        item2.setValorServico(25.0);
        item2.setServico(DataSource.getServico(3));
        item2.setObservacoes("B");
//        ItemOS item3 = new ItemOS();
//        item3.setValorServico(DataSource.getServico(3).getValor());
//        item3.setServico(DataSource.getServico(3));
//        item3.setObservacoes("C");
        
        os.add(item1);
        os.add(item2);
//        os.add(item3);
        
        System.out.println(ImpressaoOS.imprimirOS(os));
//        System.out.println(imprimir(DataSource.getCliente(1)));  

        // Excessao para caso insira um numero com virgula na pontuacao
//        try{
//            DataSource.getCliente(1).getPontuacao().subtrair(0.5);
//        }catch(RuntimeException e){
//            System.out.println("O sistema aceita apenas numeros inteiros");
//        }
                
        //Excessao caso remova um veiculo que não existe
//        ExceptionLavacao.ExcessaoRemoverVeiculo(DataSource.getVeiclo(4));
//        try{
//            DataSource.getCliente(2).remove(DataSource.getVeiclo(4));
//        }catch(NullPointerException e){
//            System.out.println("VEICULO NAO EXISTE!!\n");
//        }
        
//        System.out.println(imprimir(DataSource.getCliente(2))); 
    }
}
