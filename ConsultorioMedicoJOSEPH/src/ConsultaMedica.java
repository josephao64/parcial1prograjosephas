class ConsultaMedica extends Consulta {
    private String diagnostico;

    @Override
    void agendarConsulta() {

        System.out.println("Se ha agendado una consulta médica.");
    }

    @Override
    void realizarConsulta() {
        System.out.println("Se ha realizado la consulta médica.");
    }


    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
