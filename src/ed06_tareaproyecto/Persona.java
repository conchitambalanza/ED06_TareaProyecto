/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author CONCHITA
 */
public class Persona {
    private int nacimiento; 
    private String nombre_persona;
    private int pasaporte;
   // se crea el constructor que recibe tres argumentos 
   public Persona (int nac, String n_per,int pas)throws Exception{
        this.nacimiento=nac;
        this.nombre_persona=n_per;
        this.pasaporte=pas;
    }
   //se crea el metodo que devuelve el valor del atributo
   public String Dime_nombre()throws Exception{
       return nombre_persona;
       
       }
    
}
