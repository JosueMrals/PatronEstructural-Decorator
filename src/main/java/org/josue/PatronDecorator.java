package org.josue;

public abstract class PatronDecorator implements CuentaPrincipal {
    private final CuentaPrincipal cuentaPrincipal;
    public PatronDecorator(CuentaPrincipal cuentaPrincipal) {
        this.cuentaPrincipal = cuentaPrincipal;
    }

    public CuentaPrincipal getCuenta() {
        return cuentaPrincipal;
    }
    public double saldoInicial() {
        return cuentaPrincipal.saldoInicial();
    }
    public void ingresar(double cantidad) {
        cuentaPrincipal.ingresar(cantidad);
    }
    public void retirar(double cantidad) {
        cuentaPrincipal.retirar(cantidad);
    }
    public Cliente getCliente() {
        return cuentaPrincipal.getCliente();
    }
    public Fecha getFechaApertura() {
        return cuentaPrincipal.getFechaApertura();
    }
    @Override
    public String toString() {
        return cuentaPrincipal.toString();
    }
    public abstract void Intereses();
}

