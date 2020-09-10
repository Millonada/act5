package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x;
        double y;


        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la actividad 5");
        System.out.println("Ingrese numero 1");
        x=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        y=leer.nextInt();
        System.out.println(":::::::::::::::::::::::::::::::");
        System.out.println(":: X = "+x+" ");
        System.out.println(":: Y = "+y);
        System.out.println(":: Suma = "+ suma(x,y));
        System.out.println(":: Resta = "+ resta(x,y));
        System.out.println(":: Multiplicacion = "+ multiplicacion(x,y));
        System.out.println(":: Division = "+ division(x,y));
        System.out.println(":: Modulo = "+ modulo(x,y));
        System.out.println(":::::::::::::::::::::::::::::::");




    }
    public static double suma(double x,double y){
    return x+y;
    }
    public static double resta(double x,double y){
        return x-y;
    }
    public static double multiplicacion(double x,double y){
        return x+y;
    }
    public static double division(double x,double y){
        return x/y;
    }
    public static double modulo(double x,double y){
        return x%y;
    }


}
