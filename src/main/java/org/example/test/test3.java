package org.example.test;

public class test3 {

    public static int somme1(int a, int b) {
        return a + b;
    }

    ;

    public static int difference(int k, int b) {
        return k - b;
    }

    ;


    public static int convertirEnSecondes(int minutes) {
        return minutes * 60;
    }

    ;

    public static void verifierPositif(int numero) {
        if (numero > 0) {
            System.out.println(numero + " est un nombre positif");
        } else {
            System.out.println(numero + " n'est pas un nombre positif");
        }
    }

    ;

    public static double aireCercle(double rayon) {
        return 3.14 * rayon * rayon;
    }

    public static int maxDeTrois(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > num1) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }


    public static void main(String[] args) {
//        Testing c1 = new Testing();
//        int result = c1.somme1(5, 6);
//        int result2 = c1.difference(8, 5);
//        System.out.println(result);
//        System.out.println(result2);

        System.out.println("***************************");
        int num1 = 20, num2 = 12;
        System.out.println("la somme est " + somme1(num1, num2));
        System.out.println("la différence est " + difference(num1, num2));

        System.out.println("***************************");
        int minutes = 5;
        System.out.println(minutes + " minutes = " + convertirEnSecondes(minutes) + " secondes.");

        System.out.println("******************************");
        int monNumero = -5;
        verifierPositif(monNumero);

        System.out.println("******************************");
        double rayon = 5.5;
        System.out.println("laire du cercle est " + aireCercle(rayon));

        System.out.println("******************************");
        int a = 5, b = 11, c = 9;
        System.out.println("lz maximum est:" + maxDeTrois(a, b, c));


    }
}
