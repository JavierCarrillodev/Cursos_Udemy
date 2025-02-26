public class Ordenador {

    private String marca;
    private String modelo;
    private int gbRam = 4;
    private int capacidadDiscoDuro = 50;
    private int capacidaUtilizadaDisco;
    private boolean encendido;

    public Ordenador() {
        this.marca = marca;
        this.modelo = modelo;
        this.gbRam = gbRam;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
        this.capacidaUtilizadaDisco = capacidaUtilizadaDisco;
        this.encendido = encendido;
    }

    public Ordenador(int gbRam) {
        this.gbRam = gbRam;
    }
    public Ordenador( int gbRam, int capacidadDiscoDuro) {
        this.gbRam = gbRam;
        this.capacidadDiscoDuro = capacidadDiscoDuro;

    }
    public Ordenador(String marca, String modelo, int gbRam, int capacidadDiscoDuro) {
        this.marca = marca;
        this.modelo = modelo;
        this.gbRam = gbRam;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public void encender(){
        encendido = true;
        System.out.println("Encendido con exito");
    }
    public void apagar(){
        encendido = false;
        System.out.println("Apagado con exito");
    }

    public void transferirArchivos(int numeroGb){
        if(encendido){
            capacidaUtilizadaDisco += numeroGb;
            System.out.println("Se estan utilizando " + capacidaUtilizadaDisco + " GB ");
            if (numeroGb > capacidadDiscoDuro){
                System.out.println("Capacidad insuficiente");

            }

        }

    }


    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", gbRam=" + gbRam +
                ", capacidadDiscoDuro=" + capacidadDiscoDuro +
                ", capacidaUtilizadaDisco=" + capacidaUtilizadaDisco +
                ", encendido=" + encendido +
                '}';
    }
}



