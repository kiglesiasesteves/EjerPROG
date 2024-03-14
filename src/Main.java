public class Main {
    public static void main(String[] args) {
       Array array=new Array();
       array.RellenarArray(array.aleatorio);
       array.MaximoArray(array.aleatorio);
Circulo circ= new Circulo();
circ.dibujar();
Cuadrado cuadr= new Cuadrado();
        cuadr.dibujar();

Division div= new Division();
div.Division(5,3);
GestorDeEmpleados gestor=new GestorDeEmpleados();
gestor.AnhadirEmpleados();
ForEach forE=new ForEach();
System.out.println(forE.RellenarArray(forE.palabras));
forE.eliminarValores();
        }
    }
