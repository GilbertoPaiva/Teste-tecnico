package br.com.gpaiva;

public class SomaIndice {
    public static void main(String[] args) {
        // Inicializa as variáveis INDICE, SOMA e K
        int INDICE = 12, SOMA = 0, K = 1;

        // Loop enquanto K for menor que INDICE
        while (K < INDICE) {
            // Incrementa K em 1
            K = K + 1;
            // Adiciona o valor de K a SOMA
            SOMA = SOMA + K;
        }

        // Imprime o valor final de SOMA
        System.out.println(SOMA); // O valor de SOMA será 78
    }
}