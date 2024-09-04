/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import domain.Cliente;
import domain.PessoaFisica;
import domain.Veiculo;

/**
 *
 * @author PC
 */
public class Relatorio {
    public static String imprimir(Cliente cliente) {
        StringBuilder sb = new StringBuilder();
//        String formatText = "%-15s";
//        String formatValor = "%5.2f";

        sb.append("==========[ CLIENTE ]============").append("\n");
        sb.append("Nome........: ").append(cliente.getNome()).append("\n");
        sb.append("Celular........: ").append(cliente.getNome()).append("\n");
        sb.append("Email........: ").append(cliente.getNome()).append("\n");
        sb.append("Data do Cadastro........: ").append(cliente.getNome()).append("\n");
        if(cliente instanceof PessoaFisica){
            sb.append("CPF........: ").append(cliente.getNome()).append("\n");
            sb.append("Data de Nascimento........: ").append(cliente.getNome()).append("\n");
        }else{
            sb.append("CNPJ........: ").append(cliente.getNome()).append("\n");
            sb.append("Inscricao Estadual........: ").append(cliente.getNome()).append("\n");
        }
        sb.append("==========[ VEICULOS RELACIONADOS ]============").append("\n");
        int i = 0;
        for (Veiculo veiculo: cliente.getVeiculos()) {
            sb.append(++i).append(" Veiculo...:\n");
            sb.append("Placa....:").append(veiculo.getPlaca()).append("\n");
            sb.append("Placa....:").append(veiculo.getPlaca()).append("\n");
            sb.append("Marca....:").append(veiculo.getPlaca()).append("\n");
            sb.append("Modelo....:").append(veiculo.getPlaca()).append("\n");
            sb.append("Cor....:").append(veiculo.getPlaca()).append("\n");
        }        

//        sb.append("========================================").append("\n");
//        sb.append("Data...........: ").append(cf.getData().format(formatterData)).append("\n");

//        sb.append("========================================").append("\n");
//        sb.append(" ****** OBRIGADO PELA PREFERÊNCIA ***** ").append("\n");
        return sb.toString();
    }
}
