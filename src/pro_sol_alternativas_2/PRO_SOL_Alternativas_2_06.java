
package pro_sol_alternativas_2;

import java.util.Scanner;

/**
 * Escribe un algoritmo que pida seleccionar un método de pago (1=Efectivo, 
 * 2=Tarjeta, 3=Transferencia) y muestre instrucciones según el método elegido
 * 
 * @author manuela
 */
public class PRO_SOL_Alternativas_2_06
{
    public static void main(String[] args)
    {
        int tipo ; 
        Scanner entrada = new Scanner( System.in) ;
        
        System.out.println("       MENÚ ");
        System.out.println("1.- Efectivo");
        System.out.println("2.- Tarjeta");
        System.out.println("3.- Transferencia" );
        
        System.out.print("Introduzca una opción: ");
        tipo = entrada.nextInt() ;
        
        
        switch( tipo)
        {
        case 1:
                System.out.println("Instrucciones para sacar en efectivo.");
                break ;                
                
        case 2:
                System.out.println("Instrucciones para sacar con tarjeta.");
                break ;

        case 3:
                System.out.println("Instrucicones para realizar transferencia.");
                break ;    
                
        default:
               System.out.println("Opción incorrecta");
        }
    }
}
