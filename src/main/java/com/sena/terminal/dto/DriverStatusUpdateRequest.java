package com.sena.terminal.dto;

public class DriverStatusUpdateRequest {

    private long id;
    private boolean estado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setestado(boolean estado) {
        this.estado = estado;
    }
}
