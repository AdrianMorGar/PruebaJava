import java.util.Arrays;

public class Diapositiva01 {

    public static void main(String[] args) {
        int numeros[] = {5, 6, 7, 5};
        System.out.println(Arrays.toString(numeros));
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i < numeros.length - 1) {
                System.out.print(numeros[i] + ", ");
            } else {
                System.out.print(numeros[i]);
            }
        }
        System.out.print("]\n");
    
}