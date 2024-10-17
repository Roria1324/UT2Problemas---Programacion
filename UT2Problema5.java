// @author Alexandro Stefan Dezso Florea

import java.util.Scanner;

public class UT2Problema5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota = 0, notaMedia = 0, notaMediaAprobados = 0, notaMediaSuspensos = 0, porcentajeSuspensos = 0, porcentajeAprobados = 0, notaAlta = 0, notaBaja = 10;

        int alumnos = 0, alumnosAprobados = 0, alumnoSuspenso = 0;

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
            porcentajeAprobados = (alumnosAprobados * 100) / alumnos;
            porcentajeSuspensos = (alumnoSuspenso * 100) / alumnos;

            System.out.printf("-Se han evaluado un total de %d \n", alumnos);
            System.out.printf("-La nota media del curso ha sido %.2f\n", notaMedia / alumnos);
            System.out.printf("-Han aprobado un total de %d, lo que supone un %.2f %% del total\n", alumnosAprobados, porcentajeAprobados);
            System.out.printf("-La nota media de los alumnos aprobados ha sido %.2f\n", notaMediaAprobados / alumnosAprobados);
            System.out.printf("-Han suspendido un total de %d, lo que supone un %.2f %% del total\n", alumnoSuspenso, porcentajeSuspensos);
            System.out.printf("-La nota media de los alumnos suspensos ha sido %.2f\n", notaMediaSuspensos / alumnoSuspenso);
            System.out.printf("-La nota más alta es %.2f\n", notaAlta);
            System.out.printf("-La nota más baja es %.2f\n", notaBaja);
        }
    }
}
