/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import domain.OrdemServico;
import domain.ItemOS;
import java.text.SimpleDateFormat;
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
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        sb.append("       ***** ORDEM DE SERVICO ******        ").append("\n");
        sb.append("Cliente........: ").append(os.getVeiculo().getCliente().getNome()).append("\n");
        sb.append("Veiculo........: ").append(os.getVeiculo().getPlaca()).append("\n");
        sb.append("Marca........: ").append(os.getVeiculo().getModelo().getMarca().getNome()).append("\n");
        sb.append("Numero da Ordem........: ").append(os.getNumero()).append("\n");
        sb.append("Valor Total........: ").append(os.calcularServico()).append("\n");
        // Estura de repetição para servico
        
        sb.append("========================================").append("\n");
//        sb.append("Empresa........: ").append(cf.getEmpresa().getNome()).append("\n");
//        sb.append("========================================").append("\n");
//        sb.append("Número.........: ").append(cf.getCodigo()).append("\n");
//        sb.append("Data...........: ").append(cf.getData().format(formatterData)).append("\n");
//        sb.append("     Horario...: ").append(cf.getHora().format(formatterTime)).append("\n");
//        sb.append("==========[ ITENS DO CUPOM ]============").append("\n");
//        sb.append("Item\tDescricao\tqtd\tValor").append("\n");
//        int i = 0;
//        for (ItemCP itemCP: cf.getItensCP()) {
//            sb.append(++i).append("\t").append(
//                    String.format(formatText, (itemCP.getProduto().getNome().length()>15)?itemCP.getProduto().getNome().substring(0, 14):itemCP.getProduto().getNome())).append("\t")
//                    .append(itemCP.getQuantidade()).append("\t")
//                    .append(String.format(formatValor, itemCP.calcularTotal()))
//                    .append("\n");
//        }
//        sb.append("----------------------------------------").append("\n");
//        sb.append("TOTAL\t\t\t\t").append(String.format(formatValor, cf.calcularTotal())).append("\n");
//        sb.append("========================================").append("\n");
//        sb.append(" ****** OBRIGADO PELA PREFERÊNCIA ***** ").append("\n");
        return sb.toString();
    }
}
