package ParcialDos.Model;

import java.util.ArrayList;
import java.util.List;

public class Operador extends Persona {

    //ATRIBUTOS
    private int codigoEmpleado, fechaContratacion;
    private double salario;

    //RELACIONES
    private List<Venta> listVentas;

    /**
     * Metodo constructor para la clase Operador
     * @param documentoIdentidad
     * @param numerotelefono
     * @param nombre
     * @param correoElectronico
     * @param codigoEmpleado
     * @param fechaContratacion
     * @param salario
     */
    public Operador(int documentoIdentidad, int numerotelefono, String nombre, String correoElectronico, int codigoEmpleado, int fechaContratacion, double salario) {
        super(documentoIdentidad, numerotelefono, nombre, correoElectronico);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.listVentas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Operador{" +
                "codigoEmpleado=" + codigoEmpleado +
                ", fechaContratacion=" + fechaContratacion +
                ", salario=" + salario +
                ", listVentas=" + listVentas +
                '}';
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(int fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Venta> getListVentas() {
        return listVentas;
    }

    public void setListVentas(List<Venta> listVentas) {
        this.listVentas = listVentas;
    }
}
