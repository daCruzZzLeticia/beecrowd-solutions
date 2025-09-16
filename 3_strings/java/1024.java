/**
 * @source Beecrowd
 * @problem 1024 - Encryption
 * @subject String Manipulation
 * 
 * @author Letícia Cruz
 * @date 2025-08-22
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader InputReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(InputReader);

        int N = Integer.parseInt(input.readLine());

        char[] linha;
        String linhaCodificada;
        for (int i = 0; i < N; i++) {
            linha = (input.readLine()).toCharArray();
            linhaCodificada = "";

            for (int j = 0; j < linha.length; j++) {
                if (Character.isLetter(linha[j])) {
                    linha[j] += 3;
                }
            }

            for (int j = 0; j < Math.round(linha.length / 2.0); j++) {
                linha[j] -= 1;
            }

            for (int j = linha.length; j > 0; j--) {
                linhaCodificada += linha[j - 1];
            }

            System.out.println(linhaCodificada);
        }
    }
}
