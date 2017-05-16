import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraysLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {

        int[] out = new int[n];
        int fim = n - 1;

        for(int k_start = k - 1; k_start >= 0; k_start --){

            out[fim] = a[k_start];
            fim --;

        }

        int cont = 0;

        for(int k_ending = k; k_ending < n; k_ending ++){

            out[cont] = a[k_ending];
            cont ++;

        }

        return out;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
