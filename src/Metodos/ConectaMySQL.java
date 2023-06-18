/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author p
 */
public class ConectaMySQL 
{
    
    public String db = "empleados"; //NOMBRE DE LA BASE DE DATOS
    public String url = "jdbc:mysql://127.0.0.1/"+db; //DIRECCION DE LA BD
    public String user = "root"; 
    public String pass = "athena55";
    
    public  Connection Conectar() throws SQLException
    {
        Connection link = null;
        try
        {
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url,this.user,this.pass);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return link;
    }
    
}
