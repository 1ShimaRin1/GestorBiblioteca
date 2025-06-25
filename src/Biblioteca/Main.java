package biblioteca;

public class Main {
    public static void main(String[] args) {
        // Obtener instancia Singleton
        BibliotecaManager manager = BibliotecaManager.getInstance();

        // Crear libro PDF y adaptarlo
        PdfLibro pdf = new PdfLibro("Diseño de Software");
        Libro adaptado = new PdfAdapter(pdf);

        // Agregar a la biblioteca
        manager.agregarLibro(adaptado);

        // Mostrar libros con Iterator
        System.out.println("📚 Libros en la biblioteca:");
        for (Libro libro : manager.getLibros()) {
            System.out.println("- " + libro.mostrarContenido());
        }

        // Clonar libro con Prototype
        Libro clon = ((LibroConcreto)adaptado).clonar();
        manager.agregarLibro(clon);

        System.out.println("\n📚 Después de clonar:");
        for (Libro libro : manager.getLibros()) {
            System.out.println("- " + libro.mostrarContenido());
        }
    }
}
