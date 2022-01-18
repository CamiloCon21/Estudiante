/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.Controlador;
import Modelo.Empleado;
import Modelo.operaciones2Emp;
import Vista.Empreladojf;
import Vista.Vista_emplog;

/**
 *
 * @author Usuario
 */
public class Crud_final {
    public static void main(String[] args) {
        Empleado mod = new Empleado();
        operaciones2Emp modc = new operaciones2Emp();
        Empreladojf frm = new Empreladojf();
        Vista_emplog log = new Vista_emplog();
        
        Controlador ctrl= new Controlador(mod, modc, frm,log);
        
        
        log.setVisible(true);
        log.setLocationRelativeTo(null);
          
        
        
        
    }
}
