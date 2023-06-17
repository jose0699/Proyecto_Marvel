/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;

public class ConexionBD {
  private Connection conexion;

      public Connection obtenerConexion() throws SQLException, ClassNotFoundException {
        if (conexion == null || conexion.isClosed()) {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Proyecto_Marvel", "postgres", "joseluis0699");
        }
        return conexion;
    }
  
  public boolean conectar() {
    try {
      Class.forName("org.postgresql.Driver");
      conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Proyecto_Marvel", "postgres", "joseluis0699");
      System.out.println("Conexión exitosa");
      return true;
    } catch (ClassNotFoundException | SQLException e) {
      System.out.println("Error de conexión: " + e.getMessage());
      return false;
    }
  }

  public void desconectar() {
    try {
      conexion.close();
      System.out.println("Conexión cerrada");
    } catch (SQLException e) {
      System.out.println("Error al cerrar la conexión: " + e.getMessage());
    }
  }

  public Connection getConexion() {
    return conexion;
  }
}


