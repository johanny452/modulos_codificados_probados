/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sena.registro.clientes.logica;

import com.edu.sena.registro.clientes.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author EQUIPO
 */
public class Controladora {
    
    ControladoraPersistencia controladorapersistencia = new ControladoraPersistencia();

    public void registrarClientes(Clientes e){
    
        controladorapersistencia.registrarClientes(e);
    }
    
    
    public List<Clientes>listarClientes(){
    
    
        return controladorapersistencia.listarClientes();
        
    
    }

   
}
