package biblioteca;

public class LibroConcreto implements Libro {
    protected String titulo;

    public LibroConcreto() {}

    public LibroConcreto(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String mostrarContenido() {
        return "Libro: " + titulo;
    }

    public LibroConcreto clonar() {
        return new LibroConcreto(this.titulo + " (Clon)");
    }
}
