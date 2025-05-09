package com.libcode.dbgym.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "asistencias")
public class AsistenciaClase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "miembro_id")
    private Miembro miembro;

    @ManyToOne
    @JoinColumn(name = "clase_id")
    private Clase clases;


    @Column
    private String nombre;

    @Column
    private String matutino;

    @Column
    private String tarde;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatutino() {
        return matutino;
    }

    public void setMatutino(String matutino) {
        this.matutino = matutino;
    }

    public String getTarde() {
        return tarde;
    }

    public void setTarde(String tarde) {
        this.tarde = tarde;
    }


    

}
