public class Sanatorio {
    public static void main(String[] args) {
        Pediatrico p1 = new Pediatrico("44529770", "Lisandro Florindo", "IPS", 20, "3764564963", "Padre", "Alta en Proteinas");
        Adulto a1 = new Adulto("38138913", "Yesica Kubski", "ConSalud", 120, 1.65, 65);
        Internado i1 = new Internado("49586312", "Luca Florindo", "IPS", "101", 110, "O+", "Vegetariana");

        Paciente[] pacientes = {p1, a1, i1};

        for (Paciente p : pacientes) {
            p.mostrarInformacion();
            System.out.println(p.getCobertura());
            System.out.println("Descuento: " + p.getDescuento() * 100 + "%");
            System.out.println("Vademécum: " + p.getVademecum());

            if (p instanceof Nutricion) {
                System.out.println("Dieta: " + ((Nutricion)p).getDieta());
            }

            if (p instanceof Clinica) {
                ((Clinica)p).recetarEstudios();
            }

            System.out.println("-----------");
        }
    }
}
