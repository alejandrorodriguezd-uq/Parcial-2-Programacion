package ParcialDos.Model;

import java.util.ArrayList;

public class Asiento {
    //ATRIBUTOS
    public int fila;
    private int numeroAsiento;

    //RELACIONES
    private EstadoAsiento estadoAsiento;
    private List<Asiento> listAsientos;
    private List<Boleta> listBoletas;

    /**
     * Método constructor de la clase Asiento
     * @param fila
     * @param numeroAsiento
     * @param estadoAsiento
     * @param listAsientos
     * @param listBoletas
     */
    public Asiento(int fila, int numeroAsiento, EstadoAsiento estadoAsiento, List<Asiento> listAsientos, List<Boleta> listBoletas) {
        this.fila = fila;
        this.numeroAsiento = numeroAsiento;
        this.estadoAsiento = estadoAsiento;
        this.listAsientos = listAsientos;
        this.listBoletas = listBoletas;
    }
}
