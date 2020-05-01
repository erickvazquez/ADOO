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
public class Odonto {
    public Odonto(){
        
    }
    public int Guardar(String Correo,String Odonto) throws SQLException{
        MysqlConnect C= MysqlConnect.getDbCon();
        ResultSet S = C.query("call GuardarOdontograma('"+Correo+"','"+Odonto+"')");
        S.next();
        String resp = S.getString("Respuesta");
        return Integer.parseInt(resp);
    }
    
    public String Recuperar(String Correo) throws SQLException{
        MysqlConnect C= MysqlConnect.getDbCon();
        ResultSet S = C.query("call RecuperarOdonto('"+Correo+"')");
        S.next();
        String resp = S.getString("ODONTOGRAMA");
        return resp;
    }
    
    public String Actualiza(String Correo, String Odonto) throws SQLException{
        MysqlConnect C= MysqlConnect.getDbCon();
        ResultSet S = C.query("call ActualizarOdonto('"+Correo+"','"+Odonto+"')");
        S.next();
        String resp = S.getString("Respuesta");
        return resp;
    }
}
