package biblioteca;

public class Libro {
    private String ISBN;
    private String titulo;
    private boolean prestado;

    public Libro(String ISBN, String titulo, boolean prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestarLibro() {
        if (prestado) {
            System.out.println("El libro no esta prestado ");
        }else {
            System.out.println("El libro esta prestado ");
        }
    }
}

