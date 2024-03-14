import java.io.Serializable;

public class Empleado implements Serializable {
    String nombre;
    int id;
    String departamento;

    public Empleado(String nombre, int id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
