package ParcialDos.Model;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    //ATRIBUTOS
    public String titulo;
    private int codigo;
    public String duracion;
    public String clasificacionEdad;

    //RELACIONES
    private GeneroPelicula generoPelicula;
    private List<Funcion> listFunciones;

    /**
     * Método constructor de la clase Pelicula
     * @param titulo
     * @param codigo
     * @param duracion
     * @param clasificacionEdad
     * @param generoPelicula
     */
    public Pelicula(String titulo, int codigo, String duracion, String clasificacionEdad, GeneroPelicula generoPelicula) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.duracion = duracion;
        this.clasificacionEdad = clasificacionEdad;
        this.generoPelicula = generoPelicula;
        this.listFunciones = new ArrayList<>();
    }

    /**
     * metodo para registrar pelicula
     * @param titulo
     * @param codigo
     * @param duracion
     * @param clasificacionEdad
     * @param generoPelicula
     * @return
     */

    public static String registrarPelicula(String titulo, int codigo, String duracion, String clasificacionEdad, GeneroPelicula generoPelicula ){

        String mensaje ="";
        Pelicula encontrado= buscarPelicula(codigo);

        if(encontrado==null){
            Pelicula pelicula= new Pelicula(titulo, codigo, duracion, clasificacionEdad, generoPelicula);
            Cine.listPeliculas.add(pelicula);
            mensaje=" Pelicula registrada exitosamnete ";
        }else{
            mensaje="Esta pelicula ya existe:\n"+encontrado.toString();
        }

        return mensaje;
    }

    /**
     * metodo para buscar pelicula
     * @param codigo
     * @return
     */
    public static Pelicula buscarPelicula(int codigo){

        Pelicula encontrado=null;
        for (int i=0; i<Cine.listPeliculas.size(); i++){
            Pelicula pelicula= Cine.listPeliculas.get(i);
            if(pelicula.getCodigo()==codigo){
                encontrado= pelicula;
                break;
            }
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", codigo=" + codigo +
                ", duracion='" + duracion + '\'' +
                ", clasificacionEdad='" + clasificacionEdad + '\'' +
                ", generoPelicula=" + generoPelicula +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public GeneroPelicula getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(GeneroPelicula generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public List<Funcion> getListFunciones() {
        return listFunciones;
    }

    public void setListFunciones(List<Funcion> listFunciones) {
        this.listFunciones = listFunciones;
    }
}
