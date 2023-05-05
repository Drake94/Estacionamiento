package estacionamientosnuevaera;

import javax.swing.JOptionPane;

/**
  * @author Diego Ortega
 * @Email: draco_9431@hotmail.com
 * @fecha creacion 24/04/2023
 */
public class Encargado extends Persona{
    
    String clave, Email;
    
    public Encargado(String nombre, String rut){
        super(nombre, rut);        
    }
   
    
    @Override
    public void saludo(){
        JOptionPane.showMessageDialog(null, "Hola, Bienvenido", "Saludo", JOptionPane.INFORMATION_MESSAGE);
    }
}
