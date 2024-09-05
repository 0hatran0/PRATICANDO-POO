/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import domain.Cliente;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Veiculo;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author PC
 */
public class Relatorio {
    public static String imprimir(Cliente cliente) {
        StringBuilder sb = new StringBuilder();
//        String formatText = "%-15s";
//        String formatValor = "%5.2f";

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        sb.append(" ********* RELATORIO DO CLIENTE ******** ").append("\n");
        sb.append("==============[ CLIENTE ]================").append("\n");
        sb.append("Nome...............: ").append(cliente.getNome()).append("\n");
        sb.append("Celular............: ").append(cliente.getCelular()).append("\n");
        sb.append("Email..............: ").append(cliente.getEmial()).append("\n");
        sb.append("Data do Cadastro...: ").append(cliente.getDataCadastro().format(formatterData)).append("\n");
        if(cliente instanceof PessoaFisica pessoaFisica){
            sb.append("CPF................: ").append(pessoaFisica.getCpf()).append("\n");
            sb.append("Data de Nascimento.: ").append(pessoaFisica.getDataNascimento().format(formatterData)).append("\n");
        }else{
            PessoaJuridica pessoaJuridica = (PessoaJuridica)cliente;
            sb.append("CNPJ...............: ").append(pessoaJuridica.getCnpj()).append("\n");
            sb.append("Inscricao Estadual.: ").append(pessoaJuridica.getInscricaoEstadual()).append("\n");
        }
        sb.append("=======[ VEICULOS RELACIONADOS ]=========").append("\n");
        int i = 0;
        for (Veiculo veiculo: cliente.getVeiculos()) {
            sb.append(++i).append(" Veiculo..........:\n");
            sb.append("Placa..............:").append(veiculo.getPlaca()).append("\n");
            sb.append("Marca..............:").append(veiculo.getModelo().getMarca().getNome()).append("\n");
            sb.append("Modelo.............:").append(veiculo.getModelo().getDescricao()).append("\n");
            sb.append("Cor................:").append(veiculo.getCor().getCor()).append("\n");
        }        
        sb.append("=========================================").append("\n");
        return sb.toString();
    }
}
