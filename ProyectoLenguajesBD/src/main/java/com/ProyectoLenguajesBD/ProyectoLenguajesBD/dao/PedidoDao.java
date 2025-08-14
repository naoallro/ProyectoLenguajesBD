/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.dao;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoDao extends JpaRepository<Pedido, Long> {
    
}