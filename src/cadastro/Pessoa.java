package cadastro;

//Classe que representa informações sobre uma pessoa

public class Pessoa {
	// Atributos privados para armazenar informações sobre a pessoa
	private String nome, sobrenome, sexo;
	private double peso, altura;
	private int idade;

	// Construtor que inicializa os atributos com os valores passados como parâmetros
	public Pessoa(String nome, String sobrenome, String sexo,
			double peso, double altura, int idade) {
		this.idade = idade;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura; 
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
