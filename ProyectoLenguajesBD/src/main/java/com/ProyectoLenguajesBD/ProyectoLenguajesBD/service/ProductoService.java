/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> getProductos();
    Producto getProducto(Long id);
    void save(Producto producto);
    void delete(Long id);
}
