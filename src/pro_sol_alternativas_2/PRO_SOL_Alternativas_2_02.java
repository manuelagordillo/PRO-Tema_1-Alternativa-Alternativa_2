
package pro_sol_alternativas_2;

import java.util.Scanner;

/**
 * Realiza un algoritmo que, al recibir una nota del 0 al 10, imprima la 
 * calificación textual: "Suspenso", "Aprobado", "Notable" o "Sobresaliente", empleando según.
 * 
 * @author manuela
 */
public class PRO_SOL_Alternativas_2_02
{
     public static void main(String[] args)
    {
        int nota ; 
        float notaEntrada ;
        Scanner entrada = new Scanner( System.in) ;
        
        System.out.print("Introduzca un número: ");
        notaEntrada = entrada.nextFloat() ;
        
        // Validar que la nota esté dentro del rango permitido
        if (notaEntrada < 0 || notaEntrada > 10) 
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        else 
        {
            nota = (int) notaEntrada ;
        
            switch (nota) 
            {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                    System.out.println("Calificación: Suspenso");
                    break;
            case 5:
            case 6:
                    System.out.println("Calificación: Aprobado");
                    break;
            case 7:
            case 8:
                    System.out.println("Calificación: Notable");
                    break;
            case 9:
            case 10:
                    System.out.println("Calificación: Sobresaliente");
                    break;
            }
        }
    }
}
