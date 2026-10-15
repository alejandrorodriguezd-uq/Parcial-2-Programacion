package ParcialDos.Model;

import java.util.ArrayList;

public class Pelicula {
    //ATRIBUTOS
    public String titulo;
    private int codigo;
    public String duracion;
    public String clasificacionEdad;

    //RELACIONES
    private GeneroPelicula generoPelicula;
    private List<Funcion> listFunciones;

    /**
     * Método constructor de la clase Pelicula
     * @param titulo
     * @param codigo
     * @param duracion
     * @param clasificacionEdad
     * @param generoPelicula
     * @param listFunciones
     */
    public Pelicula(String titulo, int codigo, String duracion, String clasificacionEdad, GeneroPelicula generoPelicula, List<Funcion> listFunciones) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.duracion = duracion;
        this.clasificacionEdad = clasificacionEdad;
        this.generoPelicula = generoPelicula;
        this.listFunciones = new ArrayList<>();
    }
}
