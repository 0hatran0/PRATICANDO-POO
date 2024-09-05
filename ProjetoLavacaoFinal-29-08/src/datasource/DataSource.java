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
        
        clientes.add(new PessoaFisica("333.333.333-33", LocalDate.now(), 1, "Carlos", "93333-3333", "carlos@gmail.com", LocalDate.now()));
        clientes.get(0).add(veiculos.get(0));
        clientes.add(new PessoaJuridica("22.222555/2255-55", "222.222.555.555", 2, "Bruna", "92222-5555", "bruna@gmail.com", LocalDate.now()));
        clientes.get(1).add(veiculos.get(1));
        clientes.get(1).add(veiculos.get(2));
        
        servicos.add(new Servico(1, "Completa", 10, ECategoria.PADRAO));
        servicos.add(new Servico(2, "Completa", 15, ECategoria.MEDIO));
        servicos.add(new Servico(3, "Pretinho", 20, ECategoria.PADRAO));
        servicos.add(new Servico(4, "Pretinho", 25, ECategoria.MEDIO));
        servicos.add(new Servico(5, "Trocar Oleo", 30, ECategoria.PADRAO));
        servicos.add(new Servico(6, "Trocar Oleo", 35, ECategoria.MEDIO));
        
    }

    // Utiliza de um variavel para percorrer a lista e utilizada dessa mesma 
    // variavel para verificar a condição.
    public static Marca getMarca(int id) {
        for (Marca mc : marcas) { //foreach
            if (mc.getId() == id) {
                return mc;
            }
        }
        return null;
    }
    
    public static Cor getCor(int id) {
        for (Cor c : cores) { 
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
    
    public static Modelo getModelo(int id) {
        for (Modelo md : modelos) { 
            if (md.getId() == id) {
                return md;
            }
        }
        return null;
    }
    
//    public Modelo getModelo(int id){
//        for(int i = 0; i < this.modelos.size(); i++){
//            if(id == modelos.get(i).getId()){
//                return modelos.get(i);
//            }
//        }
//        return null;
//    }
    
    public static Veiculo getVeiclo(int id) {
        for (Veiculo vc : veiculos) { 
            if (vc.getId() == id) {
                return vc;
            }
        }
        return null;
    }
    
    public static Cliente getCliente(int id) {
        for (Cliente cl : clientes) { 
            if (cl.getId() == id) {
                return cl;
            }
        }
        return null;
    }
    
    public static Servico getServico(int id) {
        for (Servico sv : servicos) { 
            if (sv.getId() == id) {
                return sv;
            }
        }
        return null;
    }
    
}
