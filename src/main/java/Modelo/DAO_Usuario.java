/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
 
/**
 *
 * @author José Luis López
 */

/*Modelo que se va a trabajar seria con el usuario, aqui se va a colocar todo la parte
las operaciones del usuario para asi limitar su acceso a la base de dato.
*/


import Modelo.Usuario;


import Modelo.ConexionBD;

//Librerias a utilizar

import java.sql.Connection;
import java.sql.SQLException;


//Fin de librerias a utlizar


public class DAO_Usuario {
    ConexionBD Conexion= new ConexionBD();
    
  public boolean Existencia_Usuario_Login (String usuario) throws SQLException, ClassNotFoundException{
    boolean existe=false;  
   try {
       Connection conn = Conexion.obtenerConexion();
   }catch (Exception e){
   
   }
    return existe;
      
  }
}
