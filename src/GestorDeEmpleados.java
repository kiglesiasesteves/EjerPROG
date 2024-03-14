import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GestorDeEmpleados implements Serializable {

    public void AnhadirEmpleados(){
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Ana", 1, "Física"));
        listaEmpleados.add(new Empleado("Pedro", 2, "Cortos"));

        // Serializar la lista de empleados
        serializarObjeto(listaEmpleados, "empleados.ser");
    }

    public static void serializarObjeto(List<Empleado> listaEmpleados, String nombreArchivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaEmpleados);
            out.close();
            fileOut.close();
            System.out.println("Los objetos se han serializado correctamente en el archivo " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}