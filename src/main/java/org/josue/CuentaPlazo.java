package org.josue;

public class CuentaPlazo extends PatronDecorator {

    private final double interes;

    private final int plazo;

    public CuentaPlazo(CuentaPrincipal cuentaPrincipal, double interes, int plazo) {
        super(cuentaPrincipal);
        this.interes = interes;
        this.plazo = plazo;
    }
    public void Intereses() {
        double saldoActual = super.saldoInicial();
        System.out.print("Después del plazo su saldo será de: " +
                (saldoActual + (saldoActual*(interes / 100) * plazo)));
    }

    @Override
    public double saldoInicial() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterés: " + interes + " - Plazo: " + plazo;
    }

}
