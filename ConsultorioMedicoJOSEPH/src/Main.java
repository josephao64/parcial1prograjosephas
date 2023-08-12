
//joseph isaac asencio ortiz 0907-22-11933

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<Consulta> consultas = new ArrayList<>();


        Paciente paciente1 = new Paciente("joseph", 19, "Masculino", "Calle transito rojas", "Historial 1", "Seguro 1");
        Paciente paciente2 = new Paciente("maria", 30, "Femenino", "Calle 12", "Historial 2", "Seguro 2");

        Medico medico1 = new Medico("Dr. charlie", 45, "Masculino", "Avenida 723", "Cardiología", "12345", "Lunes 9-12");
        Medico medico2 = new Medico("Dra. Juana", 35, "Femenino", "Avenida 987", "Dermatología", "67890", "Martes 14-17");

        ConsultaMedica consultaMedica1 = new ConsultaMedica();
        consultaMedica1.agendarConsulta();
        consultaMedica1.realizarConsulta();
        consultaMedica1.setDiagnostico("Gripe");

        ConsultaDental consultaDental1 = new ConsultaDental();
        consultaDental1.agendarConsulta();
        consultaDental1.realizarConsulta();
        consultaDental1.setTipoProcedimiento("Limpieza dental");

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        medicos.add(medico1);
        medicos.add(medico2);
        consultas.add(consultaMedica1);
        consultas.add(consultaDental1);

        // Simulación de operaciones en el consultorio
        for (Paciente paciente : pacientes) {
            System.out.println("Paciente: " + paciente.getNombre() + " - Historial: " + paciente.getHistorialMedico());
        }

        for (Medico medico : medicos) {
            System.out.println("Médico: " + medico.getNombre() + " - Especialidad: " + medico.getEspecialidad());
        }

        for (Consulta consulta : consultas) {
            if (consulta instanceof ConsultaMedica) {
                ConsultaMedica consultaMedica = (ConsultaMedica) consulta;
                System.out.println("Consulta Médica - Diagnóstico: " + consultaMedica.getDiagnostico());
            } else if (consulta instanceof ConsultaDental) {
                ConsultaDental consultaDental = (ConsultaDental) consulta;
                System.out.println("Consulta Dental - Procedimiento: " + consultaDental.getTipoProcedimiento());
            }
        }
    }
}
