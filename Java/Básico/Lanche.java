// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

// 1 - Cachorro Quente - 4.00
// 2 - X-Salada - 4.50
// 3 - X-Bacon - 5.00
// 4 - Torrada simples - 2.00
// 5 - Refrigerante - 1.50

// Entrada
// O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

// Saída
// O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int X, Y;
		double[] precos = {4.0, 4.5, 5.0, 2.0, 1.5};
		
		Scanner input = new Scanner(System.in);
		X = input.nextInt();
		Y = input.nextInt();
		
		System.out.printf("Total: R$ %.2f\n", precos[X - 1] * Y);
	}

}