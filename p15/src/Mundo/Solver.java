package Mundo;

import Mundo.MATRIZ;


public class Solver {

    public static void ordenar(MATRIZ O) {
        O.setpasos();
        orden_l(O);
        System.out.println("ya quedo la l ");
        gusano(O);
        
    }  
    public static void desordenar(MATRIZ O) {
        O.aletorio();
    
    
    }

    public static void orden_l(MATRIZ O) {

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

            while (encontrado[0] != 0 || encontrado[1] != 1 || O.getBlanco()[0] != 0 || O.getBlanco()[1] != 0) {
                O.GirarH();

                encontrado = O.buscarN(6);
            }
            System.out.println("antes de poner el 6");

            O.Movimiento(8);

            O.Movimiento(4);

            O.Movimiento(2);

            O.Moverh();

        }

        System.out.println("inciamos con el 7");

        encontrado = O.buscarN(7);

        if (encontrado[0] == 1 && encontrado[1] == 2) {
            System.out.println("en posicion");
        } else {
            if ((encontrado[0] == 1 || encontrado[0] == 2) && (encontrado[1] == 1 || encontrado[1] == 2)) {

                System.out.println("ESTA ADENTRO");

                if ((encontrado[0] == 2 && encontrado[1] == 1)) {
                    System.out.println("esta donde deberia ir el 10");

                    System.out.println("posiocion inconrrecta");
                    while ((O.getBlanco()[0] != 3 || O.getBlanco()[1] != 1)) {
                        System.out.println("girando hasta que el blanco este en x 3  y 1");
                        O.GirarH();

                        System.out.println(O.getBlanco()[0] + "" + O.getBlanco()[1]);

                    }

                    System.out.println("el blanco esta en: ");

                    System.out.println(O.getBlanco()[0] + " " + O.getBlanco()[1]);

                    System.out.println("blanco en posicion");

                    O.Movimiento(2);
                    O.Movimiento(6);

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

                    int[] p = O.buscarN(7);
                    System.out.println("el 6 esta en: ");
                    System.out.println(p[0] + " " + p[1]);
                    O.Movimiento(6);
                    O.Movimiento(8);

                }

            }
            encontrado = O.buscarN(7);

            System.out.println("el 7 esta en:  " + encontrado[0] + " " + encontrado[1]);

            while (encontrado[0] != 1 || encontrado[1] != 3 || O.getBlanco()[0] != 0 || O.getBlanco()[1] != 2) {
                O.GirarH();

                encontrado = O.buscarN(7);
            }

            System.out.println("el 7 esta en:  " + encontrado[0] + " " + encontrado[1]);
            System.out.println("el blanco esta en:  " + O.getBlanco()[0] + " " + O.getBlanco()[1]);

            O.Movimiento(8);

            O.Movimiento(4);

            System.out.println("el 7 esta en:  " + encontrado[0] + " " + encontrado[1]);
            System.out.println("el blanco esta en:  " + O.getBlanco()[0] + " " + O.getBlanco()[1]);

            O.Moverh();

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
                    System.out.println("el 10 esta en: ");
                    System.out.println(p[0] + " " + p[1]);

                    O.Movimiento(6);
                    O.Movimiento(8);

                }

            }
            encontrado = O.buscarN(10);
            while (encontrado[0] != 2 || encontrado[1] != 0 || O.getBlanco()[0] != 3 || O.getBlanco()[1] != 1) {
                O.GirarH();

                encontrado = O.buscarN(10);
                System.out.println(encontrado[0] + " " + encontrado[1]);
            }

            O.Movimiento(2);

            O.Movimiento(6);

            O.Moverh();

        }
    }

    public static void gusano(MATRIZ O) {

  

        int[] encontrado;

        meterGusano(O, 1, 5);
        meterGusano(O, 2, 1);
        meterGusano(O, 3, 2);
        meterGusano(O, 4, 3);

        meterGusano(O, 8, 4);
        meterGusano(O, 12, 8);

        meterGusano(O, 15, 12);

        meterGusano(O, 14, 15);
        meterGusano(O, 13, 14);
        meterGusano(O, 9, 13);

        encontrado = O.buscarN(1);
        while (encontrado[0] != 0 || encontrado[1] != 0 || O.getBlanco()[0] != 3 || O.getBlanco()[1] != 3) {

            O.GirarH();
            encontrado = O.buscarN(1);

        }

    }

    public static void meterGusano(MATRIZ O, int a, int b) {
     

        System.out.println("vamos con el " + a);
        System.out.println("buscanco el  ");
        int[] encontrado = O.buscarN(a);

        if (encontrado[0] != 2 || encontrado[1] != 2) {

            while (encontrado[0] != 2 || encontrado[1] != 3 || O.getBlanco()[0] != 3 || O.getBlanco()[1] != 2) {
                O.GirarH();
                encontrado = O.buscarN(a);
            }

            if (O.buscarN(1)[0] == 3 && O.buscarN(1)[1] == 3) {
                System.out.println("caso especial");

                while (encontrado[0] != 3 || encontrado[1] != 2 || O.getBlanco()[0] != 2 || O.getBlanco()[1] != 3) {
                    O.GirarH();
                    encontrado = O.buscarN(a);
                }

                System.out.println("vamos a meter a " + a + "en " + b);

                O.Movimiento(6);
                O.Movimiento(8);
                System.out.println("terminacion de caso especial");

            } else {

                O.Movimiento(2);
                O.Movimiento(4);
            }
        }

        encontrado = O.buscarN(b);
        while (encontrado[0] != 1 || encontrado[1] != 3 || O.getBlanco()[0] != 2 || O.getBlanco()[1] != 3) {

            O.GirarH();
            encontrado = O.buscarN(b);

        }

        System.out.println("el " + a + " esta en posicion para gusano ");
        System.out.println("el " + b + "  esta en posicion pora gusano");
        O.Movimiento(6);
        O.Movimiento(8);
    }

}
