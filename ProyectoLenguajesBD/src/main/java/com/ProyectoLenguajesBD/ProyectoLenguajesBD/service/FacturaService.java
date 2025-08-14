/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Factura;
import java.util.List;

public interface FacturaService {
    List<Factura> getFacturas();
    Factura getFactura(Long id);
    Factura getFacturaPorPedido(Long pedidoId);
    void save(Factura f);   // lanza excepción si viola UNIQUE
    void delete(Long id);
}
