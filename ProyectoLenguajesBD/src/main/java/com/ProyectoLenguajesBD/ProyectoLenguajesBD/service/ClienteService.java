/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> getClientes();
    List<Cliente> getClientesActivos();
    Cliente getCliente(Long id);
    void save(Cliente c);
    void delete(Long id);
}
