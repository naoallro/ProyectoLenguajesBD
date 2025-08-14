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
@Table(name = "Envios")
public class Envio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "envio_seq")
    @SequenceGenerator(name = "envio_seq", sequenceName = "ENVIOS_SEQ", allocationSize = 1)
    @Column(name = "ID_Envio")
    private Long idEnvio;

    @Column(name = "Direccion_Entrega")
    private String direccionEntrega;

    @Column(name = "Fecha_Envio")
    private Date fechaEnvio;

    @Column(name = "Estado_Envio")
    private String estadoEnvio;

    @Column(name = "Pedido_ID")
    private Long pedidoId;
}
