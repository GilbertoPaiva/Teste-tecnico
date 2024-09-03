package br.com.gpaiva;

import java.util.Scanner;

public class ContadorDeA {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe uma string
        System.out.print("Informe uma string: ");

        // Lê a string informada pelo usuário
        String input = scanner.nextLine();

        // Conta o número de ocorrências da letra 'a' (maiúscula ou minúscula) na string
        int count = contarA(input);

        // Imprime o número de ocorrências da letra 'a'
        System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + count + " vezes na string.");
    }

    // Método para contar o número de ocorrências da letra 'a' (maiúscula ou minúscula) em uma string
    public static int contarA(String input) {
        int count = 0; // Inicializa o contador

        // Itera sobre cada caractere da string
        for (char c : input.toCharArray()) {
            // Verifica se o caractere é 'a' ou 'A'
            if (c == 'a' || c == 'A') {
                count++; // Incrementa o contador
            }
        }

        // Retorna o número de ocorrências
        return count;
    }
}