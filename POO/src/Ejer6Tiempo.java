public class Ejer6Tiempo {

    private int horas = 2;
    private int minutos = 1;
    private int segundos = 5;



    public int suma(){
        int TotalSuma= horas+minutos+segundos;
        return TotalSuma;
    }

    public int resta(){

        return resta();
    }

    public Ejer6Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Ejer6Tiempo{" +
                "horas=" + horas +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                '}';
    }
}
