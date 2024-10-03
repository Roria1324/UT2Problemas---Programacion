//@author Alexandro Stefan Dezso Florea
import java.util.Scanner;
public class UT2Problema3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce el año (d.C.) para saber el horóscopo chino: ");
        int year = input.nextInt();
        
        int animal = year % 12;
       
        if (year == 0) {
            System.out.println("Error");
        }else {
            switch (animal){
                case 0:
                    System.out.println("Mono");
                    break;
                case 1:
                    System.out.println("Gallo");
                    break;
                case 2:
                    System.out.println("Perro");
                    break;
                case 3:
                    System.out.println("Cerdo");
                    break;
                case 4:
                    System.out.println("Rata");
                    break;
                case 5:
                    System.out.println("Buey");
                    break;
                case 6:
                    System.out.println("Tigre");
                    break;
                case 7:
                    System.out.println("Conejo");
                    break;
                case 8:
                    System.out.println("Dragón");
                    break;
                case 9:
                    System.out.println("Serpiente");
                    break;
                case 10:
                    System.out.println("Caballo");
                    break;
                case 11:
                    System.out.println("Cabra");
                    break;    
            }
        }
    }
}
