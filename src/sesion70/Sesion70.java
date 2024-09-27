/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion70;

import java.util.ArrayList;


public class Sesion70 {

    
    public static void main(String[] args) {
        Empleado em = new Empleado("Juan");
        Gerente ge = new Gerente("Marco");
        Jefe1 j1=new Jefe1("Carlos");
        Jefe2 j2=new Jefe2("Judas");
        
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(em);
        lista.add(ge);
        lista.add(j1);
        lista.add(j2);
        //for interactivo por objetos ; foreach
        for(Persona per :lista ){
            System.out.println("My name is : " + per.getNombre());
        
        }
        
        
    
    }
    
    
}
