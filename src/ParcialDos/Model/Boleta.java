package ParcialDos.Model;

public class Boleta {
    //ATRIBUTO
    private int codigo, fila, numeroAsiento;
    private double valor;

    //RELACIONES
    private Asiento asiento;
    private Venta venta;
    private Funcion funcion;

    /**
     * Método Constructor de la Boleta
     * @param codigo
     * @param fila
     * @param numeroAsiento
     * @param valor
     * @param asiento
     * @param venta
     * @param funcion
     */
    public Boleta(int codigo, int fila, int numeroAsiento, double valor, Asiento asiento, Venta venta, Funcion funcion) {
        this.codigo = codigo;
        this.fila = fila;
        this.numeroAsiento = numeroAsiento;
        this.valor = valor;
        this.asiento = asiento;
        this.venta = venta;
        this.funcion = funcion;
    }
}
