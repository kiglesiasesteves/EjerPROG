public class Cuadrado extends Figura{
    int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    /**
     *
     */
    @Override
    public void dibujar() {
        super.dibujar();


    char[][] cuadro = new char[lado][lado];

    // Llenar la matriz con puntos (.) que representan el interior del cuadrado
        for (int i = 0; i < lado; i++) {
        for (int j = 0; j < lado; j++) {
            cuadro[i][j] = '.';
        }
    }

    // Marcar los bordes del cuadrado con palitos (|)
        for (int i = 0; i < lado; i++) {
        cuadro[i][0] = '|';           // Lado izquierdo
        cuadro[i][lado - 1] = '|';    // Lado derecho
        cuadro[0][i] = '|';           // Parte superior
        cuadro[lado - 1][i] = '|';    // Parte inferior
    }

    // Imprimir la matriz
        for (int i = 0; i < lado; i++) {
        for (int j = 0; j < lado; j++) {
            System.out.print(cuadro[i][j] + " ");
        }
        System.out.println();
    }
}
}
