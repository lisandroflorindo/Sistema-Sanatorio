public class Adulto extends Paciente implements Clinica {
    private double presionArterial;
    private double altura;
    private double peso;

    public Adulto(String dni, String nombre, String obraSocial, double presionArterial, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }

    public void recetarEstudios() {
        System.out.println("Estudios recetados: Rx y análisis de sangre.");
    }

    public void mostrarInformacion() {
        System.out.println("Adulto: " + nombre + " (" + dni + ")");
    }
}

