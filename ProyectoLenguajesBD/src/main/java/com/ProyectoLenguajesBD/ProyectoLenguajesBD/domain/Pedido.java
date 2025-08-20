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
@Table(name = "PEDIDOS")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
    @SequenceGenerator(name = "pedido_seq", sequenceName = "PEDIDOS_SEQ", allocationSize = 1)
    @Column(name = "ID_PEDIDO")
    private Long idPedido;

    @Column(name = "NUMERO")
    private Long numero;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA")
    private Date fecha;

    @Column(name = "ESTADO", length = 1)
    private String estado;

    @Column(name = "TOTAL_PEDIDO")
    private Double totalPedido;

    @Column(name = "CLIENTE_ID")
    private Long clienteId;
}