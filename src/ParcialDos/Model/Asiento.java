package ParcialDos.Model;

import java.util.ArrayList;
import java.util.List;

public class Asiento {

    //ATRIBUTOS
    public int fila;
    private int numeroAsiento;

    //RELACIONES
    private EstadoAsiento estadoAsiento;
    private List<Boleta> listBoletas;

    /**
     * Método constructor de la clase Asiento
     * @param fila
     * @param numeroAsiento
     * @param estadoAsiento
     */
    public Asiento(int fila, int numeroAsiento, EstadoAsiento estadoAsiento) {
        this.fila = fila;
        this.numeroAsiento = numeroAsiento;
        this.estadoAsiento = estadoAsiento;
        this.listBoletas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "fila=" + fila +
                ", numeroAsiento=" + numeroAsiento +
                ", estadoAsiento=" + estadoAsiento +
                '}';
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public EstadoAsiento getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(EstadoAsiento estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }

    public List<Boleta> getListBoletas() {
        return listBoletas;
    }

    public void setListBoletas(List<Boleta> listBoletas) {
        this.listBoletas = listBoletas;
    }
}
