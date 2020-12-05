/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
public class dbConnection {
    Connection conn;
public static Connection ConnecrDb(){
try {
Class.forName("org.sqlite.JDBC");
Connection conn=DriverManager.getConnection("jdbc:sqlite:insuaranceDB.db");
//JOptionPane.showMessageDialog(null,"Connection Success");
return conn;


}catch (Exception err){
JOptionPane.showMessageDialog(null,err);
return null;
}
}
}
