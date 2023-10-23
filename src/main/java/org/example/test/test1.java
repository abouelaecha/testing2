package org.example.test;

public class test1 {
    public static void main(String[] args) {

/*
        //Instanciation (Création) des trois
        // objets o1 , o2 and o3
        Testing o1 = new Testing();
        Testing o2 = new Testing(11, "Salle Informatique");
        Testing o3 = new Testing("Salle des cours");
*/
        //Affichage des valeurs des attributs des
        // objets o1,2 and 3*/
/*
        System.out.println(o1.id + " " + o1.name);
        System.out.println(o2.id + " " + o2.name);
        System.out.println(o3.id + " " + o3.name);
*/
        System.out.println("******************************** 1");

        //fonction

        Testing calculator = new Testing();
        int result = calculator.somme(5, 4);
        System.out.println(result);

        System.out.println("******************************** 2");

        //Condition:

        int x = 3;

        if (x > 5) {
            System.out.println("kbir");
        } else {
            System.out.println("sgir");
        }

        System.out.println("******************************** 3");

        // For loop:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("******************************** 4");

        // While loop
        while (x > 0) {
            System.out.println(x);
            x--;
        }

        System.out.println("********************************");
        // type dyal l’array:

        int[] a = new int[5];
        String[] smiyat = {"Ahmed", "Fatima", "Youssef"};

        a[0] = 15;
        smiyat[1] = "Karim";

        System.out.println(a[0]);
        System.out.println(smiyat[1]);


        System.out.println("********************************");
        // For loop
        int[] a1 = new int[5];
        a1[0] = 1;
        a1[1] = 11;
        a1[2] = 12;
        a1[3] = 13;
        a1[4] = 14;

        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }


        System.out.println("********************************");
        // For-each loop

        String[] smiyat1 = {"Ahmed", "Fatima", "Youssef"};
        for (String s : smiyat1) {
            System.out.println(s);
        }

        System.out.println("********************************");
        int[] b = new int[5];
        b[0] = 1;
        b[1] = 11;
        b[2] = 12;
        b[3] = 13;
        b[4] = 10;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 10) {
                System.out.println("L9it l 10 fi position " + i);
            }
        }
/*
        System.out.println("********************************");

        Arrays.sort(a);
*/
        System.out.println("********************************");

      //Khassk tdefini new array ou t9der tdir copie mn les deux arrays fih:
        int[] k = new int[5];
        k[0] = 1;
        k[1] = 11;
        k[2] = 12;
        k[3] = 13;
        k[4] = 14;
        int[] v = new int[5];
        v[0] = 1;
        v[1] = 11;
        v[2] = 12;
        v[3] = 13;
        v[4] = 14;

        int[] c = new int[k.length + v.length];
        System.arraycopy(k, 0, c, 0, k.length);
        System.arraycopy(v, 0, c, v.length, v.length);

        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }

    }
}
