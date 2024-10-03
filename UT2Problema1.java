//@author Alexandro Stefan Dezso Florea
import java.util.Scanner;

public class UT2Problema1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int salarioMin, salarioMax,ayuda;
        salarioMin = 10000;
        salarioMax = 40000;
        ayuda = 15000;
        
        System.out.print("Introduzca su salario bruto mensual en euros: ");
        int salario = input.nextInt();
        
        if (salario <= 0) {
            System.out.println("Dato introducido erroneo, el dato debe ser válido.");     
        }
        else    {
            if (salario >= salarioMin && salario <= salarioMax) {
               
                int salarioTot = salario * 12;
                double impuestos = salarioTot * 0.2;
                System.out.printf("Su salario anual es: %d € %nDebería pagar: %.2f € \n",salarioTot,impuestos);
                
                if (salario < ayuda){
                    double ayudaTotal = salario * 0.15;
                  
                    System.out.printf("Recibes una ayuda de: %.2f €\n",ayudaTotal);
                }
                
            }else if (salario <= salarioMin) {
                int salarioTot = salario * 12;
                System.out.printf("Su salario anual es: %d € \nDebería pagar: 0 € \n",salarioTot );
                
                if (salario < ayuda){
                    double ayudaTotal = salario * 0.15;
                    
                    System.out.printf("Recibes una ayuda de: %.2f €\n",ayudaTotal);
                }
                 
            }else{
                int salarioTot = salario * 12;
                double impuestos = salarioTot * 0.3;
                System.out.printf("Su salario anual es: %d € \nDebería pagar: %.2f € \nNo recibes ayuda\n",salarioTot,impuestos);
            }
        }
    }
}
