package Ejercicio1;

public class Persona implements Precedable<Persona> {

    private String nombre;
    private int dni;

    public static int MODOCONFIG;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona() {
    }

    public Persona(Persona p){
        this.nombre = p.nombre;
        this.dni = p.dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeA(Persona persona) {
        return persona.getDni() - dni;
    }

    @Override
    public String toString() {
        return nombre +"/"+dni;
    }
}
