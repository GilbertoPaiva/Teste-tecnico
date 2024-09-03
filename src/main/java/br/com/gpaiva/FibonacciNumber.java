package br.com.gpaiva;

public class FibonacciNumber {
    public static void main(String[] args) {
        // Define o número a ser verificado
        int number = 144;

        // Verifica se o número está na sequência de Fibonacci
        boolean isFibonacci = isFibonacciNumber(number);

        // Imprime o resultado da verificação
        if (isFibonacci) {
            System.out.println("O número " + number + " está na sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO está sequência de Fibonacci.");
        }
    }

    // Método para verificar se um número está na sequência de Fibonacci
    public static boolean isFibonacciNumber(int number) {
        // Números negativos não estão na sequência de Fibonacci
        if (number < 0) {
            return false;
        }

        // Inicializa os dois primeiros números da sequência de Fibonacci
        int a = 0;
        int b = 1;

        // Calcula os próximos números da sequência até que b seja maior ou igual ao número fornecido
        while (b < number) {
            int temp = b; // Armazena o valor atual de b
            b = a + b;    // Calcula o próximo número da sequência
            a = temp;     // Atualiza a para o valor anterior de b
        }

        // Retorna true se o número fornecido for igual a a ou b, indicando que está na sequência
        return b == number || a == number;
    }
}