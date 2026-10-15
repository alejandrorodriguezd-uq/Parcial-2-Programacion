package ParcialDos.Model;

public class Boleta {

    //ATRIBUTO
    private int codigo;
    private double valorPagado;

    //RELACIONES
    private Asiento asiento;
    private Venta venta;
    private Funcion funcion;


    public Boleta(int codigo, double valorPagado, Asiento asiento, Venta venta, Funcion funcion) {
        this.codigo = codigo;
        this.valorPagado = valorPagado;
        this.asiento = asiento;
        this.venta = venta;
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "codigo=" + codigo +
                ", valorPagado=" + valorPagado +
                ", asiento=" + asiento.getNumeroAsiento() +
                ", venta=" + venta.getCodigo()+
                ", funcion=" + funcion.getSala().getNombre()+
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(double valorPagado) {
        this.valorPagado = valorPagado;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }
}
