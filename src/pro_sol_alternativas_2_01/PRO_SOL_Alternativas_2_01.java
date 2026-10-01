/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pro_sol_alternativas_2_01;

import java.util.Scanner;

/**
 * Escribe un algoritmo que, dado un número del 1 al 7, muestre el nombre 
 * correspondiente del día de la semana usando la estructura según.
 * 
 * @author manuela
 */
public class PRO_SOL_Alternativas_2_01
{
    public static void main(String[] args)
    {
        int numero ; 
        Scanner entrada = new Scanner( System.in) ;
        
        System.out.print("Introduzca un número: ");
        numero = entrada.nextInt() ;
        
        
        switch( numero)
        {
        case 1: 
                    System.out.println("Lunes");
                    break ;
        case 2: 
                    System.out.println("Martes");
                    break ;
        case 3: 
                    System.out.println("Miércoles");
                    break ;                    
        case 4: 
                    System.out.println("Jueves");
                    break ;
        case 5: 
                    System.out.println("Viernes");
                    break ;
        case 6: 
                    System.out.println("Sábado");
                    break ;                                        
        case 7: 
                    System.out.println("Domingo");
                    break ;
                    
        default:
                    System.out.println("Numero introducido no está entre 1 y 7");
        }
    }
}
