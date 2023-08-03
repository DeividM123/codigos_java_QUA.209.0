package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.println("\nPor favor digite seu nome: ");
		//leitura de dao tipo String(Conjunto de caracteres)
		nome = leia.nextLine();
		
		System.out.println("\nDigite sua idade ");
		idade= leia.nextInt();
		//leitura de dado tipo int(numero inteiro)
		
		System.out.println("\nDigite a sua altura");
		altura= leia.nextDouble();
		//leitura de dado do tipo double()
		
		System.out.println("\nQual o sexo (m/f): ");
		sexo= leia.next().charAt(0);
		
		System.out.println("\nO nome difgitado foi "+nome);
		System.out.println("A idade digitada é: "+idade);
		System.out.println("A altura digitada foi: "+altura);
		System.out.println("O sexo digitado é: "+sexo);
		
		leia.close();
		

	}

}
