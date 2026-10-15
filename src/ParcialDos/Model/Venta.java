package ParcialDos.Model;

import java.util.ArrayList;

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
     * @param listBoletas
     */
    public Venta(int codigo, int fechaRealizacion, Cliente cliente, Operador operador, List<Boleta> listBoletas) {
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.cliente = cliente;
        this.operador = operador;
        this.listBoletas = new ArrayList<>();
    }
}
