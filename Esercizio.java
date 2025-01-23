
//LEGGERE LE ISimport java.util.*;
import java.util.Scanner;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, o, valore, i;

        System.out.println("Inserire la grandezza del vettore: ");
        n = input.nextInt();
        int[] v = new int[n];

        for (i = 0; i <= n - 1; i++) {
            v[i] = 0;
        }
        do {
            System.out.println("Scegli un'opzione: 1. Inserisci elemento 2. Elimina elemento 3. Ricerca elemento 4. Elimina duplicati 5. Visualizza vettore 6. Esci");
            o = input.nextInt();
            if (o == 1) {
                inserisciElemento();
            }
            if (o == 2) {
                eliminaElemento();
            }
            if (o == 3) {
                System.out.println("Inserire valore da ricercare: ");
                valore = input.nextInt();
                valore = ricercaNelVettore(v[n], valore, n);
                System.out.println("Il valore è presente nella posizione: " + valore);
            }
            if (o == 4) {
                eliminaDuplicati();
            }
            if (o == 5) {
                visualizza(v[n], n);
            }
            if (o != 1 || o != 2 || o != 3 || o != 4 || o != 5 || o != 6) {
                System.out.println("Inserire un valore valido");
            }
        } while (o != 6);
    }
    
    public static void eliminaDuplicati(int[] v, int dimensione) {
    }
    
    public static void eliminaElemento(int[] v, int dimensione) {
    }
    
    public static void inserisciElemento(int[] v, int deminsione) {
    }
    
    public static int ricercaNelVettore(int[] v, int valore, int dimesione) {
        int i, j;

        j = 0;
        while (i == 0 && j < dimesione) {
            if (valore == v[j]) {
                i = j;
            }
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
