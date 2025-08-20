/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.impl;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.dao.PedidoDao;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Pedido;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.PedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoDao pedidoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pedido> getPedidos() {
        return pedidoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pedido getPedido(Long id) {
        return pedidoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Pedido pedido) {
        pedidoDao.save(pedido);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        pedidoDao.deleteById(id);
    }
}