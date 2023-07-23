/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sena.registro.clientes.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

    
    @Entity
public class Clientes implements Serializable {
    
   @Id
   private int cedula;
   private String nombres;
   private String apellidos;
   private String direccion;
   private String correo;
   private int telefono;

    public Clientes() {
    }
   
    public Clientes(int cedula, String nombres, String apellidos, String direccion,String correo, int telefono){
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ",  direccion=" + direccion + ", correo=" + correo + ",telefono=" + telefono + "}";
    }
   
   
    
}
    

