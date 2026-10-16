package ParcialDos;

import ParcialDos.Model.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //INSTANCIAR CLASES
        Sala sala = new Sala(1, 50, "Sala_Uno", TipoSala.TRADICIONAL);
        Operador operador = new Operador(2, 2, "Tatiana", "tatianproxdxd@gmail.com", 1, 01012007, 2);

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "----- MENÚ PRINCIPAL -----\n" +
                    "1. Registrar Películas\n" +
                    "2. Registrar clientes\n" +
                    "3. Programar funciones\n" +
                    "4. Realizar ventas de boletas\n" +
                    "5. Calcular el valor total de una venta\n" +
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
                    Pelicula.registrarPelicula(titulo, codigo, duracion, clasificacionEdad, GeneroPelicula.ACCION);

                    break;

                //REGISTRAR CLIENTES
                case 2:
                    int documentoIdentidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la película: "));;
                    int numeroTelefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la película: "));;
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese la fecha de presentación de la película: ");;
                    String correoElectronico = JOptionPane.showInputDialog(null, "Ingrese la fecha de presentación de la película: ");;
                    int codigoAfiliacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la película: "));

                    Cliente.registrarCliente(documentoIdentidad, numeroTelefono, nombre, correoElectronico, codigoAfiliacion);

                    break;

                //REGISTRAR FUNCIONES
                case 3:
                    int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la película: "));
                    String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de presentación de la película: ");
                    int horaInicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de comienzo de la película: "));
                    int horaFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de finalización la película: "));
                    double precioBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio base de la película: "));

                    int codigoPelicula = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo de la película:"));
                    Pelicula pelicula = Pelicula.buscarPelicula(codigoPelicula);

                    Funcion.registrarFuncion(cod, fecha, horaInicio, horaFinal, precioBase, pelicula, sala);

                    break;

                //REALIZAR VENTA BOLETAS
                case 4:
                    //int codigo, int fechaRealizacion, Cliente cliente, Operador operador, int codigoFuncion
                    int code = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la venta: "));
                    int fechaRealizacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la hora de realización de la venta: "));
                    int codigoFuncion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la función: "));

                    int clienteBuscado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de identidad del cliente: "));
                    Persona cliente1 = Cliente.buscarCliente(clienteBuscado);

                    Venta.registrarVenta(code, fechaRealizacion, cliente1, operador, codigoFuncion);
                    break;

                //CALCULAR EL VALOR TOTAL DE UNA VENTA
                case 5:
                    int codigoVenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la Venta: "));
                    Venta.buscarVenta(codigoVenta);

                    break;

                //CALCULAR EL % DE OCUPACIÓN DE UNA SALA
                case 6:
                    int codeSala = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el código de la sala: "));
                    Funcion.calcularPorcentajeOcupacion(codeSala);

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