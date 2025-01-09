package com.endes;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenas dume tu DNI y tu nobmre");
        System.out.print("DNI: ");
        String DNI = sc.next();
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.println();
        DNI dni = new DNI(DNI, nombre);
        if(dni.validacion(DNI) == true) {
        	System.out.println("Su DNI ha sido validado y es correcto: " + DNI);
        }else {
        	System.out.println("Su DNI ha sido validado y es incorrecto: " + DNI);
        }
        System.out.println("validar");
    }
}
