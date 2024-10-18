// @author Alexandro Stefan Dezso Florea

import java.util.Scanner;

public class UT2Problema5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota = 0, notaMedia = 0, notaMediaAprobados = 0, notaMediaSuspensos = 0, notaAlta = 0, notaBaja = 10;
        
        int alumnos = 0, alumnosAprobados = 0, alumnoSuspenso = 0, mediaExcelente = 0, mediaNotable = 0, mediaBien = 0, mediaSuficiente = 0, mediaInsuficiente = 0;

        System.out.print("-------------------------------------------\n");
        System.out.print("--        ESTADÍSTICAS DE NOTAS          --\n");
        System.out.print("-------------------------------------------\n");

        while (nota >= 0) {
            System.out.print("\nIntroduzca una nota (valor negativo para finalizar el programa): ");
            if (input.hasNextDouble()) {
                nota = input.nextDouble();
                input.nextLine();

                if (nota > 10) {
                    System.out.println("Error nota invaálida");
                    continue;
                }

                if (nota <= 10 && nota >= 0) {
                    alumnos++;
                    notaMedia = notaMedia + nota;
                    if (nota < notaBaja) {
                        notaBaja = nota;
                    }
                    if (nota > notaAlta) {
                        notaAlta = nota;
                    }
                    
                    if (nota <= 10 && nota >= 9) {
                        mediaExcelente++;
                    }
                    if (nota < 9 && nota >= 7) {
                        mediaNotable++;
                    }
                    if (nota < 7 && nota >= 6) {
                        mediaBien++;
                    }
                    if (nota < 6 && nota >= 5) {
                        mediaSuficiente++;
                    }
                    if (nota < 5 && nota >= 0 ) {
                        mediaInsuficiente++;
                    }
                }

                if (nota >= 5 && nota <= 10) {
                    alumnosAprobados++;
                    notaMediaAprobados = notaMediaAprobados + nota;
                }
                if (nota < 5 && nota >= 0) {
                    alumnoSuspenso++;
                    notaMediaSuspensos = notaMediaSuspensos + nota;
                }

            } else {
                System.out.println("Error nota no válida");
                input.nextLine();
            }
        }
        if (alumnos == 0) {
            System.out.println("Error no hay alumnos introducidos");
        } else {
            double porcentajeAprobados = (alumnosAprobados * 100) / alumnos;
            double porcentajeSuspensos = (alumnoSuspenso * 100) / alumnos;
            
            double porcentajeExcelente = (mediaExcelente * 100) / alumnos;
            double porcentajeNotable = (mediaNotable * 100) / alumnos;
            double porcentajeBien = (mediaBien * 100) / alumnos;
            double porcentajeSuficiente =(mediaSuficiente * 100) / alumnos;
            double porcentajeInsuficiente = (mediaInsuficiente * 100) / alumnos;
            
            System.out.println("--------------------------------------------------------");
            
            System.out.printf("\n-Se han evaluado un total de %d \n", alumnos);
            System.out.printf("-La nota media del curso ha sido %.2f\n", notaMedia / alumnos);
            
            System.out.printf("\n-Han aprobado un total de %d, lo que supone un %.2f %% del total\n", alumnosAprobados, porcentajeAprobados);
            System.out.printf("-La nota media de los alumnos aprobados ha sido %.2f\n", notaMediaAprobados / alumnosAprobados);
            
            System.out.printf("\n-Han suspendido un total de %d, lo que supone un %.2f %% del total\n", alumnoSuspenso, porcentajeSuspensos);
            System.out.printf("-La nota media de los alumnos suspensos ha sido %.2f\n", notaMediaSuspensos / alumnoSuspenso);
            
            System.out.printf("\n-La nota más alta es %.2f\n", notaAlta);
            System.out.printf("-La nota más baja es %.2f\n", notaBaja);
            
            System.out.printf("\n-La media de Excelentes es %d que representa un %.2f %% de 100%%\n",mediaExcelente, porcentajeExcelente);
            System.out.printf("-La media de Notables es %d que representa un %.2f %% de 100%%\n", mediaNotable, porcentajeNotable);
            System.out.printf("-La media de Bien es %d que representa un %.2f %% de 100%%\n", mediaBien, porcentajeBien);
            System.out.printf("-La media de Suficientes es %d que representa un %.2f %% de 100%%\n", mediaSuficiente, porcentajeSuficiente);
            System.out.printf("-La media de Insuficientes es %d que representa un %.2f %% de 100%%\n", mediaInsuficiente, porcentajeInsuficiente);
        }
    }
}
