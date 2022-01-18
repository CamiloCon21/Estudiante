package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class operaciones2Emp implements Operaciones2 {

    Empleado pre = new Empleado();

    @Override
    public boolean guardar(Object obj) {
        pre = (Empleado) obj;
         
        String sql = "INSERT INTO trabajador (Nombre, Apellido, Fecha_nacimiento, lugar_nacimiento, Password, CARGO) VALUES (?,?,?,?,?,?)";
        conexion cn = new conexion();
        Connection cc = cn.conexion();
        try {
            PreparedStatement z = cc.prepareStatement(sql);
            z.setString(1, pre.getNombre());
            z.setString(2, pre.getApellido());
            z.setString(3, pre.getFecha_nac());
            z.setString(4, pre.getLugar_nac());
            z.setString(5, pre.getPassword());
            z.setString(6, pre.getCargo());

            int p = z.executeUpdate();
            if (p > 0) {
                JOptionPane.showMessageDialog(null, "registro guardado");
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
            //Logger.getLogger(listar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public boolean modificar(Object obj) {
        pre = (Empleado) obj;
        conexion cn = new conexion();
        Connection cc = cn.conexion();
      String sql = "UPDATE trabajador SET Nombre = ? , apellido = ? , Fecha_nacimiento = ?, Lugar_nacimiento = ?, CARGO = ? WHERE ID_empleado = ?";
        try {
            PreparedStatement z = cc.prepareStatement(sql);
            z.setString(1, pre.getNombre());
            z.setString(2, pre.getApellido());
            z.setString(3, pre.getFecha_nac());
            z.setString(4, pre.getLugar_nac());
            z.setString(5, pre.getCargo());
            z.setInt(6, pre.getId());

            int p = z.executeUpdate();
            if (p > 0) {
                JOptionPane.showMessageDialog(null, "registro Modificado");
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
            //Logger.getLogger(listar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        pre = (Empleado) obj;
        conexion cn = new conexion();
        Connection cc = cn.conexion();
        String sql = "DELETE FROM trabajador WHERE id_empleado = ?";
        try {
            PreparedStatement z = cc.prepareStatement(sql);

            z.setInt(1, pre.getId());

            int p = z.executeUpdate();
            if (p > 0) {
                JOptionPane.showMessageDialog(null, "registro Eliminado");
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
            //Logger.getLogger(listar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
                    

}
