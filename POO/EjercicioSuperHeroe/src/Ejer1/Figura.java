package Ejer1;

public class Figura {
    private String codigoFigura;
    private double precio;
    private Dimension dimension;
    private Superheroe superheroe;



    public Figura(String codigoFigura, double precio, Superheroe superheroe, Dimension dimension) {

        this.codigoFigura = codigoFigura;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }


    public  String getDescripcion(){
        return getDescripcion();
    }


    public String getCodigoFigura() {
        return codigoFigura;
    }

    public void setCodigoFigura(String codigoFigura) {
        this.codigoFigura = codigoFigura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }




    @Override
    public String toString() {
        return "figura: " +
                "codigoFigura='" + codigoFigura + '\'' +
                ", precio=" + precio +
                ", " + superheroe.toString() +
                ", " + dimension.toString() ;
    }
    public void subirPrecio(double cantidad){
        this.precio += cantidad;
    }


}
