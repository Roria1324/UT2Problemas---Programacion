//@author Alexandro Stefan Dezso Florea
 
import java.util.Scanner;
public class UT2Problema2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double peso,altura,alturaM,imcOxf,imcEst,imcDif;
        
        System.out.print("Introduzca peso: ");
        peso = input.nextFloat();
        
        System.out.print("Introduzca altura: ");
        altura = input.nextFloat();
        
        alturaM = altura / 100;
        
        imcOxf = (1.3 * peso) / Math.pow(alturaM, 2.5);
        
        imcEst = peso / Math.pow(alturaM, 2);
        
        imcDif = imcEst - imcOxf;
        
        if (peso < 0) {
            System.out.print("Error\n");
        }else{
            
            if (( imcOxf >= 18.5 && imcOxf < 25) || (imcEst >=18.5 && imcEst < 25)){
                System.out.printf("Tu IMC (Oxford 2003) es: %.2f es un rango normal\n", imcOxf);
                if (imcDif >= 1) {
                    System.out.println("Hay descompensación\n");
                }
            
            }else if ((imcOxf >= 25 && imcOxf < 30) || (imcEst >= 25 && imcEst < 30)){
                System.out.printf("Tu IMC (Oxford 2003) es: %.2f es un rango de sobrepeso\n", imcOxf);
                if (imcDif >= 1) {
                    System.out.println("Hay descompensación\n");
                }
              
            }else if ((imcOxf < 18.5)||(imcEst < 18.5)){
                System.out.printf("Tu IMC (Oxford 2003) es: %.2f es un rango de bajo peso\n", imcOxf);
                if (imcDif >= 1) {
                    System.out.println("Hay descompensación\n");
                }
                
            }else{
                System.out.printf("Tu IMC (Oxford 2003) es: %.2f es un rango de obesidad\n", imcOxf);
                if (imcDif >= 1) {
                    System.out.println("Hay descompensación\n");
                }
            }
        }
    }
}
