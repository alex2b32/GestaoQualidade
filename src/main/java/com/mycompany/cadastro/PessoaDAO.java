/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro;

import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.SQLException;
 
public class PessoaDAO { 
    public void cadastrarPessoa(Pessoa pessoa) throws SQLException { 
        try (Connection conn = DatabaseConnection.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa (nome) VALUES (?)")) { 
                stmt.setString(1, pessoa.getNome()); 
                stmt.executeUpdate(); 
        } 
    } 
} 
