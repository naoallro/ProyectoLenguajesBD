/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "Proveedores")
public class Proveedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proveedor_seq")
    @SequenceGenerator(name = "proveedor_seq", sequenceName = "PROVEEDORES_SEQ", allocationSize = 1)
    @Column(name = "ID_Proveedor")
    private Long idProveedor;

    private String nombre;
    private String contacto;
    private String telefono;
    private String correo;

    @Column(name = "Fecha_Registro")
    private Date fechaRegistro;

    private String direccion;
}