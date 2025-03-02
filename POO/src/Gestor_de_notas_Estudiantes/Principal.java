package Gestor_de_notas_Estudiantes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        class principal {
            public static void main(String[] args) {
                GestorDeCalificaciones gestor = new GestorDeCalificaciones();
                Scanner scanner = new Scanner(System.in);
                Esudiantes estudia = new Esudiantes("pepe", 7)

                while (true) {
                    System.out.println("\nMenu:");
                    System.out.println("1. Agregar estudiante");
                    System.out.println("2. Mostrar alertas");
                    System.out.println("3. Mostrar mejor esudiante");
                    System.out.println("4. Salir");

                    int opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("\nIngrese el nombre del estudiante:");
                            String nombre = scanner.nextLine();
                            System.out.println("Ingrese el número de materias:");
                            int numMaterias = scanner.nextInt();
                            System.out.println("Ingrese el número de evaluaciones por materia:");
                            int numEvaluaciones = scanner.nextInt();

                            Esudiantes estudiante = new Esudiantes(nombre, numMaterias, numEvaluaciones);

                            for (int i = 0; i < numMaterias; i++) {
                                double[] Evaluaciones = new double[numEvaluaciones];
                                System.out.println("\nIngrese las evaluaciones para la materia " + (i + 1) + ":");
                                for (int j = 0; j < numEvaluaciones; j++) {
                                    Evaluaciones[j] = scanner.nextDouble();
                                }
                                estudiante.setCalificaciones(Evaluaciones);
                            }

                            gestor.agregarEsudiante(estudiante);
                            break;

                        case 2:
                            System.out.println("\nMostrando alertas:");
                            for (Esudiantes est : gestor.esudiante) {
                                gestor.mostrarAlerta(est);
                            }
                            break;

                        case 3:
                            Esudiantes mejor = gestor.buscarMejorEsudiante();
                            if (mejor != null) {
                                System.out.println("\nEl mejor estudiante es:");
                                mejor.mostrarCalificaciones();
                                System.out.println("Promedio general: " + mejor.calcularPromedioGeneral());
                            } else {
                                System.out.println("No hay estudiantes registrados.");
                            }
                            break;

                        case 4:
                            scanner.close();
                            return;

                        default:
                            System.out.println("Opcion invalida. Por favor, ingrese una opcion valida.");
                    }
                }
            }
        }
    }
}
