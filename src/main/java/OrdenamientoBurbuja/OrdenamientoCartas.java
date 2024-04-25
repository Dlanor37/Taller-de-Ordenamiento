/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenamientoBurbuja;

/**
 *
 * @author Carlos Grueso
 */
public class OrdenamientoCartas {

    public static void main(String[] args) {
        
        int[] mano = {8, 10, 6, 2, 4, 5, 9, 7, 3, 1};

        
        ordenarMano(mano);

       
        System.out.println("Mano ordenada por valor:");
        for (int carta : mano) {
            System.out.print(carta + " ");
        }

       
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] manoConPalos = asignarPalos(mano, palos);

       
        System.out.println("\nMano con palos:");
        for (int i = 0; i < manoConPalos.length; i++) {
            System.out.print(manoConPalos[i] + " ");
        }
    }

    private static void ordenarMano(int[] mano) {
        boolean hayCambios = true;
        while (hayCambios) {
            hayCambios = false;
            for (int i = 0; i < mano.length - 1; i++) {
                if (mano[i] > mano[i + 1]) {
                    int temp = mano[i];
                    mano[i] = mano[i + 1];
                    mano[i + 1] = temp;
                    hayCambios = true;
                }
            }
        }
    }

    private static String[] asignarPalos(int[] mano, String[] palos) {
        String[] manoConPalos = new String[mano.length];
        for (int i = 0; i < mano.length; i++) {
            manoConPalos[i] = mano[i] + " de " + palos[i % palos.length];
        }
        return manoConPalos;
    }
}