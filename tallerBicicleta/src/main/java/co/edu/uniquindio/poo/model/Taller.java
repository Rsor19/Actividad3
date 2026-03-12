package co.edu.uniquindio.poo.model;
import java.time.LocalDate;
import java.util.ArrayList;
public class Taller {
    private String nombreTaller;
    private String direccion;
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Mecanico> listaMecanico;
    private ArrayList<Bicicleta> listaBicicleta;
    private ArrayList<OrdenServicio>listaOrdenes;
    private ArrayList<Repuesto>listaRepuestos;

    public Taller(String nombreTaller, String direccion) {
        this.nombreTaller = nombreTaller;
        this.direccion = direccion;
        this.listaCliente = new ArrayList<>();
        this.listaMecanico = new ArrayList<>();
        this.listaBicicleta = new ArrayList<>();
        this.listaOrdenes = new ArrayList<>();
        this.listaRepuestos = new ArrayList<>();
    }
    public String getNombre() {
        return nombreTaller;
    }
    public void setNombre(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Taller{" +
                "nombre='" + nombreTaller + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
    //Crud Cliente
    public String registrarCliente(String nombre, String identificacion, String telefono, int numeroBicicleta, String direccion, LocalDate fechaNacimiento) {
        //Verificar que no este registrado
        for (Cliente clienteAux : listaCliente) {
            if (clienteAux.getIdentificacion().equals(identificacion)) {
                return  "El cliente ya existe";
            }
        }
        // Registrarlo
        Cliente nuevoCliente = new Cliente(nombre, identificacion, telefono, numeroBicicleta, direccion, fechaNacimiento);
        //Agregar a la lista
        listaCliente.add(nuevoCliente);
        return   " El cliente fue registrado correctamente";
    }
    public Cliente buscarCliente(String identificacion) {
        for (Cliente clienteAux : listaCliente) {
            if (clienteAux.getIdentificacion().equals(identificacion)) {
                return clienteAux;
            }
        }
        return null;
    }
    public String eliminarCliente(String identificacion) {
        Cliente clienteEncontrado = buscarCliente(identificacion);
        if (clienteEncontrado != null) {
            listaCliente.remove(clienteEncontrado);
            return "El cliente ha sido eliminado correctamente";
        }
        return "El cliente no existe";
    }
    //Crud Mecanico
    public String registrarMecanico(String nombre, String telefono, String salario){
        //verificar existencia
        for(Mecanico mecanicoAux: listaMecanico){
            if(mecanicoAux.getNombre().equals(nombre)){
                return "El mecanico ya existe";
            }
        }
        Mecanico nuevoMecanico = new Mecanico(nombre,telefono,salario);
        listaMecanico.add(nuevoMecanico);
        return "EL mecanico fue registrado exitosamente";
    }
//Buscar Mecanico
    public Mecanico buscarMecanico(String nombre){
        for(Mecanico mecanicoAux: listaMecanico){
            if(mecanicoAux.getNombre().equals(nombre)){
                return mecanicoAux;
                }
            }
        return null;
        }
    public String actualizarMecanico(String nombre, String nuevoNombre){
        Mecanico mecanicoEncontrado = buscarMecanico(nombre);
        if(mecanicoEncontrado !=null){
            mecanicoEncontrado.setNombre(nuevoNombre);
            return " el mecanico fue actualizado correctamente";
        }
        return "El mecanico no existe";
     }
    //CRUD bicicleta
    public String registrarBicicleta(String marca, String serial,String color){
        //verificar existencia
        for(Bicicleta bicicletaAux: listaBicicleta){
            if(bicicletaAux.getSerial().equals(serial)){
                return "La bicicleta ya existe";
            }
        }
        Bicicleta nuevaBicicleta = new Bicicleta(marca, serial,color );
        listaBicicleta.add(nuevaBicicleta);
        return "La bicicleta fue registrada exitosamente";
    }
    //Buscar Bicicleta
    public Bicicleta buscarBicicleta(String serial){
        for(Bicicleta bicicletaAux: listaBicicleta){
            if(bicicletaAux.getSerial().equals(serial)){
                return bicicletaAux;
            }
        }
        return null;
    }
    // CRUD REPUESTO
    public String registrarRepuesto(String nombre, double costo, int cantidad) {
        for (Repuesto repuestoAux : listaRepuestos) {
            if (repuestoAux.getNombre().equals(nombre)) {
                return "El repuesto ya existe";
            }
        }
        Repuesto nuevoRepuesto = new Repuesto(nombre, costo, cantidad);
        listaRepuestos.add(nuevoRepuesto);
        return "El repuesto fue registrado correctamente";
    }
    // CRUD ORDEN SERVICIO
    public String registrarOrdenServicio(String codigo, String descripcion,
                                         Bicicleta bicicleta, LocalDate fechaIngreso, LocalDate fechaSalida, int costo) {
        for (OrdenServicio ordenAux : listaOrdenes) {
            if (ordenAux.getCodigo().equals(codigo)) {
                return "La orden ya existe";
            }
        }
        OrdenServicio nuevaOrden = new OrdenServicio(codigo, descripcion,fechaIngreso,fechaSalida, costo, bicicleta);
        listaOrdenes.add(nuevaOrden);
        return "Orden de servicio registrada correctamente";
    }
    public OrdenServicio buscarOrden(String codigo){
        for(OrdenServicio ordenAux : listaOrdenes){
            if(ordenAux.getCodigo().equals(codigo)){
                return ordenAux;
            }
        }
        return null;
    }
}