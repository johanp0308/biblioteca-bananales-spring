package com.practica.papas.bibliotecabananales.persistence.enitities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long id;

    private String nombreCliente;

    private String correoElectronico;

    private String telefonoString;

    private Date fechaNacimiento;
    
    @OneToMany(mappedBy = "cliente")
    private List<CompraEntity> compras;
    
}
