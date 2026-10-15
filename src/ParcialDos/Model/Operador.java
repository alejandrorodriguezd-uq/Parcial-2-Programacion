package ParcialDos.Model;

import java.util.ArrayList;

public class Operador extends Persona {
    //ATRIBUTOS
    private int codigoEmpleado, fechaContratacion;
    private double salario;

    //RELACIONES
    private List<Venta> listVentas;

    /**
     * Método Constructor de la clase Operador
     * @param codigoEmpleado
     * @param fechaContratacion
     * @param salario
     * @param listVentas
     */
    public Operador(int codigoEmpleado, int fechaContratacion, double salario, List<Venta> listVentas) {
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.listVentas = new ArrayList<>();
    }
}
