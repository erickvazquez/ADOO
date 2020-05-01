/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odontograma;

import java.util.ArrayList;

/**
 *
 * @author ertim
 */
public class Dentadura {
    ArrayList<Diente> Dentadura = new ArrayList<Diente>();
    public Dentadura(){
        
    }
    public void AgregarDiente(int num, String Problema, String Lado, String Comentario){
        Dentadura.add(new Diente(num, Problema, Lado, Comentario));
    }
    
    public void VerDentadura(){
        if(Dentadura.size()>0){
            System.out.println("--------------------------------------------");
            for(int i=0;i<Dentadura.size();i++ ){
                System.out.println("Diente "+Dentadura.get(i).NumDiente);
                System.out.println("Problema "+Dentadura.get(i).Problema);
                System.out.println("Lado "+Dentadura.get(i).Lado);
                System.out.println("Comentarios "+Dentadura.get(i).Comentarios);
                System.out.println("--------------------------------------------");
            }
        }else{
            System.out.println("No hay dientes");
        }
    }
    public String Problema(int i){
        if(!Dentadura.get(i).Comentarios.equals(null)){
            return Dentadura.get(i).Problema;
        }
        return "No existe diente";
    }
    public String Lado(int i){
        if(!Dentadura.get(i).Comentarios.equals(null)){
            return Dentadura.get(i).Lado;
        }
        return "No existe diente";
    }
    public String Comentario(int i){
        if(!Dentadura.get(i).Comentarios.equals(null)){
            return Dentadura.get(i).Comentarios;
        }
        return "No existe diente";
    }
}
