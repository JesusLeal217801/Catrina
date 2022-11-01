package mx.itson.catrina.entidades;

/**
 *
 * @author jesus
 */
public class Cliente {
    
    private int codigo;
    private String nombre;
    private String domicilio;
    private String ciudad;
    private String rfc;
    private String cp;

    /**
     * Obtiene el codigo de cliente.
     * @return El codigo de cliente.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Le da un numero de codigo al cliente.
     * @param codigo El codigo del cliente.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Le da un nombre al cliente.
     * @param nombre Nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el domicilio del cliente.
     * @return El domicilio del cliente.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Le da un domicilio al cliente.
     * @param domicilio Domicilio del cliente.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene la ciudad donde recide el cliente.
     * @return Ciudad del cliente.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Le da una ciudad de residencia al cliente.
     * @param ciudad Ciudad dell cliente.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el RFC del cliente.
     * @return El RFC del cliente.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Le da un RFC del cliente.
     * @param rfc RFC del cliente.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene el codigo postal del cliente.
     * @return El codigo postal del cliente.
     */
    public String getCp() {
        return cp;
    }

    /**
     * Le da un codigo postal al cliente.
     * @param cp Codigo postal del cliente.
     */
    public void setCp(String cp) {
        this.cp = cp;
    }
    
}
