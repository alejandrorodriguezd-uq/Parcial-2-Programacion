package ParcialDos.Model;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    //ATRIBUTOS
    private int codigo, fechaRealizacion;

    //RELACIONES
    private Cliente cliente;
    private Operador operador;
    private List<Boleta> listBoletas;

    /**
     * Método Constructor de la clase Venta
     * @param codigo
     * @param fechaRealizacion
     * @param cliente
     * @param operador
     */
    public Venta(int codigo, int fechaRealizacion, Cliente cliente, Operador operador) {
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.cliente = cliente;
        this.operador = operador;
        this.listBoletas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Venta{" +
                "codigo=" + codigo +
                ", fechaRealizacion=" + fechaRealizacion +
                ", cliente=" + cliente +
                ", operador=" + operador +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(int fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public List<Boleta> getListBoletas() {
        return listBoletas;
    }

    public void setListBoletas(List<Boleta> listBoletas) {
        this.listBoletas = listBoletas;
    }
}
