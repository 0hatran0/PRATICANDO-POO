/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datasource;

import domain.Cliente;
import domain.Cor;
import domain.ECategoria;
import domain.ETipoCombustivel;
import domain.Marca;
import domain.Modelo;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Servico;
import domain.Veiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class DataSource {
    private static List<Marca> marcas = new ArrayList<>();
    private static List<Cor> cores = new ArrayList<>();
    private static List<Modelo> modelos = new ArrayList<>();
    private static List<Veiculo> veiculos = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Servico> servicos = new ArrayList<>();
    
    public static void inicializandoDados(){
        
        marcas.add(new Marca(1,"Porsche"));
        marcas.add(new Marca(2,"BMW"));
        marcas.add(new Marca(3,"Lamborghini"));
        
        cores.add(new Cor(1,"Preto"));
        cores.add(new Cor(2,"Branco"));
        cores.add(new Cor(3,"Verde"));
        
        modelos.add(new Modelo(1, "Taycan", marcas.get(0), ECategoria.PADRAO));
        modelos.get(0).getMotor().setPotencia(761);
        modelos.get(0).getMotor().setTipoCobustivel(ETipoCombustivel.OUTRO);
        modelos.add(new Modelo(2, "X1", marcas.get(1), ECategoria.MEDIO));
        modelos.get(1).getMotor().setPotencia(204);
        modelos.get(1).getMotor().setTipoCobustivel(ETipoCombustivel.GASOLINA);
        modelos.add(new Modelo(3, "Huracan", marcas.get(2), ECategoria.PADRAO));
        modelos.get(2).getMotor().setPotencia(640);
        modelos.get(2).getMotor().setTipoCobustivel(ETipoCombustivel.GASOLINA);
        
        veiculos.add(new Veiculo(1,"AAA-111","Esportivo",modelos.get(0),cores.get(0)));
        veiculos.add(new Veiculo(2,"BBB-222","SUV",modelos.get(1),cores.get(1)));
        veiculos.add(new Veiculo(3,"CCC-333","Esportivo",modelos.get(2),cores.get(2)));
        
        clientes.add(new PessoaFisica("333.333.333-33", "2000-04-01", 3, "Carlos", "93333-3333", "carlos@gmail.com", LocalDate.now()));
        clientes.get(0).add(veiculos.get(0));
        clientes.add(new PessoaJuridica("22.222555/2255-55", "222.222.555.555", 5, "Bruna", "92222-5555", "bruna@gmail.com", LocalDate.now()));
        clientes.get(1).add(veiculos.get(1));
        clientes.get(1).add(veiculos.get(2));
        
        servicos.add(new Servico(1, "Completa", 10, ECategoria.PADRAO));
        servicos.add(new Servico(2, "Completa", 15, ECategoria.MEDIO));
        servicos.add(new Servico(3, "Pretinho", 20, ECategoria.PADRAO));
        servicos.add(new Servico(4, "Pretinho", 25, ECategoria.MEDIO));
        servicos.add(new Servico(5, "Trocar Oleo", 30, ECategoria.PADRAO));
        servicos.add(new Servico(6, "Trocar Oleo", 35, ECategoria.MEDIO));
    }

    public static List<Marca> getMarcas() {
        return marcas;
    }

    public static List<Cor> getCores() {
        return cores;
    }

    public static List<Modelo> getModelos() {
        return modelos;
    }

    public static List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static List<Servico> getServicos() {
        return servicos;
    }
    
}
