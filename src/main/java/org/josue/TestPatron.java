package org.josue;

public class TestPatron {
    public static void main(String[] args)
    {
        Fecha f1 = new Fecha(17, 01, 2001);
        Cliente josue = new Cliente( "12345678J", "Josue", f1, "Olivero", "57263856" );
        Fecha f2 = new Fecha(10, 03, 2000);
        Cliente beatriz = new Cliente( "87654321B", "Bellatrix", f2, "Jorge Navarro", "957628800" );

        CuentaPrincipal c1 = new CuentaGeneral(10000,josue);
        CuentaPrincipal c2 = new CuentaGeneral(20000,beatriz);

        PatronDecorator cc = new CuentaCorriente(c1, "1234 5678 8765 4321");
        System.out.println ("\n\nCuenta corriente: " + cc.getCliente().getNombre());
        System.out.println ("Su saldo actual es: " + cc.saldoInicial());

        CuentaPlazo cp = new CuentaPlazo(c2, 3, 2);
        System.out.println ("\n\nCuenta a plazo: " + cp.getCuenta().getCliente().getNombre());
        System.out.println ("Su saldo actual es: " + cp.saldoInicial());
        cp.Intereses();

    }
}
