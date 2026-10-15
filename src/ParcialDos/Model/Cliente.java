package ParcialDos.Model;

import java.util.ArrayList;

public class Cliente extends Persona {
    //CONSTANTES
    private static final double DSTO = 0.1;
    //ATRIBUTOS
    private int codigoAfiliacion;

    //RELACIONES
    private List<Venta> listVentas;

    /**
     * Método constructor de la clase Cliente
     * @param codigoAfiliacion
     * @param listVentas
     */
    public Cliente(int codigoAfiliacion, List<Venta> listVentas) {
        this.codigoAfiliacion = codigoAfiliacion;
        this.listVentas = new ArrayList<>();
    }
}
