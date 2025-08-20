/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PROVEEDORES")
public class Proveedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "proveedor_seq")
    @SequenceGenerator(name = "proveedor_seq", sequenceName = "PROVEEDORES_SEQ", allocationSize = 1)
    @Column(name = "ID_PROVEEDOR")
    private Long idProveedor;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "ESTADO", length = 1)
    private String estado; // "A"/"I"
}