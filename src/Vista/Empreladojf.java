/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Empleado;
import Modelo.conexion;
import Modelo.operaciones2Emp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Empreladojf extends javax.swing.JFrame {

    Empleado pre = new Empleado();
    operaciones2Emp oper = new operaciones2Emp();

    /**
     * Creates new form Productojf
     */
    public Empreladojf() {
        initComponents();
        txt_Id.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        tcasc = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        txt_fechanac = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_usuarios = new javax.swing.JTable();
        bt_Guardar = new javax.swing.JButton();
        bt_Eliminar = new javax.swing.JButton();
        bt_Modificar = new javax.swing.JButton();
        bt_Listar = new javax.swing.JButton();
        bt_Buscar = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        txt_lugarnac1 = new javax.swing.JTextField();
        asca = new javax.swing.JTextField();
        txt_cargo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);

        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Fecha_nacimiento");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(340, 80, 100, 30);

        jTextField2.setBackground(new java.awt.Color(0, 153, 153));
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Empleado");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(340, 20, 110, 30);

        jTextField3.setBackground(new java.awt.Color(0, 153, 153));
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("ID_empleado");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(50, 60, 100, 40);

        jTextField4.setBackground(new java.awt.Color(0, 153, 153));
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Nombre");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(60, 110, 90, 30);

        tcasc.setBackground(new java.awt.Color(0, 153, 153));
        tcasc.setForeground(new java.awt.Color(0, 0, 0));
        tcasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tcasc.setText("Contrase??a");
        tcasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcascActionPerformed(evt);
            }
        });
        jPanel2.add(tcasc);
        tcasc.setBounds(50, 190, 100, 30);

        jTextField6.setBackground(new java.awt.Color(0, 153, 153));
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Apellido");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(60, 150, 90, 30);
        jPanel2.add(txt_fechanac);
        txt_fechanac.setBounds(460, 80, 100, 30);

        txt_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdActionPerformed(evt);
            }
        });
        jPanel2.add(txt_Id);
        txt_Id.setBounds(170, 70, 100, 30);
        jPanel2.add(txt_nombre);
        txt_nombre.setBounds(170, 110, 100, 30);
        jPanel2.add(txt_password);
        txt_password.setBounds(170, 190, 100, 30);

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_apellido);
        txt_apellido.setBounds(170, 150, 100, 30);

        tb_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tb_usuarios);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(30, 250, 730, 130);

        bt_Guardar.setText("GUARDAR");
        bt_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GuardarActionPerformed(evt);
            }
        });
        jPanel2.add(bt_Guardar);
        bt_Guardar.setBounds(590, 80, 100, 25);

        bt_Eliminar.setText("ELIMINAR");
        jPanel2.add(bt_Eliminar);
        bt_Eliminar.setBounds(60, 420, 130, 25);

        bt_Modificar.setText("MODIFICAR");
        jPanel2.add(bt_Modificar);
        bt_Modificar.setBounds(350, 420, 120, 25);

        bt_Listar.setText("LISTAR");
        jPanel2.add(bt_Listar);
        bt_Listar.setBounds(220, 420, 90, 25);

        bt_Buscar.setText("BUSCAR");
        jPanel2.add(bt_Buscar);
        bt_Buscar.setBounds(590, 130, 110, 25);

        jTextField7.setBackground(new java.awt.Color(0, 153, 153));
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Lugar_naci");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField7);
        jTextField7.setBounds(340, 130, 100, 30);
        jPanel2.add(txt_lugarnac1);
        txt_lugarnac1.setBounds(460, 130, 100, 30);

        asca.setBackground(new java.awt.Color(0, 153, 153));
        asca.setForeground(new java.awt.Color(0, 0, 0));
        asca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        asca.setText("Cargo");
        asca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascaActionPerformed(evt);
            }
        });
        jPanel2.add(asca);
        asca.setBounds(340, 180, 100, 30);
        jPanel2.add(txt_cargo);
        txt_cargo.setBounds(460, 180, 100, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void tcascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcascActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txt_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void bt_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GuardarActionPerformed
           
    }//GEN-LAST:event_bt_GuardarActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void ascaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ascaActionPerformed
    void mostrar() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID_Empleado");
        modelo.addColumn("NOMBRE ");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha_nacimiento");
        modelo.addColumn("Lugar_nacimiento");

        tb_usuarios.setModel(modelo);
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

                modelo.addRow(vec);
            }
            tb_usuarios.setModel(modelo);
        } catch (SQLException ex) {
            //Logger.getLogger(listar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField asca;
    public javax.swing.JButton bt_Buscar;
    public javax.swing.JButton bt_Eliminar;
    public javax.swing.JButton bt_Guardar;
    public javax.swing.JButton bt_Listar;
    public javax.swing.JButton bt_Modificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    public javax.swing.JTable tb_usuarios;
    private javax.swing.JTextField tcasc;
    public javax.swing.JTextField txt_Id;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JTextField txt_cargo;
    public javax.swing.JTextField txt_fechanac;
    public javax.swing.JTextField txt_lugarnac1;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_password;
    // End of variables declaration//GEN-END:variables
}
