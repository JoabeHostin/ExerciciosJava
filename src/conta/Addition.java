//Programa que l� dois n�meros e ent�o soma e mostra o resultado!
//Joabe Hostin 15/06/2022

package conta;
import java.util.Scanner; //Chamada da classe Scanner.

public class Addition {
	
	// M�todo main inicia a aplica��o
	public static void main(String[] args) { 
		
		//Cria o Scanner para obter os valores de entrada
		Scanner input = new Scanner(System.in);//System.in � o tipo de dado que o usu�rio digita.
		
		int number1, //primeiro n�mero a ser lido
	        number2, //Segundo numero a ser lido
		    sum; //Soma de number1 + number2
		
		System.out.print("Digite o primeiro n�mero! ");
		//l� o primeiro n�mero
		number1 = input.nextInt();
		
		System.out.print("Digite o segundo n�mero! ");
		//l� o segundo n�mero
		number2 = input.nextInt();
		//A soma � feita e guardada na vari�vel 
		sum = number1 + number2;
		//Sess�o condicional 
		if (number1 > number2)//compara os dois n�meros
			System.out.printf("%d > %d%n", number1 , number2);
		
		if (number1 < number2)//compara os dois n�meros
			System.out.printf("%d < %d%n", number1 , number2);

		if (number1 != number2)//compara os dois n�meros
			System.out.printf("%d != %d%n", number1 , number2);
		
		if (number1 == number2)//compara os dois n�meros
			System.out.printf("%d == %d%n", number1 , number2);
		
		if (number1 >= number2)//compara os dois n�meros
			System.out.printf("%d >= %d%n", number1 , number2);
		
		if (number1 <= number2)//compara os dois n�meros
			System.out.printf("%d <= %d%n", number1 , number2);
		//Exibe a soma
		System.out.printf("%s%d%n", "A soma dos valores �: ", sum );
	}//fim m�todo main

}//fim da classe
