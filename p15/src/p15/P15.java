package p15;

import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MATRIZ M_JUEGO = new MATRIZ();
        MATRIZ M_SOL = new MATRIZ(true);
        UI inter = new UI();
        inter.imprimirTablero(M_JUEGO.get());
        System.out.println(M_JUEGO.getBlanco());
        int moviento;
        while (!M_JUEGO.equals(M_SOL)) {
            System.out.println(M_JUEGO.getBlanco());
            System.out.println("Pasos hechos: " + M_JUEGO.getNPasos());
            System.out.println("Para moverte (8 6 2 4 )");
            moviento = sc.nextInt();
            M_JUEGO.Movimiento(moviento);
            inter.imprimirTablero(M_JUEGO.get());

        }
        System.out.println("lo solucion en: " + M_JUEGO.getNPasos());

    }

}
