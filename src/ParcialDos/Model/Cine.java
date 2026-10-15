package ParcialDos.Model;

import java.util.ArrayList;

public class Cine {
    //ATRIBUTOS
    public String nombre, direccion;
    public int NIT;

    //RELACIONES
    private List<Pelicula> listPeliculas;
    private List<Sala> listSalas;
    private List<Persona> listPersonas;
    private List<Venta> listVentas;

    /**
     * Método constructor de la clase Cine
     * @param nombre
     * @param direccion
     * @param NIT
     * @param listPeliculas
     * @param listSalas
     * @param listPersonas
     * @param listVentas
     */
    public Cine(String nombre, String direccion, int NIT, List<Pelicula> listPeliculas, List<Sala> listSalas, List<Persona> listPersonas, List<Venta> listVentas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.NIT = NIT;
        this.listPeliculas = new ArrayList<>();
        this.listSalas = new ArrayList<>();
        this.listPersonas = new ArrayList<>();
        this.listVentas = new ArrayList<>();
    }
}
