/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odontograma;

/**
 *
 * @author ertim
 */
public class Diente {
    public int NumDiente;
    public String Problema;
    public String Lado;
    public String Comentarios;
    
    public Diente(int Numero,String Problema,String Lado,String Comentario){
        this.NumDiente=Numero;
        this.Problema=Problema;
        this.Lado=Lado;
        this.Comentarios=Comentario;
    }
}
