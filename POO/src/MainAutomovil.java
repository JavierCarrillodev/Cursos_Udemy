public class MainAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.cilindrada = 12;
        auto.color = "Rojo";
        auto.modelo = "Ford";

        Automovil cochazo = new Automovil();
        cochazo.cilindrada = 500;
        cochazo.fabricante = "Yo";
        cochazo.color = "verde";
        cochazo.modelo = "tesla";

        System.out.println("cochazo.fabricante = " + cochazo.fabricante);
        System.out.println("cochazo.color = " + cochazo.color);
        System.out.println("cochazo.modelo = " + cochazo.modelo);
        System.out.println("cochazo.cilindrada = " + cochazo.cilindrada);

        System.out.println(auto.acelerarFrenar(4500));

    }
}
