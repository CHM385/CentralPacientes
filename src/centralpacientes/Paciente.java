package centralpacientes;

public class Paciente {

    int id;
    String nombre;
    int edad;
    String clinica;

    public Paciente(int id, String nombre, int edad, String clinica) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.clinica = clinica;
    }

    public void mostrarPaciente() {
        System.out.println("ID: " + id +
                " Nombre: " + nombre +
                " Edad: " + edad +
                " Clinica: " + clinica);
    }
}