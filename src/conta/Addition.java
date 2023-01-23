//Programa que lê dois números e então soma e mostra o resultado!
//Joabe Hostin 15/06/2022

package conta;
import java.util.Scanner; //Chamada da classe Scanner.

public class Addition {
	
	// Método main inicia a aplicação
	public static void main(String[] args) { 
		
		//Cria o Scanner para obter os valores de entrada
		Scanner input = new Scanner(System.in);//System.in é o tipo de dado que o usuário digita.
		
		int number1, //primeiro número a ser lido
	        number2, //Segundo numero a ser lido
		    sum; //Soma de number1 + number2
		
		System.out.print("Digite o primeiro número! ");
		//lê o primeiro número
		number1 = input.nextInt();
		
		System.out.print("Digite o segundo número! ");
		//lê o segundo número
		number2 = input.nextInt();
		//A soma é feita e guardada na variável 
		sum = number1 + number2;
		//Sessão condicional 
		if (number1 > number2)//compara os dois números
			System.out.printf("%d > %d%n", number1 , number2);
		
		if (number1 < number2)//compara os dois números
			System.out.printf("%d < %d%n", number1 , number2);

		if (number1 != number2)//compara os dois números
			System.out.printf("%d != %d%n", number1 , number2);
		
		if (number1 == number2)//compara os dois números
			System.out.printf("%d == %d%n", number1 , number2);
		
		if (number1 >= number2)//compara os dois números
			System.out.printf("%d >= %d%n", number1 , number2);
		
		if (number1 <= number2)//compara os dois números
			System.out.printf("%d <= %d%n", number1 , number2);
		//Exibe a soma
		System.out.printf("%s%d%n", "A soma dos valores é: ", sum );
	}//fim método main

}//fim da classe
