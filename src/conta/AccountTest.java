//Criação de um sistema que o nome para o aplicativo de conta bancária
//Joabe Hostin 21/06/2022


package conta;


//Importa a classe Scanner
import java.util.Scanner;
//Criação da classe
public class AccountTest {
	//Inicio método main que inicia a aplicação
	public static void main(String[] args) {
		//Criação de um novo Scanner
		Scanner input = new Scanner(System.in);
		//Criação de um objeto Account e o atribui a myAccount
		Account myAccount = new Account("Joabe Hostin", 0.0, 0.0, "jkojo!", 0.0);
		
		System.out.printf("%s%n%n","Insira o valor a ser depositado "
				+ " na abertura de conta!");
		// Leitura de saldo inicial na abertura da conta
		double initialBalance = input.nextDouble();
		// Atribuição da variável de instância da classe account 
		myAccount.setInitialBalance(initialBalance);
		
		
		
		//Dados inciais da conta
		System.out.printf( "Nome da conta com o respectivo saldo incial:"
				+ "%n%n%s: R$%.2f %S%n",
				myAccount.getName(), myAccount.getBalance(),
				myAccount.getInitialBalance(), myAccount.getEMail());
		
		
		System.out.println("Por favor, insira o valor a ser depositado na conta; ");
		//Faz a leitura do valor a ser depositado
		double depositAmount= input.nextDouble();
		//Insere o valor em myAccount
		myAccount.deposit(depositAmount);
		
		System.out.println("Por favor, insira o valor a ser sacado da conta; ");
		//Faz a leitura do valor a ser depositado
		double saqueAmount= input.nextDouble();
		//Insere o valor em myAccount
		myAccount.setSaque(saqueAmount);
		
		
		
		// fim da sessão de coleta de dados
		input.close();
		
		System.out.println("");
		//Informa o objeto armazenado
		System.out.printf("Nome no objeto myAcount is: %n%s:"
				+ " %nValor armazenado em Balance %nR$%.2f%n%n"
				+ "%nValor de saque: %nR$%.2f%n", 
				myAccount.getName(), myAccount.getBalance(), myAccount.getSaque(saqueAmount));
	}

}
