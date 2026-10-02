
package pro_sol_alternativas_2;

import java.util.Scanner;

/**
 * Solicita una opción: 1 para sumar los números del 1 al N, 2 para multiplicar 
 * los números del 1 al N, 3 para restar el primero y último elemento de una 
 * serie introducida.
 * 
 * @author manuela
 */
public class PRO_SOL_Alternativas_2_18
{
    public static void main(String[] args)
    {
        int opcion, numero, primero, ultimo ; 
        int suma = 0, multi =1, resultado = 0 ;
        Scanner entrada = new Scanner( System.in) ;
        
        System.out.print("Introduzca un número: ");
        numero = entrada.nextInt() ;
        
        System.out.println("       MENÚ ");
        System.out.println("1.- Sumar 1..N");
        System.out.println("2.- Multiplicar 1..N");
        System.out.println("3.- Restar primero - último" );
               
        
        System.out.print("Introduzca una opción: ");
        opcion = entrada.nextInt() ;
        
        
        switch( opcion)
        {
        case 1:
            for( int i = 1; i <= numero; i++)
            {
                suma = suma + i ;
            }
            resultado = suma ;
            break ;
            
        case 2:
            for( int i = 1; i <= numero; i++)
            {
                multi = multi * i ;
            }
            resultado = multi ;
            break ;
            
        case 3:
            System.out.print("Introduzca el primer numero: ");
            primero = entrada.nextInt() ;
            
            System.out.print("Introduzca el último numero: ");
            ultimo = entrada.nextInt() ;
            
            resultado = primero - ultimo ;
            break;
            
        default:
            System.out.println("Opción incorrecta");
              
        }
        
        
        System.out.println("Resultado según la opcion elegida es: " + resultado);
    }
}
