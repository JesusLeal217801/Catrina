package mx.itson.catrina.entidades;

import java.util.Date;
import mx.itson.catrina.enumeradores.Tipo;

/**
 *
 * @author jesus
 */
public class Movimiento {
    
    private Date fecha;
    private String descripcion;
    private double cantidad;
    private Tipo tipo;

    /**
     * Obtiene la fecha en la que se hizo el movimiento.
     * @return La fecha en la que se hizo el movimiento.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Le da una fecha a un objeto de la clase Movimiento.
     * @param fecha La fecha en la que se hizo un movimiento.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la descripcion de un movimiento.
     * @return La descripcion de un movimiento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Le da una descripcion a un objeto de la clase Movimiento.
     * @param descripcion La descripcion del movimiento.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la cantidad de dinero que se manejo en ese movimiento.
     * @return La cantidad de dinero utilizada.
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Le da una cantidad de dinero al movimiento.
     * @param cantidad Cantidad de dinero.
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el tipo de transaccion realizada.
     * @return Tipo de transaccion realizada.
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Le da un tipo de transaccion.
     * @param tipo Tipo de transaccion.
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
}
