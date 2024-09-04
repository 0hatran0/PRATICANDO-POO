/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List; 
/**
 *
 * @author PC
 */
public abstract class Cliente implements ICliente { // Classe Generica Abstrata
    //Atributos = variaveis de instaciamento
    protected int id;
    protected String nome;
    protected String celular;
    protected String emial;
    protected LocalDate dataCadastro; 
    
    protected Pontuacao pontuacao = new Pontuacao(); // composição 
    
    private List<Veiculo> veiculos = new ArrayList<>();
    
    // Metodos Especiais
    // --> Construtor --> método que é executado automaticamente quando uma classe é instanciada (objeto é criado).
    public Cliente() { 
    }

    public Cliente(int id, String nome, String celular, String emial, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.emial = emial;
        this.dataCadastro = dataCadastro;
    }
    
    // --> Getters --> obter de forma indireta os valores armazenados dentro do objeto.  
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCelular() {
        return celular;
    }
    
    public String getEmial() {
        return emial;
    }
    
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    
    public Pontuacao getPontuacao() {
        return pontuacao;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
    // --> Setters --> permite configurar indiretamente valores dentro de um objeto (atributos). 
    public void setId(int id) {
        this.id = id;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }
    
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    // --> Metodos  
    public void add(Veiculo veiculo) {
        this.veiculos.add(veiculo); // Está adicionando o veiculo a lista de veiculos pertencente a classe cliente
        veiculo.setCliente(this); // Chama a classe veiculo e adiciona o cliente a quem pertence o veiculo  
    }
    
    public void remove(Veiculo veiculo) {
        this.veiculos.remove(veiculo);
        veiculo.setCliente(null);
    }

    @Override
    public String getDados() {
        return  "Cliente{" + " nome=" + nome + ", celular=" + celular + ", emial=" + emial + ", dataCadastro="+ dataCadastro+
                " pontuacao=" + pontuacao.saldo();
    }

    @Override
    public String getDados(String Observacao) {
        return  "Cliente{" + " nome=" + nome + ", celular=" + celular + ", emial=" + emial + ", dataCadastro="+ dataCadastro+
                " pontuacao=" + pontuacao.saldo() + " Observacao:"+ Observacao;
    }
   
}
