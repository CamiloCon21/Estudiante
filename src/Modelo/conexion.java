
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexion {
    
  Connection conect = null;
	public Connection conexion()
		{
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				conect = DriverManager.getConnection("jdbc:mysql://localhost/empleados2","root","");
				   //JOptionPane.showMessageDialog(null,"Conectado");                  
				
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("error de conexion");
				JOptionPane.showMessageDialog(null,"Error de conexion"+e);
			}
			return conect;
		}
}

