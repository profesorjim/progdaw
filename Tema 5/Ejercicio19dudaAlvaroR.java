import java.util.Scanner;

public class Ejercicio19dudaAlvaroR {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println ( "Programa que dibuja una piramide." );
        
        
        int altura;
        String caracter;
        
        System.out.println( "Introduce la altura: " );
        altura = s.nextInt();
        
        System.out.print("Introduce el caracter con el que quieres verla: ");
        caracter = s.next();
        
        
        int h = 1;
        int n = 0;
        int espacios = altura-1;
        
        while (h <= altura) {
            
          for (n = 1; n <= espacios; n++) {
            System.out.print(" ");
          }
        
          for (n = 1; n < h * 2; n++) {
            System.out.print(caracter);
          }
          
          System.out.println();          
          h++;
          espacios--;
        }
    }
}
