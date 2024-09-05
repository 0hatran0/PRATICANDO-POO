/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

import datasource.DataSource;
import domain.Veiculo;


/**
 *
 * @author PC
 */
public class ExceptionLavacao {
    public static void ExcessaoRemoverVeiculo(Veiculo veiculo){
        try{
            DataSource.getCliente(2).remove(veiculo);
        }catch(Exception ex){
            System.out.println("VEICULO NAO EXISTE!!");
            System.out.println("ERRO:"+ex.getMessage()+"\n");
//            ex.printStackTrace();
        }
    }
}
