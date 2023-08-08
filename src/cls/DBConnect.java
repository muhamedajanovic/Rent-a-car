package cls;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author esad
 */
public class DBConnect {
  private static String connUrl   = "jdbc:mysql://localhost/dbRentACar";
  private static String connUser = "root";
  private static String connPassword    = "";
  
  public static Connection uspostaviKonekciju(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection(connUrl, connUser, connPassword);
          //JOptionPane.showMessageDialog(null, "Veza sa bazom podataka je uspostavljena!");
          return conn;
      }catch (Exception e){
          JOptionPane.showMessageDialog(null, "Greška u konekciji sa bazom podataka: "+e.getMessage());
          return null;
      }
  }
}