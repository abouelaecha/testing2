package org.example.test;

public class test2 {
    public static void main(String[] args) {

        //    pour les strings
        System.out.println("************************************");
        String s1 = "salam";
        String s2 = "3alik";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        System.out.println("************************************");
        String s4 = "abouelaecha";
        System.out.println(s4.substring(0, 6));

        System.out.println("************************************");
        int i = s1.length();
        System.out.println(i);

        System.out.println("************************************");
        String a = "jjjjjjj";
        String b = "fff";
        System.out.println(a.equals(b));

        System.out.println("************************************");
        int pos = s1.indexOf("lam");
        System.out.println(pos);

        System.out.println("************************************");
        //Kat9der tbeddel caractères wela substrings
        String jdid = s1.replace("s", "S");
        System.out.println(jdid);

        System.out.println("************************************");
        //Kat9der t9leb mn string l integer wela l’autres types.
        int num = Integer.parseInt("4588");
        System.out.println(num);

        System.out.println("************************************");
        //Kat9der t9leb kolchi l majuscule wela miniscule.
        // pour majuscule :
        String maj = s1.toUpperCase();
        System.out.println(maj);

        System.out.println("************************************");
        // pour miniscule :
        String min = s1.toLowerCase();
        System.out.println(min);

        System.out.println("************************************");
        //Katmsa7 les espaces li kaynin f l’awwal ou f l’akhir.
        String trimed = " salam abouelaecha";
        System.out.println(trimed.trim());

    }
}
