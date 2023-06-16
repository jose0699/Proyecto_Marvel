/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Estoy en esta vista
import Vistas.Login;
//Estoy en esta vista


// Intafaces a invocar 
import Vistas.Principal;
import Vistas.Cambiar_Contrasena_Usuario;
import Vistas.Registrar;
//Fin de interfaces a invocar

//Modelos
import Modelo.ConexionBD;
//Fin de los modelos

//Bibliotecas
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//Fin de bibliotecas
/**
 *
 * @author José Luis López
 */
public class Controlador_Login implements ActionListener {
    private Login login;
    
    
    //añadir botones
    public Controlador_Login(Login login) {
        this.login = login;
        this.login.Iniciar_sesion.addActionListener(this);
        this.login.Olvido_Contrasena.addActionListener(this);
        this.login.CrearCuenta.addActionListener(this);
    }
    //fin de añadir botones
    
    // Sobre escribir botones principales
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== login.Iniciar_sesion){ 
           Principal pri = new Principal();
            pri.setVisible(true);
           login.setVisible(false);         
        }
        
        
        if( ae.getSource()==login.Contrasena_Login){
            Cambiar_Contrasena_Usuario cu = new Cambiar_Contrasena_Usuario ();
            cu.setVisible(true);
            login.setVisible(false);
        } 
        
     if(ae.getSource()== login.CrearCuenta){ 
         Registrar re = new Registrar();
         re.setVisible(true);
         login.setVisible(false);
     }
     
     
     
     
     
}

}
    


