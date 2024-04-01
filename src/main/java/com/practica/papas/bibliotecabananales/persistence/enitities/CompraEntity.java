package com.practica.papas.bibliotecabananales.persistence.enitities;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "compra")
public class CompraEntity {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private Date fechaCompra;
    
    private Double totalPago;

    @ManyToOne
    @JoinColumn(name="cliente_id")
    private ClienteEntity cliente;

    @ManyToMany(mappedBy = "compras")
    private Set<LibroEntity> libros;
}
