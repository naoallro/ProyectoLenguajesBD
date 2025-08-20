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
@Table(name = "ENVIOS")
public class Envio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "envio_seq")
    @SequenceGenerator(name = "envio_seq", sequenceName = "ENVIOS_SEQ", allocationSize = 1)
    @Column(name = "ID_ENVIOS")          // <- en BD es plural
    private Long idEnvio;

    @Column(name = "PEDIDO_ID")
    private Long pedidoId;

    @Column(name = "TRACKING_NUMBER")
    private String trackingNumber;

    @Column(name = "ESTADO")
    private String estado;               // en BD: ESTADO (no ESTADO_ENVIO)

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ENVIO")
    private Date fechaEnvio;

    @Column(name = "TRANSPORTISTA_ID")
    private Long transportistaId;
}