public class MainTiempo {
    public static void main(String[] args) {

        Ejer6Tiempo t = new Ejer6Tiempo(2,5,10);

        t.setHoras(2);
        t.setMinutos(5);
        t.setSegundos(10);

        t.setHoras(2);
        t.setMinutos(5);
        t.setSegundos(10);

        System.out.println(t.suma());

        System.out.print(t.getHoras() + "h ");
        System.out.print(t.getMinutos() + "m ");
        System.out.print(t.getSegundos() + "s ");

        System.out.println(t.toString());
    }
}
