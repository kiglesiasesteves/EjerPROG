public class Main {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado();
        empleado1.setNombre("Ana");
        empleado1.setDepartamento("Física");
        empleado1.setSalario(3000);
        GestorDeEmpleados gestor=new GestorDeEmpleados();
        gestor.agregar(empleado1);
      gestor.listar();
        gestor.buscarEmpleadoPorNombre("Ana");
        gestor.agregarEmpleado(new Empleado("sOFIA", "qUIMICAA", 3500));
     InstrumentoMusical piano = new Piano(); // Suponiendo que ya has implementado la clase Piano
        Empleado empleado2 = new Empleado("Sofía", "Química", 3500, piano);
        gestor.agregarEmpleado(empleado2);
        gestor.listar();
        gestor.buscarEmpleadoPorNombre("Sofía");
    }
}
