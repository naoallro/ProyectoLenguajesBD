/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.impl;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.dao.ProveedorDao;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Proveedor;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.ProveedorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProveedoresServiceImpl implements ProveedorService {

    private final ProveedorDao dao;
    public ProveedoresServiceImpl(ProveedorDao dao){ this.dao = dao; }

    @Override @Transactional(readOnly = true)
    public List<Proveedor> getProveedores(){ return dao.findAll(); }

    @Override @Transactional(readOnly = true)
    public List<Proveedor> getProveedoresActivos(){ return dao.findByEstadoOrderByNombreAsc("A"); }

    @Override @Transactional(readOnly = true)
    public Proveedor getProveedor(Long id){ return dao.findById(id).orElse(null); }

    @Override @Transactional
    public void save(Proveedor p){ dao.save(p); }

    @Override @Transactional
    public void delete(Long id){ dao.deleteById(id); }
}

