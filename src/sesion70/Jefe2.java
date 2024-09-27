/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion70;

/**
 *
 * @author Estudiante
 */
public class Jefe2 extends Gerente{
    private int horasExtra;

    public Jefe2(String nombre) {
        super(nombre);
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
}
