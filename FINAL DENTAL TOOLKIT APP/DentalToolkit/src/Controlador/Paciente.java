/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Base.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author eric
 */
public class Paciente extends Usuario{
    public String Padecimientos="";
    public ArrayList<Usuario> ARR = new ArrayList<>();
    
    public int CrearPaciente(String Nombre, String Apellidos, String Padeciemiento, String Celular, String Correo, String TelCasa,String Tipo) throws SQLException{
        MysqlConnect C= MysqlConnect.getDbCon();
        ResultSet S = C.query("call Registro('"+Nombre+"','"+Apellidos+"','"+Padeciemiento+"'"
                + ",'"+Celular+"','"+Correo+"','"+TelCasa+"','"+Tipo+"')");
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Correo=Correo;
        this.Celular=Celular;
        this.Padecimientos=Padeciemiento;
        this.TelCasa=TelCasa;
        S.next();
        String resp = S.getString("Respuesta");
        return Integer.parseInt(resp);
    }
    
    public Usuario CrearPacienteO(String Nombre, String Apellidos, String Padeciemiento, String Celular, String Correo, String TelCasa,String Tipo) throws SQLException{
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Correo=Correo;
        this.Celular=Celular;
        this.Padecimientos=Padeciemiento;
        this.TelCasa=TelCasa;
        return this;
    }
    
    public ArrayList ObtenerPacientes() throws SQLException{
        MysqlConnect C= MysqlConnect.getDbCon();
        ResultSet S = C.query("call ObtenerPacientes()");
        while(S.next()){
            Paciente A1 = new Paciente();
            ARR.add(A1.CrearPacienteO(S.getString("Nombre"),S.getString("Apellido"),S.getString("Contra"),S.getString("Celular"),S.getString("Correo"),S.getString("TelCasa"),"3"));
        }
        S.close();
        return ARR;
    }
    
    public Paciente(){
        
    }
}
