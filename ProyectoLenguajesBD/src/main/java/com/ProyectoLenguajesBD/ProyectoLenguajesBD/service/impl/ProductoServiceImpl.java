/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.impl;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.dao.ProductoDao;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Producto;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos() {
        return productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Long id) {
        return (id == null) ? null : productoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto p) {
        if (p.getIdProducto() != null && p.getIdProducto() == 0L) {
            p.setIdProducto(null);
        }
        productoDao.save(p);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (id != null) {
            productoDao.deleteById(id);
        }
    }
}