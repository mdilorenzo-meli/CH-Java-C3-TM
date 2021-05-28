package Ejercicio1;

public class PruebaSort {

    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Marcos Galperin", 456),
                new Persona("Steve Jobs", 234),
                new Persona("Bill Gates", 12),
                new Persona("Jeff Bezos", 2),
                new Persona("Elon Musk", 199)
        };
        SortUtil.ordenar(personas);

        System.out.println("\nLista ordenada de personas");

        for (Persona billonario : personas) {
            System.out.println(billonario);
        }

        Celular[] celulares = {
                new Celular(10, personas[1]),
                new Celular(200, personas[2]),
                new Celular(1, personas[3])
        };

        SortUtil.ordenar(celulares);

        for (Celular cel : celulares) {
            System.out.println(cel);
        }

    }
}
