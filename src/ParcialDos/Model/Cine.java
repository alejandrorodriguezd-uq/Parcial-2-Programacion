package ParcialDos.Model;

import java.util.ArrayList;
import java.util.List;

public class Cine {

    //ATRIBUTOS
    public String nombre, direccion;
    public int nit;

    //RELACIONES
    public static List<Pelicula> listPeliculas;
    private List<Sala> listSalas;
    public static List<Persona> listPersonas;
    public static  List<Venta> listVentas;
    private List<Funcion> listFunciones;

    /**
     * Método constructor de la clase Cine
     * @param nombre
     * @param direccion
     * @param NIT
     */
    public Cine(String nombre, String direccion, int NIT ) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = NIT;
        this.listPeliculas = new ArrayList<>();
        this.listSalas = new ArrayList<>();
        this.listPersonas = new ArrayList<>();
        this.listVentas = new ArrayList<>();
        this.listFunciones= new ArrayList<>();
    }



    @Override
    public String toString() {
        return "Cine{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", NIT=" + nit +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNIT() {
        return nit;
    }

    public void setNIT(int NIT) {
        this.nit = NIT;
    }

    public List<Pelicula> getListPeliculas() {
        return listPeliculas;
    }

    public void setListPeliculas(List<Pelicula> listPeliculas) {
        this.listPeliculas = listPeliculas;
    }

    public List<Sala> getListSalas() {
        return listSalas;
    }

    public void setListSalas(List<Sala> listSalas) {
        this.listSalas = listSalas;
    }

    public List<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(List<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }

    public List<Venta> getListVentas() {
        return listVentas;
    }

    public void setListVentas(List<Venta> listVentas) {
        this.listVentas = listVentas;
    }

    public List<Funcion> getListFunciones() {
        return listFunciones;
    }

    public void setListFunciones(List<Funcion> listFunciones) {
        this.listFunciones = listFunciones;
    }
}
