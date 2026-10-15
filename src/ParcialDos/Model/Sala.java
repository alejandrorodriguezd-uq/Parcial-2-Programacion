package ParcialDos.Model;

import java.util.ArrayList;

public class Sala {
    //ATRIBUTOS
    private int codigo,capacidadMaxima;
    private String nombre, tipo;

    //RELACIONES
    private TipoSala tipoSala;
    private List<Asiento> listAsientos;
    private List<Funcion> listFunciones;

    /**
     * Método constructor Sala
     * @param codigo
     * @param capacidadMaxima
     * @param nombre
     * @param tipo
     * @param tipoSala
     * @param listAsientos
     * @param listFunciones
     */
    public Sala(int codigo, int capacidadMaxima, String nombre, String tipo, TipoSala tipoSala, List<Asiento> listAsientos, List<Funcion> listFunciones) {
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tipoSala = tipoSala;
        this.listAsientos = new ArrayList<>();
        this.listFunciones = new ArrayList<>();
    }
}
