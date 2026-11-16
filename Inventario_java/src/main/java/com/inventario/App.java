package com.inventario;

public class App {

    public static int restar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        int resultado = restar(145, 68);

        System.out.println("Resultado de la resta: " + resultado);
    }
}