package Controlador;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.EstudanteM;

public class EstudanteC {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public EstudanteC() throws SQLException{
        con=getConexao();
    }

    public void salvar(EstudanteM e) {
        String sql = "INSERT INTO estudante (nome, curso, disciplina, ano) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, e.getNome());
            ps.setString(2, e.getCurso());
            ps.setString(3, e.getDisciplina());
            ps.setInt(4, e.getAno());
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Estudante salvo");
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Estudante nao salvo " + x);
        }
    }
    public Connection getConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/estudante", "root", "12345");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }
}
