import java.util.Scanner;

public class MainOrdenador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Ordenador ordenador = new Ordenador();
        ordenador.apagar();
        ordenador.transferirArchivos(200);

        int opciones;
        do {

            System.out.println("Introduce una opcion");
            System.out.println();

            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Transferir Archivos");
            System.out.println("4. Salir");
            opciones = entrada.nextInt();

            switch (opciones) {
                case 1:
                    ordenador.encender();
                    break;
                case 2:
                    ordenador.apagar();
                    break;
                case 3:
                    ordenador.transferirArchivos(60);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                    default:
                        System.out.println("Opcion no valida introduce una opcion");
            }

        }while (opciones!=4);

    }






}
