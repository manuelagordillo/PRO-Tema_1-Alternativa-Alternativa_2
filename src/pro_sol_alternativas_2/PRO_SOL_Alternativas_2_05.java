
import java.util.Scanner;

/*

package pro_sol_alternativas_2;

/**
 * Desarrolla un algoritmo que, dado el número de una estación (1=Primavera, 
 * 2=Verano, 3=Otoño, 4=Invierno), muestre su nombre usando según

 * @author manuela
 */
public class PRO_SOL_Alternativas_2_05
{
     public static void main(String[] args)
    {
        int numero ; 
        Scanner scanner = new Scanner( System.in) ;
        String estacion = "";
        
        System.out.print("Introduzca el numero de la estación: ");
        numero = scanner.nextInt() ;
        
        switch( numero) 
        {
        case 1: 
                estacion = "Primavera" ;
                break ;
                
        case 2: 
                estacion = "Verano" ;
                break ;
                
        case 3: 
                estacion = "Otoño" ;
                break ;                
        
        case 4: 
                estacion = "Invierno" ;
                break ;                                
        }
        
        System.out.println("La estación es: " + estacion);
    }
}
