package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String identificacion;
    private String telefono;
    private int numeroBicicleta;
    private String direccion;
    private LocalDate fechaNacimiento;

    public Cliente(String nombre, String identificacion, String telefono, int numeroBicicleta, String direccion, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.numeroBicicleta = numeroBicicleta;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumeroBicicleta() {
        return numeroBicicleta;
    }

    public void setNumeroBicicleta(int numeroBicicleta) {
        this.numeroBicicleta = numeroBicicleta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numeroBicicleta=" + numeroBicicleta +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
