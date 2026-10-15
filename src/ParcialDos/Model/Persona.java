package ParcialDos.Model;

import java.util.ArrayList;

public abstract class Persona {

    //ATRIBUTOS
    private int documentoIdentidad, numerotelefono;
    private String nombre, correoElectronico;

    //RELACIONES

    /**
     * Método constructor de la clase Persona
     * @param documentoIdentidad
     * @param numerotelefono
     * @param nombre
     * @param correoElectronico
     */
    public Persona(int documentoIdentidad, int numerotelefono, String nombre, String correoElectronico) {
        this.documentoIdentidad = documentoIdentidad;
        this.numerotelefono = numerotelefono;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "documentoIdentidad=" + documentoIdentidad +
                ", numerotelefono=" + numerotelefono +
                ", nombre='" + nombre + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public int getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(int numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
