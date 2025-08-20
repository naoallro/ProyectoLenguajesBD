/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




package com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.impl;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.dao.ClienteDao;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Cliente;
import com.ProyectoLenguajesBD.ProyectoLenguajesBD.service.ClienteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteDao dao;

    public ClienteServiceImpl(ClienteDao dao){
        this.dao = dao;
    }

    @Override @Transactional(readOnly = true)
    public List<Cliente> getClientes(){
        return dao.findAll();
    }

    @Override @Transactional(readOnly = true)
    public List<Cliente> getClientesActivos(){
        return dao.findByEstado("A");
    }

    @Override @Transactional(readOnly = true)
    public Cliente getCliente(Long id){
        return dao.findById(id).orElse(null);
    }

    @Override @Transactional
    public void save(Cliente c){
        dao.save(c);
    }

    @Override @Transactional
    public void delete(Long id){
        dao.deleteById(id);
    }
}