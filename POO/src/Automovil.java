public class Automovil {
    String fabricante = "Victoria";
    String modelo;
    String color;
    double cilindrada;

    public String detalles(){
        StringBuffer sb = new StringBuffer();
        String modelo = "otro";
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("auto.modelo = " + this.modelo);
        sb.append("auto.color = " + this.color);
        sb.append("auto.color = " + this.cilindrada);
        return sb.toString();
    }
    public String acelerar(int rpm){
        return "EL auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }
    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!!";
    }
    //Creamos un metodo con los dos metodos anteriores y lo juntamos
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
}
