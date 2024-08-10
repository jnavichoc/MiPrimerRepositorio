/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedionotas;

import java.util.Scanner;

/**
 * Esta es la clase principal que se encarga de calcular el promedio 
 * de las notas 
 * @author Jaquelin Navichoc
 * @since 31-07-2024
 **/

public class PromedioNotas {

    /**
     * Metodo principal de la clase que se encarga de
     * procesar el promedio de cuatro notas.
     * 
     * @param args que representan un listado de valores 
     * al momento de ejecutar el programa
     * @since 31-07-2024
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se declara la variable scan para leer datos de la lÃ­nea de comandos.
        Scanner scan = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3; 
        int nota4;
        
        
       System.out.println("Ingrese Primer nota: ");
       nota1 = scan.nextInt();
       System.out.println("Ingrese Segunda nota");
       nota2 = scan.nextInt();
       System.out.println("Ingrese Tercer Nota: ");
       nota3 = scan.nextInt();
       System.out.println("Ingrese Cuarta Nota: ");
       nota4 = scan.nextInt();
       //Calculo del promedio con las notas que se ingresaran 
       float promedio = (nota1 +nota2 + nota3 + nota4)/4;
       
       System.out.println("Su promedio es: "+ promedio); 
    }
    
}
