package ParcialDos.Model;

import java.util.ArrayList;

public class Funcion {
    //ATRIBUTOS
    private int codigo;
    public int fecha, horaInicio;
    private double precioBase;

    //RELACIONES
    private List<Boleta> listBoletas;

    /**
     * Método constructor de la clase Funcion
     * @param codigo
     * @param fecha
     * @param horaInicio
     * @param precioBase
     * @param listBoletas
     */
    public Funcion(int codigo, int fecha, int horaInicio, double precioBase, List<Boleta> listBoletas) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.precioBase = precioBase;
        this.listBoletas = new ArrayList<>();
    }
}
