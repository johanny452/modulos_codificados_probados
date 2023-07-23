/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.sena.registro.clientes.persistencia;

import com.edu.sena.registro.clientes.logica.Clientes;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EQUIPO
 */
public class ControladoraPersistencia {
    
     ClientesJpaController clientesJpaController = new ClientesJpaController();
    
    
    
    
    public void registrarClientes(Clientes e){
        
        try {
            clientesJpaController.create(e);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public List<Clientes> listarClientes(){
    
    
        return clientesJpaController.findClientesEntities();
    
    }
    
}
