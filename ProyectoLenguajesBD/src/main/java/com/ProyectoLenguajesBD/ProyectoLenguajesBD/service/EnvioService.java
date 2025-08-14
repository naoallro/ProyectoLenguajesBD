/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Envio;
import java.util.List;

public interface EnvioService {
    List<Envio> getEnvios();
    List<Envio> getEnviosPorPedido(Long pedidoId);
    Envio getEnvio(Long id);
    void save(Envio e);
    void delete(Long id);
}


