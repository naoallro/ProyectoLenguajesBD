/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Pedido;

/**
 *
 * @author naoal
 */
public interface PedidoService {
    void delete(Long id);
    Pedido getPedido(Long id);
    void save(Pedido pedido);
    java.util.List<Pedido> getPedidos();
}