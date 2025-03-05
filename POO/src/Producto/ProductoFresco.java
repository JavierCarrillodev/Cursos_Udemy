package Producto;

public class ProductoFresco extends Producto {
    private int diasDeCaducidad;


    public ProductoFresco(){
        this("",0,0);

    }
    public ProductoFresco(String nombre, int precio, int diasDeCaducidad) {
        super(nombre, precio);
        this.diasDeCaducidad = diasDeCaducidad;
    }
    public int getDiasDeCaducidad() {
        return diasDeCaducidad;
    }

    public void setDiasDeCaducidad(int diasDeCaducidad) {
        this.diasDeCaducidad = diasDeCaducidad;
    }

    public ProductoFresco(int diasDeCaducidad) {
        this.diasDeCaducidad = diasDeCaducidad;
    }


    @Override
    public int comprar(int cantidad) {
        return super.comprar(cantidad);
        if(diasDeCaducidad >=3 || diasDeCaducidad <=5){
            System.out.println();
        }
        return diasDeCaducidad;
    }
}
