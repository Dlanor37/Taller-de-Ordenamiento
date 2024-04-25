/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenamientoInsercion;

import java.util.ArrayList;

/**
 *
 * @author Carlos Grueso
 */
public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void ordenarLibrosPorTitulo() {
        for (int i = 1; i < libros.size(); i++) {
            Libro libroActual = libros.get(i);
            int j = i;
            while (j > 0 && libroActual.getTitulo().compareToIgnoreCase(libros.get(j - 1).getTitulo()) < 0) {
                libros.set(j, libros.get(j - 1));
                j--;
            }
            libros.set(j, libroActual);
        }
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Ejemplo de libros
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro2);

        System.out.println("Libros sin ordenar:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro);
        }

        biblioteca.ordenarLibrosPorTitulo();

        System.out.println("\nLibros ordenados:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro);
        }
    }
}