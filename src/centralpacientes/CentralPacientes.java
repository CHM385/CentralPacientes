package centralpacientes;

public class CentralPacientes {

    public static void main(String[] args) {

        ListaPacientes lista = new ListaPacientes();

        lista.agregarPaciente(new Paciente(1,"Ana",30,"Clinica Norte"));
        lista.agregarPaciente(new Paciente(2,"Carlos",40,"Clinica Sur"));
        lista.agregarPaciente(new Paciente(3,"Laura",25,"Clinica Central"));

        System.out.println("LISTA DE PACIENTES");
        lista.mostrarPacientes();

        System.out.println("\nBUSCAR PACIENTE ID 2");

        Paciente p = lista.buscarPaciente(2);

        if(p != null){
            p.mostrarPaciente();
        }

        System.out.println("\nELIMINAR PACIENTE ID 1");

        lista.eliminarPaciente(1);

        System.out.println("\nLISTA ACTUALIZADA");

        lista.mostrarPacientes();
    }
}