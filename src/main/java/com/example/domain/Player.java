package com.example.domain;
import org.springframework.cglib.core.Local;

import javax.persistence.*;

import java.time.LocalDate;
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private LocalDate fecha;
    private Integer numcanastas;
    private Integer numasistencias;
    private Integer numrebotes;
    private String posicion;
    @ManyToOne
    private Team owner;

    public Team getOwner() {
        return owner;
    }

    public void setOwner(Team owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Integer getNumcanastas() {
        return numcanastas;
    }

    public Integer getNumasistencias() {
        return numasistencias;
    }

    public Integer getNumrebotes() {
        return numrebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNumcanastas(Integer numcanastas) {
        this.numcanastas = numcanastas;
    }

    public void setNumasistencias(Integer numasistencias) {
        this.numasistencias = numasistencias;
    }

    public void setNumrebotes(Integer numrebotes) {
        this.numrebotes = numrebotes;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Player(String nombre, LocalDate fecha, Integer numcanastas, Integer numasistencias, Integer numrebotes, String posicion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.numcanastas = numcanastas;
        this.numasistencias = numasistencias;
        this.numrebotes = numrebotes;
        this.posicion = posicion;
    }

    public Player() {
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", numcanastas=" + numcanastas +
                ", numasistencias=" + numasistencias +
                ", numrebotes=" + numrebotes +
                ", posicion='" + posicion + '\'' +
                ", owner=" + owner +
                '}';
    }
}
