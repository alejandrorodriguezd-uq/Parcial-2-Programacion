package ParcialDos;

import ParcialDos.Model.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //INSTANCIAR CLASES
        Cine cine= new Cine ("CinePlus","la Vahia", 1234567890);
        Sala sala = new Sala(1, 100, "Sala_Uno", TipoSala.TRADICIONAL);
        Asiento Asiento1= new Asiento(1, 123, EstadoAsiento.DISPONIBLE);
        Sala.listAsientos.add(Asiento1);
        Asiento Asiento2= new Asiento(2, 426, EstadoAsiento.DISPONIBLE);
        Sala.listAsientos.add(Asiento2);
        Asiento Asiento3= new Asiento(3, 789, EstadoAsiento.DISPONIBLE);
        Sala.listAsientos.add(Asiento3);

        Operador operador = new Operador(2, 2, "Tatiana", "tatianproxdxd@gmail.com", 1, 01012007, 2);

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "----- MENÚ PRINCIPAL -----\n" +
                    "1. Registrar Películas\n" +
                    "2. Registrar clientes\n" +
                    "3. Programar funciones\n" +
                    "4. Realizar ventas de boletas\n" +
                    "5. Consultar Venta\n" +
                    "6. Calcular El % de Ocupación de una sala\n" +
                    "7. Salir\n" +
                    "Selecciona una opción del menú"));

            switch (opcion) {

                //REGISTRAR PELÍCULAS
                case 1:
                    String titulo = JOptionPane.showInputDialog(null, "Ingrese el título de la película: ");
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la película: "));
                    String duracion = JOptionPane.showInputDialog(null, "Ingresa la duración de la película: ");
                    String clasificacionEdad = JOptionPane.showInputDialog(null, "Ingrese la clasificación de la película: ");
                    String mensaje = Pelicula.registrarPelicula(titulo, codigo, duracion, clasificacionEdad, GeneroPelicula.ACCION);

                    JOptionPane.showMessageDialog(null, mensaje);

                    break;

                //REGISTRAR CLIENTES
                case 2:
                    int documentoIdentidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento de identidad del cliente: "));;
                    int numeroTelefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de teléfono: "));;
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");;
                    String correoElectronico = JOptionPane.showInputDialog(null, "Ingrese el correo electrónico del cliente: ");;
                    int codigoAfiliacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de afiliación: "));

                    String mensaje2 = Cliente.registrarCliente(documentoIdentidad, numeroTelefono, nombre, correoElectronico, codigoAfiliacion);

                    JOptionPane.showMessageDialog(null, mensaje2);
                    break;

                //REGISTRAR FUNCIONES
                case 3:
                    int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la función: "));
                    String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de presentación de la película: ");
                    int horaInicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de comienzo de la película (hora militar): "));
                    int horaFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de finalización la película (hora militar): "));
                    double precioBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio base de la película: "));

                    int codigoPelicula = Integer.parseInt(JOptionPane.showInputDialog(null, "Código de la película:"));
                    Pelicula pelicula = Pelicula.buscarPelicula(codigoPelicula);

                    String mensaje3 = Funcion.registrarFuncion(cod, fecha, horaInicio, horaFinal, precioBase, pelicula, sala);

                    JOptionPane.showMessageDialog(null, mensaje3);
                    break;

                //REALIZAR VENTA BOLETAS
                case 4:
                    //int codigo, int fechaRealizacion, Cliente cliente, Operador operador, int codigoFuncion
                    int code = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la venta: "));
                    int fechaRealizacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de realización de la venta: "));
                    int codigoFuncion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la función: "));

                    int clienteBuscado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de identidad del cliente: "));
                    Persona cliente1 = Cliente.buscarCliente(clienteBuscado);

                    String mensaje4 = Venta.registrarVenta(code, fechaRealizacion, cliente1, operador, codigoFuncion);

                    JOptionPane.showMessageDialog(null, mensaje4);
                    break;

                //CALCULAR EL VALOR TOTAL DE UNA VENTA
                case 5:
                    int codigoVenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la Venta: "));
                    Venta mensaje5 = Venta.buscarVenta(codigoVenta);

                    JOptionPane.showMessageDialog(null, mensaje5.toString());

                    break;

                //CALCULAR EL % DE OCUPACIÓN DE UNA SALA
                case 6:
                    int codeFuncion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la función: "));
                    String mensaje6 = Funcion.calcularPorcentajeOcupacion(codeFuncion);

                    JOptionPane.showMessageDialog(null, mensaje6);
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa, muchísimas gracias.", "1.. 2.. 3..", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intenta de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (opcion != 7);
    }
}