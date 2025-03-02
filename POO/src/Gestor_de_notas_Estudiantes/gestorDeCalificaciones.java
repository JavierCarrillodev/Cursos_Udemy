package Gestor_de_notas_Estudiantes;

import java.util.ArrayList;

public class gestorDeCalificaciones {
        ArrayList<Esudiantes> estudiantes;

        public gestorDeCalificaciones() {
            this.estudiantes = new ArrayList<>();
        }

        public void agregarEstudiante(String nombre, int numMaterias, int numEvaluaciones) {
            Esudiantes estudiante = new Esudiantes(nombre, numMaterias, numEvaluaciones);
            Esudiantes.add(estudiante);
        }

        public void mostrarAlerta(Esudiantes estudiante) {
            double promedioGeneral = estudiante.calcularPromedioGeneral();
            if (promedioGeneral < 5.0) {
                System.out.println("Alerta: " + estudiante.nombre + " necesita refuerzo académico.");
            }
        }

        public Esudiantes buscarMejorEsudiantes() {
            Esudiantes mejor = null;
            double maxPromedio = Double.MIN_VALUE;

            for (Esudiantes estudiante : estudiantes) {
                double promedioGeneral = estudiante.calcularPromedioGeneral();
                if (promedioGeneral > maxPromedio) {
                    maxPromedio = promedioGeneral;
                    mejor = estudiante;
                }
            }

            return mejor;
        }

        public void agregarEstudiante(Esudiantes esudiante) {
        }
    }
