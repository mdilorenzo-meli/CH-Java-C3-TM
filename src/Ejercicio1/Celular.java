package Ejercicio1;

public class Celular implements Precedable<Celular>{
    int numero;
    Persona titular;

    public static int MODOCOMP;

    public Celular(int numero, Persona titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }


    @Override
    public int precedeA(Celular celular) {
        return celular.getNumero() - numero;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", titular=" + titular +
                '}';
    }
}
