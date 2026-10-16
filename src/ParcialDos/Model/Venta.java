package ParcialDos.Model;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    //ATRIBUTOS
    private int codigo, fechaRealizacion;
    private double total;

    //RELACIONES
    private Persona cliente;
    private Operador operador;
    private List<Boleta> listBoletas;

    public Venta(int codigo, int fechaRealizacion, Persona cliente, Operador operador, List<Boleta> listBoletas, double total) {
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.cliente = cliente;
        this.operador = operador;
        this.listBoletas = listBoletas;
        this.total= total;
    }

    /**
     * Método para Registrar una Venta
     * @param codigo
     * @param fechaRealizacion
     * @param cliente
     * @param operador
     * @param codigoFuncion
     * @return
     */
    public static String registrarVenta (int codigo, int fechaRealizacion, Persona cliente, Operador operador, int codigoFuncion){

        String mensaje= "";

        Venta encontrado =buscarVenta(codigo);

        List<Boleta>listBoletas= Boleta.añadirBoletas(codigoFuncion);

        double total = Cliente.calcularTotal(listBoletas,codigoFuncion);

        if(encontrado==null){

            Venta venta = new Venta(codigo,fechaRealizacion,cliente,operador,listBoletas,total);
            Cine.listVentas.add(venta);

            mensaje="Venta registrada con exito\n"+"Total a pagar: "+total;
        }

        return mensaje;

    }

    /**
     * metodo para buscar una venta
     * @param codigo
     * @return
     */
    public static Venta buscarVenta ( int codigo){

        Venta encontrado = null;
        for(int i =0; i<Cine.listVentas.size(); i++){
            Venta venta =Cine.listVentas.get(i);
            if(venta.getCodigo()==codigo){
                encontrado=venta;
            }
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "codigo=" + codigo +
                ", fechaRealizacion=" + fechaRealizacion +
                ", total=" + total +
                ", cliente=" + cliente +
                ", operador=" + operador +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(int fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public List<Boleta> getListBoletas() {
        return listBoletas;
    }

    public void setListBoletas(List<Boleta> listBoletas) {
        this.listBoletas = listBoletas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
