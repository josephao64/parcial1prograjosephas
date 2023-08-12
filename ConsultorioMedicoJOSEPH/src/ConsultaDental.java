public class ConsultaDental extends Consulta{
    private String tipoProcedimiento;

    @Override
    void agendarConsulta() {
        // Lógica específica para agendar una consulta dental
        System.out.println("Se ha agendado una consulta dental.");
    }

    @Override
    void realizarConsulta() {
        // Lógica específica para realizar una consulta dental
        System.out.println("Se ha realizado la consulta dental.");
    }

    // Otros métodos específicos de ConsultaDental
    public String getTipoProcedimiento() {
        return tipoProcedimiento;
    }

    public void setTipoProcedimiento(String tipoProcedimiento) {
        this.tipoProcedimiento = tipoProcedimiento;
    }
}


