import java.util.Arrays;

public class GestorDeEmpleados implements Administrable, InstrumentoMusical {
    private Empleado[] empleados;
    private int cantidadEmpleados;

    public GestorDeEmpleados() {
        empleados = new Empleado[50]; // Inicializar el arreglo con una capacidad inicial
        cantidadEmpleados = 0;
    }

    public void agregarEmpleado(Empleado empleado) {
        // Verifica si el array necesita ser redimensionado
        if (cantidadEmpleados == empleados.length) {
            // Redimensiona el array al doble de su tamaño actual
            empleados = Arrays.copyOf(empleados, empleados.length * 2);
        }
        // Agrega el empleado al array
        empleados[cantidadEmpleados++] = empleado;
    }

    public void eliminar() {
        Administrable.super.eliminar();
    }

    public void listar() {
        Administrable.super.listar();
        for (int i = 0; i < cantidadEmpleados; i++) {
            Empleado empleado = empleados[i];
            System.out.println("Nombre: " + empleado.getNombre() +
                    ", Departamento: " + empleado.getDepartamento() +
                    ", Salario: " + empleado.getSalario());
        }
    }

    public void buscarEmpleadoPorNombre(String nombre) {
        boolean empleadoEncontrado = false;
        for (int i = 0; i < cantidadEmpleados; i++) {
            Empleado empleado = empleados[i];
            if (empleado.getNombre().equals(nombre)) {
                empleadoEncontrado = true;
                System.out.println("Empleado encontrado:");
                System.out.println("Nombre: " + empleado.getNombre() +
                        ", Departamento: " + empleado.getDepartamento() +
                        ", Salario: " + empleado.getSalario());
                break; // Detener la búsqueda después de encontrar el empleado
            }
        }
        if (!empleadoEncontrado) {
            System.out.println("Empleado no encontrado.");
        }
    }

    public void asignarInstrumento(Empleado empleado, InstrumentoMusical instrumento) {
        empleado.setInstrumentoAsignado(instrumento);
    }

    public void empleadosTocandoInstrumento() {
        for (int i = 0; i < cantidadEmpleados; i++) {
            Empleado empleado = empleados[i];
            if (empleado.getInstrumentoAsignado() != null) {
                System.out.print(empleado.getNombre() + " está ");
                empleado.getInstrumentoAsignado().tocar();
            } else {
                System.out.println(empleado.getNombre() + " no tiene un instrumento asignado.");
            }
        }
    }
}
