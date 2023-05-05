/**
 * @author Diego Ortega
 * @Email: draco_9431@hotmail.com
 * @fecha creacion 19/04/2023
 */
package estacionamientosnuevaera;

import javax.swing.JOptionPane;

public class Vehiculo {
    private String marca , patente, tipoVehiculo;
    
    
    public Vehiculo(){
        this.marca = marca;
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
    }
    
    public void validarPatente(){
        if(patente.length() > 6){
            JOptionPane.showMessageDialog(null, "Patente no puede tener mas de 6 caracteres", "Error", JOptionPane.WARNING_MESSAGE);
        } else if(patente.length()<= 0){
            JOptionPane.showMessageDialog(null, "Patente no ingresada, reintente", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void validarMarca(){
        if(marca.length() > 15){
            JOptionPane.showMessageDialog(null, "Marca no puede tener mas de 15 caracteres", "Error", JOptionPane.WARNING_MESSAGE);
        } else if(marca.length()<= 0){
            JOptionPane.showMessageDialog(null, "Marca no ingresada, reintente", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    public String getMarca() {
        return marca;
    }
  
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getPatente() {
        return patente;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
}

