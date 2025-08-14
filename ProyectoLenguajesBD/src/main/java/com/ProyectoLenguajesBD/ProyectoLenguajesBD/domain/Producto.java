

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "Productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_seq")
    @SequenceGenerator(name = "producto_seq", sequenceName = "PRODUCTOS_SEQ", allocationSize = 1)
    @Column(name = "ID_Producto")
    private Long idProducto;

    private String nombre;
    private String descripcion;
    private Double precio;

    @Column(name = "Categoria_ID")
    private Long categoriaId;

    @Column(name = "Fecha_Creacion")
    private Date fechaCreacion;

    private String estado;
    private Integer cantidad;
    private String ubicacion;

    @Column(name = "Stock_Minimo")
    private Integer stockMinimo;
}
