/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos.aleatorios;

import java.io.Serializable;

/**
 *
 * @author Urbano
 */
public class Renowned implements Serializable{
    String nombreOriginal;
    String nombreNuevo;

    public Renowned(String nombreOriginal, String nombreNuevo) {
        this.nombreOriginal = nombreOriginal;
        this.nombreNuevo = nombreNuevo;
    }
    
    public Renowned(){
        this.nombreOriginal = null;
        this.nombreNuevo = null;
    }

    public String getNombreOriginal() {
        return nombreOriginal;
    }

    public void setNombreOriginal(String nombreOriginal) {
        this.nombreOriginal = nombreOriginal;
    }

    public String getNombreNuevo() {
        return nombreNuevo;
    }

    public void setNombreNuevo(String nombreNuevo) {
        this.nombreNuevo = nombreNuevo;
    }
    
    
}
