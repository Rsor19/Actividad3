package co.edu.uniquindio.poo.model;

public class Tarea {
    private String nombre;
    private int costo;
    private String codigo;

    public Tarea(String nombre, int costo, String codigo) {
        this.nombre = nombre;
        this.costo = costo;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\n' +
                ", costo=" + costo + '\n' +
                ", codigo=" + codigo + '\n' +
                '}';
    }
}
