package ParcialDos.Model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {

    //CONSTANTES
    private static final double DESCUENTO = 0.1;

    //ATRIBUTOS
    private int codigoAfiliacion;

    //RELACIONES
    private List<Venta> listVentas;

    /**
     * metodo constructor de la clase Cliente
     * @param documentoIdentidad
     * @param numerotelefono
     * @param nombre
     * @param correoElectronico
     * @param codigoAfiliacion
     */
    public Cliente(int documentoIdentidad, int numerotelefono, String nombre, String correoElectronico, int codigoAfiliacion) {
        super(documentoIdentidad, numerotelefono, nombre, correoElectronico);
        this.codigoAfiliacion = codigoAfiliacion;
        this.listVentas = new ArrayList<>();
    }

    /**
     * Metodo para registrar cliente
     * @param documentoIdentidad
     * @param numerotelefono
     * @param nombre
     * @param correoElectronico
     * @param codigoAfiliacion
     * @return
     */

    public static String registrarCliente( int documentoIdentidad, int numerotelefono, String nombre, String correoElectronico, int codigoAfiliacion){

        String mensaje="";
        Persona encontrado= buscarCliente(documentoIdentidad);
        if(encontrado==null){

            Cliente cliente=new Cliente(documentoIdentidad,numerotelefono,nombre,correoElectronico,codigoAfiliacion);
            Cine.listPersonas.add(cliente);
            mensaje="Cliente registrado exitosamente";

        }else{

            mensaje="El cliente ya existe: \n"+ encontrado.toString();
        }

        return mensaje;
    }

    /**
     * Metodo para buscar cliente
     * @param documentoIdentidad
     * @return
     */

    public static Persona buscarCliente(int documentoIdentidad){

        Persona encontrado= null;
        for( int i=0; i<Cine.listPersonas.size(); i++){
            Persona cliente= Cine.listPersonas.get(i);
            if(cliente.getDocumentoIdentidad()==documentoIdentidad){
                encontrado=cliente;
                break;
            }
        }
        return encontrado;
    }

    @Override
    public String toString() {
        return "Cliente{" +

                "codigoAfiliacion=" + codigoAfiliacion +

                '}';
    }

    public int getCodigoAfiliacion() {
        return codigoAfiliacion;
    }

    public void setCodigoAfiliacion(int codigoAfiliacion) {
        this.codigoAfiliacion = codigoAfiliacion;
    }

    public List<Venta> getListVentas() {
        return listVentas;
    }

    public void setListVentas(List<Venta> listVentas) {
        this.listVentas = listVentas;
    }
}
