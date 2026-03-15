package centralpacientes;

public class ListaPacientes {

    Nodo cabeza;

    public ListaPacientes() {
        cabeza = null;
    }

    public void agregarPaciente(Paciente paciente) {

        Nodo nuevo = new Nodo(paciente);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {

            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }
    }

    public Paciente buscarPaciente(int id) {

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.paciente.id == id) {
                return actual.paciente;
            }

            actual = actual.siguiente;
        }

        return null;
    }

    public void eliminarPaciente(int id) {

        if (cabeza == null) return;

        if (cabeza.paciente.id == id) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null &&
               actual.siguiente.paciente.id != id) {

            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    public void mostrarPacientes() {

        Nodo actual = cabeza;

        while (actual != null) {

            actual.paciente.mostrarPaciente();

            actual = actual.siguiente;
        }
    }
}