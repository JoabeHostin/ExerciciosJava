/* Exercicio de criacão de um sistema de conta bancária
 * Joabe Hostin
 * 21/06/2022
 * */
//
package conta;
//Criação da classe
public class Account {
	//Variáveis de instância 
	private String name;
	
	private double balance;
	
	private double initialBalance;
	
	private String eMail;
	
	
	
	//Método para criar objeto com todas as variáveis de instância
	public Account(String name, double balance, double initialBalance,
			String eMail, double saque) 
	{
		this.name = name;
		//Verifica se foi feito um depósito na abertura da conta
		this.initialBalance = initialBalance;
		if (initialBalance > 0.0)
			this.balance = initialBalance;
		if (balance > 0.0) 
			this.balance = balance;
		// verifica valores solicitados em saques
		
		
		
		//Verifica o saldo e atribui a balance
		
		
		
		
		
		this.eMail = eMail;
		
		
	}
	
	public void setEMail(String eMail)
	{
		this.eMail = eMail;
	}

	
	public String getEMail()
	{
		
		return eMail;
	}
	
	// Cria o método de deposito incial na abertura de conta
	public void setInitialBalance(double initialBalance)
	{
		if (initialBalance > 0.0)
			this.initialBalance = initialBalance;
			balance = balance + initialBalance;
	}
	
	public double getInitialBalance()
	{
		return initialBalance;
	}
	
	// Cria do metodo de depósito
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	// Método de Saque
	public void setSaque(double saque)
	{
		if(saque > 0.0 && saque <= balance)
		{
			this.balance = balance - saque;
			
			System.out.printf("%nSaque no valor de: R$%.2f efetuado com sucesson%n", + saque);
		}else {			
			
			System.out.printf("%nSaque no valor de: R$%.2f nao foi efetuado%n%n", + saque);
		}
		
		
		  	  
	}
	
	public double getSaque(double saque)
	{
		return saque;
	}
	
	
	public void setName(String name) 
	{	
		this.name = name; // Armazena o nome
	}
	// Metodo para recuperar o nome do objeto
	public String getName()
	{
		return name;// Retorna o nome para o chamador
	}
}// Fim da classe Account
