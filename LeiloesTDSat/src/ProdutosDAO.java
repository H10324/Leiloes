/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto) throws SQLException{
        
        
        
        String sql = "INSERT INTO produtos (nome, valor, status) VALUES (?, ?, ?)";
        
        conn = new conectaDAO().connectDB();
        try(PreparedStatement prep = conn.prepareStatement(sql)){
            prep.setString(1, produto.getNome());
            prep.setInt(2, produto.getValor());
            prep.setString(3, produto.getStatus());
            prep.executeUpdate();
        }    
       
        
        
        
    }
    
    public void venderProduto (int id) throws SQLException{
        
    }
    
    public ArrayList<ProdutosDTO> listarProdutos() throws SQLException{
       
       
        return listagem;
    }
    
    public ArrayList<ProdutosDTO> getProdutosVendidos() throws SQLException {
       return listagem;
    }
    
    
        
}

