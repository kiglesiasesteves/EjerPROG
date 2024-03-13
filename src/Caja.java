public class Caja <T> {
    private T objeto;
    public void agregar(T objeto){
        this.objeto=objeto;
    }
    public T obtener(){
        return objeto;
    }
    public void figuras() {
        Rectangulo rec1 = new Rectangulo(5, 9);
        rec1.CalcularArea();
    }
}
