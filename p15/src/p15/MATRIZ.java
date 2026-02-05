/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p15;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class MATRIZ {

    private String[][] M;
    private int tamaño = 4;
    private int x;
    private int y;
    private int pasos = 0;

    //SOL
//    public MATRIZ(boolean A) {
//        if (!A){
//        /// quiero que el 6 este en la posicion x = 1 y=2
//        /// el resto de numeros no me importan 
//        }else{
//        M = new String[tamaño][tamaño];
//        int contador_p = 1;
//
//        for (int i = 0; i < M.length; i++) {
//            for (int j = 0; j < M[i].length; j++) {
//
//                if (i == M.length - 1 && j == M[i].length - 1) {
//                    M[i][j] = " ";
//                    x = i;
//                    y = j;
//                } else {
//                    M[i][j] = String.valueOf(contador_p);
//                    contador_p++;
//                }
//            }
//        }
//        }
//    }
    public MATRIZ(boolean A) {

        M = new String[tamaño][tamaño];
        int contador_p = 1;

        if (!A) {

//            for (int i = 0; i < M.length; i++) {
//                for (int j = 0; j < M[i].length; j++) {
//                    if (i == tamaño - 1 && j == tamaño - 1) {
//                        M[i][j] = " ";
//                        x = i;
//                        y = j;
//                    } else {
//                        M[i][j] = String.valueOf(contador_p);
//                        contador_p++;
//                    }
//                }
//            }
            String[] valores = {
                "1", "2", "3", "4",
                "5", "6", "7", "8",
                "9", "10", "11", "12",
                "15", "13", "14", " "
            };

            int k = 0;
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    M[i][j] = valores[k++];
                }
            }

            x = 3;
            y = 0;
        } else {
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M[i].length; j++) {
                    if (i == tamaño - 1 && j == tamaño - 1) {
                        M[i][j] = " ";
                        x = i;
                        y = j;
                    } else {
                        M[i][j] = String.valueOf(contador_p);
                        contador_p++;
                    }
                }
            }

        }
    }

    // JUEGO
    public MATRIZ() {
        M = new String[tamaño][tamaño];

        int contador_p = 1;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                if (i == M.length - 1 && j == M[i].length - 1) {
                    M[i][j] = " ";
                    x = i;
                    y = j;
                } else {
                    M[i][j] = String.valueOf(contador_p);
                    contador_p++;
                }
            }
        }
        Random rand = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);

        int a;
        System.out.println("moviendo aleatoriamente");
        for (int i = 0; i < 100000000; i++) {
            a = rand.nextInt(lista.size());

            Movimiento_al(a);

        }

    }

    public void imprimirTablero() {

        int x = M.length;

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < x; j++) {
                System.out.print("+----");
            }
            System.out.println("+");

            for (int j = 0; j < x; j++) {

                if (M[i][j].isEmpty()) {
                    System.out.print("|    ");
                } else {
                    System.out.printf("| %2s ", M[i][j].trim());
                }
            }
            System.out.println("|");
        }

        for (int j = 0; j < x; j++) {
            System.out.print("+----");
        }
        System.out.println("+");
    }

    public String[][] get() {
        return M;
    }

    public int getNPasos() {
        return pasos;
    }

    private void Change(int j, int p) {
        String temp = M[p][j];
        M[p][j] = M[x][y];
        M[x][y] = temp;
        x = p;
        y = j;

    }

    public void Movimiento(int direccion) {
        System.out.println("validando movimiento");

        if (direccion == 2) {
            if (x > 0) {
                Change(y, x - 1);
            } else {
                System.out.println("movimiento invalido");
            }
        }

        if (direccion == 8) {
            if (x < tamaño - 1) {
                Change(y, x + 1);
            } else {
                System.out.println("movimiento invalido");
            }
        }

        if (direccion == 6) {
            if (y > 0) {
                Change(y - 1, x);
            } else {
                System.out.println("movimiento invalido");
            }
        }

        if (direccion == 4) {
            if (y < tamaño - 1) {
                Change(y + 1, x);
            } else {
                System.out.println("movimiento invalido");
            }
        }
        imprimirTablero();
        pasos++;
    }

    public int[] getBlanco() {
        int[] blanco = new int[2];
        blanco[0] = x;
        blanco[1] = y;
        return blanco;
    }

    public void Movimiento_al(int direccion) {

        if (direccion == 2) {
            if (x > 0) {
                Change(y, x - 1);
            }
        }

        if (direccion == 8) {
            if (x < tamaño - 1) {
                Change(y, x + 1);
            }
        }

        if (direccion == 6) {
            if (y > 0) {
                Change(y - 1, x);
            }
        }

        if (direccion == 4) {
            if (y < tamaño - 1) {
                Change(y + 1, x);
            }
        }

    }

    public int[] buscarN(int b) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                if (M[i][j].equals(String.valueOf(b))) {

                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private void sacarDelCentro() {

        // Mientras siga en el centro
        while (x >= 1 && x <= 2 && y >= 1 && y <= 2) {

            // Prioridad: subir
            if (x > 0) {
                Movimiento_al(2); // arriba
            } // Si no puede subir, bajar
            else if (x < 3) {
                Movimiento_al(8); // abajo
            } // Si no, izquierda
            else if (y > 0) {
                Movimiento_al(6); // izquierda
            } // Última opción: derecha
            else if (y < 3) {
                Movimiento_al(4); // derecha
            }
        }
    }

    public void GirarH() {
        // COLUMNA IZQUIERDA
        if (y == 0) {
            if (x < 3) {
                Movimiento(8); // abajo
            } else {
                Movimiento(4); // derecha
            }

            return;
        }

        // FILA INFERIOR
        if (x == 3) {
            if (y < 3) {
                Movimiento(4); // derecha
            } else {
                Movimiento(2); // arriba
            }
            return;
        }

        // COLUMNA DERECHA
        if (y == 3) {
            if (x > 0) {
                Movimiento(2); // arriba
            } else {
                Movimiento(6); // izquierda
            }
            return;
        }

        // FILA SUPERIOR
        if (x == 0) {
            if (y > 0) {
                Movimiento(6); // izquierda
            } else {
                Movimiento(8); // abajo
            }
            return;
        }
    }

    public void Moverh() {

        if (x >= 1 && x <= 2 && y >= 1 && y <= 2) {
            sacarDelCentro();
        }

        while (!(x == 3 && y == 3)) {
            GirarH();

        }
    }

    public boolean winner() {
        MATRIZ M_SOL = new MATRIZ(true);
        return this.M.equals(M_SOL);
    }

    @Override
    public boolean equals(Object obj) {
        MATRIZ otra = (MATRIZ) obj;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                String a = M[i][j].trim();
                String b = otra.M[i][j].trim();
                if (!a.equals(b)) {

                    return false;
                }
            }
        }
        return true;
    }

}
