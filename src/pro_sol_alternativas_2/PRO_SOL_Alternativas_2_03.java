
package pro_sol_alternativas_2;

import java.util.Scanner;

/**
 * Crea un algoritmo que reciba un número del 1 al 12 y muestre el nombre del 
 * mes correspondiente con la orden según
 * 
 * @author manuela
 */
public class PRO_SOL_Alternativas_2_03
{
    public static void main(String[] args)
    {
        int numero ; 
        Scanner entrada = new Scanner( System.in) ;
        
        System.out.print("Introduzca el número del mes: ");
        numero = entrada.nextInt() ;
        
        
        switch( numero)
        {
        case 1: 
                    System.out.println("Enero");
                    break ;
        case 2: 
                    System.out.println("Febrero");
                    break ;
        case 3: 
                    System.out.println("Marzo");
                    break ;                    
        case 4: 
                    System.out.println("Abril");
                    break ;
        case 5: 
                    System.out.println("Mayo");
                    break ;
        case 6: 
                    System.out.println("Junio");
                    break ;                                        
        case 7: 
                    System.out.println("Julio");
                    break ;
        case 8: 
                    System.out.println("Agosto");
                    break ;
        case 9: 
                    System.out.println("Septiembre");
                    break ;
        case 10: 
                    System.out.println("Octubre");
                    break ;                    
        case 11: 
                    System.out.println("Noviembre");
                    break ;
        case 12: 
                    System.out.println("Diciembre");
                    break ;
        default:
                    System.out.println("Numero introducido no está entre 1 y 12");
        }
    }
}
