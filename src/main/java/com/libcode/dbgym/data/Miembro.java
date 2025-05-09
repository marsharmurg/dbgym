package com.libcode.dbgym.data;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;  // Cambié a la clase correcta

@Entity
@Table(name = "miembros")
public class Miembro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String genero;

    @Column
    private String fechaNacimiento;

    @Column
    private String telefono;

    @Column
    private String correoElectronico;

    @Column
    private String direccion;

    @Column
    private String nidentificacion;

    // Cambié la declaración de List a java.util.List
    @OneToMany(mappedBy = "miembro")
    private List<Membresia> membresias;

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNidentificacion() {
        return nidentificacion;
    }

    public void setNidentificacion(String nidentificacion) {
        this.nidentificacion = nidentificacion;
    }

    public List<Membresia> getMembresia() {
        return membresias;
    }

    public void setMembresia(List<Membresia> membresias) {
        this.membresias = membresias;
    }
}

