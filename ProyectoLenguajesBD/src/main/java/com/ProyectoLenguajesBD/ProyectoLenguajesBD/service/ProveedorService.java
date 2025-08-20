/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Proveedor;
import java.util.List;

public interface ProveedorService {
    List<Proveedor> getProveedores();
    List<Proveedor> getProveedoresActivos();
    Proveedor getProveedor(Long id);
    void save(Proveedor p);
    void delete(Long id);
}

