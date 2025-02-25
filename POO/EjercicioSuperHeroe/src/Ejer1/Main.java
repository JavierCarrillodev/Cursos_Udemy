package Ejer1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        Superheroe super1 = new Superheroe("Spiderman");
        super1.setDescripcion("El loco de las arañas");
        super1.setCapa(false);

        Superheroe super2 = new Superheroe("Superman");
        super2.setDescripcion("Pajaro volador");
        super2.setCapa(true);

        Dimension dime1 = new Dimension(2,3,5);
        Dimension dime2 = new Dimension(1,3,5);

        Figura fig1 = new Figura("12as",15,super1,dime1);
        Figura fig2 = new Figura("99as",20,super2,dime2);

        Coleccion cole1 = new Coleccion("MarvelDC");
        cole1.anadirFiguras(fig1);
        cole1.anadirFiguras(fig2);
        System.out.println(cole1);

        cole1.subirPrecio(50.0,"12as");
        System.out.println(cole1);

        System.out.println("Figuras con capa:");
        System.out.println(cole1.conCapa());

        System.out.println("Figura mas valiosa");
        System.out.println(cole1.masValioso());

        System.out.println("EL valor total de la coleccion es:" + cole1.getValorColeccion());

        System.out.println("EL volumen total de la coleccion es:" + cole1.getVolumenColeccion());



    }
}

