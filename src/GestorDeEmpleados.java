import java.util.Arrays;

public class GestorDeEmpleados implements Administrable, InstrumentoMusical {
    private Empleado[] empleados;
    private int cantidadEmpleados;


    public void agregarEmpleado(Empleado empleado) {
        // Verifica si el array necesita ser redimensionado
        if (cantidadEmpleados == empleados.length) {
            // Redimensiona el array al doble de su tamaño actual
            empleados = Arrays.copyOf(empleados, empleados.length * 2);
        }
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

    public GestorDeEmpleados() {
        empleados = new Empleado[50];
        cantidadEmpleados = 0;
    }


    public void buscarEmpleadoPorNombre(String nombre) {
        for (int i = 0; i < cantidadEmpleados; i++) {
            Empleado empleado = empleados[i];
            if (empleado.getNombre().equals(nombre)) {
                System.out.println("Empleado encontrado:");
                System.out.println("Nombre: " + empleado.getNombre() +
                        ", Departamento: " + empleado.getDepartamento() +
                        ", Salario: " + empleado.getSalario());

            } else {
                System.out.println("Empleado no encontrado.");
            }
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