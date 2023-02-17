package conta;

import java.util.Scanner;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Conta c1 = new Conta(1, 123, 1, "Erica Araújo", 30000.0f);
		c1.visualizar();
		
		c1.setSaldo(35000.0f);
		System.out.println(c1.getSaldo());
		
		Conta c2 = new Conta(2, 123, 1, "Dener Cardoso", 50000.0f);
		c2.visualizar();
		
		if(c2.sacar(1000.0f))
			System.out.println("\n\n" + c2.getSaldo());
		
		c1.depositar(10000.0f);
		c1.visualizar();
		
		// Para usar a cor, coloca: Cores.TEXT_YELLOW + "texto" para alterar no println()
		// Aplicará a tudo depois. Pra parar, coloco + Cores.TEXT_RESET.
		
		
		
		/*
		int opcao;
		*/
	}

}
