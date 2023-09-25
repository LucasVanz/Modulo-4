package Aula3.ex2;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static int calcula(int a, int b, BiFunction<Integer, Integer, Integer> funcao){
        return funcao.apply(a, b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = scanner.nextInt();
        System.out.println("Digite um segundo número: ");
        int b = scanner.nextInt();

        int soma = calcula(a, b, (a1, b1) -> a1 + b1);
        System.out.println("Soma = " + soma);
        int subtracao = calcula(a, b, (a1, b1) -> a1 - b1);
        System.out.println("Subtração = " + subtracao);
        int multiplicacao = calcula(a, b, (a1, b1) -> a1 * b1);
        System.out.println("Multiplicação = " + multiplicacao);
        int divisao = calcula(a, b, (a1, b1) -> a1 / b1);
        System.out.println("Divisão = " + divisao);
    }
}
