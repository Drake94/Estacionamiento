
package estacionamientosnuevaera;

/**
 * @author Diego Ortega
 * @Email: draco_9431@hotmail.com
 * @fecha creacion 24/04/2023
 */
public abstract class Persona {
    protected String nombre;
    protected String rut;
    
    public Persona (String nombre, String rut){
        super();
        this.nombre = nombre;
        this.rut = rut;
    }
    public abstract void saludo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
}

