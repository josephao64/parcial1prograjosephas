class Medico extends Persona {
    private String especialidad;
    private String numeroColegiado;
    private String horarioConsultas;

    public Medico(String nombre, int edad, String genero, String direccion, String especialidad, String numeroColegiado, String horarioConsultas) {
        super(nombre, edad, genero, direccion);
        this.especialidad = especialidad;
        this.numeroColegiado = numeroColegiado;
        this.horarioConsultas = horarioConsultas;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String getHorarioConsultas() {
        return horarioConsultas;
    }

    public void setHorarioConsultas(String horarioConsultas) {
        this.horarioConsultas = horarioConsultas;
    }
}