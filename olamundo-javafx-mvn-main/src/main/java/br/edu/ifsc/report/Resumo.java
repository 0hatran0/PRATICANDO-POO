/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.report;

import br.edu.ifsc.model.Funcionario;

/**
 *
 * @author PC
 */
public class Resumo {
    public static String infoFuncionario(Funcionario funcionario) {
        StringBuilder sb = new StringBuilder();
        sb.append("**** Informações do Funcionario ****").append("\n");
        sb.append("================================").append("\n");
        sb.append("Nome.........: ").append(funcionario.getNome()).append("\n");
        sb.append("Matricula....: ").append(funcionario.getMatricula()).append("\n");
        sb.append("Salario base.: ").append(funcionario.getSalarioBase()).append("\n");
        sb.append("Dependentes..: ").append(funcionario.getDependentes()).append("\n");
        sb.append("Líquido......: ").append(funcionario.calcularSalarioLiquido()).append("\n\n");
        sb.append("===============================").append("\n");
        return sb.toString();
    }   
}
