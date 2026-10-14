package ParcialDos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
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
                case 1:
                    JOptionPane.showMessageDialog(null, "Usted presionó 1", "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usted presionó 2", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Usted presionó 3", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Usted presionó 4", "Información", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Usted presionó 5", "Pregunta", JOptionPane.QUESTION_MESSAGE);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Usted presionó 6", "Mensaje", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...", "Salida", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intenta de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (opcion != 7);
    }
}

