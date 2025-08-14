/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.impl;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.dao.FacturaDao;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Factura;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.FacturaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    private final FacturaDao facturaDao;

    public FacturaServiceImpl(FacturaDao facturaDao) { this.facturaDao = facturaDao; }

    @Override @Transactional(readOnly = true)
    public List<Factura> getFacturas() { return facturaDao.findAll(); }

    @Override @Transactional(readOnly = true)
    public Factura getFactura(Long id) { return facturaDao.findById(id).orElse(null); }

    @Override @Transactional(readOnly = true)
    public Factura getFacturaPorPedido(Long pedidoId) { return facturaDao.findByPedidoId(pedidoId); }

    @Override @Transactional
    public void save(Factura f) { facturaDao.save(f); }

    @Override @Transactional
    public void delete(Long id) { facturaDao.deleteById(id); }
}
