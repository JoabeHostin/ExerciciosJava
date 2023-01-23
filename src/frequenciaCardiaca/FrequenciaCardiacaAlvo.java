package frequenciaCardiaca;

import cadastro.Pessoa;

public class FrequenciaCardiacaAlvo {
	
	
	
	
	
	
	
	
	private double  idadeFrq, frequenciaAlvoMax, frequenciaAlvoMin, frequenciaCardiaca, cinquentaPorcento;
	
	
	

	
	
	Pessoa pessoa = new Pessoa(null, null, null, 0.0, 0.0,28);
	
	public FrequenciaCardiacaAlvo(double idade) {
		
		
		
		
		
		this.idadeFrq = pessoa.getIdade();
		this.frequenciaCardiaca = 220 - pessoa.getIdade();
		this.frequenciaAlvoMax = 0.85 * frequenciaCardiaca;		
		this.frequenciaAlvoMin = 0.5 * frequenciaCardiaca;;
	}

	public double getFrqMax() {
		return frequenciaAlvoMax;
	}

	public double getFrqMin() {
		return frequenciaAlvoMin;
	}

	public double getFrq() {
		return cinquentaPorcento;
	}

	public Object getIdade() {
		// TODO Auto-generated method stub
		return idadeFrq;
	}
}
