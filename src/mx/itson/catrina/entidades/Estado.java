/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.catrina.entidades;

import com.google.gson.Gson;
import java.util.List;

/**
 * Contiene los atributos de la clase Estado y dos metodos para funcionamientos extras.
 * @author Jesús Eduardo Leal Duarte - 217801
 */
public class Estado {
    
    private String producto;
    private String cuenta;
    private String clabe;
    private String moneda;
    private Cliente cliente;
    private List <Movimiento> movimientos; 

    /**
     * Obtiene un stream de un archivo Json y lo deserealiza para leer su información. 
     * @param json Contenido de un archivo transformado en bytes.
     * @return La información del archivo ya deserializado.
     */
    public Estado deserializar(String json){
        Estado estado = new Estado();
        try {
            estado = new Gson().fromJson(json, Estado.class);
        } catch(Exception ex){
            System.err.print("Ocurrió un error: " +ex.getMessage());
        }
        return estado;
    }

    /**
     * Transforma los meses de manera escrita a un numero entero.
     * @param mes El mes de manera escrita.
     * @return Un mes como numero entero.
     */
    public int obtenerMes(String mes){
        
        int mesNumero = 0;
        
        switch(mes){

                    case "Enero": mesNumero = 1; break;
                    case "Febrero": mesNumero = 2; break;
                    case "Marzo": mesNumero = 3; break;
                    case "Abril": mesNumero = 4; break;
                    case "Mayo": mesNumero = 5; break;
                    case "Junio": mesNumero = 6; break;
                    case "Julio": mesNumero = 7; break;
                    case "Agosto": mesNumero = 8; break;
                    case "Septiembre": mesNumero = 9; break;
                    case "Octubre": mesNumero = 10; break;
                    case "Noviembre": mesNumero = 11; break;
                    case "Diciembre": mesNumero = 12; break;
                    
                }
        
        return mesNumero;
    }
    
    /**
     * Obtiene el nombre del producto.
     * @return El nombre del producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Le da un nombre al producto.
     * @param producto El nombre que tendra el producto.
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * Obtiene el numero de cuenta.
     * @return El numero de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Le da un numero de cuenta.
     * @param cuenta Numero de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene la clabe de la cuenta.
     * @return La clabe de la cuenta.
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * Le da una clabe.
     * @param clabe La clabe de la cuenta.
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * Obtiene el tipo de moneda utilizada.
     * @return El tipo de moneda.
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Le da el tipo de moneda utilizada.
     * @param moneda El tipo de moneda utilizada.
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * Obtiene los datos de la clase Cliente.
     * @return Un objeto Cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }
    
    /**
     * Le da valores a los atributos de la clase Cliente.
     * @param cliente La clase Cliente.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene los valores de la clase Movimiento en una lista.
     * @return Una lista de tipo Movimiento
     */
    public List <Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * Le da valores a los objetos de la clase Movimiento.
     * @param movimientos La lista Movimientos.
     */
    public void setMovimientos(List <Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
}
