package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaManager {
    private static BibliotecaManager instancia;
    private List<Libro> libros = new ArrayList<>();

    private BibliotecaManager() {}  // Constructor privado

    public static BibliotecaManager getInstance() {
        if (instancia == null) {
            instancia = new BibliotecaManager();
        }
        return instancia;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }
}
