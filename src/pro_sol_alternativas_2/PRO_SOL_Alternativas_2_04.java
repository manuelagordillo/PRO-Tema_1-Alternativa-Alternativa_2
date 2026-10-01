
package pro_sol_alternativas_2;

import java.util.Scanner;

/**
 * Haz un algoritmo donde, según el tipo de usuario introducido 
 * (1=Administrador, 2=Invitado, 3=Editor), muestre los permisos asignados.
 * @author manuela
 */
public class PRO_SOL_Alternativas_2_04
{
    public static void main(String[] args)
    {
        int numero ; 
        Scanner entrada = new Scanner( System.in) ;
        
        System.out.print("Introduzca el número del mes: ");
        numero = entrada.nextInt() ;
        
        switch( numero)
        {
        case 1: // Administrador
                System.out.println("Permisos de administrador");
                break ;
                
        case 2: // Invitado
                System.out.println("Permisos de invitado");
                break ;
                
        case 3: // Editor
                System.out.println("Permisos de editor");
                break ;
        }
        
    }
}
