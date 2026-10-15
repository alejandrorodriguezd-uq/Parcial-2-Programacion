package ParcialDos.Model;

import java.util.ArrayList;
import java.util.List;

public class Sala {

    //ATRIBUTOS
    private int codigo,capacidadMaxima;
    private String nombre;

    //RELACIONES
    private TipoSala tipoSala;
    public static  List<Asiento> listAsientos;
    public static  List<Funcion> listFunciones;

    /**
     * Método constructor Sala
     * @param codigo
     * @param capacidadMaxima
     * @param nombre
     * @param tipoSala
     */
    public Sala(int codigo, int capacidadMaxima, String nombre, TipoSala tipoSala) {
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.nombre = nombre;
        this.tipoSala = tipoSala;
        this.listAsientos = new ArrayList<>();
        this.listFunciones = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Sala{" +
                "codigo=" + codigo +
                ", capacidadMaxima=" + capacidadMaxima +
                ", nombre='" + nombre + '\'' +
                ", tipoSala=" + tipoSala +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public List<Asiento> getListAsientos() {
        return listAsientos;
    }

    public void setListAsientos(List<Asiento> listAsientos) {
        this.listAsientos = listAsientos;
    }

    public List<Funcion> getListFunciones() {
        return listFunciones;
    }

    public void setListFunciones(List<Funcion> listFunciones) {
        this.listFunciones = listFunciones;
    }
}
