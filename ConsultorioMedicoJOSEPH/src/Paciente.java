class Paciente extends Persona {
    private String historialMedico;
    private String seguroSalud;

    public Paciente(String nombre, int edad, String genero, String direccion, String historialMedico, String seguroSalud) {
        super(nombre, edad, genero, direccion);
        this.historialMedico = historialMedico;
        this.seguroSalud = seguroSalud;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(String historialMedico) {
        this.historialMedico = historialMedico;
    }

    public String getSeguroSalud() {
        return seguroSalud;
    }

    public void setSeguroSalud(String seguroSalud) {
        this.seguroSalud = seguroSalud;
    }
}