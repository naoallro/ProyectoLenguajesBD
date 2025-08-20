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
@Table(name = "CLIENTES")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @SequenceGenerator(name = "cliente_seq", sequenceName = "CLIENTES_SEQ", allocationSize = 1)
    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "NOMBRE")
    private String nombre;

    // En la BD es APELLIDO1
    @Column(name = "APELLIDO1")
    private String apellido;

    // En la BD es EMAIL
    @Column(name = "EMAIL")
    private String correo;

    @Column(name = "TELEFONO")
    private String telefono;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_REGISTRO")
    private Date fechaRegistro;

    @Column(name = "DIRECCION")
    private String direccion;

    // ⬅ Campo faltante que usa tu repo/servicio
    @Column(name = "ESTADO", length = 1)
    private String estado;
}