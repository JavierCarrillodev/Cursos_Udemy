package Gestor_de_notas_Estudiantes;

import java.util.ArrayList;

public class GestorDeCalificaciones {
    public Esudiantes[] esudiante;

    public void mostrarAlerta(Esudiantes est) {
    }



    public void agregarEsudiante(Esudiantes estudiante) {
    }

    public Esudiantes buscarMejorEsudiante() {
        Esudiantes mejor = null;
        double maxPromedio = Double.MIN_VALUE;

        for (Esudiantes estudiante : esudiante) {
            double promedioGeneral = estudiante.calcularPromedioGeneral();
            if (promedioGeneral > maxPromedio) {
                maxPromedio = promedioGeneral;
                mejor = estudiante;
            }
        }

        return mejor;
    }


    }
