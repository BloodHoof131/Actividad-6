public class ArticuloCientifico {

    String titulo;
    String autor;
    String[] palabrasClaves = new String[3];
    String publicacion;
    int anio;
    String resumen;

    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public ArticuloCientifico(
            String titulo,
            String autor,
            String[] palabrasClaves,
            String publicacion,
            int anio) {

        this(titulo, autor);

        this.palabrasClaves = palabrasClaves;
        this.publicacion = publicacion;
        this.anio = anio;
    }

    public ArticuloCientifico(
            String titulo,
            String autor,
            String[] palabrasClaves,
            String publicacion,
            int anio,
            String resumen) {

        this(titulo, autor, palabrasClaves, publicacion, anio);

        this.resumen = resumen;
    }

    public void imprimir() {

        System.out.println("Título del artículo = " + titulo);
        System.out.println("Autor del artículo = " + autor);

        System.out.println("Palabras clave = ");

        for (int i = 0; i < palabrasClaves.length; i++) {
            System.out.println(palabrasClaves[i]);
        }

        System.out.println("Publicación = " + publicacion);
        System.out.println("Año = " + anio);
        System.out.println("Resumen = " + resumen);
    }

    public static void main(String[] args) {

        String[] palabras = {
                "Física",
                "Espacio",
                "Tiempo"
        };

        ArticuloCientifico articulo =
                new ArticuloCientifico(
                        "La teoría especial de la relatividad",
                        "Albert Einstein",
                        palabras,
                        "Anales de Física",
                        1913,
                        "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales."
                );

        articulo.imprimir();
    }
}