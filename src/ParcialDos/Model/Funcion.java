package ParcialDos.Model;

import java.util.ArrayList;
import java.util.List;

public class Funcion {
    //ATRIBUTOS
    private int codigo;
    public int horaInicio, horaFinal;
    private double precioBase;

    private String fecha;

    //RELACIONES
    public static  List<Boleta> listBoletas;
    private Pelicula pelicula;
    private static Sala sala;

    /**
     * Metodo cosntructor de la clase Funcion
     * @param codigo
     * @param fecha
     * @param horaInicio
     * @param precioBase
     * @param pelicula
     * @param sala
     */
    public Funcion(int codigo, String fecha, int horaInicio,int horaFinal, double precioBase, Pelicula pelicula, Sala sala) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal=horaFinal;
        this.precioBase = precioBase;
        this.listBoletas = listBoletas;
        this.pelicula = pelicula;
        this.sala = sala;
        this.listBoletas= new ArrayList<>();
    }

    /**
     * metodo para registrar Funcion
     * @param codigo
     * @param fecha
     * @param horaInicio
     * @param horaFinal
     * @param precioBase
     * @param pelicula
     * @param sala
     * @return
     */

    public static String registrarFuncion(int codigo, String  fecha, int horaInicio,int horaFinal, double precioBase, Pelicula pelicula, Sala sala){

        String mensaje ="";

        Funcion encontrado=buscarFuncion(codigo);

        Funcion cruce= verificarCruce(fecha,horaInicio, horaFinal);

        if(encontrado==null&&cruce==null){
            Funcion funcion =new Funcion(codigo,fecha,horaInicio,horaFinal,precioBase,pelicula,sala);
            Sala.listFunciones.add(funcion);
            mensaje="Funcion registrada exitosamente";

        }else if(encontrado!=null&&cruce==null){
            mensaje="Ya esta funcion existe: \n"+encontrado.toString();

        }else if(encontrado==null&&cruce!=null){
            mensaje="El horario de esta funcion tiene cruce con esta funcion ya regisrada: \n"+ cruce.toString();

        }else{

            mensaje="Error al registrar esta funcion. Intenta nuevamente";

        }

        return mensaje;
    }

    /**
     * metodo para registrar funcion
     * @param codigo
     * @return
     */
    public static Funcion buscarFuncion(int codigo){

        Funcion encontrado= null;
        for(int i=0; i<Sala.listFunciones.size(); i++){
            Funcion funcion= Sala.listFunciones.get(i);
            if(funcion.getCodigo()==codigo){
                encontrado=funcion;
                break;
            }
        }
        return encontrado;
    }

    /**
     * metodo para calcular el porcentaje de ocupacion de una funcion
     * @param codigo
     * @return
     */

    public static String calcularPorcentajeOcupacion( int codigo){

        String mensaje="";

        Funcion funcion= buscarFuncion(codigo);

        double porcentaje = (double) (listBoletas.size() * 100) /sala.getCapacidadMaxima();

        mensaje="El porcentaje de ocupacion es de "+porcentaje+"%";

        return mensaje;
    }

    /**
     * metodo para verificar el cruce de una  funcion con otra
     * @param fecha
     * @param horaInicio
     * @param horaFinal
     * @return
     */
    public static Funcion  verificarCruce(String fecha, int horaInicio, int horaFinal){

        Funcion cruce=null;

        for (int i=0; i<Sala.listFunciones.size();i++){

            Funcion funcion= Sala.listFunciones.get(i);

            if(fecha.equalsIgnoreCase(funcion.getFecha())){

                if((funcion.getHoraInicio()<=horaInicio&&horaInicio<=funcion.getHoraFinal())||(funcion.getHoraInicio()<=horaFinal&&horaFinal<=funcion.getHoraFinal())){

                    cruce= funcion;
                    break;
                }
            }

        }

        return cruce;
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "codigo=" + codigo +
                ", fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", horaFinal=" + horaFinal +
                ", precioBase=" + precioBase +
                ", pelicula=" + pelicula.getTitulo() +
                ", sala=" + sala.getNombre() +
                '}';
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String  fecha) {
        this.fecha = fecha;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public List<Boleta> getListBoletas() {
        return listBoletas;
    }

    public void setListBoletas(List<Boleta> listBoletas) {
        this.listBoletas = listBoletas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public  Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }
}
