package Colecoes;
import java.util.HashSet;
import java.util.Set;

/**
 * ColecaoHashSet
 */
public class ColecaoHashSet {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        numeros.remove(numeros.size());

        numeros.add(6);

        for (Integer num : numeros) {
            System.out.println(num);
        }
    }

}