public class Pediatrico extends Paciente implements Nutricion {
    private double peso;
    private String celular;
    private String tutor;
    private String dieta;

    public Pediatrico(String dni, String nombre, String obraSocial, double peso, String celular, String tutor, String dieta) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    public void mostrarInformacion() {
        System.out.println("Pediátrico: " + nombre + " (" + dni + ")");
    }
}

