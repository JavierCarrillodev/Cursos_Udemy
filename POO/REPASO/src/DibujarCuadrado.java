import java.util.Scanner;

import java.util.Scanner;
public class DibujarCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("altura");
        int altura = sc.nextInt();
        System.out.println("anchura");
        int anchura = sc.nextInt();

        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= anchura; j++){
                boolean borde = (i == 0) || (i == altura -1) || (j == 0) || (j == anchura -1 );
                if (borde){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}




