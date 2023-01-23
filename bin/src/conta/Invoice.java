package conta;

public class Invoice {
	
	String numero, descricao;
	int quantidade;
	double precoItem;
	
	public Invoice(String numero, String descricao, int quantidade, double precoItem, double total)
	{
		this.numero = numero;
		
		this.descricao = descricao;
		
		this.quantidade = quantidade;
		
		this.precoItem = precoItem;
		
	}


	
	
	public void setNumero(String numero)
	{
		this.numero = numero;
	}
	
	public String getNumero()
	{
		return numero;
	}

	

	
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	
	public String getDescricao()
	{
		return descricao;
	}

	

	
	public void setQuantidade(int quantidade)
	{
		this.quantidade = quantidade;
	}
	
	public int getQuantidade()
	{
		return quantidade;
	}
	
	
	
	
	public void setPreco(double precoItem)
	{
		this.precoItem = precoItem;
	}
	
	public double getPreco()
	{
		return precoItem;
	}
	
	
	
	
	public double getTotal()
	{
		return precoItem * quantidade;
	}
}
