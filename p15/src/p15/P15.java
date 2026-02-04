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
//        int moviento;
//        while (!M_JUEGO.equals(M_SOL)) {
//            System.out.println(M_JUEGO.getBlanco());
//            System.out.println("Pasos hechos: " + M_JUEGO.getNPasos());
//            System.out.println("Para moverte (8 6 2 4 )");
//            moviento = sc.nextInt();
//            M_JUEGO.Movimiento(moviento);
//            inter.imprimirTablero(M_JUEGO.get());
        System.out.println("asi incio");
        inter.imprimirTablero(M_JUEGO.get());
        orden_3(M_JUEGO);
        inter.imprimirTablero(M_JUEGO.get());

//        }
        System.out.println("lo solucion en: " + M_JUEGO.getNPasos());

    }
    // =====================================================
    // ORDENAR SOLO 6, 7 y 10
    // =====================================================

    public static void orden_3(MATRIZ O) {

        Scanner sc = new Scanner(System.in);

        int[] encontrado;
        System.out.println("moviendo el blanco");
        O.Moverh();
        System.out.println("el blanco esta afuera");

        encontrado = O.buscarN(6);

        if (encontrado[0] == 1 && encontrado[1] == 1) {
            System.out.println("en posicion");
        } else {
            if ((encontrado[0] == 1 || encontrado[0] == 2) && (encontrado[1] == 1 || encontrado[1] == 2)) {

                System.out.println("ESTA ADENTRO");
                // caso 1 que este en 1 2 
                if ((encontrado[0] == 1 && encontrado[1] == 2)) {

                    System.out.println("posiocion inconrrecta");
                    while ((O.getBlanco()[0] != 1 || O.getBlanco()[1] != 3)) {
                        System.out.println("girando hasta que el blanco este en x 1  y 3");
                        O.GirarH();

                        System.out.println(O.getBlanco()[0] + "" + O.getBlanco()[1]);

                    }
                    System.out.println("el blanco esta en: ");

                    System.out.println(O.getBlanco()[0] + " " + O.getBlanco()[1]);

                    int[] p = O.buscarN(6);
                    System.out.println("el 6 esta en: ");
                    System.out.println(p[0] + " " + p[1]);
                    O.Movimiento(6);
                    O.Movimiento(2);

                }

                /// caso 2 que este en 2 2
            
                if ((encontrado[0] == 2 && encontrado[1] == 2)) {

                    System.out.println("posiocion inconrrecta");
                    while ((O.getBlanco()[0] != 2 || O.getBlanco()[1] != 3)) {
                        System.out.println("girando hasta que el blanco este en x 2  y 3");
                        O.GirarH();

                        System.out.println(O.getBlanco()[0] + "" + O.getBlanco()[1]);

                    }
                    System.out.println("el blanco esta en: ");

                    System.out.println(O.getBlanco()[0] + " " + O.getBlanco()[1]);

                    int[] p = O.buscarN(6);
                    System.out.println("el 6 esta en: ");
                    System.out.println(p[0] + " " + p[1]);
                    O.Movimiento(6);
                    O.Movimiento(8);

                }

                /// caso 3 que es es en 2 y 1
            
                     if ((encontrado[0] == 2 && encontrado[1] == 1)) {

                    System.out.println("posiocion inconrrecta");
                    while ((O.getBlanco()[0] != 3 || O.getBlanco()[1] != 1)) {
                        System.out.println("girando hasta que el blanco este en x 3  y 0");
                        O.GirarH();

                        System.out.println(O.getBlanco()[0] + "" + O.getBlanco()[1]);

                    }
                    System.out.println("el blanco esta en: ");

                    System.out.println(O.getBlanco()[0] + " " + O.getBlanco()[1]);

                    int[] p = O.buscarN(6);
                    System.out.println("el 6 esta en: ");
                    System.out.println(p[0] + " " + p[1]);
                    O.Movimiento(2);
                    O.Movimiento(6);

                }

            }
            encontrado = O.buscarN(6);

            while (encontrado[0] != 0 || encontrado[1] != 1) {
                O.GirarH();
                O.imprimirTablero();
                encontrado = O.buscarN(6);
            }
            System.out.println("antes de poner el 6");

            O.Movimiento(8);

            O.Movimiento(4);

            O.Movimiento(2);

            O.Moverh();

        }

        encontrado = O.buscarN(7);

        if (encontrado[0] == 1 && encontrado[1] == 2) {
            System.out.println("en posicion");
        } else {
            if ((encontrado[0] == 1 || encontrado[0] == 2) && (encontrado[1] == 1 || encontrado[1] == 2)) {

                System.out.println("ESTA ADENTRO");

                /// caso 3 que es es en 2 y 1
            
                     if ((encontrado[0] == 2 && encontrado[1] == 1)) {

                    System.out.println("posiocion inconrrecta");
                    while ((O.getBlanco()[0] != 3 || O.getBlanco()[1] != 1)) {
                        System.out.println("girando hasta que el blanco este en x 3  y 0");
                        O.GirarH();
                        O.imprimirTablero();
                        System.out.println(O.getBlanco()[0] + "" + O.getBlanco()[1]);

                    }
                    System.out.println("el blanco esta en: ");

                    System.out.println(O.getBlanco()[0] + " " + O.getBlanco()[1]);

                    O.Movimiento(2);
                    O.Movimiento(6);

                    O.imprimirTablero();

                }

                if ((encontrado[0] == 2 && encontrado[1] == 2)) {

                    System.out.println("posiocion inconrrecta");
                    while ((O.getBlanco()[0] != 2 || O.getBlanco()[1] != 3)) {
                        System.out.println("girando hasta que el blanco este en x 2  y 3");
                        O.GirarH();

                        System.out.println(O.getBlanco()[0] + "" + O.getBlanco()[1]);

                    }
                    System.out.println("el blanco esta en: ");

                    System.out.println(O.getBlanco()[0] + " " + O.getBlanco()[1]);

                    int[] p = O.buscarN(6);
                    System.out.println("el 6 esta en: ");
                    System.out.println(p[0] + " " + p[1]);
                    O.Movimiento(6);
                    O.Movimiento(8);

                }

            }
            encontrado = O.buscarN(7);
            while (encontrado[0] != 1 || encontrado[1] != 3) {
                O.GirarH();
                O.imprimirTablero();
                encontrado = O.buscarN(7);
            }

            O.imprimirTablero();
            O.Movimiento(6);
            O.imprimirTablero();
            O.Movimiento(8);
            O.imprimirTablero();
            O.Movimiento(4);
            O.imprimirTablero();
            O.Moverh();
            O.imprimirTablero();
        }
        encontrado = O.buscarN(10);

        if (encontrado[0] == 2 && encontrado[1] == 1) {
            System.out.println("en posicion");
        } else {
            if ((encontrado[0] == 1 || encontrado[0] == 2) && (encontrado[1] == 1 || encontrado[1] == 2)) {

                System.out.println("ESTA ADENTRO");

                if ((encontrado[0] == 2 && encontrado[1] == 2)) {

                    System.out.println("posiocion inconrrecta");
                    while ((O.getBlanco()[0] != 2 || O.getBlanco()[1] != 3)) {
                        System.out.println("girando hasta que el blanco este en x 2  y 3");
                        O.GirarH();

                        System.out.println(O.getBlanco()[0] + "" + O.getBlanco()[1]);

                    }
                    System.out.println("el blanco esta en: ");

                    System.out.println(O.getBlanco()[0] + " " + O.getBlanco()[1]);

                    int[] p = O.buscarN(10);
                    System.out.println("el 6 esta en: ");
                    System.out.println(p[0] + " " + p[1]);
                    O.Movimiento(6);
                    O.Movimiento(8);

                }

            }
            encontrado = O.buscarN(10);
            while (encontrado[0] != 3 || encontrado[1] != 0) {
                O.GirarH();
                O.imprimirTablero();
                encontrado = O.buscarN(10);
                System.out.println(encontrado[0] + " " + encontrado[1]);
            }

            O.imprimirTablero();
            O.Movimiento(6);
            O.imprimirTablero();
            O.Movimiento(2);
            O.imprimirTablero();
            O.Movimiento(4);
            O.imprimirTablero();
            O.Movimiento(8);
            O.imprimirTablero();

            O.Moverh();
            O.imprimirTablero();
        }

    }

}
