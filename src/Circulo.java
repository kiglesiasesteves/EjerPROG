public class Circulo extends Figura {
    @Override
    public void dibujar() {
        super.dibujar();
       int radio=2;
        int tamaño = radio * 2 + 1;

        // Crear una matriz para representar el cuadro
        char[][] cuadro = new char[tamaño][tamaño];

        // Llenar la matriz con puntos (.) que representan los espacios vacíos
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                cuadro[i][j] = '.';
            }
        }

        // Marcar los puntos dentro del círculo con un palito (|)
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                // Calcular la distancia al centro del círculo
                int distanciaAlCentro = (i - radio) * (i - radio) + (j - radio) * (j - radio);

                // Si la distancia es menor o igual al radio al cuadrado, el punto está dentro del círculo
                if (distanciaAlCentro <= radio * radio) {
                    cuadro[i][j] = '|';
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(cuadro[i][j] + " ");
            }
            System.out.println();
        }
    }




}

