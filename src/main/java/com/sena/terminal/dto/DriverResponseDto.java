package com.sena.terminal.dto;

import java.time.LocalDateTime;

public class DriverResponseDto {

    private long id;
    private String apodo;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private Boolean estado;
    private String identificacionPermisoConduccion;
    private long idChofer;

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
