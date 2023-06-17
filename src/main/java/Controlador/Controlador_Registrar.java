/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

//Vista principal a manejar
import Vistas.Registrar;
import Vistas.Registrarse_dos;
//Vista principal a manejar

//Otra vistas
import Vistas.Login;
//Otra vistas

//Librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Librerias

/**
 *
 * @author José Luis López
 */
public class Controlador_Registrar implements ActionListener  {
    private Registrar registrar;
    Registrarse_dos RD= new Registrarse_dos();
    
    public Controlador_Registrar(Registrar registrar){
    this.registrar = registrar;
    
   //Botones de la vista Registrar
         this.registrar.Registrarse.addActionListener(this);
         this.registrar.Regresar.addActionListener(this);
   //Fin de los botones de la vista Registrar
    
    //Comienzo de los botones de la Vista Registrar_Dos
        this.RD.Registrar.addActionListener(this);
        this.RD.Regresar.addActionListener(this);
   //Fin de los botones de la Vista Registrar_Dos
}
    
    @Override
    public void actionPerformed(ActionEvent ae) {
      
       //Eventos de los botones en la Vista Registrar
       
        if(ae.getSource()== registrar.Registrarse){ 
                       
        }
         
        if(ae.getSource()== registrar.Regresar){ 
           Login login= new Login();
           login.setVisible(true);
           registrar.setVisible(false);
        }
      
       //Fin de los eventos en la Vista Registrar
       //Comienzo de los eventos en la Vista Registrar_dos
       
        if(ae.getSource()== RD.Registrar){ 
            
          }
         
        if(ae.getSource()== RD.Regresar){ 
            registrar.setVisible(true);
            RD.setVisible(false);
        }
       
       //Fin de los eventos en la vista Registrar_Dos
    } 
}
