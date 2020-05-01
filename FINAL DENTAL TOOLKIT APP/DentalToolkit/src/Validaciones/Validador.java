/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author eric
 */
public class Validador {
    public String numeros="[a-zA-Z]+";
        public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean ValidaContra(String A, String B){
        if(A.equals(B)){
            return true;
        }else{
            return false;
        }
    }
    public boolean ValidaCel(String A){
        if(A.contains(numeros)==false && A.length()==10){
            return true;
        }
        return false;
    }
    public boolean ValidaTel(String A){
        if(A.contains(numeros)==false && A.length()>=8){
            return true;
        }
        return false;
    }
    
    public static boolean validateEMAIL(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
}
