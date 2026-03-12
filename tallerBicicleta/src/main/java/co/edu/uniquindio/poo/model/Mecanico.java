package co.edu.uniquindio.poo.model;

public class Mecanico {
    private String nombre;
    private String telefono;
    private String salario;

    public Mecanico(String nombre, String telefono, String salario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }
}
