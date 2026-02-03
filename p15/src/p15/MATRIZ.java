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
    public MATRIZ(boolean A) {
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
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);
        lista.add(8);
        lista.add(6);
        lista.add(4);
        lista.add(2);

        int a;
        for (int i = 0; i < 100000; i++) {
            a = rand.nextInt(lista.size());

            Movimiento_al(a);
        }

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
        pasos++;
    }
    
    public String getBlanco(){
    
        return ("x : " + x + " y: " + y  );
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
