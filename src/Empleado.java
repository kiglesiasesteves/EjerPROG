public class Empleado implements InstrumentoMusical {
    String nombre;
    String departamento;

    float salario;
    private InstrumentoMusical instrumentoAsignado;

    public Empleado(String nombre, String departmento, float salario) {
    }

    public InstrumentoMusical getInstrumentoAsignado() {
        return instrumentoAsignado;
    }

    public void setInstrumentoAsignado(InstrumentoMusical instrumentoAsignado) {
        this.instrumentoAsignado = instrumentoAsignado;
    }

    public Empleado() {
    }


    public Empleado(String nombre, String departamento, float salario, InstrumentoMusical instrumentoAsignado) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.instrumentoAsignado = instrumentoAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
