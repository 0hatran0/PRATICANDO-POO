package br.edu.ifsc.fln.model.dao;

import br.edu.ifsc.fln.model.domain.ETipoCombustivel;
import br.edu.ifsc.fln.model.domain.Motor;
import br.edu.ifsc.fln.model.domain.Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MotorDAO{

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean atualizar(Motor motor) {
//        String sql = "UPDATE motor SET quantidade=?, qtd_minima=?, qtd_maxima=?, situacao=? WHERE id_modelo=?";
        String sql = "UPDATE motor SET potencia=?, tipo_combustivel=? WHERE id_modelo = ?;";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, motor.getPotencia());
            stmt.setString(2, motor.getTipoCombustivel().name());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Modelo> listar() {
        String sql = "SELECT * FROM motor mot INNER JOIN modelo mod ON mod.id = mot.id_modelo";
        List<Modelo> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Modelo modelo = populateVO(resultado);
                retorno.add(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
    public List<Modelo> listarPorMotor(Motor motor) {
        String sql = "SELECT * FROM motor mot INNER JOIN modelo mod ON mod.id = mot.id_modelo WHERE mot.id_modelo = ?";
        List<Modelo> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, motor.getModelo().getId());
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Modelo modelo = populateVO(resultado);
                retorno.add(modelo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
    public Modelo getMotor(Modelo modelo) {
        String sql = "SELECT * FROM motor mot INNER JOIN modelo mod ON mod.id = mot.id_modelo WHERE mot.id_modelo = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, modelo.getId());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                return populateVO(resultado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MotorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private Modelo populateVO(ResultSet rs) throws SQLException {
        Modelo modelo = new Modelo();
        //Categoria categoria = new Categoria();
        //modelo.setCategoria(categoria);
        modelo.setId(rs.getInt("id"));
        modelo.setDescricao(rs.getString("descricao"));
        modelo.getMarca.setNome(rs.getString("descricao"));
        modelo.setPreco(rs.getBigDecimal("preco"));
        modelo.getMotor().setQuantidade(rs.getInt("quantidade"));
        modelo.getMotor().setQtdMaxima(rs.getInt("qtd_maxima"));
        modelo.getMotor().setQtdMinima(rs.getInt("qtd_minima"));
        modelo.getMotor().setSituacao(Enum.valueOf(ETipoCombustivel.class, rs.getString("situacao")));
        return modelo;
    }   
    

}
