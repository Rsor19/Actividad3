package co.edu.uniquindio.poo.model;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrdenServicio {
    private String codigo;
    private String descripcion;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private int costo;
    private Bicicleta bicicleta;

    private ArrayList<Tarea>listaTareas;
    private ArrayList<Mecanico>listaMecanicos;

    public OrdenServicio(String codigo, String descripcion, LocalDate fechaIngreso, LocalDate fechaSalida, int costo, Bicicleta bicicleta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.costo = costo;
        this.listaTareas = new ArrayList<>();
        this.listaMecanicos = new ArrayList<>();
        this.bicicleta = bicicleta;
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public ArrayList<Mecanico> getListaMecanicos() {
        return listaMecanicos;
    }

    public void setListaMecanicos(ArrayList<Mecanico> listaMecanicos) {
        this.listaMecanicos = listaMecanicos;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "OrdenServicio{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                ", costo=" + costo +
                '}';
    }
    //Metodos
    public void agregarMecanico(Mecanico mecanico){
        listaMecanicos.add(mecanico);
    }
    public void agregarTarea(Tarea tarea){
        listaTareas.add(tarea);
    }
    public int calcularTotalOrdenServicio(){
        int total = 0;
        for(Tarea tareaAux : listaTareas){
            total += tareaAux.getCosto();
        }
        return total;
    }
}
