/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.dao;

import com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProveedorDao extends JpaRepository<Proveedor, Long> {
    List<Proveedor> findByEstadoOrderByNombreAsc(String estado);
}