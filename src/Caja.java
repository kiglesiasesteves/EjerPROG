public class Caja <T>{

    T objeto;
    public Caja() {
    }

    public Caja(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}
