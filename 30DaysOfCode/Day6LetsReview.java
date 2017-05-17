import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int vezes;
        Scanner scr = new Scanner(System.in);
        String linha = "";

        vezes = scr.nextInt();
        linha = scr.nextLine();

        for(int i = 0; i < vezes; i++){

            String resp1 = "";
            String resp2 = " ";

            linha = scr.nextLine();

            for(int j = 0; j < linha.length(); j ++){

                if(j % 2 == 0){

                    resp1 += linha.charAt(j);

                }else{

                    resp2 += linha.charAt(j);
                }

            }

            System.out.println(resp1 + resp2);

         }

    }
}
