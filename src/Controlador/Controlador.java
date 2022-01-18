/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleado;
import Modelo.conexion;
import Modelo.operaciones2Emp;
import Vista.Empreladojf;
import Vista.Vista_emplog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener {
    
    private Empleado mod;
    private operaciones2Emp modc;
    private Empreladojf frm;
    private Vista_emplog log;
    
    public Controlador(Empleado mod, operaciones2Emp modc, Empreladojf frm, Vista_emplog log) {
        this.mod = mod;
        this.modc = modc;
        this.frm = frm;
        this.log = log;
        this.log.login_btlog.addActionListener(this);
        this.log.login_btregister.addActionListener(this);
        this.frm.bt_Guardar.addActionListener(this);
        this.frm.bt_Eliminar.addActionListener(this);
        this.frm.bt_Modificar.addActionListener(this);
        this.frm.bt_Listar.addActionListener(this);
        this.frm.bt_Buscar.addActionListener(this);
        
    }

   

    void limpiar() {
        
        frm.txt_Id.setText(null);
        frm.txt_nombre.setText(null);
        frm.txt_apellido.setText(null);
        frm.txt_fechanac.setText(null);
        frm.txt_password.setText(null);
        
    }
    
    void mostrar() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID_Empleado");
        modelo.addColumn("NOMBRE ");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha_nacimiento");
        modelo.addColumn("Lugar_nacimiento");
        modelo.addColumn("CARGO");
        
        frm.tb_usuarios.setModel(modelo);
        conexion cn = new conexion();
        Connection con = cn.conexion();
        String[] vec = new String[7];
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM trabajador");
            while (rs.next()) {
                vec[0] = rs.getString(1);
                vec[1] = rs.getString(2);
                vec[2] = rs.getString(3);
                vec[3] = rs.getString(4);
                vec[4] = rs.getString(5);
                vec[5] = rs.getString(7);
                
                modelo.addRow(vec);
            }
            frm.tb_usuarios.setModel(modelo);
        } catch (SQLException ex) {
            //Logger.getLogger(listar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == log.login_btregister) {
            frm.setVisible(true);
            frm.setLocationRelativeTo(null);
            log.dispose();;
            frm.bt_Eliminar.setEnabled(false);
            frm.bt_Modificar.setEnabled(false);
            frm.bt_Listar.setEnabled(false);
          
            
        }
        if (ae.getSource() == log.login_btlog) {
            
            String user = log.log_user1.getText();
            String pass = log.log_pass1.getText();
            
            int res = 0;
            
            String SQL = "select * from trabajador where Nombre='" + user + "' and Password='" + pass + "'";
            
            try {                
                conexion cn = new conexion();
                Connection cc = cn.conexion();
                Statement st = cc.createStatement();
                ResultSet rs = st.executeQuery(SQL);
                if (rs.next()) {
                    String r;
                    r = rs.getString(7);
                    JOptionPane.showMessageDialog(null, r);
                    
                    res = 1;
                    if ((res == 1) && "ADMINISTRATIVO".equals(r)) {
                        JOptionPane.showMessageDialog(null, "FELICIDADES " + user + " POR SU INGRESO ");
                        frm.setVisible(true);
                        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    }
                    if (res == 1 && "USUARIO".equals(r)) {
                        frm.setVisible(true);
                        frm.bt_Eliminar.setEnabled(false);
                        frm.bt_Guardar.setEnabled(false);
                        frm.bt_Modificar.setEnabled(false);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTAS");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR " + e);
            }
            
        }
        
        if (ae.getSource() == frm.bt_Guardar) {
            mod.setNombre(frm.txt_nombre.getText());
            mod.setFecha_nac(frm.txt_fechanac.getText());
            mod.setApellido(frm.txt_apellido.getText());
            mod.setLugar_nac(frm.txt_lugarnac1.getText());
            mod.setPassword(frm.txt_password.getText());
            mod.setCargo(frm.txt_cargo.getText());
            modc.guardar(mod);
            JOptionPane.showMessageDialog(null, "Entro");
        }
        
        if (ae.getSource() == frm.bt_Modificar) {
            mod.setId(Integer.parseInt(frm.txt_Id.getText()));
            mod.setNombre(frm.txt_nombre.getText());
            mod.setFecha_nac((frm.txt_fechanac.getText()));
            mod.setApellido(frm.txt_apellido.getText());
            mod.setLugar_nac(frm.txt_lugarnac1.getText());
            mod.setCargo(frm.txt_cargo.getText());
            modc.modificar(mod);
        }
        
        if (ae.getSource() == frm.bt_Eliminar) {
            mod.setId(Integer.parseInt(frm.txt_Id.getText()));
            
            modc.eliminar(mod);
        }
        
        if (ae.getSource() == frm.bt_Buscar) {
            limpiar();
            mostrar();
        }
        
        if (ae.getSource() == frm.bt_Listar) {
            int fila = frm.tb_usuarios.getSelectedRow();
            if (fila >= 0) {
                //txt_id2.setText(tb_usuarios.getValueAt(fila, 0).toString());
                frm.txt_Id.setText(frm.tb_usuarios.getValueAt(fila, 0).toString());
                frm.txt_nombre.setText(frm.tb_usuarios.getValueAt(fila, 1).toString());
                frm.txt_password.setText(frm.tb_usuarios.getValueAt(fila, 4).toString());
                frm.txt_apellido.setText(frm.tb_usuarios.getValueAt(fila, 2).toString());
                frm.txt_fechanac.setText(frm.tb_usuarios.getValueAt(fila, 3).toString());
                frm.txt_lugarnac1.setText(frm.tb_usuarios.getValueAt(fila, 5).toString());
                frm.txt_cargo.setText(frm.tb_usuarios.getValueAt(fila, 6).toString());
                
            } else {
                JOptionPane.showMessageDialog(null, "no selecciono una fila");
                
            }
        }
    }
    
}
