package ParcialDos.Model;

import java.util.ArrayList;

public abstract class Persona {

    //ATRIBUTOS
    private int documentoIdentidad, numeroTelefono;
    private String nombre, correoElectronico;

    //RELACIONES

    /**
     * Método constructor de la clase Persona
     * @param documentoIdentidad
     * @param numeroTelefono
     * @param nombre
     * @param correoElectronico
     */
    public Persona(int documentoIdentidad, int numeroTelefono, String nombre, String correoElectronico) {
        this.documentoIdentidad = documentoIdentidad;
        this.numeroTelefono = numeroTelefono;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "documentoIdentidad=" + documentoIdentidad +
                ", numerotelefono=" + numeroTelefono +
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

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
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
