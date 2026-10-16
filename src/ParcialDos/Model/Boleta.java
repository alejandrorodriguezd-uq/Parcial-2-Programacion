package ParcialDos.Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Boleta {

    //ATRIBUTO
    private int codigo;
    private double valorPagado;

    //RELACIONES
    private Asiento asiento;
    private Venta venta;
    private Funcion funcion;


    public Boleta(int codigo, double valorPagado, Asiento asiento,  Funcion funcion) {
        this.codigo = codigo;
        this.valorPagado = valorPagado;
        this.asiento = asiento;
        this.funcion = funcion;
    }

    /**
     * Metodo para Añadir Boletas
     * @param codigoFuncion
     * @return
     */
    public static List<Boleta> añadirBoletas(int codigoFuncion){
        List<Boleta> listBoletas=new ArrayList<>();
        Funcion funcion = Funcion.buscarFuncion(codigoFuncion);
        double valorPagado= funcion.getPrecioBase();
        int opcion=0;
        do{
            int codigoBoleta= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la Boleta"));
            Boleta encontrado= buscarBoleta(codigoBoleta);
            int numeroAsiento= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuemro de asiento"));
            Asiento asiento = Asiento.buscarAsiento(numeroAsiento);

            if(encontrado==null&&asiento.getEstadoAsiento()!=EstadoAsiento.OCUPADO){

                Boleta boleta= new Boleta (codigoBoleta,valorPagado,asiento,funcion);
                listBoletas.add(boleta);
                Funcion.listBoletas.add(boleta);

                JOptionPane.showMessageDialog(null,"Boleta Agregada con exito");

                boleta.getAsiento().setEstadoAsiento(EstadoAsiento.OCUPADO);

            }else if (encontrado==null&&asiento.getEstadoAsiento()==EstadoAsiento.OCUPADO){
                JOptionPane.showMessageDialog(null,"El numero de asiento selecionado esta ocupado. Intenta otra vez");

            }else if( encontrado!=null&&asiento.getEstadoAsiento()!=EstadoAsiento.OCUPADO){

                JOptionPane.showMessageDialog(null,"Esta Boleta ya existe. Intenta otra vez");
            }else{

                JOptionPane.showMessageDialog(null,"No se pudo agregar la boleta. Intenta otra vez");
            }

            opcion=Integer.parseInt(JOptionPane.showInputDialog("Quieres Seguir agregando mas boletas? 1.si , 2.No"));

        }while(opcion!=2);

        return listBoletas;


    }

    /**
     * metodo para buscar boleta
     * @param codigo
     * @return
     */

    public static Boleta buscarBoleta(int codigo){

        Boleta encontrado= null;
        for(int i=0; i<Funcion.listBoletas.size(); i++){

            Boleta boleta = Funcion.listBoletas.get(i);
            if(boleta.getCodigo()==codigo){

                encontrado=boleta;
            }
        }
        return encontrado;
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
