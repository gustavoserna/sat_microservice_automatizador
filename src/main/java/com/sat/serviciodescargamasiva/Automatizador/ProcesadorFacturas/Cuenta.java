package com.sat.serviciodescargamasiva.Automatizador.ProcesadorFacturas;

import lombok.Data;

@Data
public class Cuenta {
    private String codigoCuenta;
    private String descripcionOperacion;
    private double importe;
    private boolean debe;
    private boolean haber;

    public Cuenta() {

    }

    public Cuenta(boolean debe, boolean haber) {
        this.debe = debe;
        this.haber = haber;
    }

    public Cuenta(EmisorReceptor emisorReceptor) {
        if(emisorReceptor == EmisorReceptor.EMISOR) {
            this.debe = true;
            this.haber = false;
        } else {
            this.debe = false;
            this.haber = true;
        }
    }
}
