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
        
//        os.calcularServico();
//        System.out.println(DataSource.getServico(1));
//        System.out.println(os);
//        System.out.println(item1);
        System.out.println(ImpressaoOS.imprimirOS(os));
        System.out.println("Relatorio");
         
//        System.out.println(DataSource.getCliente(1).getDados());
        
    }
}
