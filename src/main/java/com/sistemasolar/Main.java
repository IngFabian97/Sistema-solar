package com.sistemasolar;

public class Main {
    public static void main(String[] args) {
    Planeta planeta = new Planeta("Tierra", 1, 1000, 35000, 1, true, Planeta.tipoPlaneta.TERRESTRE);
    Planeta planeta1 = new Planeta("Jupiter", 98, 10000, 40000, 6, false, Planeta.tipoPlaneta.GASEOSOS);

    planeta.imprimirPantalla();
    planeta1.imprimirPantalla();

    System.out.println("La densidad del planeta " + planeta.getNombre() + " " + planeta.densidadPlaneta(3500));
    System.out.println("Es un planeta exterior: " + planeta.planetaExterior(1));
       
    }
}