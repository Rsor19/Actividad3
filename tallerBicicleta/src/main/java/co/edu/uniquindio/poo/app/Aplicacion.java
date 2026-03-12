package co.edu.uniquindio.poo.app;
import co.edu.uniquindio.poo.model.*;
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Aplicacion {
    public static void main(String args[]){

        Taller taller = new Taller("Taller BiciTech", "Armenia");

        int opcion = 0;

        do {

            String menu = """
                    ------ MENU TALLER ------
                    1. Registrar cliente
                    2. Buscar cliente
                    3. Eliminar cliente
                    4. Registrar mecanico
                    5. Registrar bicicleta
                    6. Registrar orden servicio
                    7. Agregar tarea a orden
                    9. Agregar mecanico a orden
                    10. Calcular costo total de orden
                    11. Salir
                    """;

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1 -> {

                    String nombre = JOptionPane.showInputDialog("Ingrese nombre:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese identificacion:");
                    String telefono = JOptionPane.showInputDialog("Ingrese telefono");
                    int numeroBicicleta = Integer.parseInt(JOptionPane.showInputDialog("Numero de bicicleta"));
                    String direccion = JOptionPane.showInputDialog("Direccion");
                    String fecha = JOptionPane.showInputDialog("Fecha nacimiento (AAAA-MM-DD)");

                    LocalDate fechaNacimiento = LocalDate.parse(fecha);

                    String resultado = taller.registrarCliente(
                            nombre,
                            identificacion,
                            telefono,
                            numeroBicicleta,
                            direccion,
                            fechaNacimiento
                    );

                    JOptionPane.showMessageDialog(null, resultado);
                }

                case 2 -> {

                    String identificacion = JOptionPane.showInputDialog("Ingrese identificacion");

                    Cliente cliente = taller.buscarCliente(identificacion);

                    if (cliente != null) {
                        JOptionPane.showMessageDialog(null, cliente.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    }
                }

                case 3 -> {

                    String identificacion = JOptionPane.showInputDialog("Identificacion del cliente");

                    String resultado = taller.eliminarCliente(identificacion);

                    JOptionPane.showMessageDialog(null, resultado);
                }

                case 4 -> {

                    String nombre = JOptionPane.showInputDialog("Nombre mecanico");
                    String telefono = JOptionPane.showInputDialog("Telefono");
                    String salario = JOptionPane.showInputDialog("Salario");

                    String resultado = taller.registrarMecanico(nombre, telefono, salario);

                    JOptionPane.showMessageDialog(null, resultado);
                }

                case 5 -> {

                    String marca = JOptionPane.showInputDialog("Marca bicicleta");
                    String serial = JOptionPane.showInputDialog("Serial");
                    String color = JOptionPane.showInputDialog("Color");

                    String resultado = taller.registrarBicicleta(marca, serial, color);

                    JOptionPane.showMessageDialog(null, resultado);
                }

                case 6 -> {

                    String codigo = JOptionPane.showInputDialog("Codigo orden");
                    String descripcion = JOptionPane.showInputDialog("Descripcion");
                    String serial = JOptionPane.showInputDialog("Serial bicicleta");

                    Bicicleta bicicleta = taller.buscarBicicleta(serial);

                    if (bicicleta == null) {
                        JOptionPane.showMessageDialog(null, "La bicicleta no existe");
                        break;
                    }

                    String fechaIngresoStr = JOptionPane.showInputDialog("Fecha ingreso (AAAA-MM-DD)");
                    String fechaSalidaStr = JOptionPane.showInputDialog("Fecha salida (AAAA-MM-DD)");

                    LocalDate fechaIngreso = LocalDate.parse(fechaIngresoStr);
                    LocalDate fechaSalida = LocalDate.parse(fechaSalidaStr);

                    int costo = Integer.parseInt(JOptionPane.showInputDialog("Costo"));

                    String resultado = taller.registrarOrdenServicio(
                            codigo,
                            descripcion,
                            bicicleta,
                            fechaIngreso,
                            fechaSalida,
                            costo
                    );

                    JOptionPane.showMessageDialog(null, resultado);
                }
                case 8 -> {

                    String codigoOrden = JOptionPane.showInputDialog("Codigo de la orden");

                    OrdenServicio orden = taller.buscarOrden(codigoOrden);

                    if(orden == null){
                        JOptionPane.showMessageDialog(null,"La orden no existe");
                        break;
                    }

                    String nombre = JOptionPane.showInputDialog("Nombre de la tarea");
                    int costo = Integer.parseInt(JOptionPane.showInputDialog("Costo de la tarea"));
                    String codigoTarea = JOptionPane.showInputDialog("Codigo de la tarea");

                    Tarea nuevaTarea = new Tarea(nombre,costo,codigoTarea);

                    orden.agregarTarea(nuevaTarea);

                    JOptionPane.showMessageDialog(null,"Tarea agregada correctamente");
                }
                case 9 -> {

                    String codigoOrden = JOptionPane.showInputDialog("Codigo de la orden");

                    OrdenServicio orden = taller.buscarOrden(codigoOrden);

                    if(orden == null){
                        JOptionPane.showMessageDialog(null,"La orden no existe");
                        break;
                    }

                    String nombreMecanico = JOptionPane.showInputDialog("Nombre del mecanico");

                    Mecanico mecanico = taller.buscarMecanico(nombreMecanico);

                    if(mecanico == null){
                        JOptionPane.showMessageDialog(null,"El mecanico no existe");
                        break;
                    }

                    orden.agregarMecanico(mecanico);

                    JOptionPane.showMessageDialog(null,"Mecanico asignado a la orden");
                }
                case 10 -> {

                    String codigoOrden = JOptionPane.showInputDialog("Codigo de la orden");

                    OrdenServicio orden = taller.buscarOrden(codigoOrden);

                    if(orden == null){
                        JOptionPane.showMessageDialog(null,"La orden no existe");
                        break;
                    }

                    int total = orden.calcularTotalOrdenServicio();

                    JOptionPane.showMessageDialog(null,"El costo total de la orden es: " + total);

                }

            }

        } while (opcion != 11);
    }
}
