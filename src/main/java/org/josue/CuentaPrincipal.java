package org.josue;

public interface CuentaPrincipal {

    double saldoInicial();

    void ingresar(double cantidad);

    void retirar(double cantidad);

    Cliente getCliente();

    Fecha getFechaApertura();

    @Override
    String toString();

    void Intereses();
}
