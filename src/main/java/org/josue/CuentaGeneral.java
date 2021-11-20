package org.josue;

public class CuentaGeneral implements CuentaPrincipal{
    private final double saldoInicial;
    private final Cliente cliente;
    private final Fecha fechaApertura;

    public CuentaGeneral(double saldoIni, Cliente cliente) {
        this.saldoInicial = saldoIni;
        this.cliente = cliente;
        this.fechaApertura = new Fecha();
    }

    @Override
    public double saldoInicial() {
        return saldoInicial;
    }

    @Override
    public void ingresar(double cantidad) {

    }

    @Override
    public void retirar(double cantidad) {

    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public Fecha getFechaApertura() {
        return fechaApertura;
    }

    @Override
    public void Intereses() {

    }

}
