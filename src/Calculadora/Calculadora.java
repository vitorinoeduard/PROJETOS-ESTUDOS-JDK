package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String produto = "Coca-cola";
        double precoOriginal = 6.59;
        int desconto = 10;

        double precoFinal = precoOriginal - (precoOriginal * desconto / 100.0);
        System.out.printf("Produto: %s | Preço final: R$ %.2f%n", produto, precoFinal);
        scanner.close();
    }
}
