

package com.ProyectoLenguajesBD.ProyectoLenguajesBD.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

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

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "FECHA_CREACION")
    private LocalDate fechaCreacion;

    private String estado;
    private Integer cantidad;
    private String ubicacion;

    @Column(name = "Stock_Minimo")
    private Integer stockMinimo;
}
