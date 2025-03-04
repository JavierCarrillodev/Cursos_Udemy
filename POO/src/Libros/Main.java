package Libros;

public class Main {
    public static void main(String[] args) {

       Libro libro = new Libro("12345 ","El hombre y la mierda",500,"Hector",false);

       libro.prestar();
       libro.devolver();
       libro.devolver();
       libro.prestar();
       libro.prestar();
        System.out.println( libro.imprimir(0.1));
        

    }
}
