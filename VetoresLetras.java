import java.util.Arrays;

public class VetoresLetras {

    public static void main(String[] args) {
        String[] letras = {"A", "B", "C", "J", "X"};
        for (int i=0; i <letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));
    }
}
