package DispositivosElectronicos;

public class Main {
    public static void main(String[] args) {

        DispositivoConBateria dispositivoConBateria1 = new DispositivoConBateria("Movil",20);
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.recargar();
        dispositivoConBateria1.usarDispositivo();
        dispositivoConBateria1.usarDispositivo();

    }
}
