package estacionamientosnuevaera;

import javax.swing.JOptionPane;

/**
 * @author Diego Ortega
 * @Email: draco_9431@hotmail.com
 * @fecha creacion 24/04/2023
 */
public class PropietarioVehiculo extends Persona{
        
    public PropietarioVehiculo(String nombre, String rut){
        super(nombre, rut);        
    }
    
    @Override
    public void saludo(){
        JOptionPane.showMessageDialog(null, "Hola, soy "+ getNombre() + ", el dueño del vehiculo", "Saludo", JOptionPane.INFORMATION_MESSAGE);
    }
}
