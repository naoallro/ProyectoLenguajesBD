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
@Table(name = "Facturas")
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "factura_seq")
    @SequenceGenerator(name = "factura_seq", sequenceName = "FACTURAS_SEQ", allocationSize = 1)
    @Column(name = "ID_Factura")
    private Long idFactura;

    @Column(name = "Pedido_ID")
    private Long pedidoId;

    @Column(name = "Fecha_Factura")
    private Date fechaFactura;

    @Column(name = "Monto_Total")
    private Double montoTotal;

    private String estado;
}