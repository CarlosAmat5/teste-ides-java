package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		float divisao = divisao(a,b);
		
		System.out.println("A soma de " + a + " + " + b + " é igual a "+soma);
		System.out.println("A subtracao de " + a + " - " + b + " é igual a "+ subtracao);
		System.out.println("A multiplicacao de " + a + " * " + b + " é igual a "+multiplicacao);
		System.out.println("A divisao de " + a + " / " + b + " é igual a "+divisao);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static float divisao(int a, int b) {
		return a / b;
	}
}
