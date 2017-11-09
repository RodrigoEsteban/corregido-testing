/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cinthia
 */
public class conectar1 {
    //instanciacion de variable
    Connection conectar=null;
    //Genera la conexión a la base de datos.
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/bd_biblioteca","root","A-hamode2006");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
}
