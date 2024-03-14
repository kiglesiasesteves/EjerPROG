import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class ForEach {
char[] palabras= new char[25];

    HashSet<Integer> conjunto = new HashSet<>();
    public void AnhadirValores() {
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(5);

    }

    public void eliminarValores() {
        Iterator<Integer> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            Integer elemento = iterator.next();
            // Aquí puedes agregar tu lógica para decidir si eliminar el elemento o no
            if (elemento % 2 == 0) { // Por ejemplo, eliminar números pares
                iterator.remove();
            }
        }
    }

    Random random=new Random();
    public char[] RellenarArray(char[] palabras) {
        for (int i = 0; i < palabras.length; i++) {
            int numeroAleatorio = random.nextInt(26) + 97;
            char letraAleatoria = (char) numeroAleatorio;
            palabras[i] = letraAleatoria;        }
        return palabras;
    }
    public void Iterar(){
        for(char palabra : palabras) {
            System.out.println(palabras[palabra]);
        }

    }
}
