package Producto;

public class Producto {
    private int id;
    private String nombre;
    private int precio;
    private static int idAutoincrementando = 1;

    public Producto() {
        this("",0);
    }

    public Producto( String nombre, int precio) {

        if(precio < 0){
            throw new IllegalArgumentException("Precio no puede ser negativo");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.id = Producto.idAutoincrementando++;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    public int comprar(int cantidad) {
        int precioTotal = cantidad * this.precio;
        return cantidad + precioTotal;
    }
}
