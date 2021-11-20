package org.josue;

public class CuentaCorriente extends PatronDecorator {
    private final String tarjetaCredito;
    public CuentaCorriente(CuentaPrincipal cuentaPrincipal, String tarjetaCredito) {
        super(cuentaPrincipal);
        this.tarjetaCredito = tarjetaCredito;
    }

    public void Intereses() {
        double saldoActual = super.saldoInicial();
        super.getCuenta().ingresar(saldoActual * (0.5 / 100));
    }

    @Override
    public String toString() {
        return super.toString() + "\nTarjeta de Crédito: " + tarjetaCredito;
    }
}
