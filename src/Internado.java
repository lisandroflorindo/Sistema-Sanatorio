public class Internado extends Paciente implements Nutricion, Clinica {

    private String habitacion;
    private double presionArterial;
    private String rh;
    private String dieta;

    public Internado(String dni, String nombre, String obraSocial, String habitacion, double presionArterial, String rh, String dieta) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.presionArterial = presionArterial;
        this.rh = rh;
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    public void recetarEstudios() {
        System.out.println("Estudios recetados: Rx y análisis de sangre.");
    }

    public void mostrarInformacion() {
        System.out.println("Internado: " + nombre + " (" + dni + ")");
    }
}
