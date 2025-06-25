package biblioteca;

public class PdfLibro {
    private String titulo;

    public PdfLibro(String titulo) {
        this.titulo = titulo;
    }

    public String leerPdf() {
        return "Leyendo archivo PDF: " + titulo;
    }
}
