import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura");
        int altura = sc.nextInt();
        System.out.println("Anchura");
        int anchura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                boolean borde = (i == 0) || (i == altura -1) || (j == 0) || (j == anchura -1);
                if (borde) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }








    }
}
