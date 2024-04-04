package exercicios;

import java.util.Scanner;

public class LerVetores {
	/*

  ler números informados pelo usuário, armazenar em um vetor e somar
os números


*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor= new int[10];
		
		
		System.out.println("Informe o primeiro número  para colocarmos  no vetor:");
		vetor[0] = sc.nextInt();
		System.out.println("Informe o segundo número para colocarmos no vetor:");
		vetor[1] = sc.nextInt();
		System.out.println("Informe o terceiro número para colocarmos no vetor:");
		vetor[2] = sc.nextInt();
		System.out.println("Informe o quarto número para colocarmos no vetor: ");
		vetor[3] = sc.nextInt();
		System.out.println("Informe o quinto número para colocarmos no vetor: ");
		vetor[4] = sc.nextInt();
		System.out.println("Informe o sexto número para colocarmos no vetor: ");
		vetor[5] = sc.nextInt();
		System.out.println("Informe o sétimo número para colocarmos no vetor: ");
		vetor[6] = sc.nextInt();
		System.out.println("Informe o oitavo número para colocarmos no vetor: ");
		vetor[7] = sc.nextInt();
		System.out.println("Informe o nono número para colocarmos no vetor: ");
		vetor[8] = sc.nextInt();
		System.out.println("Informe o décimo número para colocarmos no vetor: ");
		vetor[9] = sc.nextInt();
		
		int soma=(vetor[0]+ vetor[1] +vetor[2] + vetor[3] + vetor[4] + vetor[5] + vetor[6] + vetor[7]+ vetor[8] + vetor[9]);
		
		System.out.println("Soma dos vetores: "+soma);
		
		System.out.println("Números informados no vetor:");
		for(int x=0;x<vetor.length;x++) {
			
			System.out.println("Número: "+vetor[x]);
			
		}
		
		}
		
		
		
		
	}
