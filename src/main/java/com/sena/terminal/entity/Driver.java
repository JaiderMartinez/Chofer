package com.sena.terminal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "choferes")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column()
    private String apodo;
    @Column()
    private LocalDateTime horaEntrada;
    @Column()
    private LocalDateTime horaSalida;
    @Column()
    private Boolean estado;
    @Column()
    private String identificacionPermisoConduccion;
    @Column()
    private long idChofer;

    public Driver() {
    }

    public Driver(String apodo, LocalDateTime horaEntrada, LocalDateTime horaSalida, Boolean estado, String identificacionPermisoConduccion, long idChofer) {
        this.apodo = apodo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.estado = estado;
        this.identificacionPermisoConduccion = identificacionPermisoConduccion;
        this.idChofer = idChofer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getIdentificacionPermisoConduccion() {
        return identificacionPermisoConduccion;
    }

    public void setIdentificacionPermisoConduccion(String identificacionPermisoConduccion) {
        this.identificacionPermisoConduccion = identificacionPermisoConduccion;
    }

    public long getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(long idChofer) {
        this.idChofer = idChofer;
    }
}
