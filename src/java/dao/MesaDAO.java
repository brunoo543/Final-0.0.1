/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mesa;
import util.BancoDados;
import static util.BancoDados.conectar;

/**
 *
 * @author BRUNO
 */
public class MesaDAO {
    
    private Connection con;

    public boolean cadastrarMesa(Mesa mesa) {
        String sql = "insert into mesa "
                + "(numero) "
                + "values (?)";
        try {
            con = BancoDados.conectar();
            PreparedStatement p = con.prepareStatement(sql);
            p.setInt(1, mesa.getNumero());
            p.execute();
            con.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        
    }

    public List<Mesa> carregar() {       
        try {
            con = BancoDados.conectar();
            PreparedStatement ps = con.prepareStatement("select * from mesa");
            ResultSet resultSet = ps.executeQuery();
            List<Mesa> Array = new ArrayList<>();
            while (resultSet.next()) {
                Mesa mesa=  new Mesa();
                mesa.setId(resultSet.getInt("id"));
                mesa.setNumero(resultSet.getInt("numero"));
                Array.add(mesa);
            }
            con.close();
            return Array;
            
        } catch (SQLException ex) {
            Logger.getLogger(MesaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public boolean excluir(Mesa mesa) {
          String sql = "delete from mesa where id = ?";
        try {
            PreparedStatement p = conectar().prepareStatement(sql);
            p.setInt(1, mesa.getId());
            p.execute();
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    
}
