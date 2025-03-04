package Ordenador;

public class Main {
    public static void main(String[] args) {

        Ordenador ordenador = new Ordenador(3,50);
        Ordenador ordenador1 = new Ordenador(1,50);
        ordenador.EnciendeOrdenador();
        ordenador.EnciendeOrdenador();

        ordenador.transferirArchivos(40);
        ordenador.eliminarArchivos(20);

        if (ordenador.equals(ordenador1)) {
            System.out.println("Iguales");
        }else {
            System.out.println("Diferentes");
        }




    }
}
