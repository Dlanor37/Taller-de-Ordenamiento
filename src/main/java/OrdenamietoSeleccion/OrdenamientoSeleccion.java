/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenamietoSeleccion;

/**
 *
 * @author Carlos Grueso
 */
public class OrdenamientoSeleccion {

    public static void main(String[] args) {
        int[] tiemposLlegada = {10, 9, 11, 10, 9}; 

        System.out.println("Tiempos de llegada desordenados:");
        for (int tiempo : tiemposLlegada) {
            System.out.print((int) tiempo + " "); 
        }

        tiemposLlegada = ordenarSeleccion(tiemposLlegada);

        System.out.println("\nTiempos de llegada ordenados:");
        for (int tiempo : tiemposLlegada) {
            System.out.print(tiempo + " ");
        }
    }

    private static int[] ordenarSeleccion(int[] tiemposLlegada) {
        for (int i = 0; i < tiemposLlegada.length - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < tiemposLlegada.length; j++) {
                if (tiemposLlegada[j] < tiemposLlegada[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            if (i != indiceMenor) {
                int temp = tiemposLlegada[i];
                tiemposLlegada[i] = tiemposLlegada[indiceMenor];
                tiemposLlegada[indiceMenor] = temp;
            }
        }

        return tiemposLlegada; 
    }
}