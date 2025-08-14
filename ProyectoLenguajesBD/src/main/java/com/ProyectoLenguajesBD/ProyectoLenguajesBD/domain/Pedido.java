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
@Table(name = "Pedidos")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
    @SequenceGenerator(name = "pedido_seq", sequenceName = "PEDIDOS_SEQ", allocationSize = 1)
    @Column(name = "ID_Pedido")
    private Long idPedido;

    @Column(name = "Cliente_ID")
    private Long clienteId;

    @Column(name = "Fecha_Pedido")
    private Date fechaPedido;

    @Column(name = "Total")
    private Double total;

    private String estado;
}
