public class Circulo implements FiguraGeometrica {
    public int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo(float radio) {


    }

    public Circulo() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public float CalcularArea() {
        FiguraGeometrica.super.CalcularArea();
        return (float) (radio*radio*Math.PI);
    }
}
