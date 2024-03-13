public class Rectangulo implements FiguraGeometrica{
    public int altura;
    public int base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public float CalcularArea() {
        FiguraGeometrica.super.CalcularArea();
        return altura*base;


    }
}
