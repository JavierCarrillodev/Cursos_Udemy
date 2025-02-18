import javax.swing.*;
import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Obtener el nombre mas largo de tres personas


        String nom1 = JOptionPane.showInputDialog("Di un nombre y apellido");
        String nom2 = JOptionPane.showInputDialog("Di otro nombre y apellido");
        String nom3 = JOptionPane.showInputDialog("Di otro nombre y apellido");


        System.out.println("El nombre " + nom1 + " tiene " + nom1.length() + " letras");
        System.out.println("El nombre " + nom2 + " tiene " + nom2.length() + " letras");
        System.out.println("El nombre " + nom3 + " tiene " + nom3.length() + " letras");

        /*El metodo split lo que hace es dividir la cadena en subcadena y con el
        indice 0 accedes a la primera palabra*/
        String max = (nom1.split(" ")[0].length() < nom2.split(" ") [0].length())? nom2 : nom1;
        max =(nom3.split(" ")[0].length() < max.split(" ")[0].length())? max : nom3;

        System.out.println("El nombre mas grande es " + max);
    }
}
