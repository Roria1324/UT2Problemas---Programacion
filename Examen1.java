import java.util.Scanner;

public class Pruebas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int filas = 10 * 2;
        
        //PIRÁMIDES
        for (int i = 1; i < 10; i++) {
            System.out.printf("Tabla del %d \n", i);
            for (int j = 0; j < 10; j++) {
                System.out.println( i + "x" + j + "=" + (j*i));
            } 
        }
         
        
        //Cuadrado
        for (int i = 1; i < filas; i++) {
            for (int j = 0; j <= filas - 1; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
        //Triangulo rectángulo derecha
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                if (j < i) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }System.out.println();
        }
        
    

        for (int i = 0; i < filas; i++) {
            for (int j = i; j < filas; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
         
        for (int i = 1; i <= filas ; i++ ) {
            for (int j = 0; j < (filas - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }System.out.println();
        }
        
        for (int i = 1; i <= filas ; i= i+2 ) {
            for (int j = 0; j < (filas - i)/2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }System.out.println();
        }
        
        
        for (int i = 1; i <= filas ; i= i+2 ) {
            for (int j = 0; j < (filas - 3)/2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }System.out.println();
        }
        
        
       
        for (int i = 1; i <= filas; i++) {
            // Imprimir espacios en blanco
            for (int j = i; j < filas; j++) {
                System.out.print("  ");
            }

            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" *");
            }

            // Cambiar de línea
            System.out.println();
        }
    }
}
