/**
 * @source Beecrowd
 * @problem 1253 - Caesar Cipher
 * @subject String
 * 
 * @author Letícia Cruz
 * @date 2025-08-21
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {

        InputStreamReader InputReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(InputReader);

        int N = Integer.parseInt(input.readLine());

        String cifra;
        String decifrado = "";
        int deslocamento;

        for (int i = 0; i < N; i++) {

            decifrado = "";
            cifra = input.readLine();
            deslocamento = Integer.parseInt(input.readLine());

            for (int j = 0; j < cifra.length(); j++) {

                char c = cifra.charAt(j);
                c -= deslocamento;

                if (c < 65) {
                    c += 26;
                }

                decifrado += c;
            }

            System.out.println(decifrado);
        }

    }
}
