/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.Controlador;
import modelo.Modelo;

import vista.Vista;

/**
 *
 * @author SuperUs
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista,modelo);
        controlador.inicio();
        vista.setVisible(true);

    }
    
}