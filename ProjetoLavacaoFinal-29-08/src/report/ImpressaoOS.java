/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import domain.OrdemServico;
import domain.ItemOS;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author PC
 */
public class ImpressaoOS {
    public static String imprimirOS(OrdemServico os){
        StringBuilder sb = new StringBuilder();
        String formatText = "%-15s";
        String formatValor = "%5.2f";

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        sb.append("   ********* ORDEM DE SERVICO **********    ").append("\n");
        sb.append("Numero da Ordem.: ").append(os.getNumero()).append("\n");
        sb.append("Status..........: ").append(os.getStatus()).append("\n");
        sb.append("Data............:").append(os.getAgenda().format(formatterData)).append("\n");
        sb.append("Desconto........: ").append(os.getDesconto()).append("\n");
        sb.append("==============[ CLIENTE ]================").append("\n");
        sb.append("Cliente.........: ").append(os.getVeiculo().getCliente().getNome()).append("\n");
        sb.append("Veiculo.........: ").append(os.getVeiculo().getPlaca()).append("\n");
        sb.append("Marca...........: ").append(os.getVeiculo().getModelo().getMarca().getNome()).append("\n");   
        sb.append("==============[ SERVICOS ]===============").append("\n");
        int i = 0;
        for (ItemOS itemOS: os.getItensOS()) {
            sb.append(++i).append("\t").append(
                    String.format(formatText, (itemOS.getServico().getDescricao().length()>15)?itemOS.getServico().getDescricao().substring(0, 14):itemOS.getServico().getDescricao())).append("\t")
                    .append(itemOS.getValorServico()).append("\t")
                    .append(itemOS.getObservacoes()).append("\t")
                    .append("\n");
        }
        sb.append("-----------------------------------------").append("\n");
        sb.append("TOTAL\t\t\t\t").append(String.format(formatValor, os.calcularServico())).append("\n");
        sb.append("=========================================").append("\n");
        sb.append(" ****** TENHA UM OTIMO SERVICO ****** ").append("\n");
        return sb.toString();
    }
}
