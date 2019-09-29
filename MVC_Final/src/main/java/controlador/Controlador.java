/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author SuperUs
 */
public class Controlador implements ActionListener{

    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.btnConvertir.addActionListener(this);
    }
    
    /**
     * Metodo por el cual inicia el programa se le da un titulo al formulario y se pocisiona en 
     * el centro de la pantalla
     */
    
    public void inicio(){
    
        vista.setTitle(titulo());
        vista.setLocationRelativeTo(null);
        
    }   
    
    public void asignarValor(){
        modelo.setPeso(Double.parseDouble(vista.txtPesos.getText()));
        
       
       // modelo.convertirEuro();
      
       // vista.txtEuro.setText(String.valueOf(modelo.getEuro()));
    
    }
    
    public   String titulo(){
    
       String  cadena = "Conversor de Moneda Local";
        vista.lbTitulo.setText(cadena);
        return cadena;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        asignarValor();
    }
      
}
