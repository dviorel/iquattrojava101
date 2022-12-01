package bo.gob.impuestos.java11.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Prueba {

//    int edad;

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(4);
        List<Integer> numeros2 = new LinkedList<>();
        numeros2.add(5);
        numeros2.add(4);

        Persona p = new Persona("Danny");

        Persona x = new Persona("Danny");

        System.out.println(p.hashCode());
        System.out.println(x.hashCode());
        if (true) {
            return;
        }
//        int edad = 20l;
        long edad = 2000000000000000001L;
        int edadInt = (int)edad;
        System.out.println(edadInt);
//        float x = 3.14F;
//        System.out.println(4.0/3.0);
//        System.out.println(4/3);
//        System.out.println(5 * 1.0 /3);
        //System.out.println(3.4 % 2.1);
        // System.out.println(4 % 2);
        int numero = 100;
        System.out.println(numero & 1);
        System.out.println(numero = 100);
        System.out.println(numero = 101);
        System.out.println(3 + (4 * 2));
        int var1 = 4;
        var1 += 3 * 6 + 2;
        System.out.println(var1);
//        edad = "15";
//        System.out.println(edad.getClass().getName());
//        var edad = 19;
        var var = 19;
        final int edadMinima = 18;
        Prueba prueba = new Prueba();
//        if (esPermitido(var, edadMinima)) {
//        if (esPermitido(edad, edadMinima)) {
//            System.out.println("Permitido");
//        } else {
//            System.out.println("No permitido");
//        }
         final int mayoriaDeEdad = 18;
         boolean esMayorDeEdad = edad >= mayoriaDeEdad;
         // if(edad >= mayoriaDeEdad){
        if(esMayorDeEdad){
             System.out.println("Permitido");
         }
         else{
             System.out.println("No permitido");
         }
        String valorSwitch = "2";
        switch (valorSwitch){
            case "1":
                System.out.println("Es 1");
                break;
            case "2":
                System.out.println("Es 2");
//                break;
            case "3":
                System.out.println("Es 3");
                break;
            default:
                System.out.println("Default");
                break;
        }
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
//        int i = 1;
//        //while (i <= 10){
//        for (;i <= 10;i++){
//            System.out.println(i);
//        }
//        i = 1;
//        while(i<=10){
//            System.out.println(i);
//            if (i == 4){
//                // break;
//                continue;
//            }
//            i++;
//        }
    }
    static boolean esPermitido(int edad, int edadMinima){
        return edad > edadMinima;
    }

}
