package frequenciaCardiaca;

import java.util.Scanner;

public class TesteFrequenciaCardiaca {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		FrequenciaCardiacaAlvo pessoa = new FrequenciaCardiacaAlvo(0);

		System.out.printf("Sua idade é:%.0f "
				+ "%nSua frequencia cardiaca alvo é entre %.0f"
				+ " e %.0f", pessoa.getIdade(), pessoa.getFrqMin(), pessoa.getFrqMax(), "");
	}
}
