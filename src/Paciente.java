abstract class Paciente implements Administracion {
        protected String dni;
        protected String nombre;
        protected String obraSocial;

        public Paciente(String dni, String nombre, String obraSocial) {
            this.dni = dni;
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }

        public String getCobertura() {
            return "Cobertura de OS: " + obraSocial;
        }

        public double getDescuento() {
            return 0.20;
        }

        public String getVademecum() {
            return "Lista de medicamentos estándar";
        }

        public abstract void mostrarInformacion();
    }
