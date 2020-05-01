/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Base.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ertim
 */
public class Usuario {
        public MysqlConnect C=MysqlConnect.getDbCon();
        public String Nombre;
        public String Apellidos;
        public int Edad;
        public String Correo;
        public String Celular;
        public String TelCasa;
    public Usuario(){
        
    }
    
    public int CrearUsuario(String Nombre, String Apellido, String Contra, String Celular, String Correo, String TelCasa,String Tipo) throws SQLException{
        MysqlConnect C= MysqlConnect.getDbCon();
        ResultSet S = C.query("call Registro('"+Nombre+"','"+Apellido+"','"+Contra+"'"
                + ",'"+Celular+"','"+Correo+"','"+TelCasa+"','"+Tipo+"')");
        this.Nombre=Nombre;
        this.Apellidos=Apellido;
        this.Correo=Correo;
        this.Celular=Celular;
        S.next();
        String resp = S.getString("Respuesta");
        return Integer.parseInt(resp);
    }
    
    public String LoginUsuario(String Correo, String Contra, int T) throws SQLException{
        ResultSet S = C.query("call Login('"+Correo+"','"+Contra+"',"+T+")");
        S.next();
        String resp = S.getString("Respuesta");
        String Nombre=S.getString("Nombre");
        S.close();
        if(Integer.parseInt(resp)==0){
            return "";
        }else{
            return Nombre;
        }
    }
    
    public void ModificarUsuario(String Nombre, String Apellido, String Direccion){
        
    }
}
