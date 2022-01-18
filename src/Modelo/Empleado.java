
package Modelo;

import java.sql.Date;


public class Empleado {


    private int id;
    private String nombre,apellido,Lugar_nac, fecha_nac,password,cargo;


    
    /*public Empleado(int id, String nombre, String apellido, String Lugar_nac, String fecha_nac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Lugar_nac = Lugar_nac;
        this.fecha_nac = fecha_nac;
    }
*/

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLugar_nac() {
        return Lugar_nac;
    }

    public void setLugar_nac(String Lugar_nac) {
        this.Lugar_nac = Lugar_nac;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }



  
  

   
    
}
