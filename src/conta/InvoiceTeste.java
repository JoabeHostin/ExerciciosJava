package conta;

import java.util.Scanner;

public class InvoiceTeste {

	public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	
	Invoice myInvoice = new Invoice("00000001", "Descri��o", 0, 0, 0);
	
	
	
	
	System.out.printf("Insira o n�mero do pedido: %n","");
	
	String numeroPedido = input.nextLine();
	
	myInvoice.setNumero(numeroPedido);
	
	System.out.printf("%nO n�mero do pedido �: %s%n%n%n",myInvoice.getNumero());
	
	

	
	System.out.printf("Informe a descri��o do pedido:%n", "");
	
	String descricaoPedido = input.nextLine();
	
	myInvoice.setDescricao(descricaoPedido);
	
	System.out.printf("%nA descri�ao do pedido �: %s%n%n%n",myInvoice.getDescricao());
	
	
	
	
	System.out.printf("Informe a quantidade de itens%n","");
	
	int quantidade = input.nextInt();
	
	myInvoice.setQuantidade(quantidade);
	
	System.out.printf("%n%nA quantidade informada foi: %d%n%n%n", myInvoice.getQuantidade());
	
	
	
	
	System.out.printf("Informe o valor de cada Item%n", "");
	
	double preco = input.nextDouble();	
	
	myInvoice.setPreco(preco);
	
	System.out.printf("%n%nO pre�o do iten � %.2f", myInvoice.getPreco());
	
	
	
	
	input.close();
	
	
	
	
	System.out.printf("%n%nO total do pedido � %.2f", myInvoice.getTotal());
	
	
}
	
}
