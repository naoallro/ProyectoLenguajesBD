/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.impl;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.dao.EnvioDao;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Envio;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.EnvioService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EnvioServiceImpl implements EnvioService {

    private final EnvioDao envioDao;

    public EnvioServiceImpl(EnvioDao envioDao) {
        this.envioDao = envioDao;
    }

    @Override @Transactional(readOnly = true)
    public List<Envio> getEnvios() { return envioDao.findAll(); }

    @Override @Transactional(readOnly = true)
    public List<Envio> getEnviosPorPedido(Long pedidoId) {
        return envioDao.findByPedidoIdOrderByIdEnviosAsc(pedidoId);
    }

    @Override @Transactional(readOnly = true)
    public Envio getEnvio(Long id) { return envioDao.findById(id).orElse(null); }

    @Override @Transactional
    public void save(Envio e) { envioDao.save(e); }

    @Override @Transactional
    public void delete(Long id) { envioDao.deleteById(id); }
}
