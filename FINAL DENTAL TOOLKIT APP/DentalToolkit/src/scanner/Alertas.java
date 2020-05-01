/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.io.IOException;

/**
 *
 * @author ertim
 */
public class Alertas {
    public Alertas(){
        
    }
    public void AlertaGlobal(String Numero, String Mensaje, String Asunto,String Correo) throws IOException{
        SMS S = new SMS();
        S.mandar(Numero, Mensaje);
        EMAIL E = new EMAIL();
        //E.ENVIAR(Correo, Asunto, Mensaje);
    }
}
