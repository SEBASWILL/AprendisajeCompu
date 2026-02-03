/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p15;

/**
 *
 * @author PC
 */
public class UI {

    public void imprimirTablero(String[][] M) {

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

}
