package com.practica.papas.bibliotecabananales.persistence.enitities;

import java.util.Set;

import org.hibernate.annotations.Collate;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class LibroEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tituloLibro;

    private String genero;

    private double precio;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name = "compras_libros",
        joinColumns = {@JoinColumn(name = "libro_id")},
        inverseJoinColumns = { @JoinColumn(name = "compra_id")}
    )
    private Set<CompraEntity> compras;

}
