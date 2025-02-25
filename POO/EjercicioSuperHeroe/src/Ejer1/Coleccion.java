package Ejer1;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion = "Marvel";
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void anadirFiguras(Figura fig){
        this.listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id){
       for (Figura figura : listaFiguras){
           if (figura.getCodigoFigura().equals(id)){
               figura.subirPrecio(cantidad);
           }
       }

    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", listaFiguras=" + listaFiguras +
                '}';
    }

    public String conCapa(){
        StringBuilder sb = new StringBuilder("Figuras con capa");
        for (Figura figura: listaFiguras){
            if (figura.getSuperheroe().isCapa()){
                sb.append(figura.toString()).append("\n");
            }
        }
        return sb.toString();
    }


    public Figura masValioso(){
        Figura figuraMasValiosa= listaFiguras.get(0);
        for (Figura figura: listaFiguras){
            if (figura.getPrecio() > figuraMasValiosa.getPrecio()){
                figuraMasValiosa = figura;

            }
        }
        return figuraMasValiosa;
    }

    public double getValorColeccion(){
        double precioTotal =0;
        for (Figura figura: listaFiguras){
            precioTotal += figura.getPrecio();
        }
        return precioTotal;
    }

    public double getVolumenColeccion(){
        double voluAprox = 0;
         for (Figura figura: listaFiguras){
             voluAprox += figura.getDimension().getVolumen();
         }
         voluAprox +=200;
        return voluAprox;
    }
}
