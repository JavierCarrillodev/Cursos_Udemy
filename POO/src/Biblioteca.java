public class Biblioteca {

    private String ISBN;
    private String titulo;
    private String numeroPaginas;
    private String autor;
    boolean  prestado;

    public Biblioteca() {
    }

    public Biblioteca(String ISBN, String titulo, String numeroPaginas, String autor, String prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
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

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar(){
        if(prestado){
            prestado = true;
        }else {
            prestado = false;
        }
    }

    public void devolver(){
        if(this.prestado){
            this.prestado = true;
        } else {
            this.prestado = false;
        }
    }

    public void imprimir(int paginas){
        int coste = 0;
        if(paginas > 100){
        coste += paginas;
        }
    }
}

