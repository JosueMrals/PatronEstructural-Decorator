package org.josue;

public class Cliente {
    private String dni;
    private String nombre;
    private Fecha fecha;
    private String direccion;
    private String telefono;

    public Cliente(String dni, String nombre, Fecha fecha, String direccion,
                   String telefono) {
        dni = dni;
        nombre = nombre;
        fecha = fecha;
        direccion = direccion;
        telefono = telefono;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return this.fecha;
    }

    public void setFechaNac(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
