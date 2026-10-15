package ParcialDos.Model;

import java.util.ArrayList;

public abstract class Persona {
    //ATRIBUTOS
    private int documentoIdentidad, numerotelefono;
    private String nombre, correoElectronico;

    //RELACIONES
    private List<Cliente> listClientes;
    private List<Operador> listOperadores;

    /**
     * Método constructor de la clase Persona
     * @param documentoIdentidad
     * @param numerotelefono
     * @param nombre
     * @param correoElectronico
     * @param listClientes
     * @param listOperadores
     */
    public Persona(int documentoIdentidad, int numerotelefono, String nombre, String correoElectronico, List<Cliente> listClientes, List<Operador> listOperadores) {
        this.documentoIdentidad = documentoIdentidad;
        this.numerotelefono = numerotelefono;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.listClientes = new ArrayList<>();
        this.listOperadores = new ArrayList<>();
    }
}
