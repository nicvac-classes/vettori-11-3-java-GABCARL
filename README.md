import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, o, valore, i;

        System.out.println("Inserire la grandezza del vettore: ");
        n = input.nextInt();
        int[] v = new int[n * 10];

        for (i = 0; i <= n - 1; i++) {
            v[i] = 0;
        }
        do {
            System.out.println("Scegli un'opzione: 1. Inserisci elemento 2. Elimina elemento 3. Ricerca elemento 4. Elimina duplicati 5. Visualizza vettore 6. Esci");
            o = input.nextInt();
            if (o == 1) {
                System.out.println("Inserire il valore da aggiungere: ");
                valore = input.nextInt();
                do {
                    System.out.println("Inserire la posizione in cui inserire il valore: ");
                    i = input.nextInt();
                } while (i < 0 || i >= n);
                n = inserisciElemento(v, n, valore, i);
            }
            if (o == 2) {
                do {
                    System.out.println("Inserire la posizione dell'elemento da eliminare: ");
                    i = input.nextInt();
                } while (i < 0 || i >= n);
                n = eliminaElemento(v, n, i);
            }
            if (o == 3) {
                System.out.println("Inserire valore da ricercare: ");
                valore = input.nextInt();
                i = ricercaNelVettore(v, valore, n);
                if (i >= 0) {
                    System.out.println("Il valore: " + valore + " è presente nella posizione: " + i);
                } else {
                    System.out.println("Il valore: " + valore + " non è presente nel vettore");
                }
            }
            if (o == 4) {
                n = ElminiaDuplicati(v, n);
            }
            if (o == 5) {
                visualizza(v, n);
            }
            if (o != 1 && o != 2 && o != 3 && o != 4 && o != 5 && o != 6) {
                System.out.println("Inserire un valore valido");
            }
        } while (o != 6);
    }
    
    public static void eliminaDuplicati(int[] v, int dimensione) {
    }
    
    public static int eliminaElemento(int[] v, int dimensione, int i) {
        int n, j;
        int[] w = new int[dimensione - 1];

        for (j = 0; j <= i - 1; j++) {
            w[j] = v[j];
        }
        for (j = i + 1; j <= dimensione - 1; j++) {
            w[j - 1] = v[j];
        }
        for (j = 0; j <= dimensione - 2; j++) {
            v[j] = w[j];
        }
        n = dimensione - 1;
        
        return n;
    }
    
    public static int inserisciElemento(int[] v, int dimensione, int elemento, int i) {
        int nDimensione;
        int j;
        int[] w = new int[dimensione + 1];

        for (j = 0; j <= i - 1; j++) {
            w[j] = v[j];
        }
        w[i] = elemento;
        for (j = i + 1; j <= dimensione; j++) {
            w[j] = v[j - 1];
        }
        for (j = 0; j <= dimensione; j++) {
            v[j] = w[j];
        }
        nDimensione = dimensione + 1;
        
        return nDimensione;
    }
    
    public static int ricercaNelVettore(int[] v, int valore, int dimesione) {
        int i, j;

        j = 0;
        i = 0;
        while (i == 0 && j < dimesione) {
            if (valore == v[j]) {
                i = j;
            }
            j = j + 1;
        }
        
        return i;
    }
    
    public static void visualizza(int[] v, int dimensione) {
        int i;

        for (i = 0; i <= dimensione - 1; i++) {
            System.out.println(Integer.toString(i + 1) + "° numero: " + v[i]);
        }
    }
}
