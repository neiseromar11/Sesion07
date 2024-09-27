/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion70;

/**
 *
 * @author Estudiante
 */
public class Gerente  extends Persona{
    private String cargo;

    public Gerente(String nombre) {
        super(nombre);
    }

    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
