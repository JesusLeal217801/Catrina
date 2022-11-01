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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
}
