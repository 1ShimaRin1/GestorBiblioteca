package biblioteca;

public class PdfAdapter extends LibroConcreto {
    private PdfLibro pdf;

    public PdfAdapter(PdfLibro pdf) {
        this.pdf = pdf;
        this.titulo = pdf.leerPdf();
    }

    @Override
    public String mostrarContenido() {
        return pdf.leerPdf();
    }
}
