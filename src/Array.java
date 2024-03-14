import java.util.Random;

public class Array {

    int[] aleatorio = new int[10];
    Random random = new Random();

    public int[]  RellenarArray(int [] aleatorio) {
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = random.nextInt(100);
        }
        return aleatorio;
    }

    public int MaximoArray(int[] aleatorio) {
int maximo=0;
int indiceMaximo=0;
        for (int i = 0; i < aleatorio.length; i++) {
        if (aleatorio[i]>maximo){
            maximo=aleatorio[i];
            indiceMaximo=i;

        }
        }
        System.out.println("El maximo es"+maximo+"su índice es igual a="+indiceMaximo);
        return  maximo;

    }
}
